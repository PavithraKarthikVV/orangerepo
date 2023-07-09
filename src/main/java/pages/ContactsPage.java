package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactsPage {
	private WebDriver driver;
	

	public ContactsPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	@FindBy(xpath ="//label[text()='Street 1']/../../div[2]/input")private WebElement Street1;
	@FindBy(xpath ="//label[text()='Street 2']/../../div[2]/input") private WebElement Street2;
	@FindBy(xpath ="//label[text()='City']/../../div[2]/input")private WebElement City;
	@FindBy(xpath ="//label[text()='State/Province']/../../div[2]/input")private WebElement State;
	//@FindBy(xpath ="//label[text()='Zip/Postal Code']/../../div[2]/input")private WebElement Zipcode;
	/* //div[@class='oxd-select-text-input']/..//div[@role='listbox']//*[text()='India']   */
	//@FindBy(xpath ="//label[text()='Country']/../../div[2]//div[@tabindex='0']")private WebElement Country1;
	@FindBy(xpath ="//label[text()='Home']/../../div[2]/input")private WebElement Home;
	@FindBy(xpath ="//label[text()='Mobile']/../../div[2]/input")private WebElement Mobile;
	@FindBy(xpath ="//label[text()='Work']/../../div[2]/input")private WebElement Work;
	@FindBy(xpath ="//label[text()='Work Email']/../../div[2]/input")private WebElement WorkEmail;
	@FindBy(xpath ="//label[text()='Other Email']/../../div[2]/input")private WebElement OtherEmail;
	@FindBy(xpath ="//button[@type='submit']")private WebElement SubmitBtn;
	@FindBy(id = "oxd-toaster_1") private WebElement SaveAlert;
	
	public void ContactFillData(String st1,String st2,String ct,String st,String hm,String mb,String wp,String em,String ot)
	{
		PageFactory.initElements(driver,this);
		new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(Street1));
		Street1.click();
		Street1.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		Street1.sendKeys(st1);
		Street2.click();
		Street2.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		Street2.sendKeys(st2);
		City.click();
		City.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		City.sendKeys(ct);
		State.click();
		State.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		State.sendKeys(ct);
		/*Zipcode.click();
		new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(Zipcode));
		Zipcode.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		Zipcode.sendKeys(zip);
		new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(Country1));
		Country1.click();
		Country1.sendKeys("ii");*/
		Home.click();
		Home.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		Home.sendKeys(hm);
		Mobile.click();
		Mobile.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		Mobile.sendKeys(mb);
		Work.click();
		Work.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		Work.sendKeys(wp);
		WorkEmail.click();
		WorkEmail.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		WorkEmail.sendKeys(em);
		OtherEmail.click();
		OtherEmail.sendKeys(Keys.CONTROL+"A"+Keys.DELETE);
		OtherEmail.sendKeys(ot);
	}
	public void save() {
		PageFactory.initElements(driver,this);
		SubmitBtn.click();
	}
	public boolean SavePopup()
	{PageFactory.initElements(driver,this);
		new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(SaveAlert));
		if(SaveAlert.isDisplayed())
		{
			return true;
		}
		return false;
	}
}
