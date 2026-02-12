Feature: Date Picker

  @DatePicker
  Scenario: Date Picker testleri
    Given Date Picker sehifesine kecid et
    When Select Date inputuna "01/15/2025" tarix daxil et
    Then Select Date inputunda tarixi yoxla
    When Date And Time inputuna tarix ve saat daxil et
    Then Date And Time inputunda tarix ve saati yoxla