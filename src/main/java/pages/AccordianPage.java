package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;

public class AccordianPage extends BasePage {
    public AccordianPage() {
    }

    public void getaccordian() {
        driver.get("https://demoqa.com/accordian");
        gozle(2);
    }

    @FindBy(id = "section1Heading")
    private WebElement section1;
    public void getsection1() {
        section1.click();
        gozle(1);
    }

    @FindBy(id = "section1Content")
    private WebElement section1Content;
    public boolean isSection1Visible() {
        return section1Content.isDisplayed();
    }

    @FindBy(id = "section2Heading")
    private WebElement section2;
    public void getsection2() {
        section2.click();
        gozle(1);
    }

    @FindBy(id = "section2Content")
    private WebElement section2Content;
    public boolean isSection2Visible() {
        return section2Content.isDisplayed();
    }

    @FindBy(id = "section3Heading")
    private WebElement section3;
    public void getsection3() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", section3);
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].click();", section3);
    }

    @FindBy(id = "section3Content")
    private WebElement section3Content;
    public boolean isSection3Visible() {
        return section3Content.isDisplayed();
    }
}