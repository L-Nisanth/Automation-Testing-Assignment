package module8_assignment4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {

	public static void main(String[] args) {
		

		// ****************** Module 8: Assignment - 4 *************************

		// Write a Test Script to Automate www.saucedemo.com Login using Page Object Model.
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		PageFactory.initElements(driver, LoginPageObjects.class);
		
		LoginPageObjects.userName.sendKeys("standard_user");
		
		LoginPageObjects.password.sendKeys("secret_sauce");
		
		LoginPageObjects.loginButton.click();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		
		

	}

}
