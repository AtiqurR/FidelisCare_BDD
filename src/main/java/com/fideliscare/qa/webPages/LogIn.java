package com.fideliscare.qa.webPages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fideliscare.qa.base.BaseClass;
import com.fideliscare.qa.commonMethods.CommonMethods;

public class LogIn {

	public LogIn(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@class='dropdown-toggle'])[1]") public WebElement logIn;
	@FindBy(xpath = "(//h4[@class='link-external'])[1]")  public WebElement memberOP;
	@FindBy(name = "dnn$ctr5098$View$txtEmail") public WebElement email;
	@FindBy(name = "dnn$ctr5098$View$txtPassword") public WebElement password;
	@FindBy(id = "dnn_ctr5098_View_btnLogin") public WebElement logInBtn;
	
	public void logInStep() {
		BaseClass.cm.clickMethod(logIn);
	}
	public void memberOPStep() {
		BaseClass.cm.clickMethod(memberOP);
		
		Set<String> allwindowhandles = BaseClass.driver.getWindowHandles();
		String parent = (String) allwindowhandles.toArray()[0];
		String child = (String) allwindowhandles.toArray()[1];
		BaseClass.driver.switchTo().window(child);
		
	}
	
	public  void emailStep() {
//		BaseClass.cm.clickMethod(email);
		BaseClass.cm.writeText(email, "anik@gmail.com");
	}
	public void passwordStep() {
		BaseClass.cm.writeText(password, "abcde");
	}
	public void logInBtnStep() {
		BaseClass.cm.clickMethod(logInBtn);
	}

}
