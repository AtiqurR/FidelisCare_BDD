Feature: Log In Validation

  Scenario: Verify Invalid credentials to log in
    Given user should be on fideliscare home page
    When user move cursor to log in tab and click
    Then user click on member online portal
    And user should enter invalid username
    And user should enter invalid password
    And user click on login button
    Then the log in failed

    
