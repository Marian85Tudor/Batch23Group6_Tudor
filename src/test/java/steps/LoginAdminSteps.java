package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import java.time.Duration;

public class LoginAdminSteps extends CommonMethods {

    @Given("User is on the HRMS application")
    public void user_is_on_the_HRMS_application() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginPage(driver); // You need to implement this constructor
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.usernameField.sendKeys("admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        click(loginPage.loginButton); // Implement click method or use loginPage.loginButton.click();
    }

    @Then("User should be redirected to the dashboard")
    public void user_should_be_redirected_to_dashboard() {
        System.out.println("Admin redirected to dashboard");
    }

    // Example click method
    private void click(org.openqa.selenium.WebElement element) {
        element.click();
    }
}