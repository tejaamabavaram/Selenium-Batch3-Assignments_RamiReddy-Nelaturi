package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author NelaturiR
 *
 */
public class DashboardHeading {

	/**
	 * @param Read Header Text
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));

		driver.findElement(By.xpath("//input[@name='Submit']"));
		WebElement login = driver.findElement(By.xpath("//input[@name='Submit']"));

		username.sendKeys("Admin");
		password.sendKeys("admin123");
		login.click();
		
		
		WebElement header = driver.findElement(By.xpath("//h1[text()='Dashboard']"));
		String HeaderText  = header.getText();
		System.out.println("Header text is:"+HeaderText);
				
	}

}
