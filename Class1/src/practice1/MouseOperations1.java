package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MouseOperations1 
{

	
public  WebDriver driv;
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browsername)
	{
		//CommonBrowsers br=new CommonBrowsers(browsername);	
		driv=CmBrs.CmBrs(browsername);
	}

	
	
	@Test (priority =1)
	public void MoveToelement() throws InterruptedException
	{
		
		//moveToElement(WebElement target)
		driv.get("https://aptransport.in/tgcfstonline");
		Actions a=new Actions(driv);
		a.moveToElement(driv.findElement(By.linkText("ALTERNATE ADDRESS ENTRY"))).perform();
		driv.findElement(By.linkText("License Alternate Address Entry")).click();
		Thread.sleep(3000);
		
	}
	
	
	
	
	@Test (priority =0)
	public void DragAnddrop() throws InterruptedException
	{
		
		//dragAndDrop(WebElement source, WebElement target)
				driv.get("http://jqueryui.com/droppable/");
				driv.switchTo().frame(0);
				
				Actions a=new Actions(driv);
				
				a.dragAndDrop(driv.findElement(By.id("draggable")), driv.findElement(By.id("droppable"))).perform();
				Thread.sleep(4000);
	}
	
	
	
	
	@Test (priority =3)
	public void slider() throws InterruptedException
	{
		
		//a.dragAndDropBy(WebElement source, int xOffset, int yOffset)
		
				driv.get("http://jqueryui.com/slider/");
				driv.switchTo().frame(0);
				
				Actions a=new Actions(driv);
				
				a.dragAndDropBy(driv.findElement(By.xpath("//div[@id='slider']/span")), 100, 0).perform();
				Thread.sleep(4000);			
	}
	
	
	
	
	@Test (priority =2 )
	public void Browserslider() throws InterruptedException
	{
		
		//Browser Scroll Method
		driv.get("http://www.seleniumhq.org/download/");	
		
		for(int i=0;i<10;i++)
		{
			((RemoteWebDriver)driv).executeScript("window.scrollBy(0,100)");
			Thread.sleep(2000);
		}
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driv.quit();
	}
	
}
