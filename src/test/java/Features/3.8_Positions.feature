Feature:Positions functionality

  Background: Positions background
    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Positionsadd, update and delete

    When   user navigate to Positions page


    Then Create a Positions name as "doctor39" short name as "dr39"
    Then Positions  should be created


    Then User edit the name as "doctor39" to "teacher39" and short name as "dr39" to "tch39"
    Then Positions should be updated


    Then User delete the name as "teacher39"
    Then Positions should be deleted