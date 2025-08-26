Feature: Add employee scenarios

  Background:

    When user enter username and password
    And user click on login button
    Then user is successfully logged in
    When user clicks on PIM option
    When user clicks on add employee option

  @test
  Scenario: Adding one employee
    And user enter firstname middlename and lastname
    And user click on save button
    Then employee is added successfully


  @params
  Scenario: Adding one employee using params
    And user enter "lana" and "ms" and "smith"
    And user click on save button
    Then employee is added successfully


  @examples
  Scenario Outline: adding multiple employees for data driven testing using examples table
    And user enters "<firstName>" and "<middleName>" and "<lastName>" values
    And user clicks on save button
    Then employee is added successfully
    Examples:
      | firstName | middleName | lastName  |
      | Tudor     | ms         | Marian    |
      | Nelofar   | ms         | Karimzada |
      | Yasemin   | ms         | Abrantes  |
      | Yaroslav  | ms         | Zaderaka  |


  @datatable
  Scenario: adding multiple employees using data table
    And user enters firstname middlename and lastname values from data table
      | firstName | middleName | lastName  |
      | Tudor     | ms         | Marian    |
      | Nelofar   | ms         | Karimzada |
      | Yasemin   | ms         | Abrantes  |
      | Yaroslav  | ms         | Zaderaka  |


