package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement product;


    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement clearQuantity;

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement sizedrop;


    @FindBy(xpath = "//a[@name='White']")
    WebElement white;


    @FindBy(xpath = "//a[@title='Orange']")
    WebElement orange;


    @FindBy(xpath = "//a[@title='Green']")
    WebElement green;


    @FindBy(xpath = "//a[@title='Blue']")
    WebElement blue;


    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addtocart;


    @FindBy(xpath = "//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
    WebElement actualMessage1;


    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
    WebElement close;

    public void setProduct(){
        log.info("Clicking on Product " + product.toString() );
        clickOnElement(product);
    }



    public void setClearQuantity() {

        clearTextToElement(clearQuantity);// clear quantity
    }


    public void setChangeQuantity(String text) {
        sendTextToElement(clearQuantity, text);
        log.info("Enter the quantity " + text + " to new quantity field " + clearQuantity.toString() );
    }



    public void setSizedrop(String text) {
        selectByVisibleTextFromDropDown(sizedrop, text);
        log.info("Selecting Dress size  "+ text +" from dropdown "+sizedrop.toString() );
    }






    public void clickOnCart() {
        clickOnElement(addtocart);
        log.info("Clicking on add to cart " + addtocart.toString() );
    }



    public String verifyProductSuccessfullyAddedToYourShoppingCart() {
       log.info("getting Message product added successfully in shopping cart text  "+ actualMessage1.toString());
        return getTextFromElement(actualMessage1);
    }



    public void clickOnClose() {
        log.info("Clicking on close " + close.toString() );
        clickOnElement(close);
    }

    public void selectProduct(String text) {
        if(text == "White") {
            clickOnElement(white);
            log.info("Clicking on colour " + white.toString());
        }

        if(text == "Orange") {
            clickOnElement(orange);
            log.info("Clicking on Printed Dress " + orange.toString());
        }
        if(text == "Green") {
            clickOnElement(green);
            log.info("Clicking on Printed Chiffon Dress " + green.toString());
        }
        if(text == "Blue") {
            clickOnElement(blue);
            log.info("Clicking on Printed Summer Dress with Price tag $28.98 " + blue.toString());
        }
    }

}
