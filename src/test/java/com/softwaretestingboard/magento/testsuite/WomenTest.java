package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        womenPage.mouseHoverOnWomen();
        womenPage.mouseHoverOnTop();
        womenPage.clickOnJacket();
        womenPage.selectFiletrFromDropDownList();
        List originalList=womenPage.getPriceList();
        Collections.sort(originalList);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='sorter']"), "Product Name");
        List listAfterSorting=womenPage.getList();
        Assert.assertEquals(originalList, listAfterSorting);
    }

    @Test
    public void verifyTheSortByPriceFilter() {
        womenPage.mouseHoverOnWomen();
        womenPage.mouseHoverOnTop();
        womenPage.clickOnJacket();
        womenPage.setSelectByFilterPrice();
        List originalList=womenPage.getList();
        Collections.sort(originalList);
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='sorter']"), "Price");
        List actualList=womenPage.getList();
        Assert.assertEquals(originalList, actualList);
    }
}
