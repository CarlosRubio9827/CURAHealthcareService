

@Suite @Login
Feature: CP01 - Validate login
  Background: Validate login
    Given the user navigates to the website
    And clicks on Make Appointment
  @ValidCredentials
  Scenario: 1 - Validate with correct credentials
    When the user enters valid credentials
    Then the system should display the appointment form
  @InvalidCredentials
  Scenario: 2 - Validate with incorrect credentials
    When the user enters invalid credentials
    Then the system displays an error message