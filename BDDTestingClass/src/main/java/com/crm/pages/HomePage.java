package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.crm.base.TestBase;

public class HomePage extends TestBase{
	
	
	public void verifyApplicationHome() {
		driver.findElement(By.xpath("//div[contains(text(), 'Login')]")).click();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Cogmento CRM"));
	}

	public void verifyCompanyAndProfile() {
		driver.findElement(By.xpath("//b[normalize-space()='Krishsoftware']")).isDisplayed();
		driver.findElement(By.xpath("//span[@class='user-display']")).isDisplayed();	
	}

	public void verifyHomeButtonOptions() {
		
		Actions action = new Actions(driver);		
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='home icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Home']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='calendar icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Calendar']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='users icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Contacts']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='building icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Companies']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='money icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Deals']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='tasks icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Tasks']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='comments icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Cases']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='phone icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Calls']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='file icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Documents']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='mail outline icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Email']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='target icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Campaigns']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='wpforms icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Forms']")).isEnabled();
		
		action.moveToElement(driver.findElement(By.xpath("//i[@class='line chart icon']"))).build().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Reports']")).isEnabled();
	}
	
	public CalendarPage clickCalendarBtn() {
		driver.findElement(By.xpath("//i[@class='calendar icon']")).click();
		return new CalendarPage();
	}

	public ContactsPage clickContactsButton() {
		driver.findElement(By.xpath("//i[@class='users icon']")).click();
		return new ContactsPage();
	}
	

}
