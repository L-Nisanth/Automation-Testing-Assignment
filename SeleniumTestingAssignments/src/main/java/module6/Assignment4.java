package module6;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4 {

	
	public static void main(String[] args) {
		
		 //****************** Module 5: Assignment - 4 *************************
	
		/*Test Scenario I: Actions
		Step 1: Launch Chrome browser
		Step 2: Open Test URL: http://only-testing-blog.blogspot.com/2014/09/selectable.html
		Step 3: Drag the slider up to 50% and drop the slider
		Step 4: Close browser */
		
		
		
		// Step 1: Launch Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Step 2: Open test URL:
		// http://only-testing-blog.blogspot.com/2014/09/selectable.html
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");

		// Step 3: Drag the slider up to 50% and drop the slider
		Actions action = new Actions(driver);
		WebElement slider = driver
				.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
		Point location = slider.getLocation();
		System.out.println("XY coordinates before sliding = " + location);
		action.dragAndDropBy(slider, slider.getLocation().getX() + 15, 0).build().perform();
		Point location1 = slider.getLocation();
		System.out.println("XY coordinates After sliding = " + location1);

		// Step 4: Close browser */
		driver.quit();

	}
}
