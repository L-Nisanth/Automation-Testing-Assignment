package module4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// ****************** Module 4: Assignment - 4 *************************

		
	//	Write a Test Script to get number of links available on Facebook Page https://www.facebook.com/
		
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   driver.get("https://www.facebook.com/");
		
    	List<WebElement> listOfElements = driver.findElements(By.tagName("a"));
		System.out.println("number of links available on Facebook Page = " + listOfElements.size());
	
	    driver.quit();
	    
		
		
	}

}
