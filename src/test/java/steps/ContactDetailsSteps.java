package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import Pages.ContactDetailsPage;
import Pages.ESSUserDashboardPage;
import Pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.util.List;
import java.util.Map;

public class ContactDetailsSteps extends CommonMethods {

    private LoginPage loginPage;
    private ESSUserDashboardPage essUserDashboardPage;
    private ContactDetailsPage contactDetailsPage;

    @Given("the employee is logged into the HRMS application")
    public void the_employee_is_logged_into_the_hrms_application() {
        loginPage = new LoginPage(driver);
        String username = ConfigReader.read("essUserName");
        String password = ConfigReader.read("essPassword");

        sendText(username, loginPage.usernameField);
        sendText(password, loginPage.passwordField);
        click(loginPage.loginButton);
    }

    @Given("the employee navigates to the contact details page")
    public void the_employee_navigates_to_the_contact_details_page() {
        essUserDashboardPage = new ESSUserDashboardPage();
        contactDetailsPage = new ContactDetailsPage();

        click(essUserDashboardPage.myInfoButton);

        // Wait for sidebar to load and click contact details link
        waitForElementToBeVisible(contactDetailsPage.contactDetailsLink);
        click(contactDetailsPage.contactDetailsLink);
    }

    @When("the employee updates the contact information with the following details:")
    public void the_employee_updates_the_contact_information_with_the_following_details(io.cucumber.datatable.DataTable dataTable) {
        contactDetailsPage = new ContactDetailsPage();
        List<Map<String, String>> contactData = dataTable.asMaps();

        // Click edit button to enable editing
        waitForElementToBeVisible(contactDetailsPage.editButton);
        click(contactDetailsPage.editButton);

        // Update address fields with null checks
        for(Map<String, String> data:contactData) {
            updateFieldIfNotNull(data.get("Address Street 1"), contactDetailsPage.addressStreet1);
            updateFieldIfNotNull(data.get("Address Street 2"), contactDetailsPage.addressStreet2);
            updateFieldIfNotNull(data.get("city"), contactDetailsPage.city);
            updateDropdownIfNotNull(data.get("State"), contactDetailsPage.state);
            updateFieldIfNotNull(data.get("Zip Code"), contactDetailsPage.zipCode);
            updateDropdownIfNotNull(data.get("Country"), contactDetailsPage.country);

            // Update phone fields
        updateFieldIfNotNull(data.get("Home Phone"), contactDetailsPage.homePhone);
        updateFieldIfNotNull(data.get("Mobile Phone"), contactDetailsPage.mobilePhone);
        updateFieldIfNotNull(data.get("Work Phone"), contactDetailsPage.workPhone);

        // Update email fields
        updateFieldIfNotNull(data.get("Work Email"), contactDetailsPage.workEmail);
        updateFieldIfNotNull(data.get("Other Email"), contactDetailsPage.otherEmail);
    }
        }

    @When("the employee clicks the save button")
    public void the_employee_clicks_the_save_button() {
        waitForElementToBeVisible(contactDetailsPage.saveButton);
        click(contactDetailsPage.saveButton);
    }

    @Then("the contact information should be successfully saved")
    public void the_contact_information_should_be_successfully_saved() {
        // Wait for edit button to be visible (indicating save was successful)
        waitForElementToBeVisible(contactDetailsPage.editButton);
        Assert.assertTrue("Save was not successful - Edit button not visible",
                contactDetailsPage.editButton.isDisplayed());
    }

}