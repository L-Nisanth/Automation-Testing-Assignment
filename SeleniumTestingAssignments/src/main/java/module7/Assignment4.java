package module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment4 {

	public static void main(String[] args) {
		  
		// ****************** Module 7: Assignment - 4 *************************
		
		/*Test Scenario I: File download
		Step 1: Launch Firefox browser
		Step 2: Open test URL: https://www.selenium.dev/downloads/
		Step 3: In table Selenium Client and Web Driver Language Bindings, automate
		the plain text
		Step 4: Get the plain text Java, Python into Console
		Step 5: Close browse*/

		
		// Step 1: Launch Firefox browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		//Step 2: Open test URL: https://www.selenium.dev/downloads/
		driver.get("https://www.selenium.dev/downloads/");
		
		//Step 3: In table Selenium Client and Web Driver Language Bindings, automate the plain text
		WebElement c = driver.findElement(By.xpath("//p[text()='C#']"));
		WebElement ruby = driver.findElement(By.xpath("//p[text()='Ruby']"));
		WebElement java = driver.findElement(By.xpath("//p[text()='Java']"));
		WebElement python = driver.findElement(By.xpath("//p[text()='Python']"));
		WebElement javaScript = driver.findElement(By.xpath("//p[text()='JavaScript']"));
		
		//Step 4: Get the plain text Java, Python into Console
		System.out.println(java.getText());
		System.out.println(python.getText());
		System.out.println(c.getText());
		System.out.println(ruby.getText());
		System.out.println(javaScript.getText());
		
		//Step 5: Close browse
		driver.close();
		
		
	}

}
