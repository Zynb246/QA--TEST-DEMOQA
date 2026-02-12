package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DynamicPropertiesPage extends BasePage {
    public DynamicPropertiesPage() {
    }

    @FindBy(xpath = "//span[text()='Dynamic Properties']")
    private WebElement item8;
    public void getitem8() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", item8);
        gozle(2);
    }

    @FindBy(xpath = "//p[contains(text(),'This text has random Id')]")
    private WebElement randomIdText;
    public boolean isRandomIdTextVisible() {
        return randomIdText.isDisplayed();
    }

    @FindBy(id = "enableAfter")
    private WebElement enableAfter;
    public boolean isEnableAfterButtonEnabled() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.elementToBeClickable(enableAfter));
        return enableAfter.isEnabled();
    }

    @FindBy(id = "colorChange")
    private WebElement colorChange;
    public boolean isColorChanged() {
        String initialColor = colorChange.getCssValue("color");
        gozle(5);
        String changedColor = colorChange.getCssValue("color");
        return !initialColor.equals(changedColor);
    }

    @FindBy(id = "visibleAfter")
    private WebElement visibleAfter;
    public boolean isVisibleAfterButtonDisplayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.visibilityOf(visibleAfter));
        return visibleAfter.isDisplayed();
    }
}


