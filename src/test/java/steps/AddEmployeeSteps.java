package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        WebElement username = driver.findElement(By.id("txtUsername"));
       WebElement password = driver.findElement(By.id("txtPassword"));
       username.sendKeys("admin");
       password.sendKeys("Hum@nhrm123");


    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        System.out.println("User is logged in");


    }
    @When("user clicks on add employee option")
    public void user_clicks_on_add_employee_option() {
        WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeButton.click();

    }
    @When("user enters firstname middlename and lastname")
    public void user_enters_firstname_middlename_and_lastname() {
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement middleName = driver.findElement(By.id("middleName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("Tudor");
        middleName.sendKeys("ms");
        lastName.sendKeys("Marian");
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();

    }
    @Then("employee is added successfully")
    public void employee_is_added_successfully() {
        System.out.println("Employee is added successfully");

    }
    @Then("the employee should be added successfully in the database with id {string}")
    public void the_employee_should_be_added_successfully_in_the_database_with_id(String string) {

        
    }


}
