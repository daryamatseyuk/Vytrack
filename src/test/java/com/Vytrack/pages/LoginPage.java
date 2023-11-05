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
    public WebElement userName;
    @FindBy(id="prependedInput2")
    public WebElement password;
    @FindBy(name = "_submit")
    public WebElement submit;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
    }

    public void loginAs(String role) {
        switch (role.toLowerCase()) {
            case "sales manager":
                userName.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
                password.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
                break;
            case "store manager":
                userName.sendKeys(ConfigurationReader.getProperty("store_manager_username"));
                password.sendKeys(ConfigurationReader.getProperty("store_manager_password"));
                break;
            case "driver":
                userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
                password.sendKeys(ConfigurationReader.getProperty("driver_password"));
                break;
        }
        submit.click();
    }


}
