package StepDefinitions;

import com.crm.pages.ContactsPage;
import com.crm.pages.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsStepDefinitions {
	
	HomePage homepage = new HomePage();
	ContactsPage contactspage = new ContactsPage();
	
	@And("User clicks on Contacts")
	public void user_clicks_on_contacts() {
		homepage.clickContactsButton();
	}

	@When("User clicks on create button")
	public void user_clicks_on_create_button() {
		contactspage.clickCreateButton();
	}

	@Then("Verify user is navigated to create new contact page")
	public void verify_user_is_navigated_to_create_new_contact_page() {
	    contactspage.verifyCreateContactPage();
	}

	@Then("User enter the mandatory fields")
	public void user_enter_the_mandatory_fields() {
	    contactspage.enterMandatoryFields();
	}

	@Then("User clicks on save button")
	public void user_clicks_on_save_button() {
	    contactspage.clickSaveButton();
	}

	@Then("Verify the contact is created")
	public void verify_the_contact_is_created() {
	    contactspage.verifyContactCreated();
	}
	
	@When("User clicks on edit icon")
	public void user_clicks_on_edit_button() {
		contactspage.clickEditIcon();
	}

	@Then("Edit firstname and lastname")
	public void edit_firstname() {
		contactspage.editFirstAndLastName();
	}
	
	@Then("User clicks on delete icon")
	public void user_clicks_on_delete_icon() {
		contactspage.clickDeleteIcon();
	}

	@Then("User clicks on delete button on popup")
	public void user_clicks_on_delete_button_in_popup() {
		contactspage.clickDeleteButtonOnPopUp();
	}
	
	@When("User clicks on Edit icon for a particular contact")
	public void user_clicks_on_edit_icon_for_a_particular_contact() {
	    contactspage.clickEditIconForContact();
	}

	@When("User clicks on Delete icon for a particular contact")
	public void user_clicks_on_delete_icon_for_a_particular_contact() {
		contactspage.clickDeleteIconForContact();
	    
	}


}
