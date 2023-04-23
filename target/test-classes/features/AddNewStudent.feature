Feature: Validate Add New Student Functionality

  @studentAdd
  Scenario: Add New Student Functionality
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When I login as Admin
    And  I proceed to Students tab
    And  Click on Add New button
    When  I add new students informations
    And  I submit changes
    And I accept the alert
    Then I validate student is created
    
    #And I will quit the browser // It is done @After in Hooks
