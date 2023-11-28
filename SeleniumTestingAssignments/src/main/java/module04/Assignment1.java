package module04;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	static WebDriver driver;

	public static void main(String[] args) {

		// ****************** Module 4: Assignment - 1 *************************

		/*
		 * 1. Automate Facebook Registration Page using Direct Locator's in Chrome
		 * Browser https://www.facebook.com/
		 * 2. Automate dropdowns part of Facebook Registration Page using Direct
Locator's in Firefox Browser- https://www.facebook.com/
		 */

		
		
		//  1. Automate Facebook Registration Page using Direct Locator's in Chrome
		// Browser https://www.facebook.com/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("demoFirstName");

		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("DemoLastName");

		WebElement mailidOrNumber = driver.findElement(By.name("reg_email__"));
		mailidOrNumber.sendKeys("demo@demomail.com");

		WebElement condirmMailidOrNumber = driver.findElement(By.name("reg_email_confirmation__"));
		condirmMailidOrNumber.sendKeys("demo@demomail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@id='password_step_input']"));
		password.sendKeys("demoPassword123");

		// dropdown
		WebElement birthDate = driver.findElement(By.id("day"));
		Select selector = new Select(birthDate);
		selector.selectByIndex(9);

		WebElement birthMonth = driver.findElement(By.id("month"));
		selector = new Select(birthMonth);
		selector.selectByValue("10");

		WebElement birthYear = driver.findElement(By.id("year"));
		selector = new Select(birthYear);
		selector.selectByVisibleText("2010");

		// radio button
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex'][@value='2']"));
		gender.click();

		// submit button is not automated because it will create a new account everytime
		// we run the script
		System.out.println("****************************chrome browser assignment ***************************");
		System.out.println("     FIRST NAME        = " + firstName.getAttribute("value"));
		System.out.println("     LAST NAME         = " + lastName.getAttribute("value"));
		System.out.println("    Email(or)NUMBER    = " + mailidOrNumber.getAttribute("value"));
		System.out.println("CONFIRM Email(or)NUMBER= " + condirmMailidOrNumber.getAttribute("value"));
		System.out.println("       PASSWORD        = " + password.getAttribute("value"));
		System.out.println("     birthDate         = " + birthDate.getAttribute("value"));
		System.out.println("     birthMonth        = " + birthMonth.getAttribute("value"));
		System.out.println("     birthYear         = " + birthYear.getAttribute("value"));

		if (gender.isSelected()) {
			System.out.println("GENDER selected = Male");
		} else {
			System.out.println("GENDER radio button not working");
		}

		driver.quit();

		// 2. Automate dropdowns part of Facebook Registration Page using Direct
		// Locator's in Firefox Browser- https://www.facebook.com/

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement birthDate1 = driver.findElement(By.id("day"));
		selector = new Select(birthDate1);
		selector.selectByIndex(1);

		WebElement birthMonth1 = driver.findElement(By.id("month"));
		selector = new Select(birthMonth1);
		selector.selectByValue("2");

		WebElement birthYear1 = driver.findElement(By.id("year"));
		selector = new Select(birthYear1);
		selector.selectByVisibleText("2002");
		System.out.println("************************firefox browser assignment**************************");
		System.out.println("     birthDate         = " + birthDate1.getAttribute("value"));
		System.out.println("     birthMonth        = " + birthMonth1.getAttribute("value"));
		System.out.println("     birthYear         = " + birthYear1.getAttribute("value"));

		driver.quit();
        
		
		
		
		
	}

}
