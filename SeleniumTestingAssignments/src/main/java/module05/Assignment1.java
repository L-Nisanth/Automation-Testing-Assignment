package module05;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment1 {
	static WebDriver driver;
    @Test
	public void test() {

		// ****************** Module 5: Assignment - 1 *************************

		/*
		 * 1 . Automate Facebook Registration Page using Relative XPath in 2 different
		 * Browsers https://www.facebook.com/
		 */

		// using chrome browser
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("demoFirstname");

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("DemoLastName");

		WebElement mailidOrNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mailidOrNumber.sendKeys("demo@demomail.com");

		WebElement condirmMailidOrNumber = driver.findElement(
				By.xpath("//input[@aria-label='Re-enter email address'][@name='reg_email_confirmation__']"));
		condirmMailidOrNumber.sendKeys("demo@demomail.com");

		WebElement password = driver.findElement(By.xpath("//input[@type='password'][@id='password_step_input']"));
		password.sendKeys("demoPassword123");

		WebElement birthDate = driver.findElement(By.xpath("//select[@id='day']"));
		Select selection = new Select(birthDate);
		selection.selectByIndex(9);

		WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));
		selection = new Select(birthMonth);
		selection.selectByValue("10");

		WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
		selection = new Select(birthYear);
		selection.selectByVisibleText("2010");

		WebElement gender = driver.findElement(By.xpath("//input[@name='sex'][@value='2']"));
		gender.click();

		System.out.println("***********using chrome browser************");
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

		// using edge browser
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		WebElement firstName1 = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName1.sendKeys("demoFirstname");

		WebElement lastName1 = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastName1.sendKeys("DemoLastName");

		WebElement mailidOrNumber1 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mailidOrNumber1.sendKeys("demo@demomail.com");

		WebElement condirmMailidOrNumber1 = driver.findElement(
				By.xpath("//input[@aria-label='Re-enter email address'][@name='reg_email_confirmation__']"));
		condirmMailidOrNumber1.sendKeys("demo@demomail.com");

		WebElement password1 = driver.findElement(By.xpath("//input[@type='password'][@id='password_step_input']"));
		password1.sendKeys("demoPassword123");

		WebElement birthDate1 = driver.findElement(By.xpath("//select[@id='day']"));
		selection = new Select(birthDate1);
		selection.selectByIndex(9);

		WebElement birthMonth1 = driver.findElement(By.xpath("//select[@id='month']"));
		selection = new Select(birthMonth1);
		selection.selectByValue("10");

		WebElement birthYear1 = driver.findElement(By.xpath("//select[@id='year']"));
		selection = new Select(birthYear1);
		selection.selectByVisibleText("2010");

		WebElement gender1 = driver.findElement(By.xpath("//input[@name='sex'][@value='2']"));
		gender1.click();

		System.out.println("***********using edge browser************");
		System.out.println("     FIRST NAME        = " + firstName1.getAttribute("value"));
		System.out.println("     LAST NAME         = " + lastName1.getAttribute("value"));
		System.out.println("    Email(or)NUMBER    = " + mailidOrNumber1.getAttribute("value"));
		System.out.println("CONFIRM Email(or)NUMBER= " + condirmMailidOrNumber1.getAttribute("value"));
		System.out.println("       PASSWORD        = " + password1.getAttribute("value"));
		System.out.println("     birthDate         = " + birthDate1.getAttribute("value"));
		System.out.println("     birthMonth        = " + birthMonth1.getAttribute("value"));
		System.out.println("     birthYear         = " + birthYear1.getAttribute("value"));

		if (gender1.isSelected()) {
			System.out.println("GENDER selected = Male");
		} else {
			System.out.println("GENDER radio button not working");
		}

		driver.quit();

	}

}
