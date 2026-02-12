package stepDefinition;

import io.cucumber.java.en.*;
import pages.AccordianPage;

public class AccordianStep {

    public AccordianPage accordianPage;

    public AccordianStep() {
        accordianPage = new AccordianPage();
    }

    @Given("Accordian sehifesine kecid et")
    public void accordianSehifesineKecidEt() {
        accordianPage.getaccordian();
    }

    @When("Section 1 click et")
    public void section1ClickEt() {
        accordianPage.getsection1();
    }

    @Then("Section 1 acildigini yoxla")
    public void section1AcildiginiYoxla() {
        if(accordianPage.isSection1Visible()) {
            System.out.println("Section 1 açıldı");
        }
    }

    @When("Section 2 click et")
    public void section2ClickEt() {
        accordianPage.getsection2();
    }

    @Then("Section 2 acildigini yoxla")
    public void section2AcildiginiYoxla() {
        if(accordianPage.isSection2Visible()) {
            System.out.println("Section 2 açıldı");
        }
    }

    @When("Section 3 click et")
    public void section3ClickEt() {
        accordianPage.getsection3();
    }

    @Then("Section 3 acildigini yoxla")
    public void section3AcildiginiYoxla() {
        if(accordianPage.isSection3Visible()) {
            System.out.println("Section 3 açıldı");
        }
    }
}