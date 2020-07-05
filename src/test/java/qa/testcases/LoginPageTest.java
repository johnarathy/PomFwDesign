package qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import qa.base.TestBase;
import qa.pages.BookStoreLoggedIn;
import qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void loginPageHeaderTest() {
		String text = loginPage.validateLoginPageHeader();
		Assert.assertEquals(text, "Login");
	}
	
	@Test
	public void loginTest() {
		BookStoreLoggedIn homePg = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
