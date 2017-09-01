package dropdowntesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class MultiDropdown {
   WebDriver driver;
   
	
	@BeforeMethod
  public void beforeMethod() 
   {
	   System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	   driver.get("https://eenadupellipandiri.net/register");
		
  }

   @Test
   public void f() throws InterruptedException 
   
  {
	   
 
	   WebElement multi_lang = driver.findElement(By.name("can_speak_lang[]"));
  Select str = new Select(multi_lang);

  for(int i=0; i<5; i++)
  {
	str.selectByIndex(i);  
  }
  
  List<WebElement> display = str.getAllSelectedOptions();
  for(WebElement s:display)
  {
	  System.out.println(s.getText());
  }
  
  }
   
   
  
  
   
  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }

}
