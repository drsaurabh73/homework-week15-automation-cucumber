package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement WomenLink;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement Dresses;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement TShirt;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement SignIn;
    @CacheLookup
    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement logo;


    public void clickOnWomenTab() {

        clickOnElement(WomenLink);
        log.info("Clicking on Womenlink" + WomenLink.toString() );
    }

    public void clickOnDressesTab() {

        clickOnElement(Dresses);
        log.info("Clicking on Dresses" + TShirt.toString() );
    }

    public void clickOnTShirtTab() {

        clickOnElement(TShirt);
        log.info("Clicking on T shirt" + TShirt.toString() );
    }

    public void clickOnSignInTab() {

        clickOnElement(SignIn);
        log.info("Clicking on signIn button" + SignIn.toString() );
    }

    public void clickOnLogo() {

        clickOnElement(logo);
        log.info("Clicking on logo" + logo.toString() );
    }

}
