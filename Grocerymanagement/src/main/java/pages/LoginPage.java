package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@name='username']")WebElement username;
	@FindBy(xpath="//input[@name='password']")WebElement password;
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	
		
public WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}

public void enterUserName(String uname)
{
	username.sendKeys(uname);
}

public void enterPassword(String pword)
{
	password.sendKeys(pword);
}

public void clickSignin()
{
	signin.click();
}

public boolean isDashboardDisplayed()
{
	return dashboard.isDisplayed();
}

}
