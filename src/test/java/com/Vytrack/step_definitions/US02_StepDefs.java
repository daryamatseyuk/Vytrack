package com.Vytrack.step_definitions;

import com.Vytrack.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_StepDefs {

    HomePage hp = new HomePage();

    @When("user selects Get help question mark icon on top pin bar")
    public void user_selects_question_mark_icon_on_top_pin_bar() {
       hp.questionMarkBtn.click();
    }
    @Then("user should be able to see {string} page")
    public void user_should_be_able_to_see_page(String expectedURL) {
        Assert.assertEquals(expectedURL,hp.getOraDocURL());
    }

}
