Feature: In this feature Country processes are proceeds

  Background:Country background

    Given user on home page
    And   user logged in to basqar

  @Smoke @Regression

  Scenario: Country add and delete

    When  user navigate to country page
    When  user create a country as "country67" and code as "Code67"
    Then  country should be created
    When  user delete the name as "country67"
    Then  country should be deleted