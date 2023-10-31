package com.Vytrack.step_definitions;

import com.Vytrack.pages.HomePage;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class US01_StepDefs {

    HomePage homePage = new HomePage();

    @Given("user is on the login page DM")
    public void user_is_on_the_login_page_dm() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Then("the user should see the following module names:")
    public void the_user_should_see_the_following_module_names(List<String> expectedModules) {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.titleIs("Dashboard"));

        List<String> actualModules = new ArrayList<>();

        for (WebElement eachModule : homePage.allTopModules) {

            actualModules.add(eachModule.getText());
        }


        Assert.assertEquals(expectedModules,actualModules);

    }

}
