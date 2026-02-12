package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DroppablePage extends BasePage {

    public DroppablePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Interactions']")
    private WebElement interactionsMenu;

    @FindBy(xpath = "//span[text()='Droppable']")
    private WebElement droppableButton;

    @FindBy(id = "draggable")
    private WebElement dragMe;

    @FindBy(id = "droppable")
    private WebElement dropHere;

    public void goToDroppable() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", interactionsMenu);
        js.executeScript("window.scrollBy(0,300);");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].scrollIntoView(true);", droppableButton);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].click();", droppableButton);
    }

    public void dragAndDrop() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe, dropHere).perform();
    }

    public boolean isDropped() {
        return dropHere.getText().equals("Dropped!");
    }
}
