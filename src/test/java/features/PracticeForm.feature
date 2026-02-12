@PracticeForm
Feature: Practice Form funksionallığının test edilməsi

  Background:
    Given Demoqada Practice Form sehifesine kecid et

  Scenario: Practice Form doldurma testi
    When Form First Name xanasina Ali daxil et
    And Form Last Name xanasina Valiyev daxil et
    And Email xanasina ali@test.com daxil et
    And Gender Male sec
    And Mobile Number xanasina 1234567890 daxil et
    And Date of Birth sec
    And Subject xanasina Maths daxil et
    And Hobbies Sports sec
    And Picture yukle
    And Current Address xanasina Baku Azerbaijan daxil et
    And State ve City sec
    And Submit buttonuna click et
    And Close buttonuna click et
    Then Formun ugurla gonderildiyini yoxla