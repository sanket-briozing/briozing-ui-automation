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

    @FindBy(xpath = "//div[@class='post-list row']/div[1]//h2")
    private List<WebElement> devOpsBlog;

    @FindBy(xpath = "//div[@class='post-list row']/div[2]//h2")
    private List<WebElement> automationBlog;

    @FindBy(xpath = "//div[@class='post-list row']/div[3]//h2")
    private List<WebElement> kubernetesBlog;

    @FindBy(xpath = "//div[@class='post-list row']/div[4]//h2")
    private List<WebElement> loadBalancerBlog;

    @FindBy(xpath = "//div[@class='post-list row']/div[5]//h2")
    private List<WebElement> deploySpringBootBlog;

    @FindBy(xpath = "//div[@class='post-list row']/div[6]//h2")
    private List<WebElement> oneClickBuildBlog;

    @FindBy(xpath = "//div[@class='post-list row']/div[7]//h2")
    private List<WebElement> microServicesPart2Blog;

    @FindBy(xpath = "//div[@class='post-list row']/div[8]//h2")
    private List<WebElement> microServicesPart1Blog;

    @FindBy(xpath = "//div[@class='post-list row']/div[9]//h2")
    private List<WebElement> developersRoleBlog;

    @FindBy(xpath = "//div[@class='sidebar col-sm-4 col-md-3']//input")
    private WebElement searchBox;

    public BlogPage() throws Exception {
        PageFactory.initElements(WebDriverFactory.getDriver(), this);
    }

    public BlogPage launch() throws Exception {
        HomePage homePage=new HomePage();
        homePage.launch();
        return PageFactory.initElements(WebDriverFactory.getDriver(), BlogPage.class);
    }

    public BlogPage navigateToBlog() throws Exception {
        linkBlog.click();
        commonMethods.waitForPageToLoad();
        return PageFactory.initElements(WebDriverFactory.getDriver(), BlogPage.class);
    }

    public List<WebElement> getDevOpsBlog() throws Exception {
        return devOpsBlog;
    }

//    public Boolean isDevOpsBlogDisplayed() throws Exception {
//        return devOpsBlog.isDisplayed();
//    }

    public List<WebElement> getAutomationBlog() throws Exception {
        return automationBlog;
    }

    public List<WebElement> getKubernetesBlog() throws Exception {
        return kubernetesBlog;
    }

    public List<WebElement> getLoadBalancerBlog() throws Exception {
        return loadBalancerBlog;
    }

    public List<WebElement> getDeploySpringBootBlog() throws Exception {
        return deploySpringBootBlog;
    }

    public List<WebElement> getOneClickBuildBlog() throws Exception {
        return oneClickBuildBlog;
    }

    public List<WebElement> getmicroServicesPart2Blog() throws Exception {
        return microServicesPart2Blog;
    }

    public List<WebElement> getmicroServicesPart1Blog() throws Exception {
        return microServicesPart1Blog;
    }

    public List<WebElement> getDevelopersRoleBlog() throws Exception {
        return developersRoleBlog;
    }

    public WebElement getSearchBox() throws Exception {
        return searchBox;
    }
}
