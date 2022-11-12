package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	// pagefactory
	@FindBy(how = How.XPATH, using = "//input[@name='username']")
	public static WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	public static WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	public static WebElement loginbtn;

	
	
	// Normal approach
	/*
	 * 
	 * public static WebElement username(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@name='username']")); }
	 * 
	 * public static WebElement password(WebDriver driver) {
	 * 
	 * return driver.findElement(By.xpath("//input[@name='password']"));
	 * 
	 * }
	 * 
	 * public static WebElement loginbtn(WebDriver driver) { return
	 * driver.findElement(By.xpath("//input[@type='submit']")); }
	 */


}
