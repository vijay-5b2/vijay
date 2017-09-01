package practice1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CmBrs 

{
  public static WebDriver driv;
	

  
  public static WebDriver CmBrs(String browsername) 
 
 {
	  if(browsername.equalsIgnoreCase("CHROME"))
		
{
			
			System.setProperty("WebDriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
			driv = new ChromeDriver();
}
	  else if(browsername.equalsIgnoreCase("FIREFOX"))

{
		  System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Training\\Softwares\\geckodriver-v0.16.1-win64\\geckodriver.exe" );

			driv=new FirefoxDriver();
					
		}
		
		driv.manage().window().maximize();
	
	driv.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	  
		return driv;
		
 }
}
