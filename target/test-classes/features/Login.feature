Feature: Login Functionality

  @smoke @regression @login
  Scenario: Valid Admin Login
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When I enter a valid username
    And I enter a valid password
    And I select the academic year
    And I click on the login button
    Then I validate that I am logged in
    #And I will quit the browser // It is done @After in Hooks


#  @regression @login
#  Scenario: Invalid Password
    #Given I navigated to the HRM website
#    When I enter a valid username
#    And I enter an invalid password
#    And I select the academic year
#    And I click on the login button
#    Then I validate that Invalid Credentials is displayed 
    #And I will quit the browser