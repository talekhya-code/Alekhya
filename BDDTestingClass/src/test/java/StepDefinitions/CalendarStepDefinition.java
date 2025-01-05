package StepDefinitions;

import com.crm.pages.CalendarPage;
import com.crm.pages.HomePage;

import io.cucumber.java.en.Then;

public class CalendarStepDefinition {

		HomePage homepage = new HomePage();
		CalendarPage calendarpage = new CalendarPage();
		
		@Then("User clicks on Calendar")
		public void user_clicks_on_calendar() {
			homepage.clickCalendarBtn();	    
		}

		@Then("Validate the dashboard header buttons")
		public void validate_the_dashboard_header_buttons() {
			calendarpage.dashboardHeaderButtons();
		}

		@Then("Validate the current month and year in calendar")
		public void validate_the_current_month_and_year_in_calendar() {
			calendarpage.currentMonthYear();
		}


	}

