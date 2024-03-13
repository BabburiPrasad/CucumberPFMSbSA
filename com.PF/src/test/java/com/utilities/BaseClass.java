package com.utilities;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseClass 
{
	public static WebDriver driver;
	static String testdatapath = "C:\\Users\\HP\\Documents\\SeleniumPractice\\CucumberPFMSbSA\\com.PF\\src\\test\\resources\\ConfigData\\TestData.properties";

	@SuppressWarnings("deprecation")
	public static WebDriver lauchBrowser()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");		
		return driver;	
	}
	
	public static void visit(String url)
	{
		driver.get(url);
	}
	
	public static void sendKeys(WebElement e, String data)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(e));
		
		try
		{
			e.sendKeys(data);
		}
		catch (Exception e2)
		{
			e2.printStackTrace();
		}
	}
	public static void getText(WebElement e)
	{
		e.getText();
	}
	
	public static void click(WebElement e)
	{
		e.click();
	}
	
	public static void sleep(int sec)
	{
		try 
		{
			Thread.sleep(sec);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void asserttext(String actual, String expected)
	{
		Assert.assertEquals(actual, expected);
	}
	public static String getData(String Key)
	{
		String property = null;
		Properties p = new Properties();
		try
		{
			FileReader fr = new FileReader(testdatapath);
			p.load(fr);
			property = p.getProperty(Key);
			
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return property;
	}
	
}
