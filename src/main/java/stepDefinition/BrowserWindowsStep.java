package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BrowserWindowsPage;

public class BrowserWindowsStep {

    public BrowserWindowsPage browserWindowsPage;

    public BrowserWindowsStep() {
        browserWindowsPage = new BrowserWindowsPage();
    }

    @Given("Demoqada Browser Windows sehifesine kecid et")
    public void DemoqadaBrowserWindowsSehifesineKecidEt() {
        browserWindowsPage.getbrowserWindows();
    }

    @When("New Tab buttonuna click et")
    public void NewTabButtonunaClickEt() {
        browserWindowsPage.gettabButton();
    }

    @Then("Yeni tab acildigini yoxla")
    public void YeniTabAcildiginiYoxla() {
        browserWindowsPage.switchToNewTab();
        if(browserWindowsPage.isSampleHeadingDisplayed()) {
            System.out.println("Yeni tab açıldı");
        }
    }

    @And("Yeni tabi baglayib esasa qayit")
    public void YeniTabiBaglayibEsasaQayit() {
        browserWindowsPage.closeNewTab();
    }

    @When("New Window buttonuna click et")
    public void NewWindowButtonunaClickEt() {
        browserWindowsPage.getwindowButton();
    }

    @Then("Yeni window acildigini yoxla")
    public void YeniWindowAcildiginiYoxla() {
        browserWindowsPage.switchToNewTab();
        if(browserWindowsPage.isSampleHeadingDisplayed()) {
            System.out.println("Yeni window açıldı");
        }
    }

    @And("Yeni windowi baglayib esasa qayit")
    public void YeniWindowiBaglayibEsasaQayit() {
        browserWindowsPage.closeNewTab();
    }

    @When("New Window Message buttonuna click et")
    public void NewWindowMessageButtonunaClickEt() {
        browserWindowsPage.getmessageWindowButton();
    }

    @Then("Yeni window message acildigini yoxla")
    public void YeniWindowMessageAcildiginiYoxla() {
        browserWindowsPage.switchToNewTab();
        System.out.println("Yeni message window açıldı");
    }
}