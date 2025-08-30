Feature: Create Login Details for Employee in HRMS

  Scenario: Admin creates login details for a new employee
    Given the admin is logged in to the HRMS application
    And the admin navigates to "Add Employee" page
    When the admin enters "Tudor" in the First Name field
    And the admin enters "Marian" in the Last Name field
    And the admin checks "Create Login Details"
    And the admin enters "TudorMarian" in the User Name field
    And the admin enters "Hum@nhrm123" in the Password field
    And the admin re-enters "Hum@nhrm123" in the Confirm Password field
    And the admin selects "Enabled" from Status dropdown
    And the admin clicks on "Save"
    Then the system should save the employee details
    And the new employee "TudorMarian" should be able to log in with "Hum@nhrm123"