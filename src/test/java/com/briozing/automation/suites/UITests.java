package com.briozing.automation.suites;

import com.briozing.automation.base.BaseTest;
import com.briozing.automation.factory.Log4JFactory;
import com.briozing.automation.helpers.ValidationHelper;
import com.briozing.automation.listeners.MethodListener;
import com.briozing.automation.pageobjects.BlogPage;
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

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Briozing", "HomePage"}, description = "Verify home page")
    public void verify_home_page() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateHomePageDetails(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "HomeLink", "HomePage"}, description = "Verify home link")
    public void verify_home_link() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateHomeLinkDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "BlogLink", "HomePage"}, description = "Verify blog link")
    public void verify_blog_link() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateBlogLinkDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Connect", "HomePage"}, description = "Verify connect with us text display")
    public void verify_connect_with_us() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateConnectWithUsDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Name", "HomePage"}, description = "Verify text name display")
    public void verify_text_name() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextNameDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Text_Box_First_Name", "HomePage"}, description = "Verify text box of first name display")
    public void verify_text_box_first_name() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextBoxFirstNameDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "First_Name", "HomePage"}, description = "Verify text First Name display")
    public void verify_text_first_name() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextFirstNameDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Text_Box_Last_Name", "HomePage"}, description = "Verify text box of last name display")
    public void verify_text_box_last_name() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextBoxLastNameDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Last_Name", "HomePage"}, description = "Verify text Last Name display")
    public void verify_text_last_name() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextLastNameDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Email", "HomePage"}, description = "Verify text Email display")
    public void verify_text_email() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextEmailDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Text_Box_Email", "HomePage"}, description = "Verify text box of email display")
    public void verify_text_box_email() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextBoxEmailDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "PhoneNumber", "HomePage"}, description = "Verify text Phone Number display")
    public void verify_text_phone_number() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextPhoneNumberDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Text_Box_PhoneNumber", "HomePage"}, description = "Verify text box of phone number display")
    public void verify_text_box_phone_number() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextBoxPhoneNumberDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Comment", "HomePage"}, description = "Verify text Comment or Message display")
    public void verify_text_comment() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextCommentDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Text_Box_Comment", "HomePage"}, description = "Verify text box of comment or message display")
    public void verify_text_box_comment() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTextBoxCommentDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Submit", "HomePage"}, description = "Verify Submit button display")
    public void verify_submit_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateSubmitButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Top", "HomePage"}, description = "Verify Top button display")
    public void verify_top_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTopButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Client", "HomePage"}, description = "Verify Client button display")
    public void verify_client_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateClientButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Core", "HomePage"}, description = "Verify Core button display")
    public void verify_core_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateCoreButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "About", "HomePage"}, description = "Verify About button display")
    public void verify_about_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateAboutButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Features", "HomePage"}, description = "Verify Features button display")
    public void verify_features_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateFeaturesButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Cta", "HomePage"}, description = "Verify Cta button display")
    public void verify_cta_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateCtaButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Team", "HomePage"}, description = "Verify Team button display")
    public void verify_team_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateTeamButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "LatestBlogs", "HomePage"}, description = "Verify Latest Blogs button display")
    public void verify_Latest_Blogs_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateLatestBlogsButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "Contact", "HomePage"}, description = "Verify Contact button display")
    public void verify_contact_button() {
        try {
            HomePage homePageObj = new HomePage();
            validationHelper.validateContactButtonDisplay(homePageObj.launch());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "DevopsBlog", "BlogPage"}, description = "Verify DevOps Blog display")
    public void verify_devops_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateDevOpsBlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "AutomationBlog", "BlogPage"}, description = "Verify Automation Blog display")
    public void verify_automation_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateAutomationBlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "KubernetesBlog", "BlogPage"}, description = "Verify Kubernetes Blog display")
    public void verify_kubernetes_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateKubernetesBlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "LoadBalancerBlog", "BlogPage"}, description = "Verify Load Balancer Blog display")
    public void verify_load_balancer_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateLoadBalancerBlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "DeploySpringBootBlog", "BlogPage"}, description = "Verify Deploy Spring-Boot Blog display")
    public void verify_deploy_spring_boot_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateDeploySpringBootBlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "OneClickBuildBlog", "BlogPage"}, description = "Verify One Click Build Blog display")
    public void verify_one_clicl_build_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateOneClickBuildBlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MicroServicesPart2Blog", "BlogPage"}, description = "Verify micro services part 2 blog display")
    public void verify_micro_services_part2_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateMicroServicesPart2BlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "MicroServicesPart1Blog", "BlogPage"}, description = "Verify micro services part 1 blog display")
    public void verify_micro_services_part1_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateMicroServicesPart1BlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "DevelopersRoleBlog", "BlogPage"}, description = "Verify dvelopers role blog display")
    public void verify_developers_role_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateDevelopersRoleBlogDisplay(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }

    @Test(groups = {TestConstants.TEST_GROUP_SANITY, "searchBox", "BlogPage"}, description = "Verify Search Box functionality")
    public void verify_search_blog() {
        try {
            HomePage homePage = new HomePage();
            validationHelper.validateSearchBox(homePage.launch().navigateToBlog());
        } catch (Exception ex) {
            logger.error(ex.getMessage());
            AppAssert.assertTrue(false, ex.getMessage());
        }
    }
}

