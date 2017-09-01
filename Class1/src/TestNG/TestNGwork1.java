package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGwork1 {
	WebDriver obj1;
	
	
	@BeforeMethod
	
	public void chrome()
	{
	//	System.out.println("chrome");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "\\Lib\\chromedriver.exe");
		obj1=new ChromeDriver();
		obj1.get("https://www.amazon.in");
	}
	
	
	@AfterMethod
	
	public void close()
	{
		//System.out.println("close");
	
	obj1.close();
		
	}
	
	
	@Test
	
	public void a() throws InterruptedException
	{
		//System.out.println("test");
	//obj1.findElement(By.name("identifier").;
	
		/*obj1.manage().window().maximize();
		obj1.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("vijay");
		obj1.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		//obj1.findElement(By.xpath("//*[@id='password']")).sendKeys("*****");
		obj1.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("abcd");*/
		
		obj1.findElement(By.xpath("//*[@id='nav-your-amazon']")).click();
		obj1.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("vijay");
		obj1.manage().window().maximize();
		Thread.sleep(3000);
		obj1.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("vijju");
		obj1.findElement(By.xpath("//*[@id='a-autoid-0']")).click();
		Thread.sleep(3000);
		System.out.println("Login failed");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
