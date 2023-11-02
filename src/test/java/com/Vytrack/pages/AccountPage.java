package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountPage {

    public AccountPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']") //div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']
    public List<WebElement> allFilters;

    @FindBy(xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement filterButton;

    @FindBy(xpath="//*[@id=\"mCSB_1_container\"]/div/div[1]/div[2]/div/div[1]/div[2]")
    public WebElement stickyNote;
}
//div[@class='filter-item oro-drop'] <- filters (8)
//div[.='Sticky Note']
////div[contains(@class, 'sidebar-widget-sticky-note')]
////*[@id="mCSB_1_container"]/div/div[1]/div[2]/div/div[1]/div[2]