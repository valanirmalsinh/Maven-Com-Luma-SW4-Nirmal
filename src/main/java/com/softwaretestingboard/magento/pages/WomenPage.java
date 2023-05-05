package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WomenPage extends Utility {

   // Mouse Hover on Women Menu
   By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
   // Mouse Hover on Tops
   By tops = By.linkText("Tops");
   // Click on Jackets
   By clickOnJackets = By.linkText("Jackets");
   By selectByFilterProductName = By.xpath("//div[2]//div[3]//select[1]");
   By selectByFilterPrice= By.xpath("//select[@id='sorter']");
   By listLink=By.xpath("//div[2]//div[3]//select[1]/option[3]");
   By productLink=By.xpath("//div[2]//div[3]//select[1]/option[3]");

   public void mouseHoverOnWomen() {
      mouseHoverToElement(womenMenu);
   }
   public void mouseHoverOnTop() {
      mouseHoverToElement(tops);
   }
   public void clickOnJacket(){
      clickOnElement(clickOnJackets);
   }
   public void selectFiletrFromDropDownList() {
      clickOnElement(selectByFilterProductName);
   }
   public  void setSelectByFilterPrice(){
      selectByValueFromDropDown(selectByFilterPrice,"price");
   }
   public List getList(){
      List<WebElement> list=driver.findElements(listLink);
      List<String> orignalList= new ArrayList<>();
      for(WebElement e:list){
         orignalList.add(e.getText());
      }
      return orignalList;
   }
   public List getPriceList(){
      List<WebElement> products = driver.findElements(productLink);
      List<String> originalProductsPrice = new ArrayList<>();
      for (WebElement e : products) {
         originalProductsPrice.add(e.getText());
      }return originalProductsPrice;
   }
}

