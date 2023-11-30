package module11_assignment1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Actions extends RepositoryLoginPage {
	
WebDriver driver;

	
	@BeforeTest
	public void goToUrl() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@Test
	public void Login() {
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
        PageFactory.initElements(driver, RepositoryLoginPage.class);
		
		RepositoryLoginPage.userName.sendKeys(unm);
		
		RepositoryLoginPage.password.sendKeys(pwd);
		
		RepositoryLoginPage.loginButton.click();   
		assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
		

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
