package selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitexample {
	@Test
	
	public void verifylogin() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://techfios.com/test/billing/?ng=login/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
	driver.findElement(By.id("password")).sendKeys("abc123");


}
}