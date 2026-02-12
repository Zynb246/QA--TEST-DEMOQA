Feature: Modal Dialogs

  @ModalDialogs
  Scenario: Modal Dialogs testleri
    Given Modal Dialogs sehifesine kecid et
    When Small modal buttonuna click et
    Then Small modal acildigini yoxla
    And Small modal-i bagla
    When Large modal buttonuna click et
    Then Large modal acildigini yoxla
    And Large modal-i bagla