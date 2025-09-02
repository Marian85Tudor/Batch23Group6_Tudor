package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    WebDriver driver;

    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By createLoginCheckbox = By.id("chkLogin");
    By username = By.id("user_name");
    By password = By.id("user_password");
    By confirmPassword = By.id("re_password");
    By statusDropdown = By.id("status");
    public By saveButton = By.id("btnSave");

    public AddEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }

    public void checkCreateLogin() {
        driver.findElement(createLoginCheckbox).click();
    }

    public void enterUsername(String uname) {
        driver.findElement(username).sendKeys(uname);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void confirmPassword(String pass) {
        driver.findElement(confirmPassword).sendKeys(pass);
    }

    public void selectStatus(String status) {
        driver.findElement(statusDropdown).sendKeys(status);
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }


}
