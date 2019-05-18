package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstseleniumClass {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.southwest.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.id("LandingPageAirSearchForm_originationAirportCode")).sendKeys("Dallas");
		driver.findElement(By.id("LandingPageAirSearchForm_destinationAirportCode")).sendKeys("lga");
		Thread.sleep(4000);

	}

}
