package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;

public class BrowserWindowsPage extends BasePage {
    public BrowserWindowsPage() {
    }

    @FindBy(xpath = "//span[text()='Browser Windows']")
    private WebElement browserWindows;
    public void getbrowserWindows() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", browserWindows);
        gozle(2);
    }

    @FindBy(id = "tabButton")
    private WebElement tabButton;
    public void gettabButton() {
        tabButton.click();
        gozle(2);
    }

    @FindBy(id = "windowButton")
    private WebElement windowButton;
    public void getwindowButton() {
        windowButton.click();
        gozle(2);
    }


    @FindBy(id = "messageWindowButton")
    private WebElement messageWindowButton;
    public void getmessageWindowButton() {
        messageWindowButton.click();
        gozle(2);
    }

    public void switchToNewTab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        gozle(2);
    }

    public void closeNewTab() {
        driver.close();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        gozle(1);
    }

    @FindBy(id = "sampleHeading")
    private WebElement sampleHeading;
    public boolean isSampleHeadingDisplayed() {
        return sampleHeading.isDisplayed();
    }
}

