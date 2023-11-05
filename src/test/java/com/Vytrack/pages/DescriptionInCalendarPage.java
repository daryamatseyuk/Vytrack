package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DescriptionInCalendarPage {


    public DescriptionInCalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    public void switchToIframe(){
        WebElement iframe = Driver.getDriver().findElement(By.tagName("iframe"));
        Driver.getDriver().switchTo().frame(iframe);
    }
    public void enterTextInDescriptionBox(String text){
        WebElement descriptionBox = Driver.getDriver().findElement(By.xpath("//body[@id='tinymce']"));
        descriptionBox.sendKeys(text);
    }
    public String verifyText(){
        WebElement paragraphChild = Driver.getDriver().findElement(By.xpath("//body[@id='tinymce']/p"));
        return paragraphChild.getText();
    }
    public void switchToParentFrame(){
        Driver.getDriver().switchTo().parentFrame();
    }
}
