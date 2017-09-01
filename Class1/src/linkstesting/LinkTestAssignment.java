package linkstesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LinkTestAssignment {
  WebDriver driver;
  int count = 0;
  
  @BeforeMethod
  public void browsersetup()
  {
  System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.manage().deleteAllCookies();
  driver.get("https://www.amazon.in/");
  
  }
	@Test
  public void links() 
	{
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
		WebElement str1 = driver.findElement(By.className("a-carousel"));
		//List<WebElement> str2 = str1.findElements(By.className("a-carousel-card"));
		//List<WebElement> str = driver.findElements(By.xpath(".//*[@class='a-carousel']/li"));
		List<WebElement> str2 = str1.findElements(By.tagName("a"));
		System.out.println(str2.size());
 //WebElement next;
 
 
  for(int i=0; i<str2.size();i++)
 {
	 //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	  str2.get(i).click();
	  String val = str2.get(i).getAttribute("innerHTML");
System.out.println("link" + i + "is: " + val);
driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);



}

 //System.out.println("Total number of active links are: " + count);
	
	}
  

  @AfterMethod
  public void afterMethod()
  {
  driver.close();
  }

}
