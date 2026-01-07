package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	
@Test	
public void checkUsesrisAbleToLoginWithValidCredentials()	
{
	
	String user="admin";
	String pword="admin";
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(user);
	loginpage.enterPassword(pword);
	loginpage.clickSignin();
	Boolean isHomepageDisplayed=loginpage.isDashboardDisplayed();
	Assert.assertTrue(isHomepageDisplayed);

}
}