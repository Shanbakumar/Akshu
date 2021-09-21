Feature: Test Login functionality

  Scenario Outline: Check login is successful with valid credencial
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And hit login button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | Raghav   |    12345 |
