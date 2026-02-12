package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ButtonsPage;

public class ButtonsStep {

        public ButtonsPage buttonsPage;
        public ButtonsStep(){
            buttonsPage= new ButtonsPage();
        }

    @Given("Demoqada Buttons sehifesine kecid et")
    public void DemoqadaButtonsSehifesineKecidEt() {
            buttonsPage.getitem4();

    }



    @When("Double Click Me buttonuna double click et")
    public void DoubleClickMeButtonunaDoubleClickEt() {
            buttonsPage.getdoubleClickBtn();

    }



    @Then("Double click mesajinin gorunduyunu yoxla")
    public void DoubleClickMesajininGorunduyunuYoxla() {


    }



    @When("Right Click Me buttonuna right click et")
    public void RightClickMeButtonunaRightClickEt() {
        buttonsPage.getrightClickBtn();
    }



    @Then("Right click mesajinin gorunduyunu yoxla")
    public void RightClickMesajininGorunduyunuYoxla() {

    }



    @When("Click Me buttonuna click et")
    public void ClickMeButtonunaClickEt() {
        buttonsPage.getLl();
    }



    @Then("Click mesajinin gorunduyunu yoxla")
    public void ClickMesajininGorunduyunuYoxla() {

    }

}
