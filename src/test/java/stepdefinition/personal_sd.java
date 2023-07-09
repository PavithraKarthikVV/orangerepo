package stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import driverfactory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ContactsPage;
import pages.HomePage;
import pages.Login;
import pages.PersonalDetailPage;

public class personal_sd {
	private Login l=new Login(DriverFactory.getdriver());
	private HomePage home;
	private PersonalDetailPage personal;
	private ContactsPage contactpg;

	
		
	
	@When("click contact details tab")
	public void click_contact_details_tab() {
		personal=new PersonalDetailPage(DriverFactory.getdriver());
		personal.ContactClick();
		 
	}
	
	@When("click emergency details tab")
	public void click_emergency_details_tab() throws InterruptedException {
	   personal=new PersonalDetailPage(DriverFactory.getdriver());
	  personal.EmergencyClick();
	}
	
	@When("Verify page PageTitle")
	public void verify_page_page_title() {
	   System.out.println(DriverFactory.getdriver().getTitle());
	}

	
}
