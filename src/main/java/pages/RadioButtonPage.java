package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;


public class RadioButtonPage extends BasePage {
    public RadioButtonPage() {
    }

    @FindBy(id = "item-2")
    private WebElement item2;
    public void getItem2() {
        js.executeScript("window.scrollBy(0,200)");
        item2.click();
    }

    @FindBy(id = "yesRadio")
    private WebElement yesRadio;
    public void getyesRadio() {
        js.executeScript("arguments[0].click();", yesRadio);
        gozle(2);// ✅ Düzəliş
    }

    @FindBy(id = "impressiveRadio")
    private WebElement impressiveRadio;
    public void getyimpressiveRadio() {
        js.executeScript("arguments[0].click();", impressiveRadio);  // ✅ Düzəliş
    }
}






