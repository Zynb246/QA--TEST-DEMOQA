@TextBox
  Feature: Text box xanalarini doldurun

    Scenario: TextBox inputlarina text elave edib Submit buttonuna click et
      Given Demoqada TextBox sehifesine kecid et
      And Full Name xanasina qiymet daxil et
      And Email xanasina qiymet daxil et
      And Current Address xanasina qiymet daxil et
      And Perment Address xanasina qiymet daxil et
      When Submit buttonuna cick et
      Then Melumatlarin dogru qayitdigini yoxla