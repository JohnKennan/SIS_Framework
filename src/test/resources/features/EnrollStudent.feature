Feature: Validate Enroll Student functionality and "Enrollment" Tab

  @enrollStudent
  Scenario: Enroll Student Functionality
    #Given I navigated to the HRM website // It is done @Before in Hooks
    When I login as Admin
    And  I proceed to Students tab
    When Change the status
		And  Find the student created
		And  Click on Enroll and Fill out more
    Then Validate status is Enrolled
    #And I will quit the browser // It is done @After in Hooks
