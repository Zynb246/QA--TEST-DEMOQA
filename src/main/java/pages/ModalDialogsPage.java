package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ModalDialogsPage extends BasePage {

    public ModalDialogsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Alerts, Frame & Windows']")
    private WebElement alertsMenu;

    @FindBy(xpath = "//span[text()='Modal Dialogs']")
    private WebElement modalDialogsButton;

    @FindBy(id = "showSmallModal")
    private WebElement smallModalButton;

    @FindBy(id = "showLargeModal")
    private WebElement largeModalButton;

    @FindBy(className = "modal-content")
    private WebElement modalContent;

    @FindBy(id = "closeSmallModal")
    private WebElement closeSmallButton;

    @FindBy(id = "closeLargeModal")
    private WebElement closeLargeButton;

    public void goToModalDialogs() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertsMenu);
        js.executeScript("arguments[0].scrollIntoView(true);", modalDialogsButton);
        js.executeScript("arguments[0].click();", modalDialogsButton);
    }

    public void clickSmallModal() {
        smallModalButton.click();
    }

    public boolean isSmallModalVisible() {
        return modalContent.isDisplayed();
    }

    public void closeSmallModal() {
        closeSmallButton.click();
    }

    public void clickLargeModal() {
        largeModalButton.click();
    }

    public boolean isLargeModalVisible() {
        return modalContent.isDisplayed();
    }

    public void closeLargeModal() {
        closeLargeButton.click();
    }
}