package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class VehiclesModelPage {
    public VehiclesModelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//span[@class='grid-header-cell__label']")
    public List<WebElement> namesWebTable;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement noPermissionMsgDriver;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement selectAllCheckboxes;

    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> allCheckboxes;

    @FindBy(xpath = "//tr[@class='grid-row row-click-action row-selected']//input")
    public List<WebElement> selectedElementsList;

    public WebElement selectRandomElement(List<WebElement> listOfWebElement){
        Random random = new Random();
        int randomNum = random.nextInt(45);
        return listOfWebElement.get(randomNum);
    }

}
