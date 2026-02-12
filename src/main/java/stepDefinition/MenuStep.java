package stepDefinition;

import io.cucumber.java.en.*;
import pages.MenuPage;

public class MenuStep {

    public MenuPage menuPage;

    public MenuStep() {
        menuPage = new MenuPage();
    }

    @Given("Menu sehifesine kecid et")
    public void menuSehifesineKecidEt() {
        menuPage.goToMenu();
    }

    @When("Main Item 2 ustune gel")
    public void mainItem2UstuneGel() {
        menuPage.hoverMainItem2();
    }

    @Then("Sub menu gorundugunu yoxla")
    public void subMenuGorundugunuYoxla() {
        if(menuPage.isSubMenuVisible()) {
            System.out.println("Sub menu göründü");
        }
    }

    @When("SUB SUB LIST ustune gel")
    public void subSubListUstuneGel() {
        menuPage.hoverSubSubList();
    }

    @Then("Sub Sub Item 1 gorundugunu yoxla")
    public void subSubItem1GorundugunuYoxla() {
        if(menuPage.isSubSubItem1Visible()) {
            System.out.println("Sub Sub Item 1 göründü");
        }
    }
}