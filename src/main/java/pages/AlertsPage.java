package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsPage extends BasePage {
    public AlertsPage() {}

    @FindBy(id = "alertButton")
    private WebElement alertButton;

    @FindBy(id = "confirmButton")
    private WebElement confirmButton;

    @FindBy(id = "confirmResult")
    private WebElement confirmResult;

    public void clickAlertButton() {
        alertButton.click();
        gozle(1);
    }

    public void clickConfirmButton() {

     // Adi click() yerinə js click istifadə edirik
        js.executeScript("arguments[0].click();", confirmButton);
        gozle(1);
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getConfirmResultText() {
        return confirmResult.getText();
    }
}