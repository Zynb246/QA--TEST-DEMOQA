@BrowserWindows
Feature: Browser Windows funksionallığının test edilməsi

  Background:
    Given Demoqada Browser Windows sehifesine kecid et

  Scenario: New Tab acilmasi testi
    When New Tab buttonuna click et
    Then Yeni tab acildigini yoxla
    And Yeni tabi baglayib esasa qayit

  Scenario: New Window acilmasi testi
    When New Window buttonuna click et
    Then Yeni window acildigini yoxla
    And Yeni windowi baglayib esasa qayit

  Scenario: New Window Message acilmasi testi
    When New Window Message buttonuna click et
    Then Yeni window message acildigini yoxla
    And Yeni windowi baglayib esasa qayit