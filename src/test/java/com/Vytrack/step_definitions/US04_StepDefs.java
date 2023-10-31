package com.Vytrack.step_definitions;

import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.LoginPage;
import com.Vytrack.pages.VehicleContractsPage;
import com.Vytrack.pages.VehiclesModelPage;
import com.Vytrack.utilities.BrowserUtils;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebElement;

import java.util.*;

public class US04_StepDefs {

    LoginPage loginPage= new LoginPage();
    HomePage homePage = new HomePage();
    VehicleContractsPage vehicleContractsPage = new VehicleContractsPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user logs in as a {string}")
    public void user_enters_and(String role) {
        loginPage.loginAs(role);
    }


    @When("user selects {string} option in {string} module")
    public void user_selects_option_in_module(String option, String module) {
       homePage.selectOptionFromModules(module, option);
    }

    @Then("user should see the {string} page")
    public void user_should_see_the_vehicle_contracts_page(String pageName) {
        Assert.assertTrue(vehicleContractsPage.getPageTitle().contains(pageName));
    }

}
