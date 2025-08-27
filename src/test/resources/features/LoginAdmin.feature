@scenario
Feature: Login functionality

  Scenario: Successful login
    Given User is on the HRMS application
    When user enters username and password
    When User enters valid credentials
    Then User should be redirected to the dashboard
