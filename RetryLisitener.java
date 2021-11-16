
package seleniumAssignments;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author NelaturiR
 *
 */
public class RetryLisitener extends Testbase{
	
	 public static WebDriver driver;
		OrangeHrpPages OrangeOR;
		public static FileInputStream fileLoc;
		public static Properties prop;
	    @BeforeClass
		public void setUp() {

			try {
				fileLoc = new FileInputStream(System.getProperty("user.dir")+"\\ExecutionProperties\\Config.properties");
				prop = new Properties();
				prop.load(fileLoc);
			}catch(Exception e) {
				e.printStackTrace();
			}

			System.setProperty("webdriver.chrome.driver",
					"C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get(prop.getProperty("Url"));
	        }
		@Test(priority=1)
		public void LogInApp() throws InterruptedException {
			String  Name = prop.getProperty("username");
			String  Psword = prop.getProperty("passwd");
			driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
			driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
			driver.findElement(By.id("btnLogin")).click();
			Thread.sleep(1000);
		}
	    @Test(priority=2 , retryAnalyzer= Listener.RetryAnalyzer.class)
	    public void method1() throws Exception
		{
	        String DashBoardHeader = OrangeOR.GetDashBoardHeaderText();
			boolean result = DashBoardHeader.equalsIgnoreCase("Dashboard");
			boolean res;
			if(res)
			{
				Thread.sleep(1000);
				captureScreenshot(driver,"DashBoard Passed");
				Assert.assertTrue(true); 
				System.out.println(true);
			}
			else
			{
				int i = 1; 
				captureScreenshot(driver,"DashBoard Failed Interation = "+ i);
				Assert.assertTrue(false); 
				System.out.println(true);
				i++;
			} 
		}
	    @After
		public void tearDown() {
			driver.quit();
		}

}
