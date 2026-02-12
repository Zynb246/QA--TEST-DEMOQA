package stepDefinition;

import io.cucumber.java.en.*;
import pages.FramesPage;
import org.junit.Assert;

public class FramesStep {

    public FramesPage framesPage;

    public FramesStep() {
        framesPage = new FramesPage();
    }

    @Given("Demoqada Frames sehifesine kecid et")
    public void demoqadaFramesSehifesineKecidEt() {
        framesPage.getFramesPage();
    }

    @When("Birinci frame-e kecid et")
    public void birinciFrameEKecidEt() {
        framesPage.switchToFirstFrame();
    }

    @Then("Frame daxilindeki metnin {string} oldugunu yoxla")
    public void frameDaxilindekiMetninOldugunuYoxla(String expectedText) {
        String actualText = framesPage.getFrameText();
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Frame daxilindəki mətn: " + actualText);
    }

    @And("Esas sehifeye geri qayit")
    public void esasSehifeyeGeriQayit() {
        framesPage.switchToMainPage();
    }
}