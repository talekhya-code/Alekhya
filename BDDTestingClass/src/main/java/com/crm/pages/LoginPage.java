package com.crm.pages;

import java.util.Set;
import org.openqa.selenium.By;
import com.crm.base.TestBase;

public class LoginPage extends TestBase {

    // Declare By locators
    private static final By EMAIL_FIELD = By.xpath("//input[@name='email']");
    private static final By PASSWORD_FIELD = By.xpath("//input[@name='password']");
    private static final By LOGIN_BUTTON = By.xpath("//div[contains(text(), 'Login')]");

    // Method to enter credentials
    public void enterTheCredentials(String user, String password) {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.contentEquals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }
        driver.findElement(EMAIL_FIELD).sendKeys(user);
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    // Method to click login button
    public HomePage clickLoginBtn() {
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage();
    }

    // Method to verify fields
    public void verifyField() {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.contentEquals(parentWindow)) {
                driver.switchTo().window(window);
            }
        }
        driver.findElement(EMAIL_FIELD).isDisplayed();
        driver.findElement(PASSWORD_FIELD).isDisplayed();
    }
}
