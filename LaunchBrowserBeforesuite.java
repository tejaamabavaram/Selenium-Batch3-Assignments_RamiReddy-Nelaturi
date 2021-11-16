/**
 * 
 */
package seleniumAssignments;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author NelaturiR
 *
 */
public class LaunchBrowserBeforesuite {

	/**
	 * @param Launch
	 *            Browser using Before Suite Annotation
	 */

	@Test
	public void beforeSuiteTesting() {
		System.out.println("before Suite execution");
	}

	@Before
	public void before_suite() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.close();
	}

}
