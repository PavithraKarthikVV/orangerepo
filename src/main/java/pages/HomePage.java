package pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PersonalDetailPage;

public class HomePage {

	private WebDriver driver;
	public HomePage(WebDriver d) {
		// TODO Auto-generated constructor stub
		this.driver=d;
	}
	@FindBy(xpath ="//span[text()='My Info']") private WebElement Myinfo;

	
	public PersonalDetailPage InfoClick()
	{
		PageFactory.initElements(driver,this);
		new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(Myinfo));
		Myinfo.click();
		return new PersonalDetailPage(driver);
	}

	
	
	
	

}
