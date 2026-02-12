@DynamicProperties
Feature: DemoQA Dinamik Elementlərin yoxlanılması

  Background:
    Given Demoqada Dynamic Properties səhifəsinə keçid et

  Scenario: Elementlərin zamanla dəyişməsini yoxla
    Then Səhifədəki random ID-li mətnin görünür olduğunu yoxla
    And Will enable 5 seconds düyməsinin 5 saniyə sonra aktiv olduğunu yoxla
    And Color Change düyməsinin rənginin dəyişdiyini yoxla
    And Visible After 5 Seconds düyməsinin 5 saniyə sonra ortaya çıxdığını yoxla