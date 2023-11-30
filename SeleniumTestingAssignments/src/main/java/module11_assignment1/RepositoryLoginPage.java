package module11_assignment1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepositoryLoginPage {
	
	
	// ****************** Module 11: Assignment - 1 ************************
	
	/*Write a Test Script to automate www.saucedemo.com using Page Object Model
	● Create Maven Project
	● Use TestNG
	● Create Repository in Class File*/
	

	 @FindBy(id= "user-name")  
	 public static  WebElement userName;
	 
	 @FindBy(id = "password")
	 public static  WebElement password;
	  
	 @FindBy(id= "login-button")
	 public static  WebElement loginButton;
	 
	 public  String unm = "standard_user";
	 
	 public  String pwd = "secret_sauce";

	
	
	

}
