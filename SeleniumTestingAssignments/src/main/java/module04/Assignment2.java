package module04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		    
		// ****************** Module 4: Assignment - 2 *************************
		
		
		// 1. Automate Oracle Registration Page in Chrome Browser
		// https://profile.oracle.com/myprofile/account/create-account.jspx
		
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		System.out.println("*****************Automate Oracle Registration Page in Chrome Browser**************");
		driver.get(" https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Email Address
		WebElement email = driver.findElement(By.id("sView1:r1:0:email::content"));
		email.click();
		email.sendKeys("demo@demomail.com");
		System.out.println("Email = " + email.getAttribute("value"));

		// Password
		WebElement password = driver.findElement(By.name("sView1:r1:0:password"));
		password.sendKeys("123456Aa$");
		System.out.println("password = " + password.getAttribute("value"));

		// Retype password
		WebElement retypePassword = driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		retypePassword.sendKeys("123456Aa$");
		System.out.println("retypePassword = " + retypePassword.getAttribute("value"));

		// Country
		WebElement country = driver.findElement(By.xpath("//select[@name='sView1:r1:0:country']"));
		Select select = new Select(country);
		select.selectByValue("IN");
		System.out.println("country = " + country.getAttribute("value"));

		// firstName
		WebElement firstName = driver.findElement(By.id("sView1:r1:0:firstName::content"));
		firstName.sendKeys("demoFirstName");
		System.out.println("firstName = " + firstName.getAttribute("value"));

		// lastName
		WebElement lastName = driver.findElement(By.name("sView1:r1:0:lastName"));
		lastName.sendKeys("demoLastName");
		System.out.println("lastName = " + lastName.getAttribute("value"));

		// job title
		WebElement jobTitle = driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		jobTitle.sendKeys("demojobTitle");
		System.out.println("jobTitle = " + jobTitle.getAttribute("value"));

		// work phone
		WebElement workPhone = driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		workPhone.sendKeys("987654321");
		System.out.println("workPhone = " + workPhone.getAttribute("value"));

		// company name
		WebElement companyName = driver.findElement(By.id("sView1:r1:0:companyName::content"));
		companyName.sendKeys("demoCompany");
		System.out.println("companyName = " + companyName.getAttribute("value"));

		// address
		WebElement address = driver.findElement(By.id("sView1:r1:0:address1::content"));
		address.sendKeys("demoAddress");
		System.out.println("address = " + address.getAttribute("value"));

		// city
		WebElement city = driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("demoCity");
		System.out.println("city = " + city.getAttribute("value"));

		// state or province
		WebElement stateOrProvince = driver.findElement(By.id("sView1:r1:0:state::content"));
		select = new Select(stateOrProvince);
		select.selectByIndex(10);
		System.out.println("stateOrProvince = " + stateOrProvince.getAttribute("title"));

		// postal code
		WebElement postalCode = driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		postalCode.sendKeys("6666666");
		System.out.println("postalCode = " + postalCode.getAttribute("value"));

		driver.quit();

		/*
		 * 2. Automate dropdowns part of Oracle Registration Page in Firefox Browser
		 * https://profile.oracle.com/myprofile/account/create-account.jspx
		 */

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("*********** Firefox Browser assignment****************");

		// Country
		WebElement country1 = driver.findElement(By.xpath("//select[@name='sView1:r1:0:country']"));
		select = new Select(country1);
		select.selectByValue("IN");
		System.out.println("country = " + country1.getAttribute("title"));

		// state or province
		WebElement stateOrProvince1 = driver.findElement(By.id("sView1:r1:0:state::content"));
		select = new Select(stateOrProvince1);
		select.selectByIndex(11);
		System.out.println("stateOrProvince = " + stateOrProvince1.getAttribute("title"));

		driver.quit();
		
		
	}

}
