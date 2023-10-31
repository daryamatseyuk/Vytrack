package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarRepeatDayInputBox_Page {

    public CalendarRepeatDayInputBox_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Calendar Events']")
    public WebElement calendarEvent;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatButton;

    @FindBy(xpath = "(//input[@data-related-field='interval'])[1]")
    public WebElement repeatInputBox;

    @FindBy(xpath = "//span[@class='validation-failed']/span")
    public WebElement errorMessage;

}
