package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.WebTablesPage;

import static pages.BasePage.driver;
public class WebTablesStep {

    public WebTablesPage webTablesPage;
    public WebTablesStep(){
        webTablesPage= new WebTablesPage();
    }



    @Given("Demoqada WebTables sehifesine kecid et")
    public void DemoqadaWebTablesSehifesineKecidEt() {
        //driver.get("https://demoqa.com/webtables");
        webTablesPage.getitem3();
    }


    @When("Add buttonuna click et")
    public void AddButtonunaClickEt() {
        webTablesPage.getaddNewRecordButton();
    }


    @When("First Name xanasina Ali daxil et")
    public void FirstNameXanasinaAliDaxilEt() {
        webTablesPage.getfirstName();
    }



    @When("Last Name xanasina Valiyev daxil et")
    public void LastNameXanasinaValiyevDaxilEt() {
        webTablesPage.getlastName();

    }
    @When("Email xanasina ali@test.com daxil et")
    public void EmailXanasinaDaxilEt() {
        webTablesPage.getuserEmail();

    }
    @When("Age xanasina 30 daxil et")
    public void AgeXanasinaDaxilEt() {
        webTablesPage.getage();

    }
    @When("Salary xanasina 5000 daxil et")
    public void SalaryXanasinaDaxilEt() {
        webTablesPage.getsalary();

    }
    @When("Department xanasina IT daxil et")
    public void DepartmentXanasinaDaxilEt() {
        webTablesPage.getdepartment();

    }
    @When("Submit buttonuna click et")
    public void SubmitButtonunaClickEt() {
        webTablesPage.getsubmit();

    }
    @Then("Yeni setrin elave edildiyini yoxla")
    public void YeniSetrinElaveEdildiyiniYoxla() {


    }



    @When("Delete buttonuna click et")
    public void DeleteButtonunaClickEt() {
        webTablesPage.getDeleteLastRecord();  // ✅ son sətri sil
    }

    @Then("Setrin silindiyini yoxla")
    public void SetrinSilindiyiniYoxla() {


    }


    @When("Search xanasina Cierra daxil et")
    public void SearchXanasinaDaxilEt() {
        webTablesPage.getsearchBox();

    }


    @Then("Axtaris neticesinin duzgun oldugunu yoxla")
    public void AxtarisNeticesininDuzgunOldugunuYoxla() {

    }

}
