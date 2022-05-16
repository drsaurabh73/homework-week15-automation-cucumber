package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class MyAccount extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public MyAccount() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'My account')]")
    WebElement myaccount;

    public String verifyMyAccount() {
        Reporter.log("getting Myaccount text  " + myaccount.toString() + "<br>");
        return getTextFromElement(myaccount);
    }

}