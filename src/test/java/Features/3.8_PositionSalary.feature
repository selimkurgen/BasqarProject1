Feature:Position Salary functionality

  Background: Position Salary background

    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Position Salary add, update and delete

    When  user navigate to Position Salary page


    Then Create a Position Salary name as "selim48"
    Then Success message should be displayed


    Then User edit the "selim48" to "selim481"
    Then Success message should be updated


    Then User delete the "selim481"
    Then Success message should be deleted