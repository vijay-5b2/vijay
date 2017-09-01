package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleDropdown1 
{

public WebDriver driv;
	
	@BeforeMethod
	@Parameters("browser")
	public void setup(String browsername)
	{
		//CommonBrowsers br=new CommonBrowsers(browsername);		
		driv=CmBrs.CmBrs(browsername);
	}
	
	
	
	@Test
	public void singleDropDown() throws InterruptedException
	{
	
		driv.get("https://www.facebook.com");
	//Identifying the Month Dropdown in Facebook Page & Storing in Select Builtin Class
		WebElement month_dropdown=driv.findElement(By.xpath("//select[@id='month']"));
		Select month_dd=new Select(month_dropdown);
		
		
	//It selects using by Index   &    To print Selected option
		month_dd.selectByIndex(3);
	
		
		WebElement sel1=month_dd.getFirstSelectedOption();
		System.out.println("Selected option name using By Index is :" + sel1.getText());
		Thread.sleep(3000);
		
/*------------------------------------------------------------------------------------------------------------------------*/
		
	//It selects using by value    &    To print Selected option
		month_dd.selectByValue("4");
		
		WebElement sel2=month_dd.getFirstSelectedOption();
		System.out.println("Selected option name using  By Value is :" + sel2.getText());
		Thread.sleep(3000);
		
		
/*------------------------------------------------------------------------------------------------------------------------*/	
		
		
	//It selects using by VisibleText    &    To print Selected option
		month_dd.selectByVisibleText("May");
		
		WebElement sel3=month_dd.getFirstSelectedOption();
		System.out.println("Selected option name using By Visibletext is :" + sel3.getText());
		Thread.sleep(3000);
		
				
	}
	
	
	
	@AfterMethod
	public void teardown()
	{
		driv.quit();
	}
	
	
}
