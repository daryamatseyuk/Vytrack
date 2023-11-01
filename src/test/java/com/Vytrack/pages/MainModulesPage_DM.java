package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage_DM {

    public MainModulesPage_DM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy( xpath = "//span[@class='title title-level-1']" )
    public List<WebElement> allModules;
}
