package com.briozing.automation.pageobjects;

import com.briozing.automation.base.WebDriverFactory;
import com.briozing.automation.config.Configuration;
import com.briozing.automation.utilities.CommonMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BlogPage  {

    CommonMethods commonMethods = new CommonMethods();

    @FindBy(xpath = "(//a[contains(@href,'briozing.com')])[1]")
    private WebElement logoBriozing;

    @FindBy(xpath = "(//a[contains(text(),'Blog')])[1]")
    private WebElement linkBlog;

    @FindBy(xpath = "(//a[contains(text(),'Home')])[1]")
    private WebElement linkHome;


    public BlogPage() throws Exception {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public BlogPage launch() throws Exception {
        return PageFactory.initElements(WebDriverFactory.getDriver(), BlogPage.class);
    }


}
