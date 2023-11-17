package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	static WebDriver driver;

	public static void main(String[] args) {

		// ****************** Module 5: Assignment - 2 *************************

		/*
		 * 1. Automate Facebook Login Page using Relative XPath in 2 different browsers
		 * https://www.facebook.com/
		 */
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement emailorPhone = driver.findElement(By.xpath("//input[@id='email']"));
		emailorPhone.sendKeys("demo@demomail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("123demo");
		
		System.out.println("***********output using firefox*************");
		System.out.println("email entered = " + emailorPhone.getAttribute("value"));
		System.out.println("password entered = " + password.getAttribute("value"));
		
		driver.quit();
		
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement emailorPhone2 = driver.findElement(By.xpath("//input[@id='email']"));
		emailorPhone2.sendKeys("demo@demomail.com");
		
		WebElement password2 = driver.findElement(By.xpath("//input[@id='pass']"));
		password2.sendKeys("123demo");
		
		System.out.println("***********output using edge browser*************");
		System.out.println("email entered = " + emailorPhone2.getAttribute("value"));
		System.out.println("password entered = " + password2.getAttribute("value"));
		driver.quit();
		
		
		
		
		
	}

}
