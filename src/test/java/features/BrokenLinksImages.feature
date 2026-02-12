@BrokenLinksImages
Feature: Broken Links Images funksionallığının test edilməsi

  Background:
    Given Demoqada Broken Links Images sehifesine kecid et

  Scenario: Valid Image yoxlanmasi
    When Valid Image yuklendiyini yoxla
    Then Valid Image duzgun gorunduyunu yoxla

  Scenario: Broken Image yoxlanmasi
    When Broken Image yuklendiyini yoxla
    Then Broken Image xetali gorunduyunu yoxla

  Scenario: Valid Link testi
    When Valid Link click et
    Then Valid Link tab acildigini yoxla

  Scenario: Broken Link testi
    When Broken Link click et
    Then Broken Link mesajinin gorunduyunu yoxla