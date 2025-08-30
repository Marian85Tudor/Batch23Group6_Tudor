package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class SearchEmployeePage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public static WebElement empIdField;

    @FindBy(id="empsearch_employee_name_empName")
    public static WebElement empNameField;

    @FindBy(id="searchBtn")
    public static WebElement searchButton;

    @FindBy(xpath="//table[@id='resultTable']/tbody/tr")
    public static WebElement searchResults;

    // More flexible locators for "No Records Found" message
    //@FindBy(xpath="//td[contains(text(),'No Records Found')]")
    // Updated locator based on the actual HTML structure
    @FindBy(xpath="//table[@id='resultTable']//td[@colspan='8' and contains(text(),'No Records Found')]")
    public static WebElement noRecordsMessage;

    public SearchEmployeePage(){
        PageFactory.initElements(driver,this);
    }
}