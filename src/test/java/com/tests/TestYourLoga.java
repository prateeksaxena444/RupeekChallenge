package com.tests;

import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.WomenPage;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestYourLoga {
  
	public static WebDriver driver;
	WomenPage wp = new WomenPage();
	HomePage hp =new HomePage();
	
	@BeforeClass(description = "Initializing Chrome driver")
	 
	public static void firefoxSetUp() throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prateek\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://automationpractice.com/index.php");
	}
	
	@Test(priority =0)
	  public void checkingPageTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "My Store");
	  }
	
	@Test(priority=1)
	public void click_on_woman_and_verify_page()
	{
		hp.clickOnWoman(driver);
		String title= driver.getTitle();
		Assert.assertEquals(title, "Women - My Store");
	}
	
	
	@Test(priority=2)
	public void filterbyPrice() 
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1500)");
		 wp.scollPriceBar(driver);
	}
	
	@Test(priority=3)
	public void print_product_details()
	{
		wp.printProdctDtails(driver);
	}
	 
	@AfterClass(description = "closing chromer driver")
	public void afterclass(){
	driver.close();
	}
	
	
  

  
}
