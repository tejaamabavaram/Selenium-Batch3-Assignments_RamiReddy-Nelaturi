package seleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author NelaturiR
 *
 */
public class LoginPageXpath_CssSelector {

	public static WebDriver driver;
	/**
	 * @Listing Xpaths and CSSSelectors of Login Page
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/nelaturir/eclipse-workspace/Selenium_Assignments_Batch3/softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		//Xpath

		//images:
			
		WebElement HeaderImage= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/img[1]"));
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/svg[1]/switch[1]/g[1]/g[1]/image[1]"));

		//textbox
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[2]"));
		WebElement UsernameTF = driver.findElement(By.xpath("//div[@id='divUsername']"));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[3]/input[1]"));
		WebElement PwdnameTF = driver.findElement(By.xpath("//input[@id='txtPassword']"));

		//links
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));
		driver.findElement(By.linkText("Forgot your password?"));
		driver.findElement(By.linkText("OrangeHRM, Inc"));
		driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='content']/div[@id='footer']/div[@id='social-icons']/a[1]/img[1]"));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/a[2]/img[1]"));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/a[3]/img[1]"));
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[5]/div[2]/a[4]/img[1]"));
		
		// Methos to Print all Links in Login page
		
		System.out.println("Links in Login page\n");
		
		List<WebElement> al = driver.findElements(By.tagName("a"));
		
		for (WebElement we : al) {

			String url = we.getAttribute("href");
			System.out.println(url);
		}
		
		System.out.println();
		
		// Methos to Print all Images Links in Login page
		
		System.out.println("Image Links \n");
		
				List<WebElement> images = driver.findElements(By.tagName("img"));
				
				for (WebElement we : images) {

					String url = we.getAttribute("src");
					System.out.println(url);
				}
		
		
		
		

		//css selector:
		
		//images:
		
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(1) div:nth-child(4) div:nth-child(1) > img:nth-child(1)"));
		driver.findElement(By.cssSelector("svg:nth-child(1) switch:nth-child(1) g:nth-child(1) g:nth-child(17) > image:nth-child(1)"));

		//Textbox:
		
		driver.findElement(By.cssSelector("#divUsername"));
		driver.findElement(By.cssSelector("#txtPassword"));

		//hyperlinks
		
		driver.findElement(By.cssSelector("div:nth-child(2) form:nth-child(1) div:nth-child(9) div:nth-child(2) > a:nth-child(1)"));
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(1) div:nth-child(6) div:nth-child(1) > a:nth-child(2)"));
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(1) > img:nth-child(1)"));
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(2) > img:nth-child(1)"));
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(3) > img:nth-child(1)"));
		driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(6) div:nth-child(2) a:nth-child(4) > img:nth-child(1)"));

	}

}
