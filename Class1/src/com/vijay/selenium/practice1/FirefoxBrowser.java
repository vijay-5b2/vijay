package com.vijay.selenium.practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "E:\\Selenium_Training\\Softwares\\geckodriver-v0.16.1-win64\\geckodriver.exe");
WebDriver obj1=new FirefoxDriver();
obj1.get("https://www.amazon.com");
/*String mytitle1 = obj1.getTitle();
String myurl = obj1.getCurrentUrl();
System.out.println("My site is" + mytitle1 +" and my url is: " + myurl);
obj1.getPageSource();
System.out.println(obj1);*/
obj1.manage();



	}

}
