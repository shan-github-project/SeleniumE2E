package IGT.ZZ_Onbarding;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Loginpage;
import pageObjects.Profile;
import pageObjects.SystemAdmin;
import resources.Base;

public class Homepage extends Base
{
	public WebDriver driver;
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=intializeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		
		Loginpage lp=new Loginpage(driver);
		lp.getUname().sendKeys("engineering+100@thinkhr-dev.com");
		lp.getPass().sendKeys("@ThinkHR4637");
		lp.getSubmit().click();
		
		Actions a = new Actions(driver);
		SystemAdmin sa=new SystemAdmin(driver);
		WebElement Hover=sa.getMove();
		a.moveToElement(Hover).build().perform();
		//sa.getSysadmin().click();
		sa.getprofile().click();
		
		
		Profile p=new Profile(driver);
		p.getActionBtn().click();
		p.getEdit().click();
		
		p.getFirstName().sendKeys(Keys.chord(Keys.CONTROL,"a"),"Brian" + RandomStringUtils.randomAlphabetic(7));
		p.getLastName().sendKeys(Keys.chord(Keys.CONTROL,"a"),"Tyler" + RandomStringUtils.randomAlphabetic(3));
		p.getEmailAddress().sendKeys(Keys.chord(Keys.CONTROL,"a"),"Shivamgupta@pepcus.com");
		p.getEmailAddress().sendKeys(Keys.chord(Keys.CONTROL,"a"),"787567114250876");
		p.getDepartment().sendKeys(Keys.chord(Keys.CONTROL,"a"),"HR");
		p.getSave().click();
	}
	
	
	
}
