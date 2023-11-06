package com.Vytrack.step_definitions;

import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.LoginPage;
import com.Vytrack.pages.VehiclesModelPage;
import com.Vytrack.utilities.BrowserUtils;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class US07_StepDefs {
    VehiclesModelPage vehiclesModelPage = new VehiclesModelPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("User is logged in as {string}.")
    public void userIsLoggedInAs(String role) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAs(role);
    }

    @When("User chooses {string} option from {string} Module")
    public void userChoosesOptionFromModule(String option, String module) {
        homePage.selectOptionFromModules(module,option);
    }

    @Then("User should see that all the checkboxes are unchecked")
    public void user_should_see_that_all_the_checkboxes_are_unchecked() {
        for (WebElement each : vehiclesModelPage.allCheckboxes){
            Assert.assertFalse(each.isSelected());
        }
    }

    @When("User clicks on the first checkbox to check all the cars")
    public void user_clicks_on_the_first_checkbox_to_check_all_the_cars() {
        vehiclesModelPage.selectAllCheckboxes.click();
    }

    @Then("User should see that all checkboxes are selected")
    public void user_should_see_that_all_checkboxes_are_selected() {
        vehiclesModelPage.allCheckboxes.forEach(x->Assert.assertTrue(x.isSelected()));
    }

    @When("User clicks on any random checkbox to select a vehicle")
    public void user_clicks_on_any_random_checkbox_to_select_a_vehicle() {
        vehiclesModelPage.clickRandomElement();
    }

    @Then("User should see that only that vehicle is selected")
    public void user_should_see_that_only_that_vehicle_is_selected() {
        Assert.assertTrue(vehiclesModelPage.checkIfOneIsSelected());
    }


}
