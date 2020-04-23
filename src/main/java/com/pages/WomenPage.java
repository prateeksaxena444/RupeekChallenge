package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomenPage {

	By scrollbar = By.xpath("//*[@id=\"layered_price_slider\"]/a[2]");
	
	public void scollPriceBar(WebDriver driver) throws InterruptedException
	{
	 WebElement slider = driver.findElement(scrollbar);

	    for (int i = 1; i <= 68 ; i++) {
	            slider.sendKeys(Keys.ARROW_LEFT);
	        }
       Thread.sleep(3000);
	}
	
	public void printProdctDtails(WebDriver driver)
	{
		List<WebElement> resultsListname = driver.findElements(By.className("product-name"));
		for(int i =1;i<resultsListname.size()-1;i++)
		{
			String price = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li["+i+"]/div/div[2]/div[1]/span")).getText();
			String name =  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li["+i+"]/div/div[2]/h5/a")).getText();
			float actualprice = Float.parseFloat(price.substring(1));
			
			if(actualprice<=28.00)
			  System.out.println(name +" : "+price);		
		}
		
	}
	
}
//*[@id="center_column"]/ul/li[1]/div/div[2]/h5/a
//*[@id="center_column"]/ul/li[2]/div/div[2]/h5/a
