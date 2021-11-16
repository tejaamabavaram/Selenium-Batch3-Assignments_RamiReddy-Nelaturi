package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author NelaturiR
 *
 */
public class ValidateDashBoard {

	/**
	 * @param dashboard
	 *            Validate
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
		
		if(driver.findElement(By.linkText("Assign Leave")) != null)
		{
            System.out.println("Assign Leave is Present");
          }
          else
          {
            System.out.println(" Assign Leave  is Absent");
          }
		if(driver.findElement(By.linkText("Leave List")) != null)
		{
            System.out.println("Leave List is Present");
          }
          else
          {
            System.out.println(" Leave List is Absent");
          }
		
		if(driver.findElement(By.linkText("Timesheets")) != null)
		{
            System.out.println("Timesheets is Present");
          }
          else
          {
            System.out.println(" Timesheets is Absent");
          }
		
		if (driver.findElement(By.linkText("Apply Leave")) != null)
			
		{
            System.out.println("Apply Leave is Present");
          }
          else
          {
            System.out.println(" Apply Leave is Absent");
          }
		
		if(driver.findElement(By.linkText("My Leave")) != null)
		{
            System.out.println("My Leave is Present");
          }
          else
          {
        	  System.out.println(" My Leave is Absent");
          }


		if(driver.findElement(By.linkText("My Timesheet")) != null)
		{
            System.out.println("My Timesheet is Present");
          }
          else
          {
        	  System.out.println(" My Timesheet is Absent");
          }

	}

}
