package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortablePage extends BasePage {

    public SortablePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Interactions']")
    private WebElement interactionsMenu;

    @FindBy(xpath = "//span[text()='Sortable']")
    private WebElement sortableButton;

    @FindBy(id = "demo-tab-list")
    private WebElement listTab;

    @FindBy(id = "demo-tab-grid")
    private WebElement gridTab;

    @FindBy(xpath = "//div[@id='demo-tabpane-list']")
    private WebElement listContent;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']")
    private WebElement gridContent;

    public void goToSortable() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", interactionsMenu);
        js.executeScript("window.scrollBy(0,300);");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].scrollIntoView(true);", sortableButton);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].click();", sortableButton);
    }

    public void clickListTab() {
        listTab.click();
    }

    public boolean isListVisible() {
        return listContent.isDisplayed();
    }

    public void clickGridTab() {
        gridTab.click();
    }

    public boolean isGridVisible() {
        return gridContent.isDisplayed();
    }
}