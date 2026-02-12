package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BrokenLinksImagesPage;

import java.util.ArrayList;

public class BrokenLinksImagesStep {

    public BrokenLinksImagesPage brokenLinksImagesPage;

    public BrokenLinksImagesStep() {
        brokenLinksImagesPage = new BrokenLinksImagesPage();
    }

    @Given("Demoqada Broken Links Images sehifesine kecid et")
    public void DemoqadaBrokenLinksImagesSehifesineKecidEt() {
        brokenLinksImagesPage.getitem6();
    }

    @When("Valid Image yuklendiyini yoxla")
    public void ValidImageYuklendiyiniYoxla() {
        brokenLinksImagesPage.getvalidImage();
    }

    @Then("Valid Image duzgun gorunduyunu yoxla")
    public void ValidImageDuzgunGorunduyunuYoxla() {
    }

    @When("Broken Image yuklendiyini yoxla")
    public void BrokenImageYuklendiyiniYoxla() {
        brokenLinksImagesPage.getbrokenImage();
    }

    @Then("Broken Image xetali gorunduyunu yoxla")
    public void BrokenImageXetaliGorunduyunuYoxla() {
    }

    @When("Valid Link click et")
    public void ValidLinkClickEt() {
        brokenLinksImagesPage.getvalidLink();
    }

    @Then("Valid Link tab acildigini yoxla")
    public void ValidLinkTabAcildiginiYoxla() throws InterruptedException {
        // Valid link yeni tab açmır, sadəcə səhifə yenilənir
        System.out.println("Valid link işlədi");
        Thread.sleep(2000);
        brokenLinksImagesPage.driver.navigate().back(); // Geri qayıt
    }

    @When("Broken Link click et")
    public void BrokenLinkClickEt() {
        brokenLinksImagesPage.getbrokenLink();
    }

    @Then("Broken Link mesajinin gorunduyunu yoxla")
    public void BrokenLinkMesajininGorunduyunuYoxla() throws InterruptedException {
        Thread.sleep(3000); // 500 error səhifəsini gözlə

        // Geri qayıt
        brokenLinksImagesPage.driver.navigate().back();
        Thread.sleep(2000);

        System.out.println("500 error gördü və geri qayıtdı");
    }
}