Feature: In this feature Salary Modifiers processes are proceeds

  Background: Salary Modifier background

    Given user on home page
    And   user logged in to basqar

  @Regression @Smoke
  Scenario: Salary Modifiers add, update and delete

    When   user navigate to Salary Modifiers page

    And Click to add button

    Then create a Salary Modifiers
      | description          | des46            |
      | variable             | var67            |
      | addition             | Employee Tax     |
      | integrationCode      | ic1111           |
      | valueType            | Formula          |
      | priority             | 055              |
      | amount               | 2000             |
      | formula              | BASE_SALARY*0.15 |
      | name                 | selim            |
      | formulaVariable      | var99            |
      | modifierVariableType | list             |

    Then Salary Modifiers should be created
    Then  navigate back page
    Then user edit Salary Modifiers description name as "des46"
    Then click to form New button
    Then user create new form
      | description          | des53            |
      | variable             | var76            |
      | addition             | Employee Tax     |
      | integrationCode      | ic007            |
      | valueType            | Formula          |
      | priority             | 007              |
      | amount               | 7000             |
      | formula              | BASE_SALARY*0.15 |
      | name                 | martin           |
      | formulaVariable      | var99            |
      | modifierVariableType | list             |
    Then Salary Modifiers should be updated
    Then user navigate to back page

    Then  user delete description name as "des53"
    Then  Salary Modifiers should be deleted

    Then  user delete  old description name as "des46"
    Then   Old Salary Modifiers should be deleted


