package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.By;

public class TopMenu extends Utility {

    By shippingLink = By.linkText("Shipping");
    By ShippingText = By.xpath("//h1[@id='page-title']");
    By newLink = By.linkText("New!");
    By newText = By.xpath("//span[contains(text(),'New!')]");
    By comingSoonLink = By.linkText("Coming Soon");
    By comingSoonText = By.xpath("//span[contains(text(),'Coming soon')]");
    By contactUsLink = By.linkText("Contact us");
    By contactUsText = By.xpath("//h1[@id='page-title']");


    public void clickOnShipping() {
        clickOnElement(shippingLink);


    }

    public String getShippingText() {
        return getTextFromElement(ShippingText);
    }


    public void clickOnNew() {
        clickOnElement(newLink);
    }

    public String getNewText() {
        return getTextFromElement(newText);


    }

    public void clickOnComingSoon() {
        clickOnElement(comingSoonLink);
    }

    public String getComingSoonText() {
        return getTextFromElement(comingSoonText);

    }

    public void clickOnContactUs() {
        clickOnElement(contactUsLink);
    }

    public String getContactUsText() {
        return getTextFromElement(contactUsText);
    }

}




