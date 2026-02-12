package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadDownloadPage extends BasePage {
    public UploadDownloadPage() {
    }

    @FindBy(id = "item-7")
    private WebElement item7;
    public void getitem7() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", item7);
        gozle(2);
    }

    @FindBy(id = "downloadButton")
    private WebElement downloadButton;
    public void getdownloadButton() {
        js.executeScript("window.scrollBy(0,200)");
        js.executeScript("arguments[0].click();", downloadButton);
        gozle(2);
    }

    @FindBy(id = "uploadFile")
    private WebElement uploadFile;
    public void getuploadFile(String filePath) {
        uploadFile.sendKeys(filePath);
        gozle(2);
    }

    @FindBy(id = "uploadedFilePath")
    private WebElement uploadedFilePath;
    public boolean isFileUploaded() {
        return uploadedFilePath.isDisplayed();
    }
}