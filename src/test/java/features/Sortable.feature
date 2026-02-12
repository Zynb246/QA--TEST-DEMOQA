Feature: Sortable

  @Sortable
  Scenario: Sortable testleri
    Given Sortable sehifesine kecid et
    When List tab-a kecid et
    Then List elementlerinin oldugunu yoxla
    When Grid tab-a kecid et
    Then Grid elementlerinin oldugunu yoxla