package com.briozing.automation.helpers;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.pageobjects.*;
import com.briozing.automation.utilities.AppAssert;
import com.briozing.automation.utilities.CommonMethods;
import com.briozing.automation.config.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
        AppAssert.assertTrue(homePage.logoBriozing.isDisplayed(), "Briozing Logo displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateHomeLinkDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.linkHome.isDisplayed(), "Home Link displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateBlogLinkDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.linkBlog.isDisplayed(), "Blog Link displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateConnectWithUsDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textConnect.isDisplayed(), "Connect with us displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextNameDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textName.isDisplayed(), "Text : Name displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextBoxFirstNameDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textBoxFirstName.isDisplayed(), "TextBox : First Name displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextFirstNameDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textFirstName.isDisplayed(), "Text : First Name displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextBoxLastNameDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textBoxLastName.isDisplayed(), "TextBox : Last Name displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextLastNameDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textLastName.isDisplayed(), "Text : Last Name displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextEmailDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textEmail.isDisplayed(), "Text : Email displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextBoxEmailDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textBoxEmail.isDisplayed(), "TextBox : Email displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextPhoneNumberDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textPhoneNumber.isDisplayed(), "Text : Phone Number displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextBoxPhoneNumberDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textBoxPhoneNumber.isDisplayed(), "TextBox : Phone Number displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextCommentDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textComment.isDisplayed(), "Text : Comment displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTextBoxCommentDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.textBoxComment.isDisplayed(), "TextBox : Comment displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateSubmitButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.submitButton.isDisplayed(), "Submit button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTopButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.topButtons.size()>0, "Top button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateClientButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.clientsButtons.size()>0, "Client button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateCoreButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.coreButtons.size()>0, "Core button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateAboutButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.aboutButtons.size()>0, "About button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateFeaturesButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.featuresButtons.size()>0, "Features button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateCtaButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.ctaButtons.size()>0, "Cta button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateTeamButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.getTeamButtons().size()>0, "Team button displayed");
        commonMethods.pause(5000);
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateLatestBlogsButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.latestBlogsButtons.size()>0, "Latest-Blogs button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateContactButtonDisplay(HomePage homePage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(homePage.contactButtons.size()>0, "Contact button displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateDevOpsBlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getDevOpsBlog().size()>0, "Devops Blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateAutomationBlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getAutomationBlog().size()>0, "Automation blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateKubernetesBlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getKubernetesBlog().size()>0, "Kubernetes blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateLoadBalancerBlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getLoadBalancerBlog().size()>0, "Load Balancer blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateDeploySpringBootBlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getDeploySpringBootBlog().size()>0, "Deploy Spring Boot blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateOneClickBuildBlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getOneClickBuildBlog().size()>0, "One Click Build blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateMicroServicesPart2BlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getmicroServicesPart2Blog().size()>0, "Micro Services Part2 blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateMicroServicesPart1BlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getmicroServicesPart1Blog().size()>0, "Micro Services Part1 blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateDevelopersRoleBlogDisplay(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        AppAssert.assertTrue(blogPage.getDevelopersRoleBlog().size()>0, "Developer's Role blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }

    public void validateSearchBox(BlogPage blogPage) throws Exception {
        commonMethods.pause(2000);
        blogPage.getSearchBox().click();
        blogPage.getSearchBox().sendKeys("Devops" + Keys.ENTER);
        commonMethods.pause(5000);
        AppAssert.assertTrue(blogPage.getDevOpsBlog().size()>0, "Devops blog displayed");
        logger.info("Current Url: " + WebDriverFactory.getDriver().getCurrentUrl());
    }
}
