package com.fideliscare.qa.steps;

import com.fideliscare.qa.base.BaseClass;
import com.fideliscare.qa.commonMethods.CommonMethods;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	@Given("user should be on fideliscare home page")
	public void user_should_be_on_fideliscare_home_page() {
	 
	}

	@When("user move cursor to log in tab and click")
	public void user_move_cursor_to_log_in_tab_and_click() {
		  BaseClass.logIn.logInStep();
	}

	@Then("user click on member online portal")
	public void user_click_on_member_online_portal() {
	    BaseClass.logIn.memberOPStep();
	}

	@And("user should enter invalid username")
	public void user_should_enter_invalid_username() {
	    BaseClass.logIn.emailStep();
	}

	@And("user should enter invalid password")
	public void user_should_enter_invalid_password() {
	   BaseClass.logIn.passwordStep();
	}

	@And("user click on login button")
	public void user_click_on_login_button() {
	    BaseClass.logIn.logInBtnStep();
	}

	@Then("the log in failed")
	public void the_log_in_failed() {
	   
	}


}
