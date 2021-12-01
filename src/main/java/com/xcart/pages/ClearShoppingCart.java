package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.By;

public class ClearShoppingCart extends Utility {
    By HotDeal1 = By.xpath("//ul[@class='nav navbar-nav top-main-menu']//span[@class='primary-title'][normalize-space()='Hot deals']");
    By bestSellers = By.linkText("Bestsellers");
    By getBestSellerstxt = By.xpath("//li[@class='info']");

    By AtoZ = By.xpath("//a[normalize-space()='Name A - Z']");
    By addToCartvinyl = By.xpath("//img[@alt='Vinyl Idolz: Ghostbusters']");
    By addToCart = By.xpath("//button[@class='btn  regular-button regular-main-button add2cart submit']");
    By sortBY = By.xpath("//li[@class='leaf active has-sub']//span[contains(text(),'Sale')]");
    By AToZ = By.xpath("//a[normalize-space()='Name A - Z']");
    By addToCartmsg = By.xpath("//li[@class='info']");
    By close = By.xpath("//a[@class='close']");
    By yourCart = By.xpath("//div[@class='lc-minicart lc-minicart-horizontal collapsed recently-updated']");
    By viewCart = By.xpath("//span[normalize-space()='View cart']");
    By cartMessage = By.xpath("//h1[@id='page-title']");
    By emptycart = By.xpath("//a[normalize-space()='Empty your cart']");
    By emptycartmsg = By.xpath("//h1[text()='Your cart is empty']");


    public void mouseHoverToHotDeal1() {
        mouseHoverToElement(HotDeal1);

    }

    public void clickOnBestseller() {
        clickOnElement(bestSellers);
    }

    public String getTextBestSeller() {
        String bstxt = getTextFromElement(bestSellers);
        return bstxt;

    }

    public void mouseHoverToSortBy() {

        mouseHoverToElement(sortBY);

    }

    public void clickOnNameAtoZ() {
        clickOnElement(AToZ);
    }

    public void clickOnvinyl() {
        clickOnElement(addToCartvinyl);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);

    }

    public String getTextAddToCart() {
        String productmsg = getTextFromElement(addToCartmsg);
        return productmsg;

    }

    public void clickOnClose() {
        clickOnElement(close);
    }

    public void clickOnYourCartAndViewCart() {
        clickOnElement(yourCart);
        clickOnElement(viewCart);


    }

    public String getCartMessageText() {
        return getTextFromElement(cartMessage);
    }

    public void emptycart() {
        clickOnElement(emptycart);
    }

    public String getEmptyCartmsg() {
        return getTextFromElement(emptycartmsg);
    }

}

