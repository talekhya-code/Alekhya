package com.crm.pages;
import java.util.Set;

import org.openqa.selenium.By;

import com.crm.base.TestBase;

public class LoginPage extends TestBase{

	public void enterTheCredentials(String user, String password) {
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for(String s : allwindow) {
			if(!(s.contentEquals(parentwindow))) {
				driver.switchTo().window(s);
			}
		}
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	public HomePage clickLoginBtn() {
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		return new HomePage();
	}

	public void verifyField() {
		String parentwindow = driver.getWindowHandle();
		Set<String> allwindow = driver.getWindowHandles();
		for(String s : allwindow) {
			if(!(s.contentEquals(parentwindow))) {
				driver.switchTo().window(s);
			}
		}
		driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
	}

}
