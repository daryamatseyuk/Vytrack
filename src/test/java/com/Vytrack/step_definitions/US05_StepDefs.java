package com.Vytrack.step_definitions;

import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.LoginPage;
import com.Vytrack.pages.VehiclesModelPage;
import com.Vytrack.utilities.BrowserUtils;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US05_StepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();

    @Given("user is on the login page.MD")
    public void user_is_on_the_login_page_md() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user logs in as a {string}.MD")
    public void user_logs_in_as_a_md(String role) {
        loginPage.loginAs(role);
    }
    @When("user selects {string} option in {string} module.MD")
    public void user_selects_option_in_module_md(String option, String module) {
        homePage.selectOptionFromModules(module, option);
        BrowserUtils.sleep(3);
    }
    @Then("user is able to see names below")
    public void user_is_able_to_see_names_below(List<String> expectedNamesOfWebTableColumns) {
        List<String> actualNamesOfWebTableColumns = new ArrayList<>();


        for (WebElement eachWebElement : vehiclesModelPage.namesWebTable) {
            actualNamesOfWebTableColumns.add(eachWebElement.getText());
        }
        for (int i = actualNamesOfWebTableColumns.size()-1; i > 9; i--) {
            actualNamesOfWebTableColumns.remove(i);
        }

        Assert.assertEquals(actualNamesOfWebTableColumns, expectedNamesOfWebTableColumns);

    }

    @Then("user is not able to access the Vehicle Model page and sees the message")
    public void user_is_not_able_to_access_the_vehicle_model_page_and_sees_the_message() {
        String expectedMessage = "You do not have permission to perform this action.";
        String actualMessage =vehiclesModelPage.noPermissionMsgDriver.getText();

        Assert.assertTrue(actualMessage.equals(expectedMessage));
    }

}


