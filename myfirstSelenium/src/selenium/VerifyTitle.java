package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\auto\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		String ExpectedTitle = "Login - TechFios Test Application - Billing";
		String ActualTitle = "";
		driver.get("http://techfios.com/test/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		//driver.findElement(By.id("password")).sendKeys("abc123");
		
		ActualTitle = driver.getTitle();
		
		if(ActualTitle.contentEquals(ExpectedTitle)){
			
			System.out.println("Test Case passed");
		}
		else {
			System.out.println("Test Case failed");
		}
		
		

	}

}
