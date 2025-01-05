package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.crm.base.TestBase;

public class ContactsPage extends TestBase {

    // Declare By locators
    private static final By CREATE_BUTTON = By.xpath("//button[normalize-space()='Create']");
    private static final By CREATE_CONTACT_PAGE = By.xpath("//span[@class='selectable ']");
    private static final By FIRST_NAME_FIELD = By.xpath("//input[@name='first_name']");
    private static final By LAST_NAME_FIELD = By.xpath("//input[@name='last_name']");
    private static final By SAVE_BUTTON = By.xpath("//button[normalize-space()='Save']");
    private static final By CONTACT_CREATED = By.xpath("//i[@class='large user red icon']");
    private static final By EDIT_ICON = By.xpath("//button[@class='ui icon button']//i[@class='edit icon']");
    private static final By EDIT_ICON_FOR_CONTACT = By.xpath("//a[normalize-space()='abcd efgh']/../../td/a/button/i[@class='edit icon']");
    private static final By DELETE_ICON = By.xpath("//i[@class='trash icon']");
    private static final By DELETE_ICON_FOR_CONTACT = By.xpath("//a[normalize-space()='pand tang']/../../td/button/i[@class='trash icon']");
    private static final By DELETE_BUTTON_ON_POPUP = By.xpath("//button[normalize-space()='Delete']");
    
    //WebElement createButton = driver.findElement(By.xpath("//button[normalize-space()='Create']"));

    // Methods using the By locators
    public void clickCreateButton() {
        driver.findElement(CREATE_BUTTON).click();
        //createButton.click();
    }

    public void verifyCreateContactPage() {
        driver.findElement(CREATE_CONTACT_PAGE).isDisplayed();
    }

    public void enterMandatoryFields() {
        driver.findElement(FIRST_NAME_FIELD).sendKeys("v");
        driver.findElement(LAST_NAME_FIELD).sendKeys("n");
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }

    public void verifyContactCreated() {
        driver.findElement(CONTACT_CREATED).isDisplayed();
    }

    public void clickEditIcon() {
        driver.findElement(EDIT_ICON).click();
    }

    public void editFirstAndLastName() {
        driver.findElement(FIRST_NAME_FIELD).clear(); // Clear the existing value first
        driver.findElement(FIRST_NAME_FIELD).sendKeys("b");
        driver.findElement(LAST_NAME_FIELD).clear(); // Clear the existing value first
        driver.findElement(LAST_NAME_FIELD).sendKeys("m");
    }

    public void clickDeleteIcon() {
        driver.findElement(DELETE_ICON).click();
    }

    public void clickDeleteButtonOnPopUp() {
        driver.findElement(DELETE_BUTTON_ON_POPUP).click();
    }

	public void clickEditIconForContact() {
		driver.findElement(EDIT_ICON_FOR_CONTACT).click();	
	}

	public void clickDeleteIconForContact() {
		driver.findElement(DELETE_ICON_FOR_CONTACT).click();
	}
}
