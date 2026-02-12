package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

public class LinksPage extends BasePage {
    public  LinksPage () {
    }


    @FindBy(id = "item-5")
    private WebElement item5;
    public void getitem5() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", item5);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "simpleLink")
    private WebElement simpleLink;
    public void getsimpleLink() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", simpleLink);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "dynamicLink")
    private WebElement dynamicLink;
    public void getdynamicLink() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", dynamicLink);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "created")
    private WebElement created;
    public void getcreated() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", created);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "no-content")
    private WebElement noContent;
    public void getnoContent() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", noContent);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "moved")
    private WebElement moved;
    public void getmoved() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", moved);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "bad-request")
    private WebElement badRequest;
    public void getbadRequest() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", badRequest);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "unauthorized")
    private WebElement unauthorized;
    public void getunauthorized() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", unauthorized);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "forbidden")
    private WebElement forbidden;
    public void getforbidden() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", forbidden);
        gozle(2);// ✅ Düzəliş
    }



    @FindBy(id = "invalid-url")
    private WebElement invalidUrl;
    public void getinvalidUrl() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", invalidUrl);
        gozle(2);// ✅ Düzəliş
    }

    }
