package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class VehiclesModelPage {
    public VehiclesModelPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    private WebElement randomlySelected;

    @FindBy (xpath = "//span[@class='grid-header-cell__label']")
    public List<WebElement> namesWebTable;

    @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement noPermissionMsgDriver;

    @FindBy(xpath = "(//input[@type='checkbox'])[1]")
    public WebElement selectAllCheckboxes;

    @FindBy(xpath = "//tbody[@class='grid-body']//input[@type='checkbox']")
    public List<WebElement> allCheckboxes;


    public void clickRandomElement(){
        Random random = new Random();
        int randomNum = random.nextInt(24);
        randomlySelected = allCheckboxes.get(randomNum);
        randomlySelected.click();
    }

    public boolean checkIfOneIsSelected() {
        return randomlySelected.isSelected();
    }



}
