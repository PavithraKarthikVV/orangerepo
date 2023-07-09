package stepdefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import driverfactory.DriverFactory;
import pages.*;
public class contact_sd {
	
	ContactsPage contact;
	@Given("User in contact Details page")
	public void user_in_contact_details_page() {
		Assert.assertEquals(DriverFactory.getdriver().getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/pim/contactDetails/empNumber/7");
	  
	}

	@When("Enter the contact information")
	public void enter_the_contact_information(DataTable dataTable) {
		List<Map<String,String>> lst=dataTable.asMaps();
		String Street1=lst.get(0).get("Street1");
		String Street2=lst.get(0).get("Street2");
		String City=lst.get(0).get("City");
		String State=lst.get(0).get("State");
		//String Zipcode=lst.get(0).get("Zipcode");
		//String Country=lst.get(0).get("Country");
		String Home =lst.get(0).get("Home");
		String Mobile=lst.get(0).get("Mobile");
		String Work=lst.get(0).get("Work");
		String WorkMail=lst.get(0).get("WorkMail");
		String OtherMail=lst.get(0).get("OtherMail");
		
		contact=new ContactsPage(DriverFactory.getdriver());
		contact.ContactFillData(Street1, Street2, City, State,Home, Mobile, Work, WorkMail, OtherMail);
	}

	@When("Click on save")
	public void click_on_save() {
		contact.save();
	   
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		Assert.assertTrue(contact.SavePopup());
	   
	}
}
