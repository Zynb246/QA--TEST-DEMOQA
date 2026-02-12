@Links
Feature: Links funksionallığının test edilməsi

  Background:
    Given Demoqada Links sehifesine kecid et

  Scenario: Home linkinə click et
    When Home linkinə click et
    Then Home tab acildigini yoxla

  Scenario: Dynamic linkinə click et
    When Home dynamic linkinə click et
    Then Home dynamic tab acildigini yoxla

  Scenario: Created linkinə click et
    When Created linkinə click et
    Then Created mesajinin gorunduyunu yoxla

  Scenario: No Content linkinə click et
    When No Content linkinə click et
    Then No Content mesajinin gorunduyunu yoxla

  Scenario: Moved linkinə click et
    When Moved linkinə click et
    Then Moved mesajinin gorunduyunu yoxla

  Scenario: Bad Request linkinə click et
    When Bad Request linkinə click et
    Then Bad mesajinin gorunduyunu yoxla

  Scenario: Unauthorized linkinə click et
    When Unauthorized linkinə click et
    Then Unauthorized mesajinin gorunduyunu yoxla

  Scenario: Forbidden linkinə click et
    When Forbidden linkinə click et
    Then Forbidden mesajinin gorunduyunu yoxla

  Scenario: Not Found linkinə click et
    When Not Found linkinə click et
    Then Not Found  mesajinin gorunduyunu yoxla