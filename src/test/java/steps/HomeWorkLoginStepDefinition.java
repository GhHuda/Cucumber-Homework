package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class HomeWorkLoginStepDefinition extends TestBase {

	LoginPage loginpage;

	@Before
	public void before_Run() {

		init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);

	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
	
	}
	

	@When("User enters the {string} in the username field")
	public void user_enters_the_in_the_username_field(String userName) throws InterruptedException {
		
		loginpage.insertUserName(userName);
		
	}

	@When("User enters the {string} in the password field")
	public void user_enters_the_in_the_password_field(String password) {
		
		loginpage.insertPassword(password);
		
	}

	@And("User clicks on login")
	public void user_clicks_on_login() {
		
		loginpage.clickOnSignintButton();
		
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		
		loginpage.validateDashboard();
		takeScreenshot(driver);
	}

	@And("User clicks on bankCash")
	public void user_clicks_on_bankCash() throws InterruptedException {
		
		loginpage.clickOnBankAndCashButton();
		
	}

	@And("User clicks on newAccount")
	public void user_clicks_on_newAccount() throws InterruptedException {

		loginpage.clickOnNewAccountButton();	
		
	}

	@And("User enters {string} in the accountTitle field in accounts page")
	public void user_enters_in_the_accountTitle_field_in_accounts_page(String accountTitle) {
		
		loginpage.enterAccountTitle(accountTitle + generateRandomNum(9999));
		
	}

	@And("User enters {string} in the description field in accounts page")
	public void user_enters_in_the_description_field_in_accounts_page(String description) {
		
		loginpage.enterAccountDescreption(description + generateRandomNum(999));
		
	}

	@And("User enters {string} in the initialBalance field in accounts page")
	public void user_enters_in_the_initialBalance_field_in_accounts_page(String initialBalance) {
		
		loginpage.enterInitialBalance(initialBalance);
		
	}

	@Then("User enters {string} in the accountNumber field in accounts page")
	public void user_enters_in_the_accountNumber_field_in_accounts_page(String accountNumber) {
	
		loginpage.enterAccountNumber(accountNumber + generateRandomNum(99999));
		
	}

	@And("User enters {string} in the contactPerson field in accounts page")
	public void user_enters_in_the_contactPerson_field_in_accounts_page(String contactPerson) {
	
		loginpage.enterContactPerson(contactPerson + generateRandomNum(999));
		
	}

	@And("User enters {string} in the Phone field in accounts page")
	public void user_enters_in_the_Phone_field_in_accounts_page(String Phone) {
	
		loginpage.enterContactPhone(Phone+generateRandomNum(999));
		
	}

	@And("User enters {string} in the internetBankingURL field in accounts page")
	public void user_enters_in_the_internetBankingURL_field_in_accounts_page(String internetBankingURL) {

		loginpage.enterInternetBankingURL(internetBankingURL);
		
	}

	@And("User clicks on submit")
	public void user_clicks_on_submit() {

		loginpage.clickOnSubmitButton();
		
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() throws InterruptedException {
		Thread.sleep(3000);
		loginpage.validateListAccounts();
		takeScreenshot(driver);

	}

	@After
	public void tearDown() throws InterruptedException {

		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}

}
