package stepDefinition;

import io.cucumber.java.en.*;
import pages.SelectMenuPage;

public class SelectMenuStep {

    public SelectMenuPage selectMenuPage;

    public SelectMenuStep() {
        selectMenuPage = new SelectMenuPage();
    }

    @Given("Select Menu sehifesine kecid et")
    public void selectMenuSehifesineKecidEt() {
        selectMenuPage.goToSelectMenu();
    }

    @When("Select Value secimini ac ve Group 1 option 1 sec")
    public void selectValueSeciminiAcVeGroup1Option1Sec() {
        selectMenuPage.selectValue();
    }

    @Then("Select Value seciminin dogru oldugunu yoxla")
    public void selectValueSecimininDogruOldugunuYoxla() {
        if(selectMenuPage.isValueSelected()) {
            System.out.println("Select Value seçildi");
        }
    }

    @When("Old Style Select Menu den Yellow sec")
    public void oldStyleSelectMenuDenYellowSec() {
        selectMenuPage.selectOldStyle();
    }

    @Then("Old Style seciminin dogru oldugunu yoxla")
    public void oldStyleSecimininDogruOldugunuYoxla() {
        if(selectMenuPage.isOldStyleSelected()) {
            System.out.println("Old Style seçildi");
        }
    }
}

