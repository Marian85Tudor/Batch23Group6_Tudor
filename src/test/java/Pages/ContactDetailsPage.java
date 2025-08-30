package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ContactDetailsPage extends CommonMethods {

    // Navigation - using the exact href from your HTML
    @FindBy(xpath = "//a[contains(@href, 'contactDetails')]")
    public WebElement contactDetailsLink;

    // Edit/Save buttons - using ID from your HTML
    @FindBy(id = "btnSave")
    public WebElement editButton;

    @FindBy(id = "btnSave")
    public WebElement saveButton;

    // Address fields - using IDs from typical HRMS systems
    @FindBy(id = "contact_street1")
    public WebElement addressStreet1;

    @FindBy(id = "contact_street2")
    public WebElement addressStreet2;

    @FindBy(id = "contact_city")
    public WebElement city;

    @FindBy(id = "contact_province")
    public WebElement state;

    @FindBy(id = "contact_emp_zipcode")
    public WebElement zipCode;

    @FindBy(id = "contact_country")
    public WebElement country;

    // Phone fields
    @FindBy(id = "contact_emp_hm_telephone")
    public WebElement homePhone;

    @FindBy(id = "contact_emp_mobile")
    public WebElement mobilePhone;

    @FindBy(id = "contact_emp_work_telephone")
    public WebElement workPhone;

    // Email fields
    @FindBy(id = "contact_emp_work_email")
    public WebElement workEmail;

    @FindBy(id = "contact_emp_oth_email")
    public WebElement otherEmail;

    // Success message - flexible locator
    @FindBy(xpath = "//div[contains(@class,'message') and (contains(@class,'success') or contains(@class,'Success'))] | " +
            "//div[contains(text(),'success') or contains(text(),'Success')] | " +
            "//span[contains(text(),'success') or contains(text(),'Success')]")
    public WebElement successMessage;

    public ContactDetailsPage() {
        PageFactory.initElements(driver, this);
    }
}