package com.ActinsKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_KeyWords {
	static WebDriver driver;
	
	//openBrowser()
	public static void openBrowser(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	//goTourl()
	public static void goToUrl(){
		driver.get("http://172.16.10.154:4200/#/login");
	}
	
	//enterUserName()
	public static void enterUserName(){
		WebElement userName = driver.findElement(By.xpath("//input[@name='user.name']"));
		userName.sendKeys("TestngM");
	}
	//enterPassword()
	public static void enterPassword(){
		WebElement password = driver.findElement(By.xpath("//input[@name='user.password']"));
		password.sendKeys("Vinoth@12");
	}
	//clickLogin()
	
	public static void clickLogin(){
		WebElement loginbutton= driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
	}
}
