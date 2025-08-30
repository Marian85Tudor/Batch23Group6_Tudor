package steps;

import Pages.AddEmployeePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLoginSteps {

    WebDriver driver;
    AddEmployeePage addEmployeePage;

    @Given("the admin is logged in to the HRMS application")
    public void admin_logged_in() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // aici faci login ca admin
    }

    @And("the admin navigates to {string} page")
    public void navigate_to_add_employee(String page) {
        // navigare în aplicație
        addEmployeePage = new AddEmployeePage(driver);
    }

    @When("the admin enters {string} in the First Name field")
    public void enter_first_name(String fname) {
        addEmployeePage.enterFirstName(fname);
    }

    @When("the admin enters {string} in the Last Name field")
    public void enter_last_name(String lname) {
        addEmployeePage.enterLastName(lname);
    }

    @When("the admin checks {string}")
    public void check_create_login(String checkbox) {
        addEmployeePage.checkCreateLogin();
    }

    @When("the admin enters {string} in the User Name field")
    public void enter_username(String uname) {
        addEmployeePage.enterUsername(uname);
    }

    @When("the admin enters {string} in the Password field")
    public void enter_password(String pass) {
        addEmployeePage.enterPassword(pass);
    }

    @When("the admin re-enters {string} in the Confirm Password field")
    public void confirm_password(String pass) {
        addEmployeePage.confirmPassword(pass);
    }

    @When("the admin selects {string} from Status dropdown")
    public void select_status(String status) {
        addEmployeePage.selectStatus(status);
    }

    @When("the admin clicks on {string}")
    public void click_save(String button) {
        addEmployeePage.clickSave();
    }

    @Then("the system should save the employee details")
    public void validate_save() {
        // verifică mesaj succes
    }

    @Then("the new employee {string} should be able to log in with {string}")
    public void validate_login(String uname, String pass) {
        // verifici login cu userul creat
    }


}
