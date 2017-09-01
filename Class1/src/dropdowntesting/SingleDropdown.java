package dropdowntesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class SingleDropdown {
   WebDriver driver;
   
	
	@BeforeMethod
  public void beforeMethod() 
   {
	   /*System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	   driver.get("https://www.facebook.com/");*/
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Training\\Softwares\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		   driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		   driver.get("https://www.facebook.com/");
  }

   @Test
   public void f() throws InterruptedException 
   
  {
	   
  WebElement month_dd = driver.findElement(By.xpath("//select[@id='month']"));
  Select str = new Select(month_dd);

  //-----By using index-----
   str.selectByIndex(4);
  WebElement str1 = str.getFirstSelectedOption();
  System.out.println("First selected option using index is: " + str1.getText());
  Thread.sleep(3000);
  }
   
   @Test
   public void g() throws InterruptedException
   {
	   WebElement month_dd = driver.findElement(By.xpath("//select[@id='month']"));
	   Select str = new Select(month_dd);
	   
   //-----By using value----- 
  str.selectByValue("4");
  WebElement str2 = str.getFirstSelectedOption();
  System.out.println("First selected option using value is: " + str2.getText());
  Thread.sleep(3000);
}
  
   @Test
   public void a() throws InterruptedException
   {
	   WebElement month_dd = driver.findElement(By.xpath("//select[@id='month']"));
	   Select str = new Select(month_dd);
   
//-----By using name----- 
  str.selectByVisibleText("Jun");
  WebElement str3 = str.getFirstSelectedOption();
  System.out.println("First selected option using visibletext is: " + str3.getText());
  Thread.sleep(3000);
  
  }
  
  
   
  @AfterMethod
  public void afterMethod() {
  driver.quit();
  }

}
