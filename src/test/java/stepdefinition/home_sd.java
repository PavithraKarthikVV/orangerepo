package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.collections.Maps;

import driverfactory.*;
import pages.*;
import io.cucumber.datatable.DataTable;
public class home_sd {
	private Login l=new Login(DriverFactory.getdriver());
	private HomePage home;
	private PersonalDetailPage personal;
	
	@Given("User is already logged in to application")
	public void user_is_already_logged_in_to_application(DataTable dataTable) {
	  List<Map<String,String>> credList= dataTable.asMaps();
	  String userName=credList.get(0).get("username");
	  String passWord=credList.get(0).get("password");
	  DriverFactory.getdriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  home=l.login(userName, passWord);
	  
	  
	}
	
	
	@Given("Employee in Employeepage")
	public void employee_in_employeepage() {
	System.out.println(home);
	}

	@Given("Click on the info tab")
	public void click_on_the_info_tab() {
	 home.InfoClick();
	
	 }
	
	

}
