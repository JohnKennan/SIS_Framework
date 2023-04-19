Feature: Students Page Validation

  @students
  Scenario: Students Page Validation
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When I login as Admin
    And  I proceed to Students tab
    Then I get all tabs into a List of WebElements and compare them
#    And  I validate all tabs contains expected List of WebElements

    #And I will quit the browser // It is done @After in Hooks
