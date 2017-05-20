package com.RnD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainDriver {

	public static void main(String[] args) {

		Student jona = new Student(12729, "Physics", "Jonathan");
		jona.displayStudent();
				
		
		/* //WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\softSetup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		*/
		
		
		CollectionsFramework cf = new CollectionsFramework();
		cf.sample();
		
	}//main

}//class
