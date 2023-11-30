package module09_assignment2;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2 {
	// ****************** Module 9: Assignment - 2 *************************
	/*Write a Test Script to Automate www.saucedemo.com Login in TestNG.
	● Apply Data Driven Testing Framework
	● Use JXL jar file*/

	WebDriver driver;

	@BeforeTest
	public void goToUrl() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

	@DataProvider(name = "logD")
	public Object[][] loginData() throws BiffException, IOException {

		FileInputStream file = new FileInputStream(".\\src\\main\\java\\module09_assignment2\\m9_Assignment2.xls");

		Workbook wbook = Workbook.getWorkbook(file);
		Sheet sheets = wbook.getSheet(0);

		int rows = sheets.getRows();
		int columns = sheets.getColumns();

		Object loginData[][] = new Object[rows - 1][columns];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				loginData[i - 1][j] = sheets.getCell(j, i).getContents();
			}
		}
		
        file.close();
        wbook.close();
        
		return loginData;

	}

	@Test(dataProvider = "logD")
	public void Login(String name, String pswrd) {
		driver.findElement(By.id("user-name")).sendKeys(name);
		driver.findElement(By.id("password")).sendKeys(pswrd);
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();

	}

	@AfterTest
	public void quitBrowser() {
		driver.quit();
	}

}
