package module11_assignment3;

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

public class LoginActions {
	
	// ****************** Module 11: Assignment - 3*************************
	
	/*Write a Test Script to automate www.saucedemo.com Login using Page Object
	Model
	● Create Maven Project
	● Use TestNG
	● Use properties files to store Data and Objects*/
	
WebDriver driver;
    
	    public static Properties loadData() throws IOException {
		FileInputStream file = new FileInputStream(".\\src\\main\\java\\module11_assignment3\\prop.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop;
		
	}
	
	@BeforeTest
	public void goToUrl() throws IOException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(loadData().getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
	}

	@Test
	public void Login() throws IOException {
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
		driver.findElement(By.id(loadData().getProperty("idusername"))).sendKeys(loadData().getProperty("userName"));
		driver.findElement(By.id(loadData().getProperty("idPassword"))).sendKeys(loadData().getProperty("password"));
		driver.findElement(By.id(loadData().getProperty("idLoginButton"))).click();
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}
	
	
	
	
	

}
