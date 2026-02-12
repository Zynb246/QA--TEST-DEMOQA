package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

public class AutoCompletePage extends BasePage {

    public AutoCompletePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[text()='Auto Complete']")
    private WebElement autoCompleteMenu;

    @FindBy(id = "autoCompleteMultipleInput")
    private WebElement multiColorInput;

    @FindBy(id = "autoCompleteSingleInput")
    private WebElement singleColorInput;

    @FindBy(xpath = "//div[@class='auto-complete__multi-value']")
    private WebElement multiColorSelected;

    @FindBy(xpath = "//div[@class='auto-complete__single-value']")
    private WebElement singleColorSelected;

    public void goToAutoComplete() {
        autoCompleteMenu.click();
    }

    public void selectMultiColor(String color) {
        multiColorInput.sendKeys(color);
        multiColorInput.sendKeys(Keys.ENTER);
    }

    public boolean isMultiColorSelected() {
        return multiColorSelected.isDisplayed();
    }

    public void selectSingleColor(String color) {
        singleColorInput.sendKeys(color);
        singleColorInput.sendKeys(Keys.ENTER);
    }

    public boolean isSingleColorSelected() {
        return singleColorSelected.isDisplayed();
    }
}