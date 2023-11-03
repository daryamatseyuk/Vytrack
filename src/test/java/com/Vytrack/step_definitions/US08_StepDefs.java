package com.Vytrack.step_definitions;

import com.Vytrack.pages.CalendarRepeatDayInputBox_Page;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US08_StepDefs {

    CalendarRepeatDayInputBox_Page calendarRepeatDayInputBoxPage = new CalendarRepeatDayInputBox_Page();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));


    @Then("User should see {string} as default number")
    public void user_should_see_as_default_number(String string) {
        Assert.assertEquals(calendarRepeatDayInputBoxPage.repeatInputBox.getAttribute("value")
                ,string);
    }
    @When("User delete {string} from Repeat Every input box")
    public void user_delete_from_repeat_every_input_box(String string) {
        calendarRepeatDayInputBoxPage.repeatInputBox.clear();
    }
    @Then("User should see error message {string} message")
    public void user_should_see_error_message_message(String ErrorMessage) {
        Assert.assertEquals(ErrorMessage,calendarRepeatDayInputBoxPage.errorMessage.getText());
    }

}
