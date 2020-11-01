package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SystemAdmin
{
	public WebDriver driver;
	
	By move=By.cssSelector("div[class*='UserNav__IconWrapper']");
	By sysadmin=By.linkText("System Administration");
	By profile=By.linkText("My Profile");
	
	   public SystemAdmin(WebDriver driver) 
	   {
		   this.driver=driver;
	   }

	public WebElement getMove()
	{
		return driver.findElement(move);
		
	}
	
	public WebElement getSysadmin()
	{
		return driver.findElement(sysadmin);
		
	}
		
	public WebElement getprofile()
	{
		return driver.findElement(profile);
		
	}
	
	
}
