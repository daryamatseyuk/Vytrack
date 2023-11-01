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

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    private WebElement noPermissionMessage;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']/../button")
    private WebElement closePermissionMessageBtn;

    public WebElement getModule(String moduleName) {
       WebElement expectedModule = null;
       Actions actions = new Actions(Driver.getDriver());
       WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
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

    public void clearMessage() {
        if (noPermissionMessage.isDisplayed()) {
            closePermissionMessageBtn.click();
        }
    }

    public WebElement getPermissionErrorMessage() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        return wait.until(ExpectedConditions.visibilityOf(noPermissionMessage));
    }


}
