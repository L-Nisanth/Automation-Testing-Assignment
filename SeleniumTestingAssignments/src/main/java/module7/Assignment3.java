package module7;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) throws AWTException {

		// ****************** Module 7: Assignment - 3 *************************
		
		
	/*	Test Scenario I: File download
		Step 1: Launch https://launchpad.net/sikuli in Firefox browser
		Step 2: Click on sikulixsetup-1.1.2.jar to download
		Step 3: Go to Window Alert and select Save
		Step 4: Specify Wait
		Step 5: Close Site  */
		
		
		//Step 1: Launch https://launchpad.net/sikuli in Firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://launchpad.net/sikuli");
		
		//Step 2: Click on sikulixsetup-1.1.2.jar to download
		driver.findElement(By.linkText("All downloads")).click();
		driver.findElement(By.linkText("sikulixsetup-1.1.2.jar")).click();
		
		//Step 3: Go to Window Alert and select Save
		Robot robo = new Robot();
		robo.setAutoDelay(1000);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

		//Step 4: Specify Wait
		robo.delay(5000);
		
		//Step 5: Close Site
		driver.close();
		
		
		

	}

}
