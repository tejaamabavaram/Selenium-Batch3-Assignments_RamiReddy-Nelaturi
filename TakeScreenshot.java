package seleniumAssignments;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author NelaturiR
 *
 */
public class TakeScreenshot {

	/**
	 * @param Take Screen Shots for failure cases
	 */
		public static Properties prop; 
		public static FileInputStream fileLoc;
		WebDriver driver;
		@BeforeTest()
		public void BrowserOpen() throws InterruptedException {
			try {
				fileLoc = new FileInputStream(System.getProperty("user.dir")+"Selenium_Assignments_Batch3\\src\\main\\resources\\Config\\config.properties");
				prop = new Properties();
				prop.load(fileLoc);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.setProperty("webdriver.gecko.driver", "C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/geckodriver.exe");
			WebDriver driver1 = new FirefoxDriver();
			driver1.get(prop.getProperty("Url"));
			Thread.sleep(2000);
			driver1.manage().window().maximize();
			
		}
		@Test(priority=1)
		public void Login() throws InterruptedException {
			
			String  Name = prop.getProperty("username");
			String  Psword = prop.getProperty("passwd");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(2000);
		}
		@Test(priority=2,dependsOnMethods= {"Login"})
		public void Search() throws InterruptedException
		{
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Linda Anderson");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
			
		}
		
		@Test(priority=3)
		public void Screenshot() throws Exception
		{
			takeSnapShot(driver,"C:\\Users\\nelaturir\\workspace\\SeleniumAssignments\\test-output\\Search.png");
		}
		@AfterTest
		public void logout()
		{
			driver.quit();
		}
		
		public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

			//Convert web driver object to TakeScreenshot

			TakesScreenshot scrShot =((TakesScreenshot)webdriver);

			//Call getScreenshotAs method to create image file

			File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

			//Move image file to new destination

			File DestFile=new File(fileWithPath);

			//Copy file at destination

			FileUtils.copyFile(SrcFile, DestFile);

			}


	}


