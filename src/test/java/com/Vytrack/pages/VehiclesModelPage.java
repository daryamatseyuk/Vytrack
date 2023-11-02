package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehiclesModelPage {
    public VehiclesModelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//span[@class='grid-header-cell__label']")
    public List<WebElement> namesWebTable;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement noPermissionMsgDriver;

}
