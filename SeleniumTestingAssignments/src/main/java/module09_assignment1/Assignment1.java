package module09_assignment1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment1 {

	// ****************** Module 9: Assignment - 1 *************************

	// Write a Test Script to Automate www.saucedemo.com Login in TestNG - Use Hard Coded Values.
	

	WebDriver driver;

	
	@BeforeTest
	public void goToUrl() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test
	public void Login() {
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
