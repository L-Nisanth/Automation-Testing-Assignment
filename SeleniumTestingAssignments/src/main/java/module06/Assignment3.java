package module06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {
	
	
	public static void main(String[] args) {
		
		   //****************** Module 5: Assignment - 3*************************
		
	
	/*	Step 1: Launch Chrome browser
		Step 2: Open test URL: http://only-testing-blog.blogspot.com/2014/09/selectable.html
		Step 3: Right click on Double-Click Me to See Alert Button
		Step 4: Close browser   */
		
	// Step 1: Launch Chrome browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	// Step 2: Open test URL:
	// http://only-testing-blog.blogspot.com/2014/09/selectable.html
	driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");

	// Step 3: Right click on Double-Click Me to See Alert Button
	Actions act = new Actions(driver);
	WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
	act.contextClick(doubleClick).build().perform();

	// Step 4: Close browser
	driver.close();
		
		
		
		
		
		
	}

}
