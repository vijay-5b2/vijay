package linkstesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LinkTesting1 {
  
	WebDriver driver;
	
	
	@Test
  public void tetslink() {
		
		String expval = "Google Images";
		driver.findElement(By.linkText("Images")).click();
	    String actval = driver.getTitle();
		   		   
	    if(actval.contains(expval))
	    {
	    	System.out.println("yayyyyy");
	    }
	    else
	    {
	    	System.out.println("oh noooo!");
	    }
			}
  
@BeforeMethod
  public void Setup() 
  {
  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.google.com");
  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
  
  }

  @AfterMethod
  public void close() {
  driver.quit();
  }

}
