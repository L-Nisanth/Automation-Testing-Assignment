package module05;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	public static void main(String[] args) {

		// ****************** Module 5: Assignment - 5 *************************

		/*
		 * Step 1: Launch Firefox browser 
		 * Step 2: Open test URL :
		 * https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt in Chrome
		 * browser 
		 * Step 3: Switch into Frame 
		 * Step 4: Click on Try it Button 
		 * Step 5: Send the text into Alert
		 * Step 6: Accept the Web Alert 
		 * Step 7: Get the text displayed on page into Console
         * Step 8: Close browser
		 */

		// * Step 1: Launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		// * Step 2: Open test URL :
		driver.get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Step 3: Switch into Frame
		driver.switchTo().frame(0);

		// Step 4: Click on Try it Button
		WebElement button = driver.findElement(By.xpath("//button[@onclick='myFunction()']"));
		button.click();

		// * Step 5: Send the text into Alert
		Alert alrt = driver.switchTo().alert();
		alrt.sendKeys("AJ");

		// * Step 6: Accept the Web Alert
		alrt.accept();

		// * Step 7: Get the text displayed on page into Console
		System.out.println(driver.findElement(By.id("demo")).getText());

		// * Step 8: Close browser
		driver.quit();
		
		
		
		
		
		
		
	}

}
