package StepDefinitions;

import com.crm.pages.HomePage;

import io.cucumber.java.en.Then;

public class HomePageStepDefinition {
	
	HomePage homepage = new HomePage();
	
	@Then("Validate company name and profile name")
	public void validate_company_name_and_profile_name() {
		homepage.verifyCompanyAndProfile();
	}

	@Then("Validate Home button and its options")
	public void validate_home_button_and_its_options() {
		homepage.verifyHomeButtonOptions();
	}

}
