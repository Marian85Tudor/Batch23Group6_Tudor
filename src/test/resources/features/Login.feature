Feature: Login Functionality

  @test @regression @khan
  Scenario: Valid admin login
    When user enter username and password
    And user click on login button
    Then user is successfully logged in