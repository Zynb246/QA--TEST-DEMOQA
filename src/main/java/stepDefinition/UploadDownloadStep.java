package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UploadDownloadPage;

public class UploadDownloadStep {

    public UploadDownloadPage uploadDownloadPage;

    public UploadDownloadStep() {
        uploadDownloadPage = new UploadDownloadPage();
    }

    @Given("Demoqada Upload Download sehifesine kecid et")
    public void DemoqadaUploadDownloadSehifesineKecidEt() {
        uploadDownloadPage.getitem7();
    }

    @When("Download buttonuna click et")
    public void DownloadButtonunaClickEt() {
        uploadDownloadPage.getdownloadButton();
    }

    @Then("Faylin yuklendiyini yoxla")
    public void FaylinYuklendiyiniYoxla() {
        System.out.println("Fayl yükləndi");
    }

    @When("Fayl upload et")
    public void FaylUploadEt() {
        // Faylın yolunu buraya yaz
        String filePath = "C:\\Users\\Admin\\OneDrive\\Masaüstü\\test.jfif";
        uploadDownloadPage.getuploadFile(filePath);
    }

    @Then("Faylin upload edildiyini yoxla")
    public void FaylinUploadEdildiyiniYoxla() {
        if(uploadDownloadPage.isFileUploaded()) {
            System.out.println("Fayl uğurla upload edildi");
        }
    }
}