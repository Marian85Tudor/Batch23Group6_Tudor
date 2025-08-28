package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
    public WebElement pimBtn;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmp;

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "middleName")
    public WebElement middleName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "employeeId")
    public WebElement empID;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }



}
