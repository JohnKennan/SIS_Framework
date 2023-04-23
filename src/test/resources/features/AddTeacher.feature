Feature: Validate Add New Teacher

  @teacher
  Scenario: Add New Teacher
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When I login as Admin
		And  Click on Add New on staff
		When Add teacher informations
    Then Validate teacher is added
    
    #And I will quit the browser // It is done @After in Hooks
