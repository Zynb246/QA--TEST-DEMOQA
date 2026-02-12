package stepDefinition;


import io.cucumber.java.en.*;
import pages.DroppablePage;

public class DroppableStep {

    public DroppablePage droppablePage;

    public DroppableStep() {
        droppablePage = new DroppablePage();
    }

    @Given("Droppable sehifesine kecid et")
    public void droppableSehifesineKecidEt() {
        droppablePage.goToDroppable();
    }

    @When("Drag me elementi Drop here ustune surusdurun")
    public void dragMeElementiDropHereUstuneSurusdurun() {
        droppablePage.dragAndDrop();
    }

    @Then("Drop here mesajinin Dropped! oldugunu yoxla")
    public void dropHereMesajininDroppedOldugunuYoxla() {
        if(droppablePage.isDropped()) {
            System.out.println("Element drop oldu");
        }
    }
}
