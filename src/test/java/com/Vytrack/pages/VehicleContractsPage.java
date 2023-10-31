package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VehicleContractsPage {

    public VehicleContractsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    private final String expectedPageTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";

    public String getPageTitle() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.titleIs(expectedPageTitle));
        return Driver.getDriver().getTitle();
    }
}
