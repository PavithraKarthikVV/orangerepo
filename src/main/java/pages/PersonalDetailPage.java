package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PersonalDetailPage {
private WebDriver driver;
@FindBy(xpath ="//a[text()='Contact Details']")private WebElement Contact;
@FindBy(xpath ="//a[contains(@href,'Emergency')]")private WebElement EmergncyBtn;
	public PersonalDetailPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public ContactsPage ContactClick()
	{
		PageFactory.initElements(driver,this);
		new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(Contact));
		Contact.click();
		return new ContactsPage(driver);
	}
	
	public EmergencyPage EmergencyClick() throws InterruptedException {
		PageFactory.initElements(driver,this);
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(EmergncyBtn));
		Thread.sleep(5000);
		EmergncyBtn.click();
		return new EmergencyPage(driver);
		
	}
	
}
