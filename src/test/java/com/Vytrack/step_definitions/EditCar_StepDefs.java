package com.Vytrack.step_definitions;

import com.Vytrack.pages.AllCarsPage;
import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.LoginPage;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class EditCar_StepDefs {
    AllCarsPage allCarsPage = new AllCarsPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());





    @Given("user logs in as {string}")
    public void user_logs_in_as(String role) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAs(role);

    }





    @When("user selects {string} option from {string} module")
    public void user_selects_option_from_module(String option, String module)  {
        homePage.selectOptionFromModules(module, option);
        actions.moveToElement(allCarsPage.module);
        actions.click(allCarsPage.option).perform();

    }




    @When("user hovers over 3 dots\"...\"")
        public void user_hovers_over_three_dots()  {
        //actions.moveToElement(allCarsPage.threeDots).perform();
       actions.click(allCarsPage.threeDots).perform();


    }

    @Then("user  sees 3 icons:")
    public void user_sees_icons(List<WebElement> expectedIcons)  {
        actions.moveToElement(allCarsPage.viewIcon).perform();
        actions.moveToElement(allCarsPage.editIcon).perform();
        actions.moveToElement(allCarsPage.deleteIcon).perform();

        //List<String> actualIcons = new ArrayList<String>();
        //actualIcons.add(allCarsPage.viewIcon.getText());
        //actualIcons.add(allCarsPage.editIcon.getText());
        //actualIcons.add(allCarsPage.deleteIcon.getText());

    }

    @Then("user is able to read {string} when he hovers over each icon respectively:")
    public void user_is_able_to_read_when_he_hovers_over_each_icon_respectively(List<String> expectedElementsNames) {

    }
}


