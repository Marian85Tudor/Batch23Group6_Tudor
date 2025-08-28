package steps;

import Pages.DashboardPage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;

public class LoginValidationSteps extends CommonMethods {


    @Given("the user is on the HRMS login page")
    public void the_user_is_on_the_hrms_login_page() {
        LoginPage pages = new Pages.LoginPage(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(LoginPage.loginButton));

        Assert.assertTrue("Login button is not visible!", LoginPage.loginButton.isDisplayed());
    }
    @When("the user logs in with valid admin credentials")
    public void the_user_logs_in_with_valid_ess_credentials() {
        LoginPage.usernameField.sendKeys(ConfigReader.read("userName"));
        LoginPage.passwordField.sendKeys(ConfigReader.read("password"));
        LoginPage.loginButton.click();
    }
    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
    DashboardPage DashboardPage = new DashboardPage();
    Assert.assertTrue("Login failed - Welcome message not visible", DashboardPage.welcomeMessage.isDisplayed());
        String expectedUrl = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("User is not on the dashboard!", expectedUrl, actualUrl);

    }



}
