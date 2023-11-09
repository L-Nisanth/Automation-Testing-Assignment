package module4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		
		// ****************** Module 4: Assignment - 5 *************************
	
	/*	1. TC-1 launch Chrome browser
		2. TC-2 go to Facebook Registration Page
		3. TC-3 fill First Name Textbox with input
		4. TC-4 clear the input from First Name Textbox
		5. TC-5 again fill the First Name Textbox with input
		6. TC-6 Get the input from Textbox and display it in Console
		7. TC-6 Close browser  */
		
		//1. TC-1 launch Chrome browser
		WebDriver driver = new ChromeDriver();
		
		//2. TC-2 go to Facebook Registration Page
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
		//3. TC-3 fill First Name Textbox with input
		WebElement firstName =  driver.findElement(By.name("firstname"));
        firstName.sendKeys("myName");
        System.out.println("TC-3 fill First Name Textbox with input = " + firstName.getAttribute("value") );
		
        //	4. TC-4 clear the input from First Name Textbox
        firstName.clear();
        System.out.println("TC-4 clear the input from First Name Textbox = " + firstName.getAttribute("value") );
        
        //5. TC-5 again fill the First Name Textbox with input
        firstName.sendKeys("jack");
        
        //6. TC-6 Get the input from Textbox and display it in Console
        System.out.println("TC-6 Get the input from Textbox and display it in Console = " + firstName.getAttribute("value") );
        
        //7. TC-6 Close browser
        driver.quit();
        
        
    
		
		

	}

}
