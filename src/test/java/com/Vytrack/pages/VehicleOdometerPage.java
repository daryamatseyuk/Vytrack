package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[.='You do not have permission to perform this action.']")
    public WebElement actualErrorMessage;

   @FindBy (xpath = "//input[@type='number']")
   public WebElement page1Box;

   @FindBy (xpath = "(//div[@class='btn-group'])[3]")
   public WebElement page25DropDown;
//
//    @FindBy ()
//    public WebElement

}
