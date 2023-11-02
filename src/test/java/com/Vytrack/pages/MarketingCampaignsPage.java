package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MarketingCampaignsPage {
    public MarketingCampaignsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterBtn;
    @FindBy(xpath = "//a[@class='add-filter-button']")
    public WebElement manageFiltersDropdown;
    @FindBy(xpath = "//input[@name='multiselect_3']")
    public List<WebElement> optionFromDropdown;

}
