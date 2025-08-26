Feature: Search Employee


  Background:

    When user enter username and password
    And user click on login button
    Then user is successfully logged in
    When user click on PIM option
    And user click on employee list option

  @test @regression
  Scenario: Search employee by ID
    When user enter valid employee id
    And user click on search button
    Then user should be able to see employee details


  @test @regression
  Scenario: Search employee by name
    When user enter valid employee name
    And user click on search button
    Then user should be able to see employee details