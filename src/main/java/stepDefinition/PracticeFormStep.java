package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.PracticeFormPage;

import static pages.BasePage.driver;

public class PracticeFormStep {

    public PracticeFormPage practiceFormPage;
    private JavascriptExecutor js;

    public PracticeFormStep() {
        practiceFormPage = new PracticeFormPage();
    }

    @Given("Demoqada Practice Form sehifesine kecid et")
    public void DemoqadaPracticeFormSehifesineKecidEt() {
        practiceFormPage.getpracticeForm();
    }

    @When("Form First Name xanasina Ali daxil et")
    public void FirstNameXanasinaAliDaxilEt() {
        practiceFormPage.getfirstName();
    }

    @And("Form Last Name xanasina Valiyev daxil et")
    public void LastNameXanasinaValiyevDaxilEt() {
        practiceFormPage.getlastName();
    }

    @And("form Email xanasina ali@test.com daxil et")
    public void FormEmailXanasinaDaxilEt() {
        practiceFormPage.getuserEmail();
    }

    @When("Gender Male sec")
    public void gender_male_sec() {

        driver.findElement(By.xpath("//label[text()='Male']")).click();
    }

    @When("Hobbies Sports sec")
    public void hobbies_sports_sec() {

        driver.findElement(By.xpath("//label[text()='Sports']")).click();
    }

    @When("State ve City sec")
    public void state_ve_city_sec() {

    }

    @When("Form Submit buttonuna click et")
    public void form_submit_buttonuna_click_et() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("Formun ugurla gonderildiyini yoxla")
    public void formun_ugurla_gonderildiyini_yoxla() {
        // Assert istifadə edərək uğurlu mesajın gəldiyini yoxlayın
    }





    @And("Mobile Number xanasina 1234567890 daxil et")
    public void MobileNumberXanasinaDaxilEt() {
        practiceFormPage.getuserNumber();
    }

    @And("Subject xanasina Maths daxil et")
    public void SubjectXanasinaDaxilEt() {
        practiceFormPage.getsubjects();
    }

    @And("Current Address xanasina Baku Azerbaijan daxil et")
    public void CurrentAddressXanasinaDaxilEt() {
        practiceFormPage.getcurrentAddress();
    }


    @And("Date of Birth sec")
    public void DateOfBirthSec() {
        practiceFormPage.getdateOfBirth();
        practiceFormPage.selectMonth();
        practiceFormPage.selectYear();
        practiceFormPage.selectDay();
    }

    @And("Picture yukle")
    public void PictureYukle() {
        practiceFormPage.getuploadPicture();
    }
    @And("Close buttonuna click et")
    public void CloseButtonunaClickEt() {
        practiceFormPage.getcloseLargeModal();
    }

    @Then("Formu baqla")
    public void formu_baqla() {
        js.executeScript("window.scrollBy(0,200)");
        WebElement closeBtn = driver.findElement(By.id("closeLargeModal"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", closeBtn);
    }
}