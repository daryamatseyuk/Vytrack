package com.Vytrack.step_definitions;

import com.Vytrack.pages.PinbarPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_StepDefs {

    PinbarPage pinbarPage = new PinbarPage();

    @When("User clicks on Learn how to use this space button")
    public void user_clicks_on_learn_how_to_use_this_space_button() {
        pinbarPage.learnHowToUseThis.click();
    }
    @And("User clicks on Pin-Unpin the page button")
    public void userClicksOnPinUnpinThePageButton() {
        pinbarPage.pinUnpinButton.click();
    }
    @Then("User verifies that the option changed to {string}")
    public void user_verifies_that_the_option_changed_to(String expectedText) {
        Assert.assertEquals(expectedText,pinbarPage.howToUseThisPinbar.getText());
    }
    @When("User clicks on Learn how to use space button")
    public void userClicksOnHowToUsePinbarButton() {
        pinbarPage.learnHowToUseThis.click();
    }
    @Then("User verifies that the image source is {string}")
    public void userVerifiesThatTheImageSourceIs(String source) {
        Assert.assertTrue(pinbarPage.image.getAttribute("src").contains(source));
    }
}
