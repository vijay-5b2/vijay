package com.vijay.selenium.practice1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {
	
	public static WebDriver dri;
	public A1(String br)
	{
		if(br.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("WebDriver.chrome.driver", "E:\\Selenium_Training\\Softwares\\chromedriver_win32\\chromedriver.exe");
			dri = new ChromeDriver();
			
		}
	}
	

}
