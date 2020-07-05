package qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qa.base.TestBase;

public class LoginPage extends TestBase{
	//PageFactory
	@FindBy(id="userName")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(@class,'main-header')]")
	WebElement LoginPgHeader;

	//constructor
	public LoginPage() {
		PageFactory.initElements(driver, this);;
	}
	
	//Actions
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String validateLoginPageHeader() {
		return LoginPgHeader.getText();
	}
	
	public BookStoreLoggedIn login(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new BookStoreLoggedIn();
	}
}
