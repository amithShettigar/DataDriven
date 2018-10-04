package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample {
	
	@FindBy(id="userHandle")
	private WebElement usernameTB;
	
	@FindBy(id="password")
	private WebElement passwordTB;
	
	@FindBy(xpath="//div/button[.='LOGIN']")
	private WebElement submitbtn;
	
	public Sample(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void username(String dummy)
	{
		usernameTB.sendKeys(dummy);
	}
	
	public void password(String passw)
	{
		usernameTB.sendKeys(passw);
	}
	
	public void sumbitbutton()
	{
		submitbtn.click();
	}
	
}


