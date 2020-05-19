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

    @FindBy(xpath="//h5[text()='CONNECT WITH US']")
    public WebElement textConnect;

    @FindBy(xpath="//label[text()='Name ']")
    public WebElement textName;

    @FindBy(xpath="//input[@class='wpforms-field-name-first wpforms-field-required']")
    public WebElement textBoxFirstName;

    @FindBy(xpath="//label[text()='First']")
    public WebElement textFirstName;

    @FindBy(xpath="//input[@class='wpforms-field-name-last wpforms-field-required']")
    public WebElement textBoxLastName;

    @FindBy(xpath="//label[text()='Last']")
    public WebElement textLastName;

    @FindBy(xpath="//label[text()='Email ']")
    public WebElement textEmail;

    @FindBy(xpath="//input[@class='wpforms-field-large wpforms-field-required']")
    public WebElement textBoxEmail;

    @FindBy(xpath="//label[text()='Phone Number ']")
    public WebElement textPhoneNumber;

    @FindBy(xpath="//input[@class='wpforms-field-medium wpforms-field-required']")
    public WebElement textBoxPhoneNumber;

    @FindBy(xpath="//label[text()='Comment or Message ']")
    public WebElement textComment;

    @FindBy(xpath="//textarea[@class='wpforms-field-large wpforms-field-required']")
    public WebElement textBoxComment;

    @FindBy(xpath="//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath="//a[text()='Top']")
    public List<WebElement> topButtons;

    @FindBy(xpath="//a[text()='Clients']")
    public List<WebElement> clientsButtons;

    @FindBy(xpath="//a[text()='Core']")
    public List<WebElement> coreButtons;

    @FindBy(xpath="//a[text()='About']")
    public List<WebElement> aboutButtons;

    @FindBy(xpath="//a[text()='Features']")
    public List<WebElement> featuresButtons;

    @FindBy(xpath="//a[text()='Cta']")
    public List<WebElement> ctaButtons;

    @FindBy(xpath="//a[text()='Team']")
    public List<WebElement> teamButtons;

    @FindBy(xpath="//a[text()='Latest-Bogs']")
    public List<WebElement> latestBlogsButtons;

    @FindBy(xpath="//a[text()='Contact']")
    public List<WebElement> contactButtons;

    public HomePage() throws Exception {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public HomePage launch() throws Exception {
        WebDriverFactory.getDriver().get(Configuration.portalUrl);
        commonMethods.waitForPageToLoad();
        return this;
    }

    public BlogPage navigateToBlog() throws Exception {
        linkBlog.click();
        commonMethods.waitForPageToLoad();
        return PageFactory.initElements(WebDriverFactory.getDriver(), BlogPage.class);
    }

    public List<WebElement> getTeamButtons() throws Exception {
        return teamButtons;
    }

}
