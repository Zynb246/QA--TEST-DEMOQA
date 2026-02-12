@Buttons
Feature: Buttons funksionallığının test edilməsi

  Background:
    Given Demoqada Buttons sehifesine kecid et

  Scenario: Buttons klikləmə testləri
    When Double Click Me buttonuna double click et
    Then Double click mesajinin gorunduyunu yoxla
    When Right Click Me buttonuna right click et
    Then Right click mesajinin gorunduyunu yoxla
    When Click Me buttonuna click et
    Then Click mesajinin gorunduyunu yoxla