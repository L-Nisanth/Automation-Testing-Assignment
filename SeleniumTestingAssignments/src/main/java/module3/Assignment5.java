package module3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {

		// ****************** Module 3: Assignment - 5 *************************

		// 1. TC-1 launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// 2. TC-2 go to test URL - https://www.google.com
		driver.get("https://www.google.com");

		// 3. TC-3 maximize the browser window
		driver.manage().window().maximize();

		// 4. TC-4 get the URL of page
		System.out.println("4. TC-4 get the URL of page = " + driver.getCurrentUrl());

		// 5. TC-5 navigate to test URL - https://www.selenium.dev/
		driver.navigate().to("https://www.selenium.dev/");

		// 6. TC-6 get the URL of page
		System.out.println("6. TC-6 get the URL of page = " + driver.getCurrentUrl());

		// 7. TC-7 navigate back to test URL - https://www.google.com
		driver.navigate().back();

		// 8. TC-8 get the URL of page
		System.out.println("8. TC-8 get the URL of page = " + driver.getCurrentUrl());

		// 9. TC-8 navigate one step forward to test URL - https://www.selenium.dev/
		driver.navigate().forward();

		// 10. TC-9 get the URL of page
		System.out.println("10. TC-9 get the URL of page = " + driver.getCurrentUrl());

		// 11.TC-10 refresh the current page
		driver.navigate().refresh();

		// 12. TC-11 get the URL of page
		System.out.println("12. TC-11 get the URL of page = " + driver.getCurrentUrl());

		// 13. TC-12 close the browser
		driver.quit();

	}

}
