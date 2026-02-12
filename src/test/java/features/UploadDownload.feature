@UploadDownload
Feature: Upload Download funksionallığının test edilməsi

  Background:
    Given Demoqada Upload Download sehifesine kecid et

  Scenario: Fayl yukleme testi
    When Download buttonuna click et
    Then Faylin yuklendiyini yoxla

  Scenario: Fayl upload testi
    When Fayl upload et
    Then Faylin upload edildiyini yoxla