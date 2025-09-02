Feature: Add employee scenarios

  Background:
     #Given user is navigated to HRMS application
    When user enters username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    When user clicks on add employee option



  @Tudor
  Scenario: Adding one employee
    And user enters firstname middlename and lastname
    And user clicks on save button
    Then employee is added successfully
    And the employee should be added successfully in the database with id "<employeeId>"

    @@params
    Scenario: Adding one employee using params
      And user enters "Nelo" and "ms" and "Jaan"
      And user clicks on save button
      Then employee is added successfully


    @examples
    Scenario Outline: adding multiple employees for data driven testing using examples table
      And user enters "<firstName>" and "<middleName>" and "<lastName>" values
      And user clicks on save button
      Then employee is added successfully
      Examples:
        | firstName  | middleName | lastName |
        |Yousra      |ms          |Jan       |
        |Asif        |mr          |Khan      |
        |Jasor       |ms          |Jaan      |



    @datatable
    Scenario: adding multiple employees using data table
      And user enters firstname middlename and lastname values from data table
        | firstName | middleName | lastName |
        |Yousra     |ms          |Jan       |
        |Asif       |mr          |Khan      |
        |Jasor      |mr          |Jaan      |


    @excel
    Scenario: adding employees using excel
      And user enters multiple employees using excel file

