package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]")
    WebElement signin;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Authentication')]")
    WebElement authentication;

    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailnewaccount;

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")
    WebElement createaccount;

    @CacheLookup
    @FindBy(xpath = "//h3[contains(text(),'Create an account')]")
    WebElement createaccountbutton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-danger']//li")
    WebElement ErrorMessage;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement signIntext;

    public void setEmail(String text) {
        sendTextToElement(email, text);
        log.info("Enter email " + text + " to email field " + email.toString() );
    }

    public void setPassword(String text) {
        sendTextToElement(password, text);
        log.info("Enter password " + text + " to password field " + password.toString() );
    }

    public void setSignin() {
        clickOnElement(signin);
        log.info("Clicking on signIn button " + signin.toString() );
    }

    public void setEmailNewAccount(String text) {
        sendTextToElement(emailnewaccount, text);
        log.info("Enter new email account " + text + " to new email field " + emailnewaccount.toString() );
    }

    public String authentaication() {
       log.info("getting authentication text  " + authentication.toString() );
        return getTextFromElement(authentication);
    }

    public void setCreateaccountbutton() {
       log.info("Clicking on create account" + createaccount.toString() );
        clickOnElement(createaccount);
    }

    public String createaccount() {
       log.info("getting creat account text from " + createaccount.toString() );
        return getTextFromElement(createaccount);
    }

    public String verifySignInText() {
       log.info("getting signIn text  " + signIntext.toString() );
        return getTextFromElement(signIntext);
    }


    public void sinInToApplication(String username, String password) {
       log.info("Enter Username and password to" + username + "" + password + " to username and password " + signin.toString() );
        setEmail(username);
        setPassword(password);
        setSignin();
    }

    public String getErrorMessage() {
       log.info("getting error message text from " + ErrorMessage.toString() );
        return getTextFromElement(ErrorMessage);
    }


}
