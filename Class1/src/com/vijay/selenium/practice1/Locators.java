package com.vijay.selenium.practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Lib\\chromedriver.exe");
		ChromeDriver obj1= new ChromeDriver();
		obj1.get("https://amazon.in");
		/*obj1.findElement(By.id("name")).sendKeys("vijay");
		obj1.findElement(By.name("name")).clear();*/
	}

}
