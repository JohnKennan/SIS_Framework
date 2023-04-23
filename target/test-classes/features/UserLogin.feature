Feature: Validate Student User Role Login

  @userLogin
  Scenario: Student User Role Login
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When Login as new user
    Then Validate Student Name
    And  Validate User Name
    #And I will quit the browser // It is done @After in Hooks
