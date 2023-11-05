package com.Vytrack.step_definitions;

import com.Vytrack.pages.AllCarsPage;
import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.LoginPage;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import java.util.List;

public class EditCar_StepDefinitions {

    AllCarsPage allCarsPage = new AllCarsPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("user logs in as {string}")
    public void user_logs_in_as(String role) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAs(role);
    }

    @When("user selects {string} option from {string} module")
    public void user_selects_option_from_module(String option, String module)  {
        homePage.selectOptionFromModules(module, option);
    }

    @When("user hovers over 3 dots\"...\"")
    public void user_hovers_over_three_dots()  {
        allCarsPage.moveToThreeDots();
    }

    @Then("user is able to see following icons")
    public void user_is_able_to_read_when_he_hovers_over_each_icon_respectively(List<String> expectedElementsNames) {
        Assert.assertEquals(expectedElementsNames, allCarsPage.getIcons());
    }

}
