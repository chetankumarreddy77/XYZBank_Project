package Step;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PFM.C_Login;
import PFM.Home;
import PFM.M_Login;
import ReportingUtil.Reporters;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def {
	
	WebDriver driver;
	Reporters R1;
	
	M_Login MP;
	Home    HP;
	C_Login CP;
	
	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		R1 = new Reporters();
		R1.CreateHTMLReport("XYZ_Bank_Report");
	}
	@Then("user enter the url as {string}")
	public void user_enter_the_url_as(String url) {
		MP = new M_Login();
		MP.driver(driver,R1);
		MP.user_enter_the_url_as(url);
	}
	@When("user click the bank manager login")
	public void user_click_the_bank_manager_login() throws InterruptedException {
		MP.user_click_the_bank_manager_login();

	}
	@When("Bank manager add customer Fname as {string} and Lname as {string} and zipcode as {string} add customer button")
	public void bank_manager_add_customer_fname_as_and_lname_as_and_zipcode_as_add_customer_button(String fname, String lname, String zipcode) throws InterruptedException, IOException {
		MP.bank_manager_add_customer_fname_as_and_lname_as_and_zipcode_as_add_customer_button(fname, lname, zipcode);
	}
	@Then("Bank manager open the bank account on customer and choose the customer and currency and click procees button")
	public void bank_manager_open_the_bank_account_on_customer_and_choose_the_customer_and_currency_and_click_procees_button() throws InterruptedException, IOException {
		MP.bank_manager_open_the_bank_account_on_customer_and_choose_the_customer_and_currency_and_click_procees_button();
	}
	@Then("user can click the customer details and you have to search as {string}")
	public void user_can_click_the_customer_details_and_you_have_to_search_as(String search) throws InterruptedException, IOException {
		MP.user_can_click_the_customer_details_and_you_have_to_search_as(search);
	}
	
	//Home
	
	@Then("user click on home button")
	public void user_click_on_home_button() throws InterruptedException {
	   HP = new Home();
	   HP.driver(driver,R1);
	   HP.user_click_on_home_button();
	}
	@Then("user can click customer Login and user can choose your name and click login btn")
	public void user_can_click_customer_login_and_user_can_choose_your_name_and_click_login_btn() throws InterruptedException, IOException {
	   CP = new C_Login();
	   CP.driver(driver,R1);
	   CP.user_can_click_customer_login_and_user_can_choose_your_name_and_click_login_btn();
	}
	@Then("user click deposit and add some amount as {string} and deposited successfull")
	public void user_click_deposit_and_add_some_amount_as_and_deposited_successfull(String deposit) throws InterruptedException, IOException {
	   CP.user_click_deposit_and_add_some_amount_as_and_deposited_successfull(deposit);
	}
	@When("user click withdraw some amount as {string} and Withdrawed Successfull")
	public void user_click_withdraw_some_amount_as_and_withdrawed_successfull(String Withdraw) throws InterruptedException, IOException {
	   CP.user_click_withdraw_some_amount_as_and_withdrawed_successfull(Withdraw);
	}
	@When("user click transactions to check the transactions")
	public void user_click_transactions_to_check_the_transactions() throws InterruptedException, IOException {
	   CP.user_click_transactions_to_check_the_transactions();
	}
	@Then("user close the brower")
	public void user_close_the_brower() {
	   CP.user_close_the_brower();
	}

}
