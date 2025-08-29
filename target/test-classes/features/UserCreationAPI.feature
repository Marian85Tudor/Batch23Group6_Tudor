Feature: User Creation API
  As a system administrator
  I want to create users through the API
  So that I can manage user accounts programmatically

  @api
  Scenario: Successfully create a new user with valid details
    Given the user creation API endpoint is available
    When I send a POST request with valid name, email, and password
    Then the response status should be 201
    And the response should contain "Message": "User Created"
    And the response should include the user's details

  @api @negative
  Scenario Outline: Attempting to create a user with invalid data
    Given the user creation API endpoint is available
    When I send a POST request with <scenario>
    Then the response status should be <expected_status>
    And the response should contain the message "<expected_message>"

    Examples:
      | scenario                                    | expected_status | expected_message                                           |
      | an email that already exists                | 200             | The email address you have entered is already registered   |
      | an email with an invalid format            | 400             | Invalid Email                                              |
      | a missing password field                    | 400             | Please fill all inputs                                     |
      | a missing name field                        | 400             | Please fill all inputs                                     |
      | an empty password field                     | 400             | Please fill all inputs                                     |
      | an empty name field                         | 400             | Please fill all inputs                                     |