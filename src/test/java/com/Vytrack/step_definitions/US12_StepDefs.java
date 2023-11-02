package com.Vytrack.step_definitions;

import com.Vytrack.pages.AccountPage;
import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.LoginPage;
import com.Vytrack.utilities.BrowserUtils;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US12_StepDefs {

    LoginPage loginPage= new LoginPage();
    HomePage homePage = new HomePage();
    
    AccountPage accountPage = new AccountPage();

    @Given("user is on the homepage signed in as a {string}")
    public void userIsOnTheHomepageSignedInAsA(String role) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.loginAs(role);
    }

    @When("user clicks on {string} option under {string} module")
    public void user_clicks_on_account_page_option_under_customers_module(String option, String module) {
        homePage.selectOptionFromModules(module, option);
    }
    @Then("user is able to see below filters")
    public void user_is_able_to_see_below_filters(List<String> expectedFilters) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(accountPage.filterButton));

        accountPage.filterButton.click();

        List<String> actualFilters = new ArrayList<>();

        for (WebElement each: accountPage.allFilters){
            BrowserUtils.waitForVisibility(each,15);
            actualFilters.add(each.getText().substring(0,each.getText().length()-5));
        }

        Assert.assertEquals(actualFilters, expectedFilters);
    }


}
