package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SliderPage extends BasePage {

    public SliderPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[text()='Widgets']")
    private WebElement widgetsMenu;

    @FindBy(xpath = "//span[text()='Slider']")
    private WebElement sliderMenu;

    @FindBy(xpath = "//input[@type='range']")
    private WebElement slider;

    @FindBy(id = "sliderValue")
    private WebElement sliderValue;

    public void goToSlider() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", widgetsMenu);
        js.executeScript("arguments[0].scrollIntoView(true);", sliderMenu);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        js.executeScript("arguments[0].click();", sliderMenu);
    }

    public void moveSlider(int value) {
        slider.click();
        for(int i = 0; i < 30; i++) {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
        for(int i = 0; i < value; i++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public int getSliderValue() {
        return Integer.parseInt(sliderValue.getAttribute("value"));
    }
}