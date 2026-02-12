@Accordian
Feature: Accordian testi

  Background:
    Given Accordian sehifesine kecid et

  Scenario: Section testleri
    When Section 1 click et
    Then Section 1 acildigini yoxla
    When Section 2 click et
    Then Section 2 acildigini yoxla
    When Section 3 click et
    Then Section 3 acildigini yoxla