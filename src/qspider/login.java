package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login
{

	@FindBy(id="username")
	private WebElement untextbox;

	@FindBy(name="pwd")
	private WebElement pwtextbox;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;

	    public login(WebDriver driver)
	    {
		/*untextbox=driver.findElement(By.id("username"));
		pwtextbox=driver.findElement(By.name("pwd"));
		loginbutton=driver.findElement(By.id("loginButton"));*/
	   
	    	PageFactory.initElements(driver, this);
	    }
	


	public void login2(String un,String pw)
	{
		untextbox.sendKeys(un);
		pwtextbox.sendKeys(pw);
		loginbutton.click();
	}
	


	
	}


