Feature: In this feature My Subject processes are proceeds

  Background: My Subject background
    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: My Subjects add, update and delete

    When  user navigate to Subject Categories page

    When  user create a Subject Categories name as " arts45" and code as "a45" and save
    Then  Subject Categories should be created

    Then   user navigate to Subjects page

    When  user create a new Subjects name as "history45" and code as "his45" and save and select name as "arts45" and style
    Then  Subject Categories should successfully be created

    Then user navigate to Subject Categories page
    Then delete Subject Categories name as "arts45"
    Then Subject Categories should be error

    Then   user navigate to Subjects page
    Then delete subject name as "history45"
    Then  Subject should successfully be deleted

    Then user navigate to Subject Categories page
    Then delete Subject Categories name as "arts45"
    Then Subject Categories should be successfully deleted