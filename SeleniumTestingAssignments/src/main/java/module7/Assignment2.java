package module7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

	public static void main(String[] args) throws AWTException {
	
		// ****************** Module 7: Assignment - 2 *************************
		
	/*	Test Scenario I: File download
		Step 1: Launch Firefox browser
		Step 2: Open test URL: https://www.selenium.dev/downloads/
		Step 3: In Selenium Client and Web Driver Language Bindings, click on link text
		to download Selenium with Java Language binding
		Step 4: Automate file download
		Step 5: Close browser */
		
		
		//Step 1: Launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Step 2: Open test URL: https://www.selenium.dev/downloads/
		driver.get(" https://www.selenium.dev/downloads/");
		
		//Step 3: In Selenium Client and Web Driver Language Bindings, click on link text
		//to download Selenium with Java Language binding
		
		driver.findElement(By.xpath("//div[@class='card-body px-0 text-center' ]/child::p[text()='Java']/parent::*/child::p[2]/a")).click();
		
		//Step 4: Automate file download
		Robot robo = new Robot();
		robo.setAutoDelay(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		//Step 5: Close browser
		driver.quit();
		
		
		
		
	}

}
