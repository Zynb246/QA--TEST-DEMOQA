package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResizablePage extends BasePage {

    public ResizablePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Interactions']")
    private WebElement interactionsMenu;

    @FindBy(xpath = "//span[text()='Resizable']")
    private WebElement resizableButton;

    @FindBy(xpath = "//div[@id='resizableBoxWithRestriction']//span")
    private WebElement resizeHandle;

    @FindBy(id = "resizableBoxWithRestriction")
    private WebElement resizableBox;

    public void goToResizable() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", interactionsMenu);
        js.executeScript("window.scrollBy(0,300);");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].scrollIntoView(true);", resizableButton);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].click();", resizableButton);
    }

    public void resizeBox() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(resizeHandle, 100, 100).perform();
    }

    public boolean isResized() {
        return resizableBox.isDisplayed();
    }
}