Feature: Slider

  @Slider
  Scenario: Slider testleri
    Given Slider sehifesine kecid et
    When Slider 50 deyerine surusdurun
    Then Slider deyerinin 50 oldugunu yoxla
    When Slider 75 deyerine surusdurun
    Then Slider deyerinin 75 oldugunu yoxla