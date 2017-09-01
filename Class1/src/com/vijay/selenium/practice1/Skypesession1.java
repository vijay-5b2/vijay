package com.vijay.selenium.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skypesession1  {

	public static void main(String[] args) {
		// T.ODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Library\\chromedriver.exe");
ChromeDriver obj1= new ChromeDriver();
obj1.get("https://www.eenadupellipandiri.net/register");
obj1.manage().window().maximize();
obj1.findElement(By.xpath("//input[@id='name']")).sendKeys("vijay");
obj1.findElement(By.xpath("//input[@id='gender'][@value='M']")).click();
	}

	
}