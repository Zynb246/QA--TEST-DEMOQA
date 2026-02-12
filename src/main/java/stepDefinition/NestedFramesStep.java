package stepDefinition;

import io.cucumber.java.en.*;
import pages.NestedFramesPage;

public class NestedFramesStep {

    public NestedFramesPage nestedFramesPage;

    public NestedFramesStep() {
        nestedFramesPage = new NestedFramesPage();
    }

    @Given("Nested Frames sehifesine kecid et")
    public void nestedFramesSehifesineKecidEt() {
        nestedFramesPage.goToNestedFrames();
    }

    @When("Parent frame-e kecid et")
    public void parentFrameEKecidEt() {
        nestedFramesPage.switchToParentFrame();
    }

    @Then("Parent frame metnini yoxla")
    public void parentFrameMetniniYoxla() {
        System.out.println(nestedFramesPage.getParentFrameText());
    }

    @When("Child frame-e kecid et")
    public void childFrameEKecidEt() {
        nestedFramesPage.switchToChildFrame();
    }

    @Then("Child frame metnini yoxla")
    public void childFrameMetniniYoxla() {
        System.out.println(nestedFramesPage.getChildFrameText());
    }
}