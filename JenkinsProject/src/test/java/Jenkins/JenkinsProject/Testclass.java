package Jenkins.JenkinsProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testclass {
	WebDriver driver;
	@Parameters("Browser")
	@Test
	
	public void name(String Browser) throws InterruptedException {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
		 driver= new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Edge")) {
			 driver= new EdgeDriver();
			}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		org.testng.Assert.assertTrue(driver.getTitle().contains("Facebook"), "Title is not Matched");
//		(driver.getTitle().contains("FaceBook"), false);
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		
		
		
	}

}
