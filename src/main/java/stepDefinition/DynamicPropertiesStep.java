package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DynamicPropertiesPage;

public class DynamicPropertiesStep {

    public DynamicPropertiesPage dynamicPropertiesPage;

    public DynamicPropertiesStep() {
        dynamicPropertiesPage = new DynamicPropertiesPage();
    }

    @Given("Demoqada Dynamic Properties səhifəsinə keçid et")
    public void DemoqadaDynamicPropertiesSehifesinekecidEt() {
        dynamicPropertiesPage.getitem8();
    }

    @Then("Səhifədəki random ID-li mətnin görünür olduğunu yoxla")
    public void SehifedekiRandomIDliMetninGorunurOldugunuYoxla() {
        if(dynamicPropertiesPage.isRandomIdTextVisible()) {
            System.out.println("Random ID-li mətn görünür");
        }
    }

    @And("Will enable 5 seconds düyməsinin 5 saniyə sonra aktiv olduğunu yoxla")
    public void WillEnable5SecondsDuymesinin5SaniyeSonraAktivOldugunuYoxla() {
        if(dynamicPropertiesPage.isEnableAfterButtonEnabled()) {
            System.out.println("Will enable düyməsi aktiv oldu");
        }
    }

    @And("Color Change düyməsinin rənginin dəyişdiyini yoxla")
    public void ColorChangeDuymesininRenqininDeyisdiyiniYoxla() {
        if(dynamicPropertiesPage.isColorChanged()) {
            System.out.println("Color Change düyməsi rəngi dəyişdi");
        }
    }

    @And("Visible After 5 Seconds düyməsinin 5 saniyə sonra ortaya çıxdığını yoxla")
    public void VisibleAfter5SecondsDuymesinin5SaniyeSonraOrtayaCixdiginiYoxla() {
        if(dynamicPropertiesPage.isVisibleAfterButtonDisplayed()) {
            System.out.println("Visible After 5 Seconds düyməsi ortaya çıxdı");
        }
    }
}



