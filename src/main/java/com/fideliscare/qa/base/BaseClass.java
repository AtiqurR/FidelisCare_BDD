package com.fideliscare.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fideliscare.qa.commonMethods.CommonMethods;
import com.fideliscare.qa.webPages.LogIn;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static CommonMethods cm;
	public static LogIn logIn;
	
	
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.fideliscare.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 30);
		init();
	}
	
	public static void init() {
		cm = new CommonMethods();
		logIn = new LogIn(driver);
	}
	
	public static void tearUp() {
		driver.quit();
	}

}
