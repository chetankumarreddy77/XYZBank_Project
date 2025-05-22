package PFM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ReportingUtil.Reporters;



public class M_Login {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[2]/button")
	WebElement BankManagerLogin;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[1]")
	WebElement Addcustomer;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input")
	WebElement Fname;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input")
	WebElement Lname;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input")
	WebElement Zipcode;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
	WebElement AddCustomerBtn;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[2]")
	WebElement OpenAccount;
	
	@FindBy(xpath="//*[@id=\"userSelect\"]")
	WebElement Customer;
	
	@FindBy(xpath="//*[@id=\"currency\"]")
	WebElement Currency;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/div/form/button")
	WebElement Process;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/button[3]")
	WebElement Customers;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input")
	WebElement Search;
	
	
	public void driver(WebDriver driver01, Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	
	public void user_click_the_bank_manager_login() throws InterruptedException {
		BankManagerLogin.click();
	    Thread.sleep(2000);
	    Addcustomer.click();
	    Thread.sleep(2000);

	}
	
	public void user_enter_the_url_as(String url) {
		driver.get(url);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	public void bank_manager_add_customer_fname_as_and_lname_as_and_zipcode_as_add_customer_button(String fname, String lname, String zipcode) throws InterruptedException, IOException {
		Fname.sendKeys(fname);
		Thread.sleep(2000);
		Lname.sendKeys(lname);
		Thread.sleep(2000);
		Zipcode.sendKeys(zipcode);
		Thread.sleep(2000);
		AddCustomerBtn.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text: " + alert.getText());
		alert.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		R1.logger(driver, "AddCustomer", "CustomerReport");
	}
	
	public void bank_manager_open_the_bank_account_on_customer_and_choose_the_customer_and_currency_and_click_procees_button() throws InterruptedException, IOException {
		OpenAccount.click();
		Thread.sleep(2000); 
		
		WebElement dropdownElement = Customer;
	    
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText("John Wick");
		
		Thread.sleep(3000); 
		
		WebElement dropdownElements = Currency;
	    
		Select dropdowns = new Select(dropdownElements);
		dropdowns.selectByVisibleText("Rupee");
		
		Thread.sleep(3000);
		
		Process.click();
		
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text: " + alert.getText());
		alert.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		R1.logger(driver,"OpenAcc", "AccReport");
	}
	
	public void user_can_click_the_customer_details_and_you_have_to_search_as(String search) throws InterruptedException, IOException {
		Customers.click();
	    Thread.sleep(2000);
	    Search.sendKeys(search);
	    Thread.sleep(2000);
	    R1.logger(driver, "search", "searchReport");
	}
	
}
