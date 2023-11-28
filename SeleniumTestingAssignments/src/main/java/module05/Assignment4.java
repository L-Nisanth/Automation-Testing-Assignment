package module05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) {

		// ****************** Module 5: Assignment - 4 *************************

		/*
		 * Step 1: Launch Firefox browser 
		 * Step 2: Open test URL-
		 * https://www.jquery-az.com/javascript/demo.php?ex=151.1_1 in Chrome browser
		 * Step 3: Click on click here to show confirm alert button 
		 * Step 4: Get the text displayed on alert into console 
		 * Step 5: Accept the web alert to delete account  
		 * Step 6: Get the text displayed on alert into console 
		 * Step 7: Accept the alert 
		 * Step 8: Close browser
		 */
		
		// * Step 1: Launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// * Step 2: Open test URL-
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1 ");

		// Step 3: Click on click here to show confirm alert button
		WebElement alertButton = driver.findElement(By.xpath("//button[@onclick='confirmalert()']"));
		alertButton.click();

		// Step 4: Get the text displayed on alert into console
		Alert alrt = driver.switchTo().alert();
		System.out.println("Step 4: Get the text displayed on alert into console = " + alrt.getText());

		// Step 5: Accept the web alert to delete account
		alrt.accept();

		// Step 6: Get the text displayed on alert into console
		System.out.println("Step 6: Get the text displayed on alert into console = " + alrt.getText());

		// Step 7: Accept the alert
		alrt.accept();

		// Step 8: Close browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
