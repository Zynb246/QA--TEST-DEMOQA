package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectMenuPage extends BasePage {

    public SelectMenuPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Widgets']")
    private WebElement widgetsMenu;

    @FindBy(xpath = "//span[text()='Select Menu']")
    private WebElement selectMenuButton;

    @FindBy(id = "withOptGroup")
    private WebElement selectValue;

    @FindBy(xpath = "//div[text()='Group 1, option 1']")
    private WebElement group1Option1;

    @FindBy(id = "oldSelectMenu")
    private WebElement oldStyleSelect;

    public void goToSelectMenu() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", widgetsMenu);
        js.executeScript("arguments[0].scrollIntoView(true);", selectMenuButton);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
        js.executeScript("arguments[0].click();", selectMenuButton);
    }

    public void selectValue() {
        selectValue.click();
        group1Option1.click();
    }

    public boolean isValueSelected() {
        return selectValue.isDisplayed();
    }

    public void selectOldStyle() {
        Select select = new Select(oldStyleSelect);
        select.selectByVisibleText("Yellow");
    }

    public boolean isOldStyleSelected() {
        return oldStyleSelect.isDisplayed();
    }
}