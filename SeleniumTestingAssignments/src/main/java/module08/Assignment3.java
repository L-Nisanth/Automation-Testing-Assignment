package module08;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment3 {

	public static void main(String[] args) throws AWTException {

		// ****************** Module 8: Assignment - 3 *************************
		
		/*Test Scenario I: File upload
		Step 1: Launch Chrome browser
		Step 2: Open test URL: https://smallpdf.com/word-to-pdf
		Step 3: Click on Choose File button
		Step 4: Automate Window Alert by uploading file
		Step 5: Specify webDriver Wait to complete files conversion and Download
		button gets displayed
		Step 6: Click on Download button
		Step 7: Close browser*/
		

		// Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Step 2: Open test URL: https://smallpdf.com/word-to-pdf
		driver.get("https://smallpdf.com/word-to-pdf ");

		// Step 3: Click on Choose File button
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();

		// Step 4: Automate Window Alert by uploading file
		Robot robo = new Robot();
		robo.setAutoDelay(1000);

		StringSelection path = new StringSelection("C:\\Users\\ADMIN\\Downloads\\Hadoop-Testing-Assignment.docx");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);

		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		//Step 5: Specify webDriver Wait to complete files conversion and Download button gets displayed

		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    	WebElement button = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Download']"))));

		// Step 6: Click on Download button
	
		button.click();
		
		// Step 7: Close browser

		driver.quit();


	}

}
