package seleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author NelaturiR
 *  Open the Application URL in Chrome browser , maximize and
 *         close the browser
 */
public class LoginApp {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.close();
	}

}
