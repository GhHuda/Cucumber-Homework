package pages;

import org.junit.Assert;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;

	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserNameElement;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PasswordElement;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInElement;
	@FindBy(how = How.XPATH, using = "//h2[text()=' Dashboard ']")
	WebElement DashboardHeaderElement;
	@FindBy(how = How.XPATH, using = "//span[text()='Bank & Cash']")
	WebElement BankAndCashElement;
	@FindBy(how = How.XPATH, using = "//a[text()='New Account']")
	WebElement NewAccountElement;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement AccountTitleElement;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement AccountDescriptionElement;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement AccountBalanceElement;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement AccountNumberElement;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement ContactPersonElement;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement ContactPhoneElement;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement IBURLElement;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement SubmitElement;
	@FindBy(how = How.XPATH, using = "//h5[text()='Manage Accounts']")
	WebElement ListAccountsHeaderElement;
	
	
	

	public void insertUserName(String userName) throws InterruptedException {

		Thread.sleep(2000);
		UserNameElement.sendKeys(userName);

	}

	public void insertPassword(String password) {

		PasswordElement.sendKeys(password);

	}

	public void clickOnSignintButton() {

		SignInElement.click();

	}

	public void validateDashboard() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Assert.assertEquals("Dashboard Page is Not Available!","Dashboard" , DashboardHeaderElement.getText());
	

	}

	
	public void clickOnBankAndCashButton() throws InterruptedException {
		Thread.sleep(3000);
		BankAndCashElement.click();
		
	}
	
	public void clickOnNewAccountButton() throws InterruptedException {
		Thread.sleep(3000);
		NewAccountElement.click();
		
	}
	
	public void enterAccountTitle(String accountTitle) {
		
		AccountTitleElement.sendKeys(accountTitle);
		
	}
	
	public void enterAccountDescreption(String descreption) {
		
		AccountDescriptionElement.sendKeys(descreption);
				
	}
	
	public void enterInitialBalance(String initialBalance) {
		
		AccountBalanceElement.sendKeys(initialBalance);
		
	}
	
	public void enterAccountNumber(String accountNumber ) {
		
		AccountNumberElement.sendKeys(accountNumber);
		
	}
	
	public void enterContactPerson(String contactPerson) {
		
		ContactPersonElement.sendKeys(contactPerson);
		
	}
	
	public void enterContactPhone(String Phone) {
		
		ContactPhoneElement.sendKeys(Phone);
		
	}
	
	public void enterInternetBankingURL(String internetBankingURL) {
		
		IBURLElement.sendKeys(internetBankingURL);
		
	}
	
	public void clickOnSubmitButton() {
		
		SubmitElement.click();
		
	}
	
	public void validateListAccounts() {
		
		Assert.assertEquals("List Accounts Page is Not Available!","Manage Accounts" , ListAccountsHeaderElement.getText());
		
		
	}
	
	
}
