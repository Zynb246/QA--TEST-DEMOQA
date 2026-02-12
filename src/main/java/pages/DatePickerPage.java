package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

public class DatePickerPage extends BasePage {

    public DatePickerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Widgets']")
    private WebElement widgetsMenu;

    @FindBy(xpath = "//span[text()='Date Picker']")
    private WebElement datePickerMenu;

    @FindBy(id = "datePickerMonthYearInput")
    private WebElement dateInput;

    @FindBy(id = "dateAndTimePickerInput")
    private WebElement dateTimeInput;

    public void goToDatePicker() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", widgetsMenu);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        js.executeScript("window.scrollBy(0,200);");
        js.executeScript("arguments[0].scrollIntoView(true);", datePickerMenu);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].click();", datePickerMenu);
    }

    public void selectDate(String date) {
        dateInput.clear();
        dateInput.sendKeys(date);
        dateInput.sendKeys(Keys.ENTER);
    }

    public boolean isDateSelected() {
        return !dateInput.getAttribute("value").isEmpty();
    }

    public void selectDateTime() {
        dateTimeInput.click();
    }

    public boolean isDateTimeSelected() {
        return dateTimeInput.isDisplayed();
    }
}