package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class VehicleContractsPage {

    public VehicleContractsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public String pageTitle = "All - Vehicle Contract - Entities - System - Car - Entities - System";
}
