/**
 * 
 */
package seleniumAssignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author NelaturiR
 *
 */
public class BrowserMinimize {

	/**
	 * @param Browser
	 *            coordinate values to minimize browser
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(10000);

		Point p = new Point(10, 300);

		// Minimize the current window to the set position
		driver.manage().window().setPosition(p);

		Thread.sleep(10000);

		// Close the browser
		driver.quit();

	}

}
