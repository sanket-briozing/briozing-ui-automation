package com.briozing.automation.pageobjects;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.config.Configuration;
import com.briozing.automation.utilities.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    CommonMethods commonMethods = new CommonMethods();

    @FindBy(xpath = "(//a[contains(@href,'briozing.com')])[1]")
    public WebElement logoBriozing;

    @FindBy(xpath = "(//a[contains(text(),'Blog')])[1]")
    public WebElement linkBlog;

    @FindBy(xpath = "(//a[contains(text(),'Home')])[1]")
    public WebElement linkHome;


    public HomePage() throws Exception {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public BlogPage navigateToBlog() throws Exception {
        linkBlog.click();
        commonMethods.waitForPageToLoad();
        return PageFactory.initElements(WebDriverFactory.getDriver(), BlogPage.class);
    }


    public HomePage launch() throws Exception {
        WebDriverFactory.getDriver().get(Configuration.portalUrl);
        commonMethods.waitForPageToLoad();
        return this;
    }

}
