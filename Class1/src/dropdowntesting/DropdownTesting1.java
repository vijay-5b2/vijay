package dropdowntesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DropdownTesting1 {
	WebDriver driver;
	 @BeforeMethod
	  public void beforeMethod() 
	 {
		 System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.get("https://www.amazon.in/");
		  //driver.get("https://www.flipkart.com/");
	 }

	 
	 @Test(priority=0)
  public void f() {
  driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
  driver.findElement(By.className("nav-input")).click();
  String actual_title = driver.getTitle();
  String expected_title = "Amazon.in: Harry Potter: Books";  
		
    Assert.assertEquals(expected_title, actual_title);
    
	 }
	 
	 
	 @Test(priority=1)
	  public void g() {
	  WebElement web = driver.findElement(By.id("searchDropdownBox"));
	  Select sel = new Select(web);
	  sel.selectByIndex(9);
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Honda");
	  driver.findElement(By.className("nav-input")).click();
	  String actual_title = driver.getTitle();
	  String expected_title = "Amazon.in: Honda: Car & Motorbike";  
	    Assert.assertEquals(expected_title, actual_title);
	    
		 }
	 
	/* @Test(priority=2)
	  public void f() {
	  driver.findElement(By.className("LM6RPg")).sendKeys("cars");
	  driver.findElement(By.className("vh79eN")).click();
	  String actual_title = driver.getTitle();
	  //String expected_title = "Amazon.in: Harry Potter: Books";  
			
	    //Assert.assertEquals(expected_title, actual_title);
	    System.out.println(actual_title);
		 }*/
	 
	 
  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
