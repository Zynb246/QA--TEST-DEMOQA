package stepDefinition;

import io.cucumber.java.en.*;
import pages.ModalDialogsPage;

public class ModalDialogsStep {

    public ModalDialogsPage modalDialogsPage;

    public ModalDialogsStep() {
        modalDialogsPage = new ModalDialogsPage();
    }

    @Given("Modal Dialogs sehifesine kecid et")
    public void modalDialogsSehifesineKecidEt() {
        modalDialogsPage.goToModalDialogs();
    }

    @When("Small modal buttonuna click et")
    public void smallModalButtonunaClickEt() {
        modalDialogsPage.clickSmallModal();
    }

    @Then("Small modal acildigini yoxla")
    public void smallModalAcildiginiYoxla() {
        if(modalDialogsPage.isSmallModalVisible()) {
            System.out.println("Small modal açıldı");
        }
    }

    @And("Small modal-i bagla")
    public void smallModalIBagla() {
        modalDialogsPage.closeSmallModal();
    }

    @When("Large modal buttonuna click et")
    public void largeModalButtonunaClickEt() {
        modalDialogsPage.clickLargeModal();
    }

    @Then("Large modal acildigini yoxla")
    public void largeModalAcildiginiYoxla() {
        if(modalDialogsPage.isLargeModalVisible()) {
            System.out.println("Large modal açıldı");
        }
    }

    @And("Large modal-i bagla")
    public void largeModalIBagla() {
        modalDialogsPage.closeLargeModal();
    }
}