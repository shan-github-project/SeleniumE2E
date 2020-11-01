package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Loginpage
{
	public WebDriver driver;
	
	
	By uname=By.cssSelector("[type='text']");
	By pass=By.cssSelector("[type='password']");
	By submit=By.cssSelector("[type=submit]");
	
	
	   public Loginpage(WebDriver driver) 
	   {
		   this.driver=driver;
	   }

	public WebElement getUname()
	{
        return driver.findElement(uname);
	}
	
	public WebElement getPass()
	{
        return driver.findElement(pass);
	}
	
	public WebElement getSubmit()
	{
        return driver.findElement(submit);
	}
	
	
	
	
}
