package linkstesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LinkTesting2 {
  WebDriver driver;
  int count = 0;
  
  @BeforeMethod
  public void browsersetup()
  {
  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.get("https://www.amazon.com/");
  
  }
	@Test
  public void links() 
	{
 List<WebElement> str = driver.findElements(By.tagName("a"));
 System.out.println("total links in this page are: " + str.size());
 for(int i=0; i<str.size();i++)
 {
	 if(!str.get(i).getText().isEmpty())
	 {
		 count++;
		 System.out.println(str.get(i).getAttribute("innerHTML"));
		 
	 }
 str = driver.findElements(By.tagName("a"));
 
 }
 
 System.out.println("Total number of active links are: " + count);
		
	}
  

  @AfterMethod
  public void afterMethod()
  {
  driver.close();
  }

}
