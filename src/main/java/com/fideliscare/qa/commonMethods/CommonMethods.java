package com.fideliscare.qa.commonMethods;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.fideliscare.qa.base.BaseClass;
import com.fideliscare.qa.utilities.JavaLogger;

public class CommonMethods {
	
	public String getText(WebDriver driver, WebElement element, String expected) {
		String text = null;
		try {
			BaseClass.wait.until(ExpectedConditions.visibilityOf(element));
			JavaLogger.log("Actual value:"+ text);
			Assert.assertEquals(expected, text);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
			Assert.fail();
		}
		return text;
	}
	
	public void clickMethod(WebElement element) {
		try {
			element.click();
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	public void writeText(WebElement element, String val) {
		try {
			element.sendKeys(val);
		} catch (NullPointerException | NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	
	

}
