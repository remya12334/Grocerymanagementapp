package testscript;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utility.ExcelUtility;

public class LoginTest extends Base {	
@Test	
public void checkUsesrisAbleToLoginWithValidCredentials() throws IOException	
{
	
	//String user="admin";
	//String pword="admin";
	String user=ExcelUtility.getStringData(1,0,"LOGINPAGE");//LOGINPAGE IS SHEET NAME
	String pword=ExcelUtility.getStringData(1,1,"LOGINPAGE");
	LoginPage loginpage=new LoginPage(driver);
	loginpage.enterUserName(user);
	loginpage.enterPassword(pword);
	loginpage.clickSignin();
	Boolean isHomepageDisplayed=loginpage.isDashboardDisplayed();
	Assert.assertTrue(isHomepageDisplayed);

}

}