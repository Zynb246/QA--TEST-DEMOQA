Feature: Droppable

  @Droppable
  Scenario: Droppable testleri
    Given Droppable sehifesine kecid et
    When Drag me elementi Drop here ustune surusdurun
    Then Drop here mesajinin Dropped! oldugunu yoxla