package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {
    public FramesPage() {
    }

    @FindBy(xpath = "//span[text()='Frames']")
    private WebElement framesMenuButton;

    @FindBy(id = "frame1")
    private WebElement frame1;

    @FindBy(id = "sampleHeading")
    private WebElement frameHeading;


    public void getFramesPage() {
        js.executeScript("window.scrollBy(0,200)");
      //  js.executeScript("arguments[0].scrollIntoView(true);", framesMenuButton);  // ✅ Elementin üstünə scroll
        js.executeScript("arguments[0].click();", framesMenuButton);
        gozle(1);
    }

    public void switchToFirstFrame() {
        // ID vasitəsilə və ya WebElement vasitəsilə freymə keçid
        driver.switchTo().frame(frame1);
    }

    public void switchToMainPage() {
        // Freymdən çıxıb əsas səhifəyə qayıtmaq
        driver.switchTo().defaultContent();
    }

    public String getFrameText() {
        return frameHeading.getText();
    }
}