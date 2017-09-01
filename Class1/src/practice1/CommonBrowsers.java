package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonBrowsers {
	
 	public static WebDriver driver;
	
	public static WebDriver CommonBrowsers(String browsername)
	{
		
	if(browsername.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Training\\Softwares\\geckodriver-v0.16.1-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com");
	return driver;
	
	}

}
