Feature: Validate Add Parent Details

  @parent
  Scenario: Add Parent Details
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When I login as Admin
    And  I proceed to Students tab
    And  Find the student created
    And  Proceed to Parental tab
    When Add primary parent
    And  Add secondary parent
    Then Validate Parents added
    
    #And I will quit the browser // It is done @After in Hooks
