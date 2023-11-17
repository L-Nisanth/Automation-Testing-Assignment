package module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) {
		
		
		        //****************** Module 5: Assignment - 2*************************

		
		/* Step 1: Launch Chrome browser
		Step 2: Open test URL: http://only-testing-blog.blogspot.com/2014/09/selectable.html
		Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
		Step 4: Accept Alert
		Step 5: Close browser */
		
		// Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Step 2: Open test URL:
		// http://only-testing-blog.blogspot.com/2014/09/selectable.html
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");

		// Step 3: Double click on Double-Click Me to see Alert Button to generate Alert
		Actions action = new Actions(driver);
		WebElement doubleClick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		action.doubleClick(doubleClick).build().perform();

		// Step 4: Accept Alert
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		// Step 5: Close browser
		driver.quit();
		
		
	}

}
