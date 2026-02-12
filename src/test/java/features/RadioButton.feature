@RadioButton
Feature: Radio Button Funksiyası

  Scenario: Radio button seçimi
    Given Demoqada RadioButton sehifesine kecid et
    When Yes radio buttonunu sec
    Then Yes secildiyini yoxla
    When Impressive radio buttonunu sec
    Then Impressive secildiyini yoxla