package com.Vytrack.step_definitions;

import com.Vytrack.pages.CalendarRepeatDayInputBox_Page;
import com.Vytrack.pages.HomePage;
import com.Vytrack.pages.LoginPage;
import com.Vytrack.utilities.BrowserUtils;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.core.Every;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.idealized.Events;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.Calendar;

public class US09_StepDefs {
    LoginPage lp = new LoginPage();
    HomePage hp = new HomePage();
    CalendarRepeatDayInputBox_Page cp = new CalendarRepeatDayInputBox_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Given("User is logged in as {string}")
    public void user_is_logged_in_as(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        lp.loginAs(user);
    }
    @When("User chooses Calendar Events option from {string} module")
    public void user_chooses_option_from_module(String Activities) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        hp.getModule(Activities);
        cp.calendarEvent.click();
    }
    @When("User clicks on Create Calendar Event button")
    public void user_clicks_on() {
        BrowserUtils.sleep(2);
        wait.until(ExpectedConditions.elementToBeClickable(cp.createCalendarEvent));
        cp.createCalendarEvent.click();
    }
    @When("User clicks on Repeat option")
    public void user_clicks_on_option() {
        cp.repeatButton.click();
    }
    @When("User enters {string} in the Repeat Every input box")
    public void user_enters_in_the_input_box(String InvalidNumber) {
        cp.repeatInputBox.clear();
        cp.repeatInputBox.sendKeys(InvalidNumber);
    }
    @Then("User should see {string} message")
    public void user_should_see_message(String ErrorMessage) {
        Assert.assertEquals(ErrorMessage,cp.errorMessage.getText());
    }

}
