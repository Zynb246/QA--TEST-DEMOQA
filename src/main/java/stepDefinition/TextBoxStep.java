package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.TextBoxPage;

import static pages.BasePage.driver;


public class TextBoxStep {
    public TextBoxPage textBoxPage;
    public TextBoxStep (){
        textBoxPage = new TextBoxPage();
    }

    @Given("Demoqada TextBox sehifesine kecid et")
    public void demoqadaTextBox() {
        String firstPage = "https://demoqa.com/text-box";
        textBoxPage.driver.get(firstPage);
        textBoxPage.driver.manage().window().maximize();

    }


    @And("Full Name xanasina qiymet daxil et")
    public void fullNameXanasiniDoldur() {
        textBoxPage.fullNameXanasiniDoldur();
    }


    @And("Email xanasina qiymet daxil et")
    public void emailXanasiniDoldur() {
        textBoxPage.emailXanasiniDoldur();
    }
    @And("Current Address xanasina qiymet daxil et")
    public void currentAddressXanasiniDoldur() {
        textBoxPage.currentAddressXanasiniDoldur();

    }
    @And("Perment Address xanasina qiymet daxil et")
    public void permentAddressXanasiniDoldur() {
        textBoxPage.permentAddressXanasiniDoldur();

    }
    @When("Submit buttonuna cick et")
    public void submitButtonunuDoldur() {
        textBoxPage.submitButtonunuDoldur();

    }
    @Then("Melumatlarin dogru qayitdigini yoxla")
    public void melumatlarinDogruGayitdiginiYoxla() {

    }

}
