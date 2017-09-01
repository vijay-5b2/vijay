package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MouseOperations 
{

	
public WebDriver driver;
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browsername)
	{
		
		/*if(browsername.equalsIgnoreCase("CHROME"))
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
	}*/

		driver = CommonBrowsers.CommonBrowsers(browsername);
		
		
	}
	
	
	@Test (priority =1)
	public void MoveToelement() throws InterruptedException
	{
		
		//moveToElement(WebElement target)
		driver.get("https://aptransport.in/tgcfstonline");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("ALTERNATE ADDRESS ENTRY"))).perform();
		driver.findElement(By.linkText("License Alternate Address Entry")).click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	@Test (priority =0)
	public void DragAnddrop() throws InterruptedException
	{
		
		//dragAndDrop(WebElement source, WebElement target)
				driver.get("http://jqueryui.com/droppable/");
				driver.switchTo().frame(0);
				
				Actions a=new Actions(driver);
				
				a.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
				Thread.sleep(4000);
	}
	
	
	
	
	@Test (priority =3)
	public void slider() throws InterruptedException
	{
		
		//a.dragAndDropBy(WebElement source, int xOffset, int yOffset)
		
				driver.get("http://jqueryui.com/slider/");
				driver.switchTo().frame(0);
				
				Actions a=new Actions(driver);
				
				a.dragAndDropBy(driver.findElement(By.xpath("//div[@id='slider']/span")), 100, 0).perform();
				Thread.sleep(4000);			
	}
	
	
	
	
	@Test (priority =2 )
	public void Browserslider() throws InterruptedException
	{
		
		//Browser Scroll Method
		driver.get("http://www.seleniumhq.org/download/");	
		
		for(int i=0;i<10;i++)
		{
			((RemoteWebDriver)driver).executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
		}
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
