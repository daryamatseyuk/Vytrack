package com.Vytrack.pages;

import com.Vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.stream.Collectors;

public class AllCarsPage {

    public AllCarsPage() { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//table//a[@class='dropdown-toggle']")
    public WebElement threeDots;

    @FindBy(xpath = "//ul[contains(@class,'launchers-list')]//li[@class='launcher-item']//a")
    public List<WebElement> iconsList;

    public void moveToThreeDots() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(threeDots).perform();
    }

    public List<String> getIcons() {
        moveToThreeDots();
        return iconsList.stream().map(x -> x.getAttribute("title")).collect(Collectors.toList());
    }







}

