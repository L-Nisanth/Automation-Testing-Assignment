package module6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) {

		// ****************** Module 6: Assignment - 1 *************************

	                  
/* Step 1: Launch Chrome browser
Step 2: Open test URL- https://www.flipkart.com/
Step 3: If found any screen hiding actual page, close the screen
Step 4: Move mouse pointer towards Women
Step 5: Click on Shoes
Step 6: Close browser */
		
		
		
// Step 1: Launch Chrome browser
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

// Step 2: Open test URL- https://www.flipkart.com/
driver.get(" https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

// Step 3: If found any screen hiding actual page, close the screen
driver.findElement(By.xpath("//span[@role='button']")).click();

// Step 4: Move mouse pointer towards Women
driver.findElement(By.xpath("//a[@aria-label='Fashion']")).click();
WebElement women = driver.findElement(By.xpath("//span[.='Women']"));
Actions action = new Actions(driver);
action.moveToElement(women).build().perform();
driver.findElement(By.linkText("Shoes")).click();
System.out.println(driver.getCurrentUrl());

// Step 6: Close browser
driver.quit();

	}

}
