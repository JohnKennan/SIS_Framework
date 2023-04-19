Feature: Homepage Validation

  @homepage
  Scenario: Login and Homepage Validation
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When I login as Admin
    Then I validate that Announcement visible
    And  I validate that logo visible
    And  I validate that url includes "MainPage.aspx"
    #And I will quit the browser // It is done @After in Hooks
