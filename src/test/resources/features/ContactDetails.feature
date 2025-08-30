@contactDetails
Feature: Edit Contact Information

  As an employee (ESS user)
  I want to be able to edit my contact information within the HRMS application
  So that my contact details remain current and accurate

  Background:
    Given the employee is logged into the HRMS application
    And the employee navigates to the contact details page

  @Nelo @editContactDetails
  Scenario: Successfully edit contact information
    When the employee updates the contact information with the following details:
      | Address Street 1  | Address Street 2  |city      |State |Zip Code |Country      |Home Phone   |Mobile Phone |Work Phone   |Work Email             |Other Email  |
      | 150 Main Street   | Apt 8B            |Portland  |Maine |10089    |United States|555-125-5867 |555-687-7543 |555-555-5555 |jasor.khan@company.com |jasor.khan@gmail.com |

    And the employee clicks the save button
    Then the contact information should be successfully saved
