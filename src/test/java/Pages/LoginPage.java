package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(id = "txtUsername")

    @FindBy(id = "txtPassword")

    @FindBy(id = "btnLogin")


        PageFactory.initElements(driver, this);
    }

}
