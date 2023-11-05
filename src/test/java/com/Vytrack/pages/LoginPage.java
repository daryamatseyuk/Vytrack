package com.Vytrack.pages;


import com.Vytrack.utilities.ConfigurationReader;
import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="prependedInput")
    public WebElement userNameInputBox;
    @FindBy(id="prependedInput2")
    public WebElement passwordInputBox;
    @FindBy(name = "_submit")
    public WebElement loginButton;


    public void login(String userNameStr, String passwordStr) {
        userNameInputBox.sendKeys(userNameStr);
        passwordInputBox.sendKeys(passwordStr);
        loginButton.click();
    }

    public void loginAs(String role) {
        switch (role.toLowerCase()) {
            case "sales manager":
                userNameInputBox.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
                break;
            case "store manager":
                userNameInputBox.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
                break;
            case "driver":
                userNameInputBox.sendKeys(ConfigurationReader.getProperty("driver_username"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("driver_password"));
                break;
        }
        loginButton.click();
    }

}
