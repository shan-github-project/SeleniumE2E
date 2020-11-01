package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Profile
{
	public WebDriver driver;
	
	
	By actionbtn=By.cssSelector("[class*='SubNavActions']");
	By editbtn=By.id("edit");
	By firstName=By.id("root_userInfo_firstName");
	By lastName=By.id("root_userInfo_lastName");
	By emailAddress=By.id("root_userInfo_email");
	By phone=By.cssSelector("[value='(999) 999-9999 ext. 50872']");
	By department=By.id("root_userInfo_department");
	By save=By.linkText("Save settings");
	
	   public Profile(WebDriver driver) 
	   {
		   this.driver=driver;
	   }

	   
  
	public WebElement getActionBtn()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(actionbtn));
        return driver.findElement(actionbtn);
	}
	
	public WebElement getEdit()
	{
        return driver.findElement(editbtn);
	}
	
	public WebElement getFirstName()
	{
		return driver.findElement(firstName);
		
	}
	
	public WebElement getLastName()
	{
		return driver.findElement(lastName);
		
	}
	
	public WebElement getEmailAddress()
	{
		return driver.findElement(emailAddress);
		
	}
	
	public WebElement getPhone()
	{
		return driver.findElement(phone);
		
	}
	public WebElement getDepartment()
	{
		return driver.findElement(department);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}
	
	
}
