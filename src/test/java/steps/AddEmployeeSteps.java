package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;

import static org.junit.Assert.*;

public class AddEmployeeSteps extends CommonMethods {
    WebDriver driver;

    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
        WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimOption.click();
    }

    @When("user clicks on Add employee option")
    public void user_clicks_on_add_employee_option() {
        WebElement addEmployeeOption = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeOption.click();
    }

    @When("user enters firstname middle name and lastname")
    public void user_enters_firstname_middle_name_and_lastname() {
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

    @When("user generates a unique employee ID")
    public void user_generates_a_unique_employee_id() {

    }

    @Then("employee added successfully")
    public void employee_added_successfully() {
        System.out.println("Employee Added Successfully");
    }

    @Then("employee added successfully with the provided employee ID")
    public void employee_added_successfully_with_the_provided_employee_id() {
        System.out.println("Employee Added Successfully");
    }

    @And("user enters details of an existing employee")
    public void userEntersDetailsOfAnExistingEmployee() throws InterruptedException {
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement middleName = driver.findElement(By.id("middleName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement empId = driver.findElement(By.id("employeeId"));
        waitForElementToBeClickAble(firstName);
        firstName.sendKeys("Tudor");
        middleName.sendKeys("ms");
        lastName.sendKeys("Marian");
        empId.clear();
        empId.sendKeys("12050971");
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();
    }

    @Then("user should see an error message indicating the employee already exists")
    public void userShouldSeeAnErrorMessageIndicatingTheEmployeeAlreadyExists() {
        WebElement messageBox = driver.findElement(By.cssSelector("div.fadable"));
        Assert.assertTrue(messageBox.isDisplayed());
        if (messageBox.isDisplayed()) {
            System.out.println("Error: Employee already exists.");
        } else {
            System.out.println("No error message displayed.");
        }

    }

    @Then("user should see an error message indicating mandatory fields are required")
    public void userShouldSeeAnErrorMessageIndicatingMandatoryFieldsAreRequired() {
        WebElement errorMessage = driver.findElement(By.className("validation-error"));
        if (errorMessage.isDisplayed()) {
            System.out.println("Error: Mandatory fields are required.");
        } else {
            System.out.println("No error message displayed.");
        }

    }

    @And("user leaves firstname or lastname empty")
    public void userLeavesFirstnameOrLastnameEmpty() {
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.clear();
        lastName.sendKeys("Doe");
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();

    }


    @And("user enters employee ID")
    public void userEntersEmployeeID() {
        WebElement employeeID = driver.findElement(By.id("employeeId"));
        employeeID.sendKeys("12050971");


    }
}