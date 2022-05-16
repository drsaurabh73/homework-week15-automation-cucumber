package com.automation.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.MyAccount;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class CreateAccountTest {
    @And("^I click on create an account button$")
    public void iClickOnCreateAnAccountButton() {
        new SignInPage().setCreateaccountbutton();
    }

    @And("^I click on Radio button$")
    public void iClickOnRadioButton() {
        new CreateAccountPage().clickOnRadioButton();
    }

    @And("^I entered firstname \"([^\"]*)\" in the name field$")
    public void iEnteredFirstnameInTheNameField(String firstname) {
        new CreateAccountPage().setFirstname(firstname);


    }

    @And("^I entered lastname \"([^\"]*)\" in the last name field$")
    public void iEnteredLastnameInTheLastNameField(String lastname) {
        new CreateAccountPage().setLastname(lastname);

    }

    @And("^I entered password \"([^\"]*)\" in the password field$")
    public void iEnteredPasswordInThePasswordField(String password) {
        new CreateAccountPage().setPassword(password);

    }

    @And("^I entered day of birth \"([^\"]*)\" in the field$")
    public void iEnteredDayOfBirthInTheField(String day) {
        new CreateAccountPage().setDateofBirth(day);

    }

    @And("^I entered month of birth \"([^\"]*)\" in the month field$")
    public void iEnteredMonthOfBirthInTheMonthField(String month) {
        new CreateAccountPage().setMonthofBirth(month);
    }

    @And("^I entered year of birth \"([^\"]*)\" in the year field$")
    public void iEnteredYearOfBirthInTheYearField(String year) {
        new CreateAccountPage().setYearofBirth(year);

    }

    @And("^I click on newsletter button$")
    public void iClickOnNewsletterButton() {
        new CreateAccountPage().setNewsletter();
    }

    @And("^I clcik on receive special offer$")
    public void iClcikOnReceiveSpecialOffer() {
        new CreateAccountPage().setSpecialoffer();
    }

    @And("^I entered name to deliver \"([^\"]*)\" in the name field$")
    public void iEnteredNameToDeliverInTheNameField(String delname) {
        new CreateAccountPage().setNameaddress(delname);
    }

    @And("^I entered last name to deliver \"([^\"]*)\" in the last name field$")
    public void iEnteredLastNameToDeliverInTheLastNameField(String dellast) {
        new CreateAccountPage().setAddressline2(dellast);

    }

    @And("^I entered address \"([^\"]*)\" in the address field$")
    public void iEnteredAddressInTheAddressField(String address) {
        new CreateAccountPage().setStreetname(address);

    }

    @And("^I entered addressline \"([^\"]*)\" in the addressline field$")
    public void iEnteredAddresslineInTheAddresslineField(String addline2) {
        new CreateAccountPage().setAddressline2(addline2);

    }


    @And("^I entered city \"([^\"]*)\" in the city field$")
    public void iEnteredCityInTheCityField(String city) {
        new CreateAccountPage().setCity(city);

    }

    @And("^I entered state \"([^\"]*)\" in the state field$")
    public void iEnteredStateInTheStateField(String state) {
        new CreateAccountPage().setState(state);

    }

    @And("^I entered zipcode \"([^\"]*)\" in the zipcode field$")
    public void iEnteredZipcodeInTheZipcodeField(String zipcode) {
        new CreateAccountPage().setPostcode(zipcode);

    }

    @And("^I entered country name \"([^\"]*)\" in the field$")
    public void iEnteredCountryNameInTheField(String country) {
        new CreateAccountPage().setCountry(country);

    }

    @And("^I entered additional infomation \"([^\"]*)\" in the field$")
    public void iEnteredAdditionalInfomationInTheField(String addinfo) {
        new CreateAccountPage().setAdditionalinformation(addinfo);

    }

    @And("^I entered home telephone number \"([^\"]*)\" in the field$")
    public void iEnteredHomeTelephoneNumberInTheField(String homephone) {
        new CreateAccountPage().setHomephone(homephone);

    }

    @And("^I entered Mobile number \"([^\"]*)\" in the field$")
    public void iEnteredMobileNumberInTheField(String mobile) {
        new CreateAccountPage().setMobilenumber(mobile);

    }

    @And("^I entered Assign an address \"([^\"]*)\" in the field$")
    public void iEnteredAssignAnAddressInTheField(String assadd) {
        new CreateAccountPage().setAssignAnAddressForFuture(assadd);

    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().setRegister();
    }

    @And("^I enter the email \"([^\"]*)\" in the email field create account page$")
    public void iEnterTheEmailInTheEmailFieldCreateAccountPage(String email)  {
    new CreateAccountPage().setEmail(email);
    }

    @Then("^I can see account \"([^\"]*)\" field$")
    public void iCanSeeAccountField(String account) throws Throwable {
        Assert.assertEquals("not my account", account, new MyAccount().verifyMyAccount());
    }
}
