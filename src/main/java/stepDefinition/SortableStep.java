package stepDefinition;

import io.cucumber.java.en.*;
import pages.SortablePage;

public class SortableStep {

    public SortablePage sortablePage;

    public SortableStep() {
        sortablePage = new SortablePage();
    }

    @Given("Sortable sehifesine kecid et")
    public void sortableSehifesineKecidEt() {
        sortablePage.goToSortable();
    }

    @When("List tab-a kecid et")
    public void listTabAKecidEt() {
        sortablePage.clickListTab();
    }

    @Then("List elementlerinin oldugunu yoxla")
    public void listElementlerininOldugunuYoxla() {
        if(sortablePage.isListVisible()) {
            System.out.println("List göründü");
        }
    }

    @When("Grid tab-a kecid et")
    public void gridTabAKecidEt() {
        sortablePage.clickGridTab();
    }

    @Then("Grid elementlerinin oldugunu yoxla")
    public void gridElementlerininOldugunuYoxla() {
        if(sortablePage.isGridVisible()) {
            System.out.println("Grid göründü");
        }
    }
}
