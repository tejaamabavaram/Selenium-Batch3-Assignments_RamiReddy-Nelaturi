package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import junit.framework.Test;

/**
 * @author NelaturiR
 *
 */
public class TestAnnotation {

	/**
	 * @param methods
	 *            prioritization using anotatios
	 */

	WebDriver driver;

	@BeforeTest()
	public void StartTest1() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Test(priority=1)
	public void StartTest21() {
		String Name = "Admin";
		String Psword = "admin123";
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(Name);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Psword);
		driver.findElement(By.id("btnLogin")).click();
	}

	@AfterTest()
	public void Logout()

	{
		driver.quit();
	}

	

	

}
