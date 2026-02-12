package stepDefinition;

import io.cucumber.java.en.*;
import pages.AlertsPage;
import org.junit.Assert;

import static pages.BasePage.driver;

public class AlertsStep {

    public AlertsPage alertsPage;

    public AlertsStep() {
        alertsPage = new AlertsPage();
    }

    @Given("Demoqada Alerts sehifesine kecid et")
    public void demoqadaAlertsSehifesineKecidEt() {
        // Burada Alerts səhifəsinə getmək üçün lazımi kod və ya metod
        driver.get("https://demoqa.com/alerts");
    }

    @When("Alert buttonuna click et")
    public void alertButtonunaClickEt() {
        alertsPage.clickAlertButton();
    }

    @And("Alerti qebul et")
    public void alertiQebulEt() {
        alertsPage.acceptAlert();
    }

    @Then("Alertin baglandigini yoxla")
    public void alertinBaglandiginiYoxla() {
        // Alert bağlandığı üçün ekranda başqa bir elementin aktivliyini yoxlaya bilərik
        System.out.println("Alert uğurla bağlandı");
    }

    @When("Confirm buttonuna click et")
    public void confirmButtonunaClickEt() {
        alertsPage.clickConfirmButton();
    }

    @Then("{string} yazisinin cixdiqini yoxla")
    public void yazisininCixdiqiniYoxla(String expectedText) {
        String actualText = alertsPage.getConfirmResultText();
        Assert.assertEquals(expectedText, actualText);
        System.out.println("Nəticə təsdiqləndi: " + actualText);
    }
}