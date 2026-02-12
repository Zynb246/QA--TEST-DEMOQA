Feature: Select Menu

  @SelectMenu
  Scenario: Select Menu testleri
    Given Select Menu sehifesine kecid et
    When Select Value secimini ac ve Group 1 option 1 sec
    Then Select Value seciminin dogru oldugunu yoxla
    When Old Style Select Menu den Yellow sec
    Then Old Style seciminin dogru oldugunu yoxla