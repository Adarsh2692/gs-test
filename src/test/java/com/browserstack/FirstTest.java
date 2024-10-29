package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.HashMap;
import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.AppiumBy;
import java.time.Duration;
import java.util.Map;

public class FirstTest extends AppiumTest {

  @Test
  public void test() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Click the "continue as guest" button
    WebElement continueGuestElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeButton[@name='login-continue-guest']")));
    continueGuestElement.click();
    Thread.sleep(2000);

    // Click the "tracking next select" button
    WebElement trackingNextElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeButton[@name='tracking_next_select']")));
    trackingNextElement.click();
    Thread.sleep(2000);

    // Click "Not right now"
    WebElement notRightNowElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='Not right now']")));
    notRightNowElement.click();
    Thread.sleep(2000);

    // Click the "more" tab
    WebElement moreTabElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeButton[@name='tabBar_more_select']")));
    moreTabElement.click();
    Thread.sleep(2000);


    // Click on the settings row
    WebElement settingsElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='MoreRowCell.MORE.HEADER_ROW_LABEL_ACCESSIBILITY_TITLE' and @label='SETTINGS']")));
    settingsElement.click();
    Thread.sleep(2000);


    // Define swipe parameters
    Map<String, Object> swipeParams = new HashMap<>();
    swipeParams.put("direction", "up");
    swipeParams.put("velocity", 1000); // Adjust velocity as needed
    swipeParams.put("element", null); // Swipe anywhere on the screen

    // Perform the swipe action
    driver.executeScript("mobile: swipe", swipeParams);

    // Wait for 2 seconds after the swipe
    Thread.sleep(2000);

    // Click the "The App Terms and Conditions" element
    // WebElement termsConditionsElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeStaticText[@name='The App Terms and Conditions']")));
    // termsConditionsElement.click();

    // Click the "Slavery Act" element
    WebElement slaveryActElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("settings_modernSlaveryAct_select")));
    slaveryActElement.click();

    // Wait for 10 seconds
    Thread.sleep(10000);


    try {
				WebElement reload = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
						.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("ReloadButton")));
				reload.click();
			}catch(Exception e) {
				WebElement settingsAppTerms2 = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
						.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("settings_theAppTermsAndConditions_select")));
				settingsAppTerms2.click();
				
				WebElement reload2 = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
						.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("ReloadButton")));
				reload2.click();
			}

  }
}
