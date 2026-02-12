package stepDefinition;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.CheckBoxPage;
import pages.RadioButtonPage;

import static pages.BasePage.driver;


public class RadioButtonStep {


    public RadioButtonPage radioButtonPage;
    public RadioButtonStep (){
        radioButtonPage= new RadioButtonPage();
    }

    @Given("Demoqada RadioButton sehifesine kecid et")
    public void DemoqadaRadioButtonSehifesiniYoxla() {
        driver.get("https://demoqa.com/radio-button");
        radioButtonPage.getItem2();

    }

    @When("Yes radio buttonunu sec")
    public void YesRadioButtonunuSec() {
        radioButtonPage.getyesRadio();
    }


    @Then("Yes secildiyini yoxla")
    public void YesSecildiyiniYoxla() {


    }
    @When("Impressive radio buttonunu sec")
    public void İmpressivaRadioButtonunuSec() {
        radioButtonPage.getyimpressiveRadio();

    }
    @Then("Impressive secildiyini yoxla")
    public void İmpressiveSecildiyiniYoxla() {

    }


}
