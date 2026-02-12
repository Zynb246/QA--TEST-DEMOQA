package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;


public class WebTablesPage extends BasePage {
    public  WebTablesPage() {
    }



    @FindBy(id = "item-3")
    private WebElement item3;

    public void getitem3() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", item3);
        gozle(1);// ✅ Düzəliş
    }

    @FindBy(id = "addNewRecordButton")
    private WebElement addNewRecordButton;

    public void getaddNewRecordButton() {

        js.executeScript("arguments[0].click();", addNewRecordButton);
        gozle(1);// ✅ Düzəliş
    }

    @FindBy(id = "firstName")
    private WebElement firstName;

    public void getfirstName() {
        firstName.sendKeys("Ali");
        js.executeScript("arguments[0].click();", firstName);
        gozle(1);// ✅ Düzəliş
    }


    @FindBy(id = "lastName")
    private WebElement lastName;
    public void getlastName() {
        lastName.sendKeys("Valiyev");
        js.executeScript("arguments[0].click();", lastName);
        gozle(1);// ✅ Düzəliş
    }


    @FindBy(id = "userEmail")
    private WebElement userEmail;
    public void getuserEmail() {
        userEmail.sendKeys("ali@test.com");
        js.executeScript("arguments[0].click();", userEmail);
        gozle(1);// ✅ Düzəliş
    }


    @FindBy(id = "age")
    private WebElement age;
    public void getage() {
        age.sendKeys("30");
        js.executeScript("arguments[0].click();", age);
        gozle(1);// ✅ Düzəliş
    }


    @FindBy(id = "salary")
    private WebElement salary;
    public void getsalary() {
        salary.sendKeys("1400");
        js.executeScript("arguments[0].click();", salary);
        gozle(1);// ✅ Düzəliş
    }


    @FindBy(id = "department")
    private WebElement department;
    public void getdepartment() {
        department.sendKeys("QA engineer");
        js.executeScript("arguments[0].click();", department);
        gozle(1);// ✅ Düzəliş
    }

    @FindBy(id = "submit")
    private WebElement submit;
    public void getsubmit() {

        js.executeScript("arguments[0].click();", submit);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "searchBox")
    private WebElement searchBox;
    public void getsearchBox() {
        js.executeScript("window.scrollBy(0,200)");
        searchBox.sendKeys("Cierra");
        js.executeScript("arguments[0].click();",searchBox);
        gozle(2);// ✅ Düzəliş
    }

    @FindBy(xpath = "//span[@title='Delete'][last()]")  // ✅ ən son delete
    private WebElement deleteLastButton;

    public void getDeleteLastRecord() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", deleteLastButton);
        gozle(2);
    }

}
