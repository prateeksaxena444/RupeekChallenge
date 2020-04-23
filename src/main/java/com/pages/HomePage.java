package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.UtilityPrograms;

public class HomePage {

	UtilityPrograms up = new UtilityPrograms();
	By womenlink = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
	
	public void clickOnWoman(WebDriver driver)
	{
		driver.findElement(womenlink).click();
        up.waitForLoad(driver);
	}
}
