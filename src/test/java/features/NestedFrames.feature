Feature: Nested Frames

  @NestedFrames
  Scenario: Nested Frames testleri
    Given Nested Frames sehifesine kecid et
    When Parent frame-e kecid et
    Then Parent frame metnini yoxla
    When Child frame-e kecid et
    Then Child frame metnini yoxla