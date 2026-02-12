@AutoComplete
Feature: Auto Complete

  @AutoComplete
  Scenario: Multi ve Single Auto Complete testleri
    Given Auto Complete sehifesine kecid et
    When Multi color name inputuna Red yaz ve sec
    And Multi color name inputuna Blue yaz ve sec
    And Multi color name inputuna Green yaz ve sec
    Then Multi color name inputunda secilenleri yoxla
    When Single color name inputuna Black yaz ve sec
    Then Single color name inputunda secileni yoxla