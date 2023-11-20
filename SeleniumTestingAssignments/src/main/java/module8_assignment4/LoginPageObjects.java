package module8_assignment4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	// ****************** Module 8: Assignment - 4 *************************

	// Write a Test Script to Automate www.saucedemo.com Login using Page Object Model.
	
	
	 @FindBy(id= "user-name")  
	 public static WebElement userName;
	 
	 @FindBy(id = "password")
	 public static WebElement password;
	  
	 @FindBy(id= "login-button")
	 public static WebElement loginButton;
	 
	
	 
	

}
