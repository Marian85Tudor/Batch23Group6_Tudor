Feature: Search Employee

  Background:
   # Given user is navigated to HRMS application
    When user enters username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on employee list option

  @smoke @validID
  Scenario: Search employee by valid ID
    When user enters valid employee id "74862476"
    And user clicks on search button
    Then user should be able to see employee details
    And the exact employee record with id "74862476" should be displayed

  @smoke @invalidID
  Scenario: Search employee by invalid ID
    When user enters valid employee id "00255444"
    And user clicks on search button
    Then user should see the no records found message

  @smoke @fullName
  Scenario: Search employee by full name
    When user enters valid employee name "Asif Jan"
    And user clicks on search button
    Then user should be able to see employee details

  @smoke @partialName
  Scenario: Search employee by partial name
    When user enters partial employee name "Asi"
    And user clicks on search button
    Then user should be able to see employee details
    And user should see multiple matching employee records

  @smoke @nameWithCapitalization
  Scenario: Search employee by name with different capitalization
    When user enters employee name with different capitalization "ASIF JAN"
    And user clicks on search button
    Then user should be able to see employee details

  @smoke @noExistingName
  Scenario: Search employee by non-existing name
    When user enters valid employee name "Nonexistent Name"
    And user clicks on search button
    Then user should see the no records found message