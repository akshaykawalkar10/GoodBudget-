Feature: Login

  Scenario: To verify login with valid user
    Given I launch the app
    And I tap on the login button
    And I enter the "akshay@test.com" in the email field
    And I enter the "12345678" in the password field
    When I tap on the loginTo button
    Then I should verify user name as "akshay"

  Scenario: To verify logout functionality
    Given I tap on settings icon
    And I tap on the settings button
    When I tap on the logout button
    And I tap on the ok button
    Then I should verify login button