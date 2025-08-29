package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class ProfilePictureESSUserSteps extends CommonMethods {

    @Given("user is logged in with ESS user credentials")
    public void user_is_logged_in_with_ess_user_credetials() {
        sendText(ConfigReader.read("essUserName"), loginPage.usernameField);
        sendText(ConfigReader.read("essPassword"), loginPage.passwordField);
        click(loginPage.loginButton);
    }
    @When("user click on MyInfo option")
    public void user_click_on_my_info_option() {
        click(essUserDashboardPage.myInfoButton);
    }
    @When("user click on profile photo area")
    public void user_click_on_profile_photo_area() {
        click(essUserDashboardPage.profilePhoto);
    }
    @When("user select new photo")
    public void user_select_new_photo() {
        sendText("C:\\Users\\yzade\\OneDrive\\Рабочий стол\\FinalProject\\Batch23Group6\\src\\test\\resources\\testdata\\testPicture.jpg", essUserDashboardPage.chooseFileButton);
    }
    @When("user click on upload button")
    public void user_click_on_upload_button() {
        click(essUserDashboardPage.uploadButton);
    }
    @Then("photo has been added user able to see delete button")
    public void photo_has_been_added_user_able_to_see_delete_button() {
        Assert.assertTrue(essUserDashboardPage.deleteButton.isDisplayed());
    }
}
