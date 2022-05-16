package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenCategoryTest {
    @When("^I click on Women tab$")
    public void iClickOnWomenTab() {
        new HomePage().clickOnWomenTab();
    }

    @Then("^I can verify \"([^\"]*)\" text from the page$")
    public void iCanVerifyTextFromThePage(String women) {

        try {
            Assert.assertEquals("not women", women, new WomenPage().verifyWomenText());
        } catch (Exception e) {

        }


    }

    @And("^I select on product \"([^\"]*)\" from women page$")
    public void iSelectOnProductFromWomenPage(String product) {
        new WomenPage().selectProduct(product);
    }

    @And("^I clear the quantity from quantity$")
    public void iClearTheQuantityFromQuantity() {
        new ProductPage().setClearQuantity();
    }

    @And("^I change quantity \"([^\"]*)\" from product page$")
    public void iChangeQuantityFromProductPage(String qty) {
        new ProductPage().setChangeQuantity(qty);

    }

    @And("^I select size \"([^\"]*)\" of the product from drop dawn$")
    public void iSelectSizeOfTheProductFromDropDawn(String size) {
        new ProductPage().setSizedrop(size);
    }

    @And("^I select colour \"([^\"]*)\" of the product$")
    public void iSelectColourOfTheProduct(String colour) {
        new ProductPage().selectProduct(colour);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnCart();
    }

    @And("^I can see the massege \"([^\"]*)\"$")
    public void iCanSeeTheMassege(String prodadded) {


    }

    @Then("^I click on close button$")
    public void iClickOnCloseButton() {
        new ProductPage().clickOnClose();
    }


    @And("^I can see the message \"([^\"]*)\" product added successfully$")
    public void iCanSeeTheMessageProductAddedSuccessfully(String prodadded) {
        try {
            Thread.sleep(5000);
            Assert.assertEquals("product select", prodadded, new ProductPage().verifyProductSuccessfullyAddedToYourShoppingCart());
        } catch (Exception e) {
//
        }
    }
}
