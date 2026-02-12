package stepDefinition;

import io.cucumber.java.en.*;
import pages.DragabblePage;

public class DragabbleStep {

    public DragabblePage dragabblePage;

    public DragabbleStep() {
        dragabblePage = new DragabblePage();
    }

    @Given("Dragabble sehifesine kecid et")
    public void dragabbleSehifesineKecidEt() {
        dragabblePage.goToDragabble();
    }

    @When("Drag me elementi surusdurun")
    public void dragMeElementiSurusdurun() {
        dragabblePage.dragElement();
    }

    @Then("Elementin yerinin deyisdigini yoxla")
    public void elementinYerininDeyisdiginiYoxla() {
        if(dragabblePage.isDragged()) {
            System.out.println("Element sürüşdürüldü");
        }
    }
}