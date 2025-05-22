package PFM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import ReportingUtil.Reporters;

public class C_Login {
	
	WebDriver driver;
	Reporters R1;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[1]/button")
	WebElement CustomerLoginBtn;
	
	@FindBy(xpath="//*[@id=\"userSelect\"]")
	WebElement YourName;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/form/button")
	WebElement LoginBtn;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[2]")
	WebElement Deposit;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/div/input")
	WebElement DepositAmount;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/button")
	WebElement DepositBtn;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[3]")
	WebElement Withdraws;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/div/input")
	WebElement WithdrawAmount;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[4]/div/form/button")
	WebElement WithdrawBtn;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[1]")
	WebElement TransactionBtn;
	
	
	public void driver(WebDriver driver01,Reporters R2) {
		this.driver = driver01;
		this.R1 = R2;
		PageFactory.initElements(driver01,this);
	}
	
	
	public void user_can_click_customer_login_and_user_can_choose_your_name_and_click_login_btn() throws InterruptedException, IOException {
		CustomerLoginBtn.click();
	    Thread.sleep(2000);
	    WebElement dropdownElementes = YourName;
	    
	    Select dropdowns = new Select(dropdownElementes);
		dropdowns.selectByIndex(6);
		
		R1.logger(driver,"Customer", "CustomerReport");
		
		Thread.sleep(2000);
		LoginBtn.click();
		Thread.sleep(2000);
	}
	
	public void user_click_deposit_and_add_some_amount_as_and_deposited_successfull(String deposit) throws InterruptedException, IOException {
		   Deposit.click();
		   Thread.sleep(2000);
		   DepositAmount.sendKeys(deposit);
		   Thread.sleep(2000);
		   DepositBtn.click();
		   Thread.sleep(2000);
		   R1.logger(driver, "deposit", "depositreport");
		}
	
	public void user_click_withdraw_some_amount_as_and_withdrawed_successfull(String Withdraw) throws InterruptedException, IOException {
		Withdraws.click();
		Thread.sleep(2000);
		WithdrawAmount.sendKeys(Withdraw);
		Thread.sleep(2000);
		WithdrawBtn.click();
		Thread.sleep(2000);
		R1.logger(driver, "Withdraw", "Withdrawreport");
	}
	
	public void user_click_transactions_to_check_the_transactions() throws InterruptedException, IOException {
		TransactionBtn.click();
		Thread.sleep(2000);
		R1.logger(driver,"Transaction","TransactionReport");
	}
	
	public void user_close_the_brower() {
		R1.closeReport();
	    driver.quit();
	}

}
