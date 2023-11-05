package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class AllCarsPage {

    public AllCarsPage() { PageFactory.initElements(Driver.getDriver(),this);}

       @FindBy(xpath = "//span[@class='title title-level-1'][2]")
      public WebElement module;

       @FindBy (xpath = "(//span[@class='title title-level-2'])[4]")
       public WebElement option;

       @FindBy(xpath = "(//a[@class='dropdown-toggle'])[5]")
       public WebElement threeDots;

       @FindBy(xpath = "//i[@class='fa-eye hide-text']")
       public WebElement viewIcon;

       @FindBy(xpath = "(//i[@class ='fa-pencil-square-o hide-text'])[2]")
       public WebElement editIcon;

       @FindBy(xpath = "//i[@class ='fa-trash-o hide-text']")
       public WebElement deleteIcon;















}

