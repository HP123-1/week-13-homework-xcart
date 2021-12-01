package com.xcart.testsuit;

import com.xcart.pages.*;
import com.xcart.testbase.TestBase;
import com.xcart.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HotDeals hotdeal = new HotDeals();
    SalePage salepage = new SalePage();
    BestSellers bestseller = new BestSellers();
    Shopping shopping = new Shopping();
    ClearShoppingCart cart = new ClearShoppingCart();

    @Test
    public void verifyUserShouldNavigateToHotDealSuccessfully() {
        hotdeal.mouseHoverToHotDeal();
        hotdeal.clickOnSaleLink();
    }

    @Test

    public void verifyUserShouldNavigateToSalePageSuccessfully() {

        hotdeal.mouseHoverToHotDeal();
        hotdeal.clickOnSaleLink();
        String expectedMessage = "Sale";
        String actualMessage = salepage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Verifiction failed: Sale");
    }

    @Test
    public void verifySaleProductArrangeAlphabetically() throws InterruptedException {
        hotdeal.mouseHoverToHotDeal();
        shopping.clickOnSale();
        shopping.mouseHoverToSortBy();
        Thread.sleep(5000);
        shopping.clickOnAtoZ();
        //mousehover doesn't work
    }

    @Test
    public void verifythatUserShouldPlaceOrderSuccessfullyForCupOfMojoBluetooth() throws InterruptedException {
        hotdeal.mouseHoverToHotDeal();
        hotdeal.clickOnSaleLink();
        shopping.mouseHoverToSortBy();
        salepage.clickOnNameAtoZ();
        shopping.mouseHoverOnProduct();
        Thread.sleep(600);
        shopping.clickAddToCart();

        shopping.verifyPopUPMessage1();
        String expectedMsg = "Product has been added to your cart";
        String actualMsg = shopping.getPopUpMessage();
        Assert.assertEquals(expectedMsg, actualMsg, "Verification failed for Text : Product has been added to your cart");


        shopping.clickOnYourCartAndViewCart();
        String expectedMsgcart = "Your shopping cart - 1 item";
        String actualMsgcart = shopping.getCartMessageText();
        Assert.assertEquals(expectedMsgcart, actualMsgcart, "Verification failed for Text : Your shopping cart - 1 item");

        shopping.clickOnCheckBox();
        shopping.clearQtyInCheckBox();

        String expectedMsgcart1 = "Your shopping cart - 2 item";
        String actualMsgcart1 = shopping.getCartMessageText();
        Assert.assertEquals(expectedMsgcart1, actualMsgcart1, "Verification failed for Text : Your shopping cart - 2 item");


        String expectedTotal = "Subtotal:\n$14.99";
        String actualTotal = shopping.getTextSubTotal();
        Assert.assertEquals(expectedTotal, actualTotal, "Verification failed for Text : Subtotal: $29.98");


        String totalAmount = "$36.00";                     //verify Total
        String realTotalAmount = shopping.getTextTotal();
        Assert.assertEquals(totalAmount, realTotalAmount, "Total Is Incorrect");

        shopping.clickOnCheckOutButton();


        String expectedloginAcMsg = "Log in to your account";
        //verify account login msg
        String actualloginAcMsg = shopping.loginAccMsg();
        Assert.assertEquals(expectedloginAcMsg, actualloginAcMsg, "Log in to your account");

        shopping.sendTextToEmail("abc@yahoo.com");

        shopping.clickOncontinueButton();

        String expectedchkmsg = "Secure Checkout";
        String actualchkmsg = shopping.secureCheckOutMsg();
        Assert.assertEquals(expectedchkmsg, actualchkmsg, "Verification failed for Text :  Secure Checkout");

        shopping.firstNameField("Ram");
        shopping.lastNameField("Ravan");
        shopping.streetField("502,Mandodari Street");
        shopping.cityField("Lanka");
        shopping.countryCode("Shri Lanka");
        shopping.stateField("RamRajya");
        shopping.zipCodeField("ha2 8lb");
        shopping.clickOnCreatAccount();
        shopping.enterPassWord("vibhishan1234");
        Thread.sleep(3000);
        WebElement header = driver.findElement(By.xpath("//h1[text()=' Secure Checkout']"));
        Thread.sleep(2000);
        shopping.clickOnlocalShipping();
        shopping.clickOnCOD();
        shopping.placeOrder();

        String expectedThkmsg = "Thank you for your order";
        String actualThkmsg = shopping.getThankYouOrder();
        Assert.assertEquals(expectedThkmsg, actualThkmsg, "Verification failed for Text : Thank you for your order");
    }

    @Test

    public void verifyThatUserShouldClearShoppingCartSuccessfully() {
        cart.mouseHoverToHotDeal1();
        cart.clickOnBestseller();
        cart.mouseHoverToSortBy();
        cart.clickOnNameAtoZ();
        cart.clickOnvinyl();
        cart.clickOnAddToCart();

        String expectedMsg = "Product has been added to your cart";
        String actualMsg = cart.getTextAddToCart();
        Assert.assertEquals(expectedMsg, actualMsg, "Verification failed for Text : Product has been added to your cart");
        cart.clickOnClose();

        cart.clickOnYourCartAndViewCart();
        String expectedMsgcart = "Your shopping cart - 1 item";
        String actualMsgcart = cart.getCartMessageText();
        Assert.assertEquals(expectedMsgcart, actualMsgcart, "Verification failed for Text : Your shopping cart - 1 item");


        cart.emptycart();
        String emptycartmsg1 = "Your cart is empty";

        String actualMsgcart1 = cart.getEmptyCartmsg();
        Assert.assertEquals(emptycartmsg1, actualMsgcart1, "Verification failed for Text : Your cart is empty");


    }


}





