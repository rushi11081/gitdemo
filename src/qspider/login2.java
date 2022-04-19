package qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2
{

	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> allcheckbox;

	

	    public login2(WebDriver driver)
	    {
		
	   
	    	PageFactory.initElements(driver, this);
	    }
	


	public void selectchk()
	{
		
		int count=allcheckbox.size();
		for(int i=0;i<count;i++)
		{
			
			allcheckbox.get(i).click();
		}
	}
	


	
	}


