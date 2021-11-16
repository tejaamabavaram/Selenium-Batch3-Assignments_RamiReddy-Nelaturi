package seleniumAssignments;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author NelaturiR
 *
 */
public class Testbase {

	/**
	 * @param Implement Utility metods 
	 */
	
		public static WebDriver driver;
		public static FileInputStream fileLoc;
		public static Properties prop;
		//
		//
		@Before
		public void setUp() {

			try {
				fileLoc = new FileInputStream(System.getProperty("user.dir")+"\\Selenium_Assignments_Batch3\\src\\main\\resources\\Config\\config.properties");
				prop = new Properties();
				prop.load(fileLoc);
			}catch(Exception e) {
				e.printStackTrace();
			}

			System.setProperty("webdriver.chrome.driver",
					"C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("Url"));

		}

		@AfterClass
		public void tearDown() {
			driver.quit();
		}


		public static void captureScreenshot(WebDriver webdriver,String fileWithPath) throws Exception{

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
