package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LinksPage;

import java.util.ArrayList;

public class LinksStep {

    public LinksPage linksPage;
    public LinksStep(){
        linksPage= new LinksPage();
        }

    @Given("Demoqada Links sehifesine kecid et")
    public void DemoqadaLinksSehifesineKecidEt() {
        linksPage.getitem5();
    }

   /* @When("Home linkinə click et")
    public void HomeLinkinəClickEt() {
        linksPage.getsimpleLink();
    }

    @Then("Home tab acildigini yoxla")
    public void HomeTabAcildiginiYoxla() {
    }
*/
   @When("Home linkinə click et")
   public void HomeLinkinəClickEt() {
       linksPage.getsimpleLink(); // Sadəcə klik edir
   }

    @Then("Home tab acildigini yoxla")
    public void HomeTabAcildiginiYoxla() throws InterruptedException {
        // KLİK-dən sonra bura gəlirik:
        ArrayList<String> tabs = new ArrayList<>(linksPage.driver.getWindowHandles());

        // 1. Yeni açılan taba keç
        linksPage.driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000); // Gözlə ki, görəsən keçid etdi

        // 2. Yeni tabı bağla
        linksPage.driver.close();

        // 3. Əsas səhifəyə (Links səhifəsinə) QAYIT
        linksPage.driver.switchTo().window(tabs.get(0));
    }


    @When("Home dynamic linkinə click et")
    public void HomeDynamicLinkinəClickEt() {
        linksPage.getdynamicLink();
    }

    @Then("Home dynamic tab acildigini yoxla")
    public void HomeDynamicTabAcildiginiYoxla() throws InterruptedException {
        // KLİK-dən sonra bura gəlirik:
        ArrayList<String> tabs = new ArrayList<>(linksPage.driver.getWindowHandles());

        // 1. Yeni açılan taba keç
        linksPage.driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000); // Gözlə ki, görəsən keçid etdi
        // 2. Yeni tabı bağla
        linksPage.driver.close();

        // 3. Əsas səhifəyə (Links səhifəsinə) QAYIT
        linksPage.driver.switchTo().window(tabs.get(0));

    }


    @When("Created linkinə click et")
    public void CreatedLinkinəClickEt() {
        linksPage.getcreated();
    }

    @Then("Created mesajinin gorunduyunu yoxla")
    public void CreatedMesajininGorunduyunuYoxla() {

    }


    @When("No Content linkinə click et")
    public void NoContentLinkinəClickEt() {
        linksPage.getnoContent();
    }

    @Then("No Content mesajinin gorunduyunu yoxla")
    public void NoContentMesajininGorunduyunuYoxla() {
    }


    @When("Moved linkinə click et")
    public void MovedLinkinəClickEt() {
        linksPage.getmoved();
    }

    @Then("Moved mesajinin gorunduyunu yoxla")
    public void MovedMesajininGorunduyunuYoxla() {
    }


    @When("Bad Request linkinə click et")
    public void BadRequestLinkinəClickEt() {
        linksPage.getbadRequest();
    }

    @Then("Bad mesajinin gorunduyunu yoxla")
    public void BadMesajininGorunduyunuYoxla() {
    }

    @When("Unauthorized linkinə click et")
    public void UnauthorizedLinkinəClickEt () {
        linksPage.getunauthorized();
    }



    @Then("Unauthorized mesajinin gorunduyunu yoxla")
    public void UnauthorizedMsajininGorunduyunuYoxla () {

    }
    @When("Forbidden linkinə click et")
    public void ForbiddenLinkinəClickEt () {
        linksPage.getforbidden();
    }

    @Then("Forbidden mesajinin gorunduyunu yoxla")
    public void ForbiddenMesajininGorunduyunuYoxla () {

    }

    @When("Not Found linkinə click et")
    public void NotFoundLinkinəClickEt () {
        linksPage.getinvalidUrl();
    }

    @Then("Not Found  mesajinin gorunduyunu yoxla")
    public void NotFoundMesajininGorunduyunuYoxla () {


    }
}
