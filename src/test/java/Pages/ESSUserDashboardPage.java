package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ESSUserDashboardPage extends CommonMethods {

    @FindBy(xpath = "//b[normalize-space()='My Info']")
    public WebElement myInfoButton;

    @FindBy(xpath = "//img[@id='empPic']")
    public WebElement profilePhoto;

    @FindBy(xpath = "//input[@id='photofile']")
    public WebElement chooseFileButton;


    @FindBy(xpath = "//input[@id='btnSave']")
    public WebElement uploadButton;

    @FindBy(xpath = "//input[@id='btnDelete']")
    public WebElement deleteButton;

    public ESSUserDashboardPage(){
        PageFactory.initElements(driver,this);
    }

}
