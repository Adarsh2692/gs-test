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

public class SecondTest extends AppiumTest {

  @Test
  public void test() throws Exception {
    driver.getPageSource();
						
			Thread.sleep(2000);
			
			// WebElement location = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
			// .until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Allow While Using App")));
			// location.click();
			// Thread.sleep(2000);

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Click the "continue as guest" button
    WebElement continueGuestElement = wait.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeButton[@name='login-continue-guest']")));
    continueGuestElement.click();
    Thread.sleep(2000);

			
			// WebElement withoutGuest = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
			// 		.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("login-continue-guest")));
			// withoutGuest.click();
			
			// Thread.sleep(2000);

			WebElement next = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
					.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("tracking_next_select")));
			next.click();
			Thread.sleep(2000);

			
			// WebElement notToTrack = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
			// 		.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Ask App Not to Track")));
			// notToTrack.click();
			// Thread.sleep(2000);

			
			WebElement notRightNow = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
					.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("Not right now")));
			notRightNow.click();
			Thread.sleep(2000);

			
			WebElement moreSelect = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
					.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("tabBar_more_select")));
			moreSelect.click();
			Thread.sleep(2000);

			
			WebElement settings = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
					.until(ExpectedConditions.elementToBeClickable(AppiumBy.xpath("//XCUIElementTypeStaticText[@name=\"MoreRowCell.MORE.HEADER_ROW_LABEL_ACCESSIBILITY_TITLE\"][1]")));
			settings.click();
			
			
			Thread.sleep(2000);
			
			HashMap<String, Object> params23 = new HashMap<>();
			params23.put("direction", "up");
			
			driver.executeScript("mobile: swipe", params23);			
			
			WebElement settingsAppTerms = (WebElement) new WebDriverWait(driver,  Duration.ofSeconds(30))
					.until(ExpectedConditions.elementToBeClickable(AppiumBy.accessibilityId("settings_theAppTermsAndConditions_select")));
			settingsAppTerms.click();
			
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
