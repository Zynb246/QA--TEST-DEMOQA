package stepDefinition;

import io.cucumber.java.en.*;
import pages.ResizablePage;

public class ResizableStep {

    public ResizablePage resizablePage;

    public ResizableStep() {
        resizablePage = new ResizablePage();
    }

    @Given("Resizable sehifesine kecid et")
    public void resizableSehifesineKecidEt() {
        resizablePage.goToResizable();
    }

    @When("Resizable Box-u boyutlendir")
    public void resizableBoxUBoyutlendir() {
        resizablePage.resizeBox();
    }

    @Then("Resizable Box boyutunun deyisdigini yoxla")
    public void resizableBoxBoyutununDeyisdiginiYoxla() {
        if(resizablePage.isResized()) {
            System.out.println("Box boyutlandırıldı");
        }
    }
}