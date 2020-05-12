package com.briozing.automation.helpers;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.pageobjects.*;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.CommonMethods;
import com.briozing.automation.config.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ValidationHelper {

    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    CommonMethods commonMethods = new CommonMethods();

    public void validatePageTitle(String expectedTitle) throws Exception {
        String currentTitle = WebDriverFactory.getDriver().getTitle();
        logger.info("Page Title: " + currentTitle);
        AppAssert.assertTrue(currentTitle.contains(expectedTitle));
    }

    public void validateHomePageDetails(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.logoBriozing.isDisplayed(), "Briozing Logo not displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }


}
