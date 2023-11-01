package com.Vytrack.pages;

import com.Vytrack.utilities.BrowserUtils;
import com.Vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']/li")
    private List<WebElement> modulesList;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-level-1 menu menu-level-1']")
    private List<WebElement> optionsList;

    @FindBy(xpath = "//*[text()='Vehicle Contracts']")
    public WebElement menu;

    private By options = By.xpath("//li[contains (@class, 'dropdown-menu-single-item')]");

    public WebElement getModule(String moduleName) {
       WebElement expectedModule = null;
       Actions actions = new Actions(Driver.getDriver());
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(1));
        for (WebElement each : modulesList) {
            try {
                wait.until(ExpectedConditions.textToBePresentInElement(each, moduleName));
                expectedModule = each;
                break;
            } catch (TimeoutException e) {
                continue;
            }
        }
        actions.moveToElement(expectedModule).perform();
        return expectedModule;
    }

    public void selectOptionFromModules(String moduleName, String optionName) {
        getModule(moduleName);
        String optionFormat = "//span[.='%s']";
        Driver.getDriver().findElement(By.xpath(String.format(optionFormat, optionName))).click();
    }


}
