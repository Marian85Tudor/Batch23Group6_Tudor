package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {


    @FindBy(id = "firstName")

    @FindBy(id = "middleName")

    @FindBy(id = "lastName")

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }

}
