package PFM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ReportingUtil.Reporters;

public class Home {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath="/html/body/div/div/div[1]/button[1]")
	WebElement HomeBtn;
	
	public void driver(WebDriver driver01,Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	public void user_click_on_home_button() throws InterruptedException {
		HomeBtn.click();
	    Thread.sleep(2000);
	}
	
}
