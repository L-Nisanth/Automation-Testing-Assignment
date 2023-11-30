package module09_assignment3;

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

public class Assignment3 {
	WebDriver driver; 
	            // ****************** Module 9: Assignment - 3 *************************
	   //Write a Test Script to Automate www.saucedemo.com Login in TestNG - Pass parameters from .xls file.
	
		@DataProvider(name = "loggingData")
		public Object[][] loginDatas() throws BiffException, IOException {
			FileInputStream file = new FileInputStream(".\\src\\main\\java\\module09_assignment3\\m9_Assignment2.xls");
			Workbook wbk = Workbook.getWorkbook(file);
			Sheet sheets = wbk.getSheet(0);
			int rowSize = sheets.getRows();
			int columnSize = sheets.getColumns();

			Object inputData[][] = new Object[rowSize - 1][columnSize];

			for (int r = 1; r < rowSize; r++) {
				for (int c = 0; c < columnSize; c++) {
					inputData[r - 1][c] = sheets.getCell(c, r).getContents();

				}

			}
			file.close();
			wbk.close();
			return inputData;
		}

		@BeforeTest
		public void goToUrl() {

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		}

		@Test(dataProvider = "loggingData")
		public void loginTest(String nam, String pwd) {
			driver.findElement(By.id("user-name")).sendKeys(nam);
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.id("login-button")).click();
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();

		}

		@AfterTest
		public void quitBrowser() {
			driver.quit();
		}

	}
