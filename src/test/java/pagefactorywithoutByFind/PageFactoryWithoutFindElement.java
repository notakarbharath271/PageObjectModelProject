package pagefactorywithoutByFind;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageFactoryWithoutFindElement {
	
	
	public static WebElement username; 
	public static WebElement password; 
	public static WebElement Login ; 
	@Test
	public void logintestmethod() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	

		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();
		
		PageFactory.initElements(driver, PageFactoryWithoutFindElement.class);
		
		username.sendKeys("BharathTest");
		password.sendKeys("Bharath@test");
		Login.click();
		
	}

}
