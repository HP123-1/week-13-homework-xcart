package com.xcart.testsuit;

import com.xcart.pages.HotDeals;
import com.xcart.pages.SalePage;
import com.xcart.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByAtoZ extends TestBase {
    HotDeals hotdeal = new HotDeals();
    SalePage salepage = new SalePage();
    By sortedByAtoZ = By.xpath("//h5[@class = 'product-name']");
    By saleText = By.xpath("//h1[@id='page-title']");

    @Test
    public void verifyUserShouldNavigateToHotDealSuccessfully() {
        hotdeal.mouseHoverToHotDeal();
        hotdeal.clickOnSaleLink();
    }

    @Test

    public void verifyUserShouldNavigateToSalePageSuccessfully() {


        String expectedMessage = "Sale";
        String actualMessage = salepage.getSaleText();
        Assert.assertEquals(expectedMessage, actualMessage, "Verifiction failed: Sale");
    }

    @Test
    public void verifySaleProductArrangeAlphabetically() {

        salepage.mouseHoverToSortBy();
        //   salepage.clickOnNameAtoZ();


        List<WebElement> originalList = driver.findElements(sortedByAtoZ);
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductNameList.add(product.getText());
        }

        Collections.sort(originalProductNameList, Collections.reverseOrder());  // We sorted this list to descending
        System.out.println(originalProductNameList);

        //Sort by position "Name: A to Z"
        // selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: A to Z")
        salepage.clickOnNameAtoZ();

        //        Thread.sleep(3000);
        //waitUntilVisibilityOfElementLocated(sortedByAtoZ, 10);

        List<WebElement> afterSortingList = driver.findElements(sortedByAtoZ);
        List<String> afterSortingProductName = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);

        Assert.assertEquals(originalProductNameList, afterSortingProductName,"Product not sorted");


    }

}
