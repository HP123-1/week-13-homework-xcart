package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Shopping extends Utility {
    By sale = By.cssSelector("li[class='leaf has-sub'] li:nth-child(1) a:nth-child(1)");
    By saleText = By.xpath("//h1[@id='page-title']");
    By sortBY = By.xpath("//span[@class='sort-by-label']");
    By AtoZ = By.xpath("//a[normalize-space()='Name A - Z']");
    By product = By.xpath("//a[contains(text(),'Avengers: Fabrikations Plush')]/parent::h5/following-sibling::div//button");
    By addToCart = By.xpath("(//span[text()='Add to cart'])[1]");
    By popUp = By.xpath("//li[text()='Product has been added to your cart']");
    By popUpClose = By.xpath("//a[@class='close']");
    By popMessage = By.xpath("//li[text()='Product has been added to your cart']");
    By yourCart = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By viewCart = By.xpath("//span[normalize-space()='View cart']");
    By cartMessage = By.xpath("//h1[@id='page-title']");
    By checkBox = By.cssSelector("#amount16");
    By clearCheckBox = By.id("amount16");
    By subTotal = By.xpath("//ul[@class='totals']//li[@class='subtotal']");
    By total = By.xpath("//li[@class='total']");
    By checkOutButton = By.xpath("//button[@class='btn  regular-button regular-main-button checkout']");
    By loginYourAcc = By.xpath("//h3[normalize-space()='Log in to your account']");
    By Email = By.xpath("//input[@id='email']");
    By continueBTN = By.xpath("//span[normalize-space()='Continue']");
    By secureCheckOut = By.xpath("//h1[normalize-space()='Secure Checkout']");
    By firstName = By.xpath("//input[@id='shippingaddress-firstname']");
    By lastName = By.xpath("//input[@id='shippingaddress-lastname']");
    By street = By.xpath("//input[@id='shippingaddress-street']");
    By city = By.xpath("//input[@id='shippingaddress-city']");
    By state = By.xpath("//input[@id='shippingaddress-custom-state']");
    By country = By.xpath("//select[@id='shippingaddress-country-code']");

    By zipcode = By.xpath("//input[@id='shippingaddress-zipcode']");
    By acCheckBOx = By.xpath("//input[@id='create_profile']");
    By password = By.xpath("//input[@id='password']");
    By localshipping = By.xpath("//h1[text()=' Secure Checkout']");

    By cod = By.xpath("//input[@id='pmethod6']");
    By placeorder = By.xpath("//span[normalize-space()='Place order: $37.03']");
    By thankyou = By.xpath("//h1[@id='page-title']");


    public void clickOnSale() {
        clickOnElement(sale);
    }


    public String getSaleText() {
        return getTextFromElement(saleText);


    }

    public void mouseHoverToSortBy() {

        mouseHoverToElement(sortBY);
    }

    public void clickOnAtoZ() {

        clickOnElement(AtoZ);

    }


    public void mouseHoverOnProduct() {
        mouseHoverToElement(product);


    }

    public void clickAddToCart() {
        clickOnElement(addToCart);

    }

    public void verifyPopUPMessage1() {
        clickOnElement(popUp);
        clickOnElement(popUpClose);
    }

    public String getPopUpMessage() {

        String msg = getTextFromElement(popMessage);
        return msg;
    }

    public void clickOnYourCartAndViewCart() {
        clickOnElement(yourCart);
        clickOnElement(viewCart);
    }

    public String getCartMessageText() {
        return getTextFromElement(cartMessage);
    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }

    public void clearQtyInCheckBox() {
        driver.findElement(checkBox).clear();
        driver.findElement(checkBox).sendKeys("2");
    }

    public String getTextSubTotal() {
        return getTextFromElement(subTotal);
    }

    public String getTextTotal() {
        return getTextFromElement(total);
    }

    public void clickOnCheckOutButton() {
        clickOnElement(checkOutButton);
    }

    public String loginAccMsg() {
        return getTextFromElement(loginYourAcc);
    }

    public void sendTextToEmail(String email) {
        sendTextToElement(Email, email);
    }

    public void clickOncontinueButton() {
        clickOnElement(continueBTN);
    }

    public String secureCheckOutMsg() {
        return getTextFromElement(secureCheckOut);
    }

    public void firstNameField(String name) {
        sendTextToElement(firstName, name);
    }

    public void lastNameField(String name) {
        sendTextToElement(lastName, name);
    }

    public void streetField(String street1) {
        sendTextToElement(street, street1);
    }

    public void cityField(String city1) {
        sendTextToElement(city, city1);
    }

    public void countryCode(String Code) {
        sendTextToElement(country, Code);
    }

    public void stateField(String State) {
        sendTextToElement(state, State);
    }

    public void zipCodeField(String zipCode) {
        sendTextToElement(zipcode, zipCode);
    }

    public void clickOnCreatAccount() {
        clickOnElement(acCheckBOx);
    }

    public void enterPassWord(String Password) {
        sendTextToElement(password, Password);
    }

    public void scrollTillElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }


    public void clickOnlocalShipping() {
        clickOnElement(localshipping);


    }

    public void clickOnCOD() {
        clickOnElement(cod);
    }

    public void placeOrder() {
        clickOnElement(placeorder);
    }

    public String getThankYouOrder() {
        String thankyoumsg = getTextFromElement(thankyou);
        return thankyoumsg;

    }
}
