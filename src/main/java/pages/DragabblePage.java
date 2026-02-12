package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragabblePage extends BasePage {

    public DragabblePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Interactions']")
    private WebElement interactionsMenu;

    @FindBy(xpath = "//span[text()='Dragabble']")
    private WebElement dragabbleButton;

    @FindBy(id = "dragBox")
    private WebElement dragBox;

    public void goToDragabble() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", interactionsMenu);
        js.executeScript("window.scrollBy(0,300);");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].scrollIntoView(true);", dragabbleButton);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].click();", dragabbleButton);
    }

    public void dragElement() {
        Actions actions = new Actions(driver);
        actions.dragAndDropBy(dragBox, 100, 50).perform();
    }

    public boolean isDragged() {
        return dragBox.isDisplayed();
    }
}