package module03;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
	
		//******************  Module 3: Assignment - 4 *************************
		
		/* Tasks To Be Performed:
		1. TC-1 launch Firefox browser
		2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
		3. TC-3 maximize the browser window
		4. TC-4 get the title of page
		5. TC-5 click on know more link text
		6. TC-6 switch from 0th window to 1st window
		7. TC-7 after switching get the title of page
		8. TC-8 close 1st window
		9. TC-8 switch from 1st window to 0th window
		10. TC-9 after switching get the title of page
		11.TC-10 close 0th window */
		
		// 1. TC-1 launch Chrome browser
		WebDriver driver = new ChromeDriver();

		// 2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

		// 3. TC-3 maximize the browser window
		driver.manage().window().maximize();

		// 4. TC-4 get the title of page
		System.out.println("4. TC-4 get the title of page = " + driver.getTitle());

		// 5. TC-5 click on know more link text
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//*[@id='nortonimg1']/div[2]/span[2]/a")).click();

		// 6. TC-6 switch from 0th window to 1st window
		ArrayList<String> multiWindowHandler = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(multiWindowHandler.get(1));

		// 7. TC-7 after switching get the title of page
		System.out.println("7. TC-7 after switching get the title of page = " + driver.getTitle());

		// 8. TC-8 switch from 1st window to 0th window
		driver.switchTo().window(multiWindowHandler.get(0));

		// 9. TC-9 after switching, get the title of page
		System.out.println("9. TC-9 after switching, get the title of page = " + driver.getTitle());

		// 10. TC-10 close 0th window
		driver.close();
		
		
		
		
	}

}
