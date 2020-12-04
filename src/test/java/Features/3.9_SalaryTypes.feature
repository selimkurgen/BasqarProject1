Feature: Salary Types functionality

  Background: Salary Types background
    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Salary Types add, update and delete

    When  user navigate to Salary Types  page


    When Create a Salary Type name as "selim14" and User Type as "student"
    Then Salary Type message should be created



    When Edit a Salary Type name as "selim14" to "ali12" and Edit User Type as "student" to "Guest"

    Then Salary Type message should be updated


    When Delete a Salary Type name as "ali12"
    Then Salary Type message should be deleted
