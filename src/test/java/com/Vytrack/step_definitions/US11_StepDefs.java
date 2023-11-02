package com.Vytrack.step_definitions;

import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.VehicleOdometerPage;
import com.Vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US11_StepDefs {

    VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
    HomePage homePage = new HomePage();

    @When("User chooses {string} option from {string} module")
    public void user_chooses_vehicle_odometer_option_from_fleet_module(String vehicleOdometer, String fleet) {
        homePage.selectOptionFromModules(fleet,vehicleOdometer);
    }
    @Then("user verifies {string}")
    public void user_verifies(String errorMessage) {
        Assert.assertEquals(errorMessage,vehicleOdometerPage.actualErrorMessage.getText());
    }
    @Then("User should see default page as {string}")
    public void user_should_see_default_page_as(String num1) {
        Assert.assertEquals(num1, vehicleOdometerPage.page1Box.getAttribute("value"));
    }
    @Then("User should see the view per page is {string} by default")
    public void user_should_see_the_view_per_page_is_by_default(String num25) {
        Assert.assertEquals(num25, vehicleOdometerPage.page25DropDown.getText());
    }








}
