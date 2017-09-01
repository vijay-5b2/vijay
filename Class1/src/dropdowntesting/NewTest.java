package dropdowntesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {

	@BeforeMethod
	  public void beforeMethod() 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
	  }

	@Test
  public void f() {
  }

  
  @AfterMethod
  public void afterMethod() {
  }

}
