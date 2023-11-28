package module02;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		// ******************* Module 2: Assignment - 2 *******************************

		/*
		 * Tasks To Be Performed: Convert the following Test Cases into Test Scripts: 1.
		 * TC-1 launch Chrome browser 2. TC-2 go to test URL https://www.google.com 3.
		 * TC-3 specify wait time for 5 sec
		 * TC-4 get the title of page into console
		 * TC-5 close the browser
		 */

		// 1. launch Chrome browser
		WebDriver driver = new ChromeDriver();

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
