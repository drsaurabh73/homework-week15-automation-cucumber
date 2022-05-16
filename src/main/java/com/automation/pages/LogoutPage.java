package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LogoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public LogoutPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@class='logout']")
    WebElement logout;

    public void clickOnLogout() {
        Reporter.log("Clicking on logout "+ logout.toString());
        clickOnElement(logout);
    }

    public String verifyLogOutText() {
        Reporter.log("getting logout text from " + logout.toString() + "<br>");
        return getTextFromElement(logout);
    }
}