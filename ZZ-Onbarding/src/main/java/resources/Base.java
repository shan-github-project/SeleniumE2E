package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base 
{
	public static WebDriver driver;
	public Properties prop;
    public WebDriver  intializeDriver() throws IOException
    {
    	prop = new Properties();
    	//System.getProperty("use.dir");
    	//FileInputStream fis=new FileInputStream(System.getProperty("use.dir")+ "/src/main/java/resources/data.properties");
    	FileInputStream fis=new FileInputStream("src/main/java/resources/data1.properties");
    	prop.load(fis);
    	
    	//String browserName=System.getProperty("browser"); //for jenkins config we use this to run on different browser. and also for maven cmd
    	String browserName=prop.getProperty("browser");
    	System.out.println(browserName);
    	
    	if(browserName.contains("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
    		ChromeOptions options=new ChromeOptions();
    		if(browserName.contains("headless"))
    		{
    		options.addArguments("--headless");
    		}
    		driver= new ChromeDriver(options);
    		
        }
    	else if(browserName.equals("firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver", "D:\\FireFox\\geckodriver.exe");
    		driver = new FirefoxDriver();
    	}
    	else if(browserName.equals("edge"))
    	{
    		System.setProperty("webdriver.edge.driver", "D:\\MicroEdge\\msedgedriver.exe");
    		 driver= new EdgeDriver();
    	}
    	
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	return driver;
    	
    }	

}
