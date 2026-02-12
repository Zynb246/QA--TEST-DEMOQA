@Frames
Feature: iFrame funksionallığının test edilməsi

  Scenario: Böyük frame daxilindəki mətni yoxla
    Given Demoqada Frames sehifesine kecid et
    When Birinci frame-e kecid et
    Then Frame daxilindeki metnin "This is a sample page" oldugunu yoxla
    And Esas sehifeye geri qayit