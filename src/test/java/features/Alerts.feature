@Alerts
Feature: Alerts funksionallığının test edilməsi

  Scenario: Sadə alert-in bağlanması testi
    Given Demoqada Alerts sehifesine kecid et
    When Alert buttonuna click et
    And Alerti qebul et
    Then Alertin baglandigini yoxla

  Scenario: Confirm box testi
    Given Demoqada Alerts sehifesine kecid et
    When Confirm buttonuna click et
    And Alerti qebul et
    Then "You selected Ok" yazisinin cixdiqini yoxla