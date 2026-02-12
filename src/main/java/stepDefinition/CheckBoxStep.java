package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import pages.CheckBoxPage;

import static pages.BasePage.driver;

public class CheckBoxStep {

    public CheckBoxPage checkBoxPage;
    public CheckBoxStep (){
        checkBoxPage= new CheckBoxPage();
    }

    @Given("Demoqada CheckBox sehifesine kecid et")
    public void DemoqadaCheckBoxSehifesiniDoldur() {

        //  driver.get("https://demoqa.com/checkbox");
        checkBoxPage.getItem1();

    }
    @And("sol buttona cick et")
    public void SolButtonaCickEt() {
        checkBoxPage.getsolButton();


    }

    @When("Home checkbox klikləyir")
    public void HomeCheckboxKlikleyir() {
        checkBoxPage.gettreenodehome();
    }




    @Then("Bütün elementlər seçilir")
    public void ButunElementlerSecilir() {
    }
}
