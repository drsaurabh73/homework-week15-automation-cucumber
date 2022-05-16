package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement radioButton;


    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement firstname;


    @CacheLookup
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement lastname;


    @CacheLookup
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement email;


    @CacheLookup
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement password;


    @CacheLookup
    @FindBy(xpath = "//select[@id='days']")
    WebElement dateofBirth;


    @CacheLookup
    @FindBy(xpath = "//select[@id='months']")
    WebElement monthofBirth;


    @CacheLookup
    @FindBy(xpath = "//select[@id='years']")
    WebElement yearofBirth;


    @CacheLookup
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletter;


    @CacheLookup
    @FindBy(xpath = "//input[@id='optin']")
    WebElement specialoffer;


    @CacheLookup
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement nameaddress;


    @CacheLookup
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastaddress;


    @CacheLookup
    @FindBy(xpath = "//input[@id='company']")
    WebElement company;


    @CacheLookup
    @FindBy(xpath = "//input[@id='address1']")
    WebElement streetname;


    @CacheLookup
    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressline2;


    @CacheLookup
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;


    @CacheLookup
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;


    @CacheLookup
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postcode;


    @CacheLookup
    @FindBy(xpath = "//select[@id='id_country']")
    WebElement country;


    @CacheLookup
    @FindBy(xpath = "//textarea[@id='other']")
    WebElement additionalinfo;


    @CacheLookup
    @FindBy(xpath = "//input[@id='phone']")
    WebElement homephone;


    @CacheLookup
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobilenumber;


    @CacheLookup
    @FindBy(xpath = "//input[@id='alias']")
    WebElement assinref;


    @CacheLookup
    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement register;

    public void clickOnRadioButton() {
        clickOnElement(radioButton);
        log.info("Clicking on Radio Button " + radioButton.toString() );
    }

    public void setFirstname(String text) {
        sendTextToElement(firstname, text);
        log.info("getting firstname text " + firstname.toString() );
    }

    public void setLastname(String text) {
        sendTextToElement(lastname, text);
        log.info("getting lastname text  " + lastname.toString() );
    }

    public void setEmail(String text) {
        sendTextToElement(email, text);
        log.info("enter email " + text + " to email field " );
    }

    public void setPassword(String text) {
        sendTextToElement(password, text);
        log.info("enter password " + text + " to email field " );
    }

    public void setDateofBirth(String text) {
        selectByValueFromDropDown(dateofBirth, text);
        log.info("Selecting day " + text + "from dropdown" + dateofBirth.toString() );
    }

    public void setMonthofBirth(String text) {
        selectByValueFromDropDown(monthofBirth, text);
        log.info("Selecting month " + text + "from Dropdown" + monthofBirth.toString() );
    }


    public void setYearofBirth(String text) {
        selectByValueFromDropDown(yearofBirth, text);
        log.info("Selecting month " + text + "from Dropdown" + yearofBirth.toString() );
    }

    public void setNewsletter() {
        clickOnElement(newsletter);
        log.info("Clicking on newsletterbox " + newsletter.toString() );
    }

    public void setSpecialoffer() {
        clickOnElement(specialoffer);
        log.info("Clicking on specialoffer " + specialoffer.toString() );
    }

    public void setNameaddress(String text) {
        sendTextToElement(nameaddress, text);
        log.info("Enter name to deliver " + text + " to delivery address field " + nameaddress.toString() );
    }

    public void setLastaddress(String text) {
        sendTextToElement(lastaddress, text);
        log.info("Enter last name to deliver " + text + " to lastname to delivery address field " + lastaddress.toString() );
    }

    public void setCompany(String text) {
        sendTextToElement(company, text);
        log.info("Enter name to company " + text + " to company field " + company.toString() );
    }

    public void setStreetname(String text) {
        sendTextToElement(streetname, text);
        log.info("Enter street name to deliver " + text + " to street name field " + streetname.toString() );
    }

    public void setAddressline2(String text) {
        sendTextToElement(addressline2, text);
        log.info("Enter address line2 to deliver " + text + " to addressline 2 field " + addressline2.toString() );
    }

    public void setCity(String text) {
        sendTextToElement(city, text);
        log.info("Enter city name to deliver " + text + " to city field " + city.toString() );
    }


    public void setState(String text) {
        selectByVisibleTextFromDropDown(state, text);
        log.info("Enter state name to deliver " + text + " to state field " + state.toString() );
    }

    public void setPostcode(String text) {
        sendTextToElement(postcode, text);
        log.info("Enter post code to deliver " + text + " to postcode field " + postcode.toString() );
    }

    public void setCountry(String text) {
        selectByVisibleTextFromDropDown(country, text);
        log.info("Selecting country " + text + " from dropdown " + country.toString() );
    }

    public void setAdditionalinformation(String text) {
        sendTextToElement(additionalinfo, text);
        log.info("sending Additional information " + text + " from dropdown " + additionalinfo.toString() );
    }

    public void setHomephone(String text) {
        sendTextToElement(homephone, text);
        log.info("Enter homephone number " + text + " to phone number field " + homephone.toString() );
    }

    public void setMobilenumber(String text) {
        sendTextToElement(mobilenumber, text);
        log.info("Enter mobile number " + text + " to mobile number field " + mobilenumber.toString() );
    }

    public void setAssignAnAddressForFuture(String text) {
        sendTextToElement(assinref, text);
        log.info("Enter assign ref " + text + " to address for future field " + assinref.toString() );
    }

    public void setRegister() {

        clickOnElement(register);
        log.info("Clicking on register" + register.toString() );
    }


}
