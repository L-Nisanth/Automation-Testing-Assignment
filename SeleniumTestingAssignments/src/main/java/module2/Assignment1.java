package module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Assignment1 {

	static WebDriver driver;

	public static void main(String[] args) {

		//****************** Module 2: Assignment - 1  **************************

// 1. Write a Test Script to open Test URL in Chrome Browser

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");

		System.out.println("URl of the page in chrome browser = " + driver.getCurrentUrl());

		driver.quit();

// 2. Write a Test Script to open Test URL in Firefox Browser

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");

		System.out.println("URL of the page in Firefox browser = " + driver.getCurrentUrl());

		driver.quit();

//3. Write a Test Script to open Test URL in Internet Explorer Browser.

		driver = new InternetExplorerDriver();

		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");

		System.out.println("URL of the page in Edge browser = " + driver.getCurrentUrl());

		driver.quit();
		
		
		
		
		
		
		
		

	}

}
