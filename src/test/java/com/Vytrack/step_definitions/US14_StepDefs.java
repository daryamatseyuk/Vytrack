package com.Vytrack.step_definitions;

import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.LoginPage;
import com.Vytrack.pages.MarketingCampaignsPage;
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

public class US14_StepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MarketingCampaignsPage marketingCampaignsPage = new MarketingCampaignsPage();

    @Given("user is on the login page. Dasha")
    public void user_is_on_the_login_page_dasha() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user logs in as a {string}. Dasha")
    public void user_logs_in_as_a_dasha(String role) {
        loginPage.loginAs(role);
    }
    @Then("user selects {string} option in {string} module. Dasha")
    public void user_selects_option_in_module_dasha(String module, String option) {
        homePage.selectOptionFromModules(module, option);
    }
    @Then("user clicks on the filter button. Dasha")
    public void user_clicks_on_the_filter_button_dasha() {
        marketingCampaignsPage.filterBtn.click();
    }
    @Then("clicks on the manage filters button. Dasha")
    public void clicks_on_the_manage_filters_button_dasha() {
        marketingCampaignsPage.manageFiltersDropdown.click();
    }

    @Then("user is able to see options below checked by default. Dasha")
    public void user_is_able_to_see_options_below_checked_by_default_dasha(List<String>expectedOptionsDropdown) {
        for (WebElement eachWebElement : marketingCampaignsPage.optionFromDropdown) {
            Assert.assertTrue(eachWebElement.isSelected());
        }
    }




}
