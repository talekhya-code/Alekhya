package StepDefinitions;

import com.crm.pages.HomePage;
import com.crm.pages.LaunchPage;
import com.crm.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	LaunchPage lp = new LaunchPage();
	LoginPage login;
	HomePage hp = new HomePage();

	@Given("The application is launched")
	public void the_application_is_launched() {
		lp.verifyApplicationLaunchPage();
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		login = lp.navigateToLoginPage();
	}

	@Then("Verify the Login Page have all fields")
	public void verify_the_login_page_have_all_fields() {
		login.verifyField();
	}
	
	@When("^User enters the (.*) and (.*)$")
	public void user_enters_the_UserId_and_Password(String user, String password) {
	    login.enterTheCredentials(user, password);
	}
	
	@When("User clicks the login button on login page")
	public void user_clicks_the_login_button_on_login_page() {
		login.clickLoginBtn();   
	}

	@Then("Verify user is navigated to Home Page")
	public void verify_user_is_navigated_to_home_page() {
	    hp.verifyApplicationHome();
	}
	


}
