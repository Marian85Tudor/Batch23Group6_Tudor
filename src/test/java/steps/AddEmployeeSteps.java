package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.sql.ResultSet;
import java.sql.SQLException;


public class AddEmployeeSteps extends CommonMethods {


    public void user_clicks_on_add_employee_option() {
    }

    @When("user enters firstname middle name and lastname")

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
    }
    @Then("the employee should be added successfully in the database with id {string}")
    public void verifyEmployeeInDatabase(String empId) throws SQLException {
        DBUtils.connect();
        String query = "SELECT emp_firstname, emp_lastname, employee_id FROM hs_hr_employees WHERE employee_id='" + empId + "'";
        ResultSet rs = DBUtils.executeQuery(query);

        boolean recordFound = false;
        while (rs.next()) {
            recordFound = true;
            System.out.println("DB Record Found: " + rs.getString("emp_firstname")
                    + " " + rs.getString("emp_lastname")
                    + " | ID: " + rs.getString("employee_id"));
        }

        Assert.assertTrue("Employee record not found in DB!", recordFound);
        DBUtils.close();
    }

}



