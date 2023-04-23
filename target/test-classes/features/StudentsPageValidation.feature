Feature: Students Page Validation

  @students
  Scenario: Students Page Validation
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When I login as Admin
    And  I proceed to Students tab
    Then I compare actual tabs with our data table
      | Parental |
      | Academic |
      | Override Final Grade |
      |Schedule|
      |Discipline Stats|
      |Personal 2|
      |Enrollment|
      |Notes|
      |E-Portfolio|
      |Program Enrollment|
    #And I will quit the browser // It is done @After in Hooks
