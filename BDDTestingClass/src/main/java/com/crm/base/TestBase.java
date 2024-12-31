package com.crm.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	static protected WebDriver driver;

	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public void LaunchApp() {
		driver.get("https://freecrm.com/en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void CloseBrowser() {
		driver.close();
		driver.quit();
	}

}

