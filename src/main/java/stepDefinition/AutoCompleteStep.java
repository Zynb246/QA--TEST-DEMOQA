package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AutoCompletePage;

import static pages.BasePage.driver;
public class AutoCompleteStep {

    public AutoCompletePage autoCompletePage;
    public AutoCompleteStep(){
        autoCompletePage= new AutoCompletePage();
    }

    @Given("Auto Complete sehifesine kecid et")
    public void AutoCompleteSehifesineKecidEt() {

    }
    @When("Multi color name inputuna Red yaz ve sec")
    public void MultiColorNameInputunaRedYazVeSec() {

    }
    @When("Multi color name inputuna Blue yaz ve sec")
    public void MultiColorNameInputunaBlueYazVeSec() {

    }
    @When("Multi color name inputuna Green yaz ve sec")
    public void MultiColorNameInputunaGreenYazVeSec() {

    }
    @Then("Multi color name inputunda secilenleri yoxla")
    public void MultiColorNameInputundaSecileniYoxla() {

    }
    @When("Single color name inputuna Black yaz ve sec")
    public void SingleColorNameInputunaBlackYazVeSec() {

    }
    @Then("Single color name inputunda secileni yoxla")
    public void SingleColorNameInputundaSecileniYoxla() {

    }

}
