package test_cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase01 {
	static WebDriver driver;
public static void main(String args[]){
	//open browser
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	//go to url
	driver.get("http://172.16.10.154:4200/#/login");
	//enter username
	WebElement userName = driver.findElement(By.xpath("//input[@name='user.name']"));
	userName.sendKeys("TestngM");
	//enter password
	WebElement password = driver.findElement(By.xpath("//input[@name='user.password']"));
	password.sendKeys("Vinoth@12");
	//submit
	WebElement loginbutton= driver.findElement(By.xpath("//button[@type='submit']"));
	loginbutton.click();
}
}
