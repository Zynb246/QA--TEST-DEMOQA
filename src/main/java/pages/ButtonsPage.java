package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;


public class ButtonsPage extends BasePage {
    public ButtonsPage() {
    }


    @FindBy(id = "item-4")
    private WebElement item4;
    public void getitem4() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", item4);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "doubleClickBtn")
    private WebElement doubleClickBtn;
    public void getdoubleClickBtn() {
        Actions actions = new Actions(driver);  // ← buraya
        actions.doubleClick(doubleClickBtn).perform();
        gozle(2);
    }



    @FindBy(id = "rightClickBtn")
    private WebElement rightClickBtn;
    public void getrightClickBtn() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", rightClickBtn);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(xpath = "//button[text()='Click Me']")  // ← BU SETRI DEYİS
    private WebElement Ll;
    public void getLl() {
        js.executeScript("arguments[0].click();", Ll);
        gozle(2);// ✅ Düzəliş
    }
}