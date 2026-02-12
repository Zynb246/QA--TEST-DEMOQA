package pages;

import config.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;
import java.time.Duration;

public class BasePage {



    public static WebDriver driver;
    public JavascriptExecutor js;// scroll deyiskeni

    public BasePage() {
        this.driver = WebDriverManager.getChromeDriver();
        this.js = (JavascriptExecutor) driver;//
        PageFactory.initElements(driver, this);
    }

    protected void fillFieldAndEnter(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
        element.sendKeys(Keys.RETURN);
    }

    public void waitAndClick(WebElement element) {
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOf(element));

            element.click();
        } catch(RuntimeException e){
            System.out.println("Element not found: " + e.getMessage());
        }
    }
        //WebDriver driver = Driver.getDriver();
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        // ✅ Bu metodu əlavə edin
        public void gozle(int saniye) {
            try {
                Thread.sleep(saniye * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
