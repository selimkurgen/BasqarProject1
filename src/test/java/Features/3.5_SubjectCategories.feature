Feature: In this feature Subject Categories processes are proceeds

  Background: Subject Categories background
    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Subject Categories add and delete

    When  user navigate to Subject Categories page

    When  user create a Subject Categories name as "adjective23" and code as "ad23" and save
    Then  Subject Categories should be created

    Then delete Subject Categories name as "adjective23"
    Then Subject Categories should be deleted