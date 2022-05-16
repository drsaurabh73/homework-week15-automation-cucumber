package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());

    public WomenPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Women')]")
    WebElement women;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement tops;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement dresses;


    @CacheLookup
    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortby;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/div[3]/div[1]/ul[1]/li[3]/a[1]/i[1]")
    WebElement listproduct;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[2]/div[1]/div[2]/h5[1]/a[1]")
    WebElement blouse;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[3]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedDress;


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Printed Chiffon Dress')]")
    WebElement printedChiffonDress;


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[5]/div[1]/div[2]/h5[1]/a[1]")
    WebElement printedSummerDress;

    public String verifyWomenText() {
        log.info("getting verify women text from " + women.toString() );
        return getTextFromElement(women);
    }


    public void setTops() {
        clickOnElement(tops);
        log.info("Clicking on tops" + tops.toString() );
    }


    public void setDresses() {
        clickOnElement(dresses);
        log.info("Clicking on Dresses" + dresses.toString() );
    }


    public void clickonSortBy() {
        clickOnElement(sortby);
        log.info("Clicking on sort by" + sortby.toString() );
    }


    public void clickOnListProduct() {
        clickOnElement(listproduct);
        log.info("Clicking on List of products" + listproduct.toString() );
    }


    public void selectProduct(String text) {

        if (text.equalsIgnoreCase("Blouse") ) {
            clickOnElement(blouse);
            log.info("Clicking on Blouse " + blouse.toString());
        }

        if (text.equalsIgnoreCase("Printed Dress")  ) {
            clickOnElement(printedDress);
            log.info("Clicking on Printed Dress " + printedDress.toString());
        }
        if (text.equalsIgnoreCase("Printed Chiffon Dress") ) {
            clickOnElement(printedChiffonDress);
            log.info("Clicking on Printed Chiffon Dress " + printedChiffonDress.toString());
        }
        if (text.equalsIgnoreCase("Printed Summer Dress with Price $28.98")  ) {
            clickOnElement(printedSummerDress);
            log.info("Clicking on Printed Summer Dress with Price tag $28.98 " + printedSummerDress.toString());
        }
    }
}
