package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage() {
    }

    @FindBy(id = "item-1")
    private WebElement item1;
    public void getItem1() {

        js.executeScript("window.scrollBy(0,200)");
        item1.click();
        gozle(1);
    }

    @FindBy(id = "tree-node-home")
    private WebElement treenodehome;
    public void gettreenodehome() {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", treenodehome);
        gozle(2);
    }



    @FindBy(xpath = "//button[@title='Toggle']")
    private WebElement solButton;

    public void getsolButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", solButton);
        gozle(2);
    }


    @FindBy(xpath = "//*[@id=\"tree-node\"]/ol/li/span/button")
    private WebElement toggleButton;
    public void gettoggleButton() {
        js.executeScript("window.scrollBy(0,200)");
        toggleButton.click();
        gozle(2);
    }
}