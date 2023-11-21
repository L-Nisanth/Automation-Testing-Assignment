package module9_assignment4;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment4 {
	// ****************** Module 9: Assignment - 4 *************************
	/*
	 * Write a Test Script to Automate www.saucedemo.com Login in TestNG - Pass
	 * parameters from .properties file.
	 */

	WebDriver driver;
    
	public static Properties loadData() throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\main\\java\\module9_assignment4\\loginData.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop;
		
	}
	
	@BeforeTest
	public void goToUrl() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
	}

	@Test
	public void Login() throws IOException {
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(loadData().getProperty("userName"));
		driver.findElement(By.id("password")).sendKeys(loadData().getProperty("password"));
		driver.findElement(By.id("login-button")).click();
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	
	
}
