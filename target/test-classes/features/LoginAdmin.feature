Feature: Adding an Employee to the HRMS Application

  Background:
    Given Admin is logged into HRMS with username "Admin" and password "Hum@nhrm123"


    @EmpId
  Scenario: Add employee without Employee ID (system generates ID automatically)
    When admin adds a new employee with first name "Tudor", middle name "ms", and last name "Marian" without Employee ID
    Then the employee is successfully added with an auto-generated Employee ID
    And the database contains a record for "Tudor" "Marian"
     @EmpId
  Scenario: Add employee with a specified Employee ID
    When admin adds a new employee with first name "Tudor", middle name "mt", last name "Marian" and Employee ID "38243571"
    Then the employee is successfully added with Employee ID "38243571"
    And the database contains a record for "Tudor" "Marian"


  @user @user1
  Scenario: Adding the employee by firstname middle name and lastname
  without employee ID
    When user clicks on PIM option
    And user clicks on Add employee option
    And user enters firstname middle name and lastname
    And user clicks on save button
    And user generates a unique employee ID
    Then employee added successfully

  @user @user2
  Scenario: Adding the employee by firstname middle name and lastname
  with employee ID
    When user clicks on PIM option
    And user clicks on Add employee option
    And user enters firstname middle name and lastname
    And user enters employee ID
    And user clicks on save button
    Then employee added successfully with the provided employee ID

  @user @user3
  Scenario: Adding employee without mandatory fields
    When user clicks on PIM option
    And user clicks on Add employee option
    And user leaves firstname or lastname empty
    And user clicks on save button
    Then user should see an error message indicating mandatory fields are required