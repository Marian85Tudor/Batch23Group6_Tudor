package steps;

import Pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import utils.CommonMethods;


import java.util.List;

public class SearchEmployeeSteps extends CommonMethods {

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
//        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
          click(dashboardPage.pimOption);
    }

    @When("user clicks on employee list option")
    public void user_clicks_on_employee_list_option() {
//        WebElement empListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
          click(dashboardPage.employeeListOption);
    }

    @When("user enters valid employee id {string}")
    public void user_enters_valid_employee_id(String empId) {
        sendText(empId, searchEmployeePage.empIdField);
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        click(searchEmployeePage.searchButton);
    }

    @Then("user should be able to see employee details")
    public void user_should_be_able_to_see_employee_details() {
        Assert.assertTrue("No Records found",
                isElementPresent(searchEmployeePage.searchResults));
    }

    @When("user enters valid employee name {string}")
    public void user_enters_valid_employee_name(String empName) throws InterruptedException {
        Thread.sleep(5000);
        sendText(empName, searchEmployeePage.empNameField, Keys.ENTER);
    }

    @Then("user should see the no records found message")
    public void user_should_see_the_no_records_found_message() {
        Assert.assertTrue("No records found message is not displayed",
                isElementPresent(searchEmployeePage.noRecordsMessage));
        String actualMessage = searchEmployeePage.noRecordsMessage.getText();
        Assert.assertEquals("No Records Found", actualMessage);
    }

    @When("user enters partial employee name {string}")
    public void user_enters_partial_employee_name(String partialName) {
        sendText(partialName, searchEmployeePage.empNameField);
    }

    @When("user enters employee name with different capitalization {string}")
    public void user_enters_employee_name_with_different_capitalization(String name) {
        sendText(name, searchEmployeePage.empNameField);
    }

    @Then("user should see multiple matching employee records")
    public void user_should_see_multiple_matching_employee_records() {
        List<WebElement> results = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        Assert.assertTrue("Expected multiple records but found only one or none", results.size() > 1);
    }

    @Then("the exact employee record with id {string} should be displayed")
    public void the_exact_employee_record_with_id_should_be_displayed(String empId) {
        WebElement resultId = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]/a"));
        Assert.assertEquals("Employee ID doesn't match", empId, resultId.getText());
    }
}