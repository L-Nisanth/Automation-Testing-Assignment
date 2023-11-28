package module02;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment3 {

	public static void main(String[] args) {

		// ************* Module 2: Assignment - 3 ***************************

		/*
		 * 1. TC-1 launch Firefox browser 
		 * 2. TC-2 go to test URL https://www.google.com
		 * 3. TC-3 specify wait time for 5 sec 
		 * 4. TC-4 get the title of page into console 
		 * 5. TC-5 close the browser
		 */

		// 1. launch Firefox browser
		WebDriver driver = new FirefoxDriver();

		// 2. go to test URL https://www.google.com
		driver.get(" https://www.google.com");

		// 3. specify wait time for 5 sec
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// 4. get the title of page into console
		System.out.println("Title of the page = " + driver.getTitle());

		// 5. close the browser
		driver.quit(); // or driver.close
		
		
		
		

	}

}
