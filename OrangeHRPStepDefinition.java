package seleniumAssignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRPStepDefinition {

	OrangeHrpPages OrangeOR;
	WebDriver Driver;
	
	@Given("^When I am in OrangeHRP Application$")
	public void when_I_am_in_OrangeHRP_Application() {
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\Selenium Driver\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		Driver 	= new ChromeDriver(co);
		Driver.get("https://opensource-demo.orangehrmlive.com/");
		OrangeOR = new OrangeHrpPages();
	}

	@Then("^Login to Application$")
	public void login_to_Application() {
	System.out.println(Driver.getTitle());
	OrangeOR.settextforUserName("Admin");
	OrangeOR.setTextforPassword("admin123");
	OrangeOR.setStaySignedInClick();
	}

	@When("^Dashboard page is available$")
	public void dashboard_page_is_available()  {
	   OrangeOR.getDashBoardisplayed();
	   System.out.println(Driver.getCurrentUrl());
	}

	@When("^click on Admin menu$")
	public void click_on_Admin_menu()  {
		OrangeOR.settoAdminMenu();
	}

	@Given("^I am logged into Orange Application$")
	public void i_am_logged_into_Orange_Application()  {
		System.out.println(Driver.getTitle());
	}

	@When("^I click on Admin Link$")
	public void i_click_on_Admin_Link() {
		OrangeOR.settoAdminMenu();
	}

	@Then("^Click on Job$")
	public void click_on_Job()  {
		OrangeOR.settoJobMenu();
	    
	}

	@Then("^validate text – Job Title$")
	public void validate_text_Job_Title()  {
		
		OrangeOR.settoJobTitle();
		OrangeOR.getJobTitle();
	}
		
		
	@Then("^Close the browser$")
	public void close_the_browser() {
	Driver.close();
	Driver.quit();
	}

}
