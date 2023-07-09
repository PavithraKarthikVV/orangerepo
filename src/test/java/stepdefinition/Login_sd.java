package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.*;

import org.junit.Assert;

import driverfactory.*;
public class Login_sd {
	Login l=new Login(DriverFactory.getdriver());
	
	@Given("Launch App")
	public void launch_app() {
		//DriverFactory.getdriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login ");
		System.out.println(DriverFactory.getdriver().getCurrentUrl());
	}

	@When("Give username and password {string},{string}")
	public void give_username_and_password(String string, String string2) {
	   l.loginIn(string, string2);
	}

	@Then("I validate the outcomes {string}")
	public void i_validate_the_outcomes(String string) {
		 String currentTitle=l.VerifyLogin();
		 System.out.println(currentTitle);
		 Assert.assertTrue(currentTitle.contains(string));
	}
}
