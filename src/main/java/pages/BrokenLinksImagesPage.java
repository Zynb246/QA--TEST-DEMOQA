package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokenLinksImagesPage extends BasePage {
    public BrokenLinksImagesPage() {
    }

    @FindBy(xpath = "//span[text()='Broken Links - Images']")
    private WebElement item6;
    public void getitem6() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", item6);
        gozle(2);
    }

    @FindBy(xpath = "//img[@src='/images/Toolsqa.jpg']")
    private WebElement validImage;
    public void getvalidImage() {
        js.executeScript("window.scrollBy(0,200)");
        gozle(2);
    }

    @FindBy(xpath = "//img[@src='/images/Toolsqa_1.jpg']")
    private WebElement brokenImage;
    public void getbrokenImage() {
        js.executeScript("window.scrollBy(0,200)");
        gozle(2);
    }

    @FindBy(xpath = "//a[text()='Click Here for Valid Link']")
    private WebElement validLink;
    public void getvalidLink() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", validLink);
        gozle(2);
    }

    @FindBy(xpath = "//a[text()='Click Here for Broken Link']")
    private WebElement brokenLink;
    public void getbrokenLink() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", brokenLink);
        gozle(2);
    }
}