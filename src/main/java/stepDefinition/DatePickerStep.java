package stepDefinition;

import io.cucumber.java.en.*;
import pages.DatePickerPage;

public class DatePickerStep {

    public DatePickerPage datePickerPage;

    public DatePickerStep() {
        datePickerPage = new DatePickerPage();
    }

    @Given("Date Picker sehifesine kecid et")
    public void datePickerSehifesineKecidEt() {
        datePickerPage.goToDatePicker();
    }

    @When("Select Date inputuna {string} tarix daxil et")
    public void selectDateInputunaTarixDaxilEt(String date) {
        datePickerPage.selectDate(date);
    }

    @Then("Select Date inputunda tarixi yoxla")
    public void selectDateInputundaTarixiYoxla() {
        if(datePickerPage.isDateSelected()) {
            System.out.println("Tarix seçildi");
        }
    }

    @When("Date And Time inputuna tarix ve saat daxil et")
    public void dateAndTimeInputunaTarixVeSaatDaxilEt() {
        datePickerPage.selectDateTime();
    }

    @Then("Date And Time inputunda tarix ve saati yoxla")
    public void dateAndTimeInputundaTarixVeSaatiYoxla() {
        if(datePickerPage.isDateTimeSelected()) {
            System.out.println("Tarix və saat seçildi");
        }
    }
}

