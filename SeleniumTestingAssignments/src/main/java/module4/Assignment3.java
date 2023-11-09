package module4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
	
		// ****************** Module 4: Assignment - 3 *************************
	
		/* Tasks To Be Performed:
		1. Automate Facebook Registration Page using Absolute XPath in Chrome Browser https://www.facebook.com/ */
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// first name
		WebElement firstName = driver.findElement(By.xpath(
				"/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
		firstName.sendKeys("jack");

		// last name
		WebElement lastName = driver.findElement(By.xpath(
				"/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input"));
		lastName.sendKeys("sparrow");

		// mobile or email
		WebElement email = driver.findElement(
				By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input"));
		email.sendKeys("jacksparrow@gmail.com");

		// new password
		WebElement password = driver.findElement(
				By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[4]/div/div[1]/input"));
		password.sendKeys("123456789");

		// birth date
		WebElement birthDate = driver.findElement(By.xpath(
				"/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]"));
		Select select = new Select(birthDate);
		select.selectByIndex(2);

		// birth month
		WebElement birthMonth = driver.findElement(By.xpath(
				"/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[2]"));
		select = new Select(birthMonth);
		select.selectByIndex(2);

		// birth year
		WebElement birthYear = driver.findElement(By.xpath(
				"/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[3]"));
		select = new Select(birthYear);
		select.selectByIndex(2);

		// gender
		WebElement gender = driver.findElement(By
				.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
		gender.click();

		System.out.println("firstName = " + firstName.getAttribute("value"));
		System.out.println("lastName = " + lastName.getAttribute("value"));
		System.out.println("email = " + email.getAttribute("value"));
		System.out.println("password = " + password.getAttribute("value"));
		System.out.println("birthDate = " + birthDate.getAttribute("value"));
		System.out.println("birthMonth = " + birthMonth.getAttribute("value"));
		System.out.println("birthYear = " + birthYear.getAttribute("value"));
		System.out.println("is gender male option selected ? " + gender.isSelected());

		driver.quit();
		
		
		
		
		
	
	}

}
