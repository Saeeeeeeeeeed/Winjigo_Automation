Feature: User Login
  I want to check that user can Login successfully on website.

  Scenario: User Login
    Given the user is on Login Page
    When I entered "<Username>", "<Password>"
    And click on Login button
    And click on courses button
    And click on add course button
    And enter "<coursename>"
    And select garde from drop list
    And select teacher form drop list
    And click on create button
    Then course added successfully

    Examples:
    | Username | Password | coursename |
    | testregister@aaa.com | Wakram_123 | Automation_Cucumber |