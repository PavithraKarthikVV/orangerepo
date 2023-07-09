package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class EmergencyPage {
private WebDriver driver;
public EmergencyPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	
	this.driver=driver;
	
}
@FindBy(xpath ="//h6[text()='Assigned Emergency Contacts']/../button")private WebElement AddEmergencyContact;
@FindBy(xpath ="//label[text()='Name']/../../div[2]/input")private WebElement EmgName;
@FindBy(xpath ="//label[text()='Relationship']/../../div[2]/input")private WebElement EmgRelation ;
@FindBy(xpath ="//label[text()='Home Telephone']/../../div[2]/input")private WebElement EmgTelephone ;
@FindBy(xpath ="//label[text()='Mobile']/../../div[2]/input")private WebElement EmgMobile;
@FindBy(xpath ="//label[text()='Work Telephone']/../../div[2]/input")private WebElement EmgWorkphone;
@FindBy(xpath ="//button[@type='submit']")private WebElement EmgSaveBtn;
@FindBy(id = "oxd-toaster_1") private WebElement SaveAlert;

public void EmergencyFillData(String name,String Relation,String Tele,String Mobile,String Work) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	PageFactory.initElements(driver,this);
	new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(EmgName));
	EmgName.click();
	EmgName.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
	EmgName.sendKeys(name);
	EmgRelation.click();
	EmgRelation.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
	EmgRelation.sendKeys(Relation);
	EmgTelephone.click();
	EmgTelephone.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
	EmgTelephone.sendKeys(Tele);
	EmgMobile.click();
	EmgMobile.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
	EmgMobile.sendKeys(Mobile);
	EmgWorkphone.click();
	EmgWorkphone.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
	EmgWorkphone.sendKeys(Work);
	EmgSaveBtn.click();	
}

public void AddEmergency() {
	PageFactory.initElements(driver,this);
	new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(AddEmergencyContact));
	AddEmergencyContact.click();
	
}
public void save() throws InterruptedException {
	PageFactory.initElements(driver,this);
	
/*	Actions act=new Actions(driver);
	act.scrollToElement(EmgSaveBtn);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,500)", "");*/
	new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(EmgSaveBtn));
	EmgSaveBtn.click();
}
//public boolean SavePopup()
//{PageFactory.initElements(driver,this);
//	new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(SaveAlert));
//	if(SaveAlert.isDisplayed())
//	{
//		return true;
//	}
//	return false;
//}
}
