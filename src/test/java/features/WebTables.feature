@WebTables
Feature: WebTables funksionallığının test edilməsi

  Background:
    Given Demoqada WebTables sehifesine kecid et

  Scenario: WebTables-də yeni məlumat əlavə et və sil

    When Add buttonuna click et
    And First Name xanasina Ali daxil et
    And Last Name xanasina Valiyev daxil et
    And Email xanasina ali@test.com daxil et
    And Age xanasina 30 daxil et
    And Salary xanasina 5000 daxil et
    And Department xanasina IT daxil et
    And Submit buttonuna click et
    Then Yeni setrin elave edildiyini yoxla
    When Delete buttonuna click et
    Then Setrin silindiyini yoxla


  Scenario: WebTables-də melumat axtar

    When Search xanasina Cierra daxil et
    Then Axtaris neticesinin duzgun oldugunu yoxla