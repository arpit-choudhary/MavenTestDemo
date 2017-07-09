package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001{
	WebDriver driver;
	@Test
	public void fb_login()
	{
		System.out.println("Browser started");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     driver.findElement(By.name("firstname")).sendKeys("ankit");
	}

}
