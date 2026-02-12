package stepDefinition;

import io.cucumber.java.en.*;
import pages.SliderPage;

public class SliderStep {

    public SliderPage sliderPage;

    public SliderStep() {
        sliderPage = new SliderPage();
    }

    @Given("Slider sehifesine kecid et")
    public void sliderSehifesineKecidEt() {
        sliderPage.goToSlider();
    }

    @When("Slider {int} deyerine surusdurun")
    public void sliderDeyerineSurusdurun(int value) {
        sliderPage.moveSlider(value);
    }

    @Then("Slider deyerinin {int} oldugunu yoxla")
    public void sliderDeyerininOldugunuYoxla(int expectedValue) {
        if(sliderPage.getSliderValue() == expectedValue) {
            System.out.println("Slider dəyəri: " + expectedValue);
        }
    }
}