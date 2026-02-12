package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBoxPage extends BasePage {

public TextBoxPage() {

}



@FindBy(id = "userName")
    private WebElement userName;

public void fullNameXanasiniDoldur(){
    userName.click();
    userName.sendKeys("admin");
}
@FindBy(id = "userEmail")
    private WebElement email;
    public void emailXanasiniDoldur(){
        js.executeScript("window.scrollBy(0,200)");
        email.click();
        email.sendKeys("zeyneb@gmail.com");
    }

    @FindBy(id = "currentAddress")
    private WebElement currentAddress ;
    public void currentAddressXanasiniDoldur(){
        currentAddress.click();
        currentAddress.sendKeys("salam text");
    }

    @FindBy(id = "permanentAddress")
    private WebElement permentAddress;
    public void permentAddressXanasiniDoldur(){
        js.executeScript("window.scrollBy(0,200)");//scroll code
        permentAddress.click();
        permentAddress.sendKeys("salam ");
    }

    @FindBy(id = "submit")
    private WebElement submit;
    public void submitButtonunuDoldur(){
        js.executeScript("window.scrollBy(0,200)");//scroll code
        submit.click();

    }
}
