package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.crm.base.TestBase;

public class HomePage extends TestBase {

    // Declare By locators
    private static final By LOGIN_BUTTON = By.xpath("//div[contains(text(), 'Login')]");
    private static final By COMPANY_NAME = By.xpath("//b[normalize-space()='Krishsoftware']");
    private static final By USER_PROFILE = By.xpath("//span[@class='user-display']");
    private static final By HOME_ICON = By.xpath("//i[@class='home icon']");
    private static final By CALENDAR_ICON = By.xpath("//i[@class='calendar icon']");
    private static final By CONTACTS_ICON = By.xpath("//i[@class='users icon']");
    private static final By COMPANIES_ICON = By.xpath("//i[@class='building icon']");
    private static final By DEALS_ICON = By.xpath("//i[@class='money icon']");
    private static final By TASKS_ICON = By.xpath("//i[@class='tasks icon']");
    private static final By CASES_ICON = By.xpath("//i[@class='comments icon']");
    private static final By CALLS_ICON = By.xpath("//i[@class='phone icon']");
    private static final By DOCUMENTS_ICON = By.xpath("//i[@class='file icon']");
    private static final By EMAIL_ICON = By.xpath("//i[@class='mail outline icon']");
    private static final By CAMPAIGNS_ICON = By.xpath("//i[@class='target icon']");
    private static final By FORMS_ICON = By.xpath("//i[@class='wpforms icon']");
    private static final By REPORTS_ICON = By.xpath("//i[@class='line chart icon']");
    private static final By HOME_BUTTON = By.xpath("//span[normalize-space()='Home']");
    private static final By CALENDAR_BUTTON = By.xpath("//span[normalize-space()='Calendar']");
    private static final By CONTACTS_BUTTON = By.xpath("//span[normalize-space()='Contacts']");
    private static final By COMPANIES_BUTTON = By.xpath("//span[normalize-space()='Companies']");
    private static final By DEALS_BUTTON = By.xpath("//span[normalize-space()='Deals']");
    private static final By TASKS_BUTTON = By.xpath("//span[normalize-space()='Tasks']");
    private static final By CASES_BUTTON = By.xpath("//span[normalize-space()='Cases']");
    private static final By CALLS_BUTTON = By.xpath("//span[normalize-space()='Calls']");
    private static final By DOCUMENTS_BUTTON = By.xpath("//span[normalize-space()='Documents']");
    private static final By EMAIL_BUTTON = By.xpath("//span[normalize-space()='Email']");
    private static final By CAMPAIGNS_BUTTON = By.xpath("//span[normalize-space()='Campaigns']");
    private static final By FORMS_BUTTON = By.xpath("//span[normalize-space()='Forms']");
    private static final By REPORTS_BUTTON = By.xpath("//span[normalize-space()='Reports']");

    // Method to verify application home
    public void verifyApplicationHome() {
        driver.findElement(LOGIN_BUTTON).click();
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Cogmento CRM"));
    }

    // Method to verify company and profile
    public void verifyCompanyAndProfile() {
        driver.findElement(COMPANY_NAME).isDisplayed();
        driver.findElement(USER_PROFILE).isDisplayed();
    }

    // Method to verify home button options
    public void verifyHomeButtonOptions() {
        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(HOME_ICON)).build().perform();
        driver.findElement(HOME_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(CALENDAR_ICON)).build().perform();
        driver.findElement(CALENDAR_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(CONTACTS_ICON)).build().perform();
        driver.findElement(CONTACTS_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(COMPANIES_ICON)).build().perform();
        driver.findElement(COMPANIES_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(DEALS_ICON)).build().perform();
        driver.findElement(DEALS_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(TASKS_ICON)).build().perform();
        driver.findElement(TASKS_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(CASES_ICON)).build().perform();
        driver.findElement(CASES_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(CALLS_ICON)).build().perform();
        driver.findElement(CALLS_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(DOCUMENTS_ICON)).build().perform();
        driver.findElement(DOCUMENTS_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(EMAIL_ICON)).build().perform();
        driver.findElement(EMAIL_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(CAMPAIGNS_ICON)).build().perform();
        driver.findElement(CAMPAIGNS_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(FORMS_ICON)).build().perform();
        driver.findElement(FORMS_BUTTON).isEnabled();

        action.moveToElement(driver.findElement(REPORTS_ICON)).build().perform();
        driver.findElement(REPORTS_BUTTON).isEnabled();
    }

    // Method to click calendar button
    public CalendarPage clickCalendarBtn() {
        driver.findElement(CALENDAR_ICON).click();
        return new CalendarPage();
    }

    // Method to click contacts button
    public ContactsPage clickContactsButton() {
        driver.findElement(CONTACTS_ICON).click();
        return new ContactsPage();
    }
}
