Feature: In this feature SomeCountry processes are proceeds


  Background: SomeCountry background
    Given user on home page
    And   user logged in to basqar

  @Regression
  Scenario: SomeCountry add, update and delete
    When   user navigate to country page

    When  user create a someCountry name as "Country96" and code as "slm96" and save
    Then  someCountry should be created

    Then user navigate to city page
    Then select name as "Country96" and create a someCity name as "city96" and save
    Then  Somecity should be created

    Then user navigate to country page
    And delete name as "Country96"
    Then Selimcountry should be error

    Then user navigate to city page
    Then delete  cityName as "city96"
    Then Beycity should be deleted

    Then user navigate to country page
    And delete again name as "Country96"
    Then Selimcountry should be successfully deleted