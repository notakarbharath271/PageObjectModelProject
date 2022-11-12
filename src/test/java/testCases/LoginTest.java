package testCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest {

	@Test
	public void urlmethod() {

	 WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().window().maximize();

		PageFactory.initElements(driver, LoginPage.class);
		LoginPage.username.sendKeys("BharathTest");
		LoginPage.password.sendKeys("Bharath@test");
		LoginPage.loginbtn.click();

		// switch to frame
		driver.switchTo().frame("mainpanel");
		PageFactory.initElements(driver, HomePage.class);
		HomePage.logout.click();

		List<String> list = new ArrayList<String>();
		/*
		 * LoginPage.username(driver).sendKeys("BharathTest");
		 * LoginPage.password(driver).sendKeys("Bharath@test");
		 * LoginPage.loginbtn(driver).click();
		 */
		/*
		 * HomePage.frame(driver); HomePage.logout(driver).click()
		 */;
		
		
	}


}
