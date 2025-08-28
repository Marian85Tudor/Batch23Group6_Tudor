package steps;

import Pages.LoginAdminPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginAdminSteps {

    private WebDriver driver;
    private LoginAdminPage loginPage;

    @Given("User is on the HRMS application")
    public void user_is_on_the_HRMS_application() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage = new LoginAdminPage(driver);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.usernameField.sendKeys("admin");
        loginPage.passwordField.sendKeys("Hum@nhrm123");
    }

    @When("User enters valid credentials")
    public void user_enters_valid_credentials() {
        click(loginPage.loginButton);
    }

    @Then("User should be redirected to the dashboard")
    public void user_should_be_redirected_to_dashboard() {
        System.out.println("Admin redirected to dashboard");
    }

    private void click(org.openqa.selenium.WebElement element) {
        element.click();
    }
}

