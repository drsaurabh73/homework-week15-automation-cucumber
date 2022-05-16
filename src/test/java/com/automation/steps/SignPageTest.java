package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.LogoutPage;
import com.automation.pages.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignPageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Signin tab$")
    public void iClickOnSigninTab() {
        new HomePage().clickOnSignInTab();
    }

    @Then("^I can see the the message \"([^\"]*)\" signin successful$")
    public void iCanSeeTheTheMessageSigninSuccessful(String signinsuccess) {
        String expectedMessage = "AUTHENTICATION";
        Assert.assertEquals("sing in not successful", expectedMessage, new SignInPage().authentaication());
    }

    @And("^I enter the email \"([^\"]*)\" in the email field$")
    public void iEnterTheEmailInTheEmailField(String email) {
        new SignInPage().setEmail(email);

    }

    @And("^I enter the password \"([^\"]*)\" in the password field$")
    public void iEnterThePasswordInThePasswordField(String password) {
        new SignInPage().setPassword(password);
    }

    @And("^I click on signin buttton$")
    public void iClickOnSigninButtton() {
        new SignInPage().setSignin();
    }

    @Then("^I can see the sigout link dispayed on the screen$")
    public void iCanSeeTheSigoutLinkDispayedOnTheScreen() {
        String expectedMessage1 = "Sign out";
        Assert.assertEquals("sign out note displayed", expectedMessage1, new LogoutPage().verifyLogOutText());
    }

    @And("^I enter invalid username  \"([^\"]*)\" in the  field$")
    public void iEnterInvalidUsernameInTheField(String username) {
        new SignInPage().setEmail(username);

    }

    @And("^I enter invalid password  \"([^\"]*)\" in the password field$")
    public void iEnterInvalidPasswordInThePasswordField(String password) {
        new SignInPage().setPassword(password);
    }

    @Then("^I can see the error message \"([^\"]*)\" in the field$")
    public void iCanSeeTheErrorMessageInTheField(String message) {
        Assert.assertEquals("user name not required", message, new SignInPage().getErrorMessage());
    }

    @And("^I click on signout button$")
    public void iClickOnSignoutButton() {
        new LogoutPage().clickOnLogout();
    }

    @Then("^I can see sign in link is dispayed on screen$")
    public void iCanSeeSignInLinkIsDispayedOnScreen() {
        String expectedMessage3 = "Sign in";
        Assert.assertEquals("verify singin text", expectedMessage3, new SignInPage().verifySignInText());
    }
}
