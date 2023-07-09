package stepdefinition;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import driverfactory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.EmergencyPage;
import utility.ExcelReader;

public class emergency_sd {
	private EmergencyPage emergency;
	@When("User in emergency Details page")
	public void user_in_emergency_details_page() {
		Assert.assertEquals(DriverFactory.getdriver().getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmergencyContacts/empNumber/7");
	}

	@When("Click on Add button")
	public void click_on_add_button() {
		emergency = new EmergencyPage(DriverFactory.getdriver());
		emergency.AddEmergency();
	}

	@When("Enter the Emergency information from sheetname {string} and RowNumber {int}")
	public void enter_the_emergency_information_from_sheetname_and_row_number(String SheetName, Integer rowno) throws InvalidFormatException, IOException {
	   ExcelReader reader=new ExcelReader();
	 
		List<Map<String,String>> rdata=reader.getData("./src/test/resources/test_exceldata/Book1.xlsx",SheetName);
		String name=rdata.get(rowno).get("Name");
		String relation=rdata.get(rowno).get("Relation");
		String telno=rdata.get(rowno).get("EmgTelephone");
		String mobno=rdata.get(rowno).get("EmgMobile");
		String work=rdata.get(rowno).get("Work");
		emergency.EmergencyFillData(name, relation, telno, mobno, work);
	
	}

		@And("Click on  Emergency contact save")
		public void click_on_save() throws InterruptedException {
			emergency.save();
		   
		}

	   
	}

