package com.xcart.pages;

import com.xcart.utility.Utility;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalePage extends Utility {
    By sale = By.cssSelector("li[class='leaf has-sub'] li:nth-child(1) a:nth-child(1)");
    By saleText = By.xpath("//h1[@id='page-title']");
    By sortBY = By.xpath("//li[@class='leaf active has-sub']//span[contains(text(),'Sale')]");
    By AtoZ = By.xpath("//a[normalize-space()='Name A - Z']");
    By sortedByAtoZ = By.xpath("//h5[@class = 'product-name']");
    By lowToHigh = By.xpath("//a[normalize-space()='Price Low - High']");
    By rates = By.xpath("//a[normalize-space()='Rates']");


    public void clickOnSale() {
        clickOnElement(sale);
    }


    public String getSaleText() {
        return getTextFromElement(saleText);


    }

    public void mouseHoverToSortBy() {

        mouseHoverToElement(sortBY);

    }

    public void clickOnNameAtoZ() {
        clickOnElement(AtoZ);
//verify AtoZ-need to finish
    }

    public void clickOnLowToHigh() {
        clickOnElement(lowToHigh);
        //verify low To high--need to finish

    }

    public void clickOnRates() {
        clickOnElement(rates);
    }

}



