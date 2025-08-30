@contactDetails
Feature: Edit Contact Information

  As an employee (ESS user)
  I want to be able to edit my contact information within the HRMS application
  So that my contact details remain current and accurate

  Background:
    Given the employee is logged into the HRMS application
    And the employee navigates to the contact details page

  @Nelo1 @editContactDetails
  Scenario: Successfully edit contact information
    When the employee updates the contact information with the following details:
      | Address Street 1  | Address Street 2  |city      |State|
      | 150 Main Street   | Apt 8B            |Portland  |Maine|

    And the employee clicks the save button
    Then the contact information should be successfully saved
    And the success message should be displayed

  @Nelo @editContactDetailsPartial
  Scenario: Edit only some contact information fields
    When the employee updates the following contact information:
      | Field        | Value         |
      | Mobile Phone | 555-999-8888  |
      | City         | Boston        |
    And the employee clicks the save button
    Then the contact information should be successfully saved
    And the success message should be displayed