package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	
	@FindBy(how=How.XPATH,using="//tbody/tr/td[4]/a[1]")
	public static WebElement logout;
	
	
	
	/*
	 * public static void frame(WebDriver driver) {
	 * driver.switchTo().frame("mainpanel"); }
	 * 
	 * public static WebElement logout(WebDriver driver) {
	 * 
	 * return driver.findElement(By.xpath("//tbody/tr/td[4]/a[1]")); }
	 */
	
	

}
