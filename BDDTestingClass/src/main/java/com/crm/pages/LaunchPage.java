package com.crm.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.crm.base.TestBase;

public class LaunchPage extends TestBase{
	
	public void verifyApplicationLaunchPage() {
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cogmento Free CRM"));
	}
	
	public LoginPage navigateToLoginPage() {
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		return new LoginPage();
	}

}
