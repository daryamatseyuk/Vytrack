package com.Vytrack.step_definitions;




import com.Vytrack.utilities.BrowserUtils;
import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;
public class Hooks {

    @Before (order = 1)
    public void setupMethod(){

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().manage().window().maximize();

    }
    @After
    public void teardownMethod(Scenario scenario){
        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", scenario.getName());

        Driver.closeDriver();

    }
}
