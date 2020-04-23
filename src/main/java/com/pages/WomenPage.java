package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomenPage {

	By scrollbar = By.xpath("//*[@id=\"layered_price_slider\"]/a[2]");
	
	public void scollPriceBar(WebDriver driver)
	{
	 WebElement slider = driver.findElement(scrollbar);

	    for (int i = 1; i <= 68 ; i++) {
	            slider.sendKeys(Keys.ARROW_LEFT);
	        }

	}
	
	public void printProdctDtails(WebDriver driver)
	{
		List<WebElement> resultsListname = driver.findElements(By.className("product-name"));
		List<WebElement> resultsListprice = driver.findElements(By.className("price product-price"));
		
		
		for(WebElement result:resultsListname)
		{
			System.out.println(result.getText());
		}
		
		for(WebElement result:resultsListprice)
		{
			System.out.println(result.getText());
		}
	}
	
}
