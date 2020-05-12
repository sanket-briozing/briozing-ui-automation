package com.briozing.automation.suites;

import com.briozing.automation.base.BaseTest;
import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.helpers.ValidationHelper;
import com.briozing.automation.listeners.MethodListener;
import com.briozing.automation.pageobjects.HomePage;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.CommonMethods;
import com.briozing.automation.utilities.TestConstants;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({MethodListener.class})
public class UITests extends BaseTest {

    CommonMethods commonMethods = new CommonMethods();
    Logger logger = Log4JFactory.getLogger(this.getClass().getSimpleName());
    ValidationHelper validationHelper = new ValidationHelper();

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Briozing"}, description = "Verify HOme Page")
    public void verify_home_page() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateHomePageDetails(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }



}

