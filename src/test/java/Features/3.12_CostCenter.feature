Feature: In this feature Cost Center processes are proceeds

  Background: Cost Center background
    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Cost Center add, update and delete
    When user navigate to Salary Cost Center

    And Click to Cost Center add button

    Then create a Cost Center
      | name                      | selim59    |
      | code                      | code91     |
      | type                      | production |
      | orderNo                   | 11         |
      | expenseAccoutCodePrefixes | 0          |

    Then Cost Center should be created

    Then user edit Cost Center  name as "selim59"
    Then user  edit form
      | name                      | selim68 |
      | code                      | code95  |
      | type                      | service |
      | orderNo                   | 22      |
      | expenseAccoutCodePrefixes | 5       |

    Then Cost Center  should be updated

    Then  user delete  name as "selim68"
    Then  Cost Center  should be deleted