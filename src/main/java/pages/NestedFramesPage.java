package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
    private WebElement alertsMenu;

    @FindBy(xpath = "//span[text()='Nested Frames']")
    private WebElement nestedFramesButton;

    @FindBy(tagName = "body")
    private WebElement frameText;

    public void goToNestedFrames() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertsMenu);

        // Reklamları sil
        try {
            js.executeScript("document.getElementById('fixedban').remove();");
        } catch (Exception e) {}

        js.executeScript("arguments[0].scrollIntoView(true);", nestedFramesButton);
        js.executeScript("arguments[0].click();", nestedFramesButton);
    }

    public void switchToParentFrame() {
        driver.switchTo().frame("frame1");
    }

    public String getParentFrameText() {
        return frameText.getText();
    }

    public void switchToChildFrame() {
        driver.switchTo().frame(0);
    }

    public String getChildFrameText() {
        return frameText.getText();
    }


}