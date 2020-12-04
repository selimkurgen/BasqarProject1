Feature: In this feature Salary Constants processes are proceeds

  Background: Salary Constants background
    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Salary Constants add, update and delete
    When  user navigate to Salary Constants page

    And Click to add button for  Salary Constants

    Then create a Salary Constants
      | name      | selim414   |
      | validFrom | 2020-11-15 |
      | key       | s113       |
      | value     | 100        |


    Then Salary Constants should be created

    Then user search with name as "selim414"

   # And Click to edit button

    Then create a new Salary Constants
      | name      | selim314   |
      | validFrom | 2020-11-16 |
      | key       | s223     |
      | value     | 300        |

    Then Salary Constants should be updated

    Then user search with  new name as "selim314"


    Then  user delete new name as "selim314"
    Then  Salary Constants should be deleted