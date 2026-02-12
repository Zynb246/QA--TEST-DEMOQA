@CheckBox
Feature: Checkbox Test

  Scenario: Home checkbox secimi
    Given Demoqada CheckBox sehifesine kecid et
    When Home checkbox klikləyir
    And sol buttona cick et
    Then Bütün elementlər seçilir
