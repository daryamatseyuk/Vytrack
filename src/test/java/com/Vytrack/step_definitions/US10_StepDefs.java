package com.Vytrack.step_definitions;


import com.Vytrack.pages.DescriptionInCalendarPage;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.time.Duration;

public class US10_StepDefs {

    DescriptionInCalendarPage dp = new DescriptionInCalendarPage();

    @Then("User writes {string} in the description box")
    public void userCanWriteInTheDescriptionBox(String text) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        dp.switchToIframe();
        dp.enterTextInDescriptionBox(text);
    }

    @Then("User can see {string} in the description box")
    public void userCanSeeInTheDescriptionBox(String text) {
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String descriptionText =dp.verifyText();
        Assert.assertEquals(text, descriptionText);
        dp.switchToParentFrame();
    }

}
