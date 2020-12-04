Feature: In this feature Cities processes are proceeds

  Background:City background
    Given user on home page
    And   user logged in to basqar

  @Smoke @Regression
  Scenario: City add and delete

    When  user navigate to city page

    When  user create a city to the country "Turkey" which name is "Antalya"
    Then  city should be created


    When  user delete the data name as "Antalya"
    Then  city should be deleted


