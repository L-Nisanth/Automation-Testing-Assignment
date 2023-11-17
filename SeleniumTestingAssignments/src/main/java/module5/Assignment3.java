package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		                   
		             // ****************** Module 5: Assignment - 3 *************************
		
		
	/*	Tasks To Be Performed:
		1. Automate Facebook Login Page using Relative XPath Axis in 2 different
		browsers https://www.facebook.com/  */
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement emailorPhone = driver.findElement(By.xpath("//form/descendant::div[1]/child::div[1]/input"));
		emailorPhone.sendKeys("demo@demomail.com");
		
		WebElement password = driver.findElement(By.xpath("//form/descendant::div[1]/child::div[2]/child::div/child::input"));
		password.sendKeys("123demo");
		
		System.out.println("***********output using chrome*************");
		System.out.println("email entered = " + emailorPhone.getAttribute("value"));
		System.out.println("password entered = " + password.getAttribute("value"));
		
		driver.quit();
		
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement emailorPhone2 = driver.findElement(By.xpath("//form/descendant::div[1]/child::div[1]/input"));
		emailorPhone2.sendKeys("demo@demomail.com");
		
		WebElement password2 = driver.findElement(By.xpath("//form/descendant::div[1]/child::div[2]/child::div/child::input"));
		password2.sendKeys("123demo");
		
		System.out.println("***********output using firefox *************");
		System.out.println("email entered = " + emailorPhone2.getAttribute("value"));
		System.out.println("password entered = " + password2.getAttribute("value"));
		driver.quit();
		
		
		
		
		

	}

}
