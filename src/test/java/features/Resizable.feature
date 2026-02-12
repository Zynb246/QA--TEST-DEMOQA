Feature: Resizable

  @Resizable
  Scenario: Resizable testleri
    Given Resizable sehifesine kecid et
    When Resizable Box-u boyutlendir
    Then Resizable Box boyutunun deyisdigini yoxla