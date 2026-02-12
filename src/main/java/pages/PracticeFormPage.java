package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PracticeFormPage extends BasePage {
    public PracticeFormPage() {
    }

    @FindBy(xpath = "//span[text()='Practice Form']")
    private WebElement practiceForm;
    public void getpracticeForm() {

        js.executeScript("arguments[0].click();", practiceForm);
        gozle(2);
    }

    @FindBy(id = "firstName")
    private WebElement firstName;
    public void getfirstName() {
        js.executeScript("window.scrollBy(0,200)");
       // email.click();
        firstName.sendKeys("Ali");
        gozle(1);
    }

    @FindBy(id = "lastName")
    private WebElement lastName;
    public void getlastName() {
        js.executeScript("arguments[0].click();", lastName);
        lastName.sendKeys("Valiyev");
        gozle(1);
    }

    @FindBy(id = "userEmail")
    private WebElement userEmail;
    public void getuserEmail() {

        js.executeScript("arguments[0].click();", userEmail);
        userEmail.sendKeys("ali@test.com");
        gozle(1);
    }

    @FindBy(xpath = "//label[text()='Male']")
    private WebElement genderMale;
    public void getgenderMale() {
        js.executeScript("arguments[0].click();", genderMale);
        gozle(1);
    }

    @FindBy(id = "userNumber")
    private WebElement userNumber;
    public void getuserNumber() {
        userNumber.sendKeys("1234567890");
        gozle(1);
    }

    @FindBy(id = "dateOfBirthInput")
    private WebElement dateOfBirth;
    public void getdateOfBirth() {
        js.executeScript("arguments[0].click();", dateOfBirth);
        dateOfBirth.click();
        gozle(1);
    }

    @FindBy(className = "react-datepicker__month-select")
    private WebElement monthSelect;
    public void selectMonth() {
        monthSelect.sendKeys("January");
        gozle(1);
    }

    @FindBy(className = "react-datepicker__year-select")
    private WebElement yearSelect;
    public void selectYear() {
        yearSelect.sendKeys("1990");
        gozle(1);
    }

    @FindBy(xpath = "//div[contains(@class,'react-datepicker__day') and text()='15']")
    private WebElement day15;
    public void selectDay() {
        day15.click();
        gozle(1);
    }

    @FindBy(id = "subjectsInput")
    private WebElement subjects;
    public void getsubjects() {
        js.executeScript("window.scrollBy(0,200)");
        subjects.sendKeys("Maths");
        subjects.sendKeys(Keys.ENTER);
        gozle(1);
    }

    @FindBy(xpath = "//label[text()='Sports']")
    private WebElement hobbySports;
    public void gethobbySports() {
        js.executeScript("arguments[0].click();", hobbySports);
        gozle(1);
    }

    @FindBy(id = "uploadPicture")
    private WebElement uploadPicture;
    public void getuploadPicture() {
       // js.executeScript("arguments[0].click();", uploadPicture);
        uploadPicture.sendKeys("C:\\Users\\Admin\\OneDrive\\Masaüstü\\test.jfif");
        gozle(1);
    }

    @FindBy(id = "currentAddress")
    private WebElement currentAddress;
    public void getcurrentAddress() {
        js.executeScript("window.scrollBy(0,200)");
        currentAddress.sendKeys("Baku, Azerbaijan");
        gozle(1);
    }

    @FindBy(id = "state")
    private WebElement state;
    public void getstate() {
        js.executeScript("arguments[0].scrollIntoView(true);", state);
        js.executeScript("arguments[0].click();", state);
        gozle(1);
    }

    @FindBy(xpath = "//div[text()='NCR']")
    private WebElement stateNCR;
    public void selectStateNCR() {
        stateNCR.click();
        gozle(1);
    }

    @FindBy(id = "city")
    private WebElement city;
    public void getcity() {
        js.executeScript("arguments[0].click();", city);
        gozle(1);
    }

    @FindBy(xpath = "//div[text()='Delhi']")
    private WebElement cityDelhi;
    public void selectCityDelhi() {
        js.executeScript("window.scrollBy(0,200)");
        cityDelhi.click();
        gozle(1);
    }

    @FindBy(id = "submit")
    private WebElement submit;
    public void getsubmit() {
        //js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", submit);
        gozle(2);
    }


    @FindBy(id = "example-modal-sizes-title-lg")
    private WebElement modalTitle;
    public boolean isModalDisplayed() {

        //js.executeScript("arguments[0].click();", modalTitle);

         js.executeScript("window.scrollBy(0,200)");
        modalTitle.click();
        gozle(2);
       // return modalTitle.isDisplayed();
        return false;
    }
    @FindBy(id = "closeLargeModal")
    private WebElement closeLargeModal;
    public void getcloseLargeModal() {
       js.executeScript("arguments[0].click();", closeLargeModal);
        gozle(2);
    }
}