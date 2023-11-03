package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage {

    public PinbarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Learn how to use this space']")
    public WebElement learnHowToUseThis;
    @FindBy(xpath = "(//a[@title='How To Use Pinbar'])[1]")
    public WebElement howToUseThisPinbar;
    @FindBy(xpath = "//img")
    public WebElement image;
    @FindBy(xpath = "//button[@title='Pin/unpin the page']")
    public WebElement pinUnpinButton;



}
