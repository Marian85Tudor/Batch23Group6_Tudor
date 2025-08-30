package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
      WebDriver driver;


    @FindBy(id = "txtUsername")
     public static WebElement usernameField;
    @FindBy(id = "txtPassword")
    public static WebElement passwordField;
    @FindBy(id = "btnLogin")
    public static WebElement loginButton;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}


