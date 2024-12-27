package com.crm.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.crm.base.TestBase;

public class HomePage extends TestBase{
	
	
	public void verifyApplicationHome() {
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cogmento CRM"));
		
		driver.findElement(By.xpath("//b[normalize-space()='Krishsoftware']")).isDisplayed();
		
		
	}
	

}
