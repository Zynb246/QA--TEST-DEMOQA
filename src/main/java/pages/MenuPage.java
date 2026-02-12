package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends BasePage {

    public MenuPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Widgets']")
    private WebElement widgetsMenu;

    @FindBy(xpath = "//span[text()='Menu']")
    private WebElement menuButton;

    @FindBy(xpath = "//a[text()='Main Item 2']")
    private WebElement mainItem2;

    @FindBy(xpath = "//a[text()='Sub Item']")
    private WebElement subItem;

    @FindBy(xpath = "//a[text()='SUB SUB LIST »']")
    private WebElement subSubList;

    @FindBy(xpath = "//a[text()='Sub Sub Item 1']")
    private WebElement subSubItem1;

    public void goToMenu() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", widgetsMenu);
        js.executeScript("window.scrollBy(0,300);");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].scrollIntoView(true);", menuButton);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].click();", menuButton);
    }

    public void hoverMainItem2() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mainItem2).perform();
    }

    public boolean isSubMenuVisible() {
        return subItem.isDisplayed();
    }

    public void hoverSubSubList() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200);");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}

        Actions actions = new Actions(driver);
        actions.moveToElement(mainItem2).perform();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {}
        actions.moveToElement(subItem).perform();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {}
        actions.moveToElement(subSubList).perform();
    }

    public boolean isSubSubItem1Visible() {
        return subSubItem1.isDisplayed();
    }
}