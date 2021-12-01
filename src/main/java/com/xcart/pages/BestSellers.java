package com.xcart.pages;

import com.xcart.utility.Utility;
import org.openqa.selenium.By;

public class BestSellers extends Utility {
    By bestSellers = By.linkText("Bestsellers");
    By zToa = By.xpath("//a[normalize-space()='Name Z - A']");
    By sortByB = By.xpath("//span[@class='sort-by-label']");
    By highToLow = By.xpath("//span[text()='Price High - Low']");
    By ratesB = By.xpath("//span[text()='Rates ']");




    public void clickOnBestseller() {
        clickOnElement(bestSellers);
        //need to verify bestseller
    }

    public void clickOnzToa() {
        clickOnElement(zToa);
        //need t verify ZtoA
    }

    public void clickOnHighToLow() {
        clickOnElement(highToLow);
    }

    public void clickOnRates(){
        clickOnElement(ratesB);
    }
    public void mouseHoverToSorBy(){
        mouseHoverToElement(sortByB);
    }

}

