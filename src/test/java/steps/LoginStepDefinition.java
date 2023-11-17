/*
 * package steps;
 * 
 * import org.openqa.selenium.support.PageFactory;
 * 
 * import io.cucumber.java.After; import io.cucumber.java.Before; import
 * io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pages.DatabasePage; import pages.LoginPage; import pages.TestBase;
 * 
 * public class LoginStepDefinition extends TestBase {
 * 
 * LoginPage loginpage; DatabasePage databasePage;
 * 
 * @Before public void before_Run() {
 * 
 * init(); loginpage = PageFactory.initElements(driver, LoginPage.class);
 * databasePage = new DatabasePage();
 * 
 * }
 * 
 * @Given("User is on techfios login page") public void
 * user_is_on_techfios_login_page() { }
 * 
 * @When("User enters username as {string}") public void
 * user_enters_username_as(String userName) throws InterruptedException {
 * loginpage.insertUserName(userName);
 * 
 * }
 * 
 * @When("User enters password as {string}") public void
 * user_enters_password_as(String password) {
 * 
 * loginpage.insertPassword(password);
 * 
 * }
 * 
 * @Given("User is on codefios login page") public void
 * User_is_on_codefios_login_page() { driver.get("https://qa.codefios.com/");
 * 
 * }
 * 
 * @When("User enters {string} from mysql database") public void
 * user_enters_from_mysql_database(String loginData) {
 * 
 * if (loginData.equalsIgnoreCase("username")) {
 * 
 * try { loginpage.insertUserName((databasePage.getDataFromDB("username"))); }
 * catch (InterruptedException e) { e.printStackTrace(); }
 * 
 * } else if (loginData.equalsIgnoreCase("password")) {
 * 
 * loginpage.insertPassword(databasePage.getDataFromDB("password"));
 * 
 * } else { System.out.println("Unable to pull data"); }
 * 
 * }
 * 
 * @When("User clicks on signin button") public void
 * user_clicks_on_signin_button() { loginpage.clickOnSignintButton();
 * 
 * }
 * 
 * @Then("User should land on dashboard page") public void
 * user_should_land_on_dashboard_page() {
 * 
 * loginpage.validateDashboard(); takeScreenshot(driver);
 * 
 * }
 * 
 * @After public void tearDown() {
 * 
 * driver.close(); driver.quit();
 * 
 * }
 * 
 * }
 */