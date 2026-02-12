Feature: Menu

  @Menu
  Scenario: Menu testleri
    Given Menu sehifesine kecid et
    When Main Item 2 ustune gel
    Then Sub menu gorundugunu yoxla
    When SUB SUB LIST ustune gel
    Then Sub Sub Item 1 gorundugunu yoxla