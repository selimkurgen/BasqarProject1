Feature:Excel Template functionality

  Background: Excel Template background
    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Excel Template add, update and delete
    When   user navigate to Excel Template page


    Then Create a Excel Template name as "kurgen59" period count as "1" and save
    And  create versions row size as"2" and column size as "3" and save and close
    Then Excel Template  should be created


    Then edit a Excel Template name as "kurgen59"  to "kurgen79" and period count as "1" to "2"and save
    Then Excel Template should be updated


    Then User delete the Excel Template name as "kurgen79"
    Then Excel Template should be deleted