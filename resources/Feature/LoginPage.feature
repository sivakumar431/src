Feature: Title of your feature

  Scenario: Verify the Login Functionality_001
    Given User is on the Login Page
    When I enter username as "Admin"
    And I enter password as "admin123"
    And I click on Login button
    Then I validate user is on dashboard page
    
    Scenario: Verify the Login Functionality_002
    Given User is on the Login Page
    When I enter username as "Admin123"
    And I enter password as "admin123"
    And I click on Login button
    Then I validate user is on dashboard page
    
    Scenario: Verify the Login Functionality_003
    Given User is on the Login Page
    When I enter username as "Admin"
    And I enter password as "admin"
    And I click on Login button
    Then I validate user is on dashboard page
    
    Scenario: Verify the Login Functionality_004
    Given User is on the Login Page
    When I enter username as ""
    And I enter password as ""
    And I click on Login button
    Then I validate user is on dashboard page