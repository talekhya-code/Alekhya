package com.crm.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import com.crm.base.TestBase;

public class LaunchPage extends TestBase {

    // Declare By locators
    private static final By LOGIN_LINK = By.xpath("//a[normalize-space()='Login']");

    // Method to verify application launch page
    public void verifyApplicationLaunchPage() {
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Cogmento Free CRM"));
    }

    // Method to navigate to login page
    public LoginPage navigateToLoginPage() {
        driver.findElement(LOGIN_LINK).click();
        return new LoginPage();
    }
}
