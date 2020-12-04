Feature: In this feature Subjects processes are proceeds

  Background: Subjects background
    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Subjects add and delete

    When   user navigate to Subjects page

    When  user create a Subjects name as "chemistry63" and code as "c63" and save
    Then  Subject Categories should successfully be created


    Then delete subject name as "chemistry63"
    Then Subject should successfully be deleted