package com.crm.pages;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import com.crm.base.TestBase;

public class CalendarPage extends TestBase {

    // Declare By locators
    private static final By EVENTS_BUTTON = By.xpath("//button[normalize-space()='Events']");
    private static final By SYNC_NOW_BUTTON = By.xpath("//button[normalize-space()='Sync now']");
    private static final By CREATE_BUTTON = By.xpath("//button[normalize-space()='Create']");
    private static final By CALENDAR_LABEL = By.xpath("//span[@class='rbc-toolbar-label']");

    // Method to check dashboard header buttons
    public void dashboardHeaderButtons() {
        driver.findElement(EVENTS_BUTTON).isEnabled();
        driver.findElement(SYNC_NOW_BUTTON).isEnabled();
        driver.findElement(CREATE_BUTTON).isEnabled();
    }

    // Method to verify the current month and year
    public void currentMonthYear() {
        // Get the current month and year formatted as "December 2024"
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM yyyy");
        String formattedDate = currentDate.format(formatter);

        // Get the text from the calendar element
        String displayedDate = driver.findElement(CALENDAR_LABEL).getText();

        // Validate the displayed month and year
        assertEquals(formattedDate, displayedDate);
    }
}
