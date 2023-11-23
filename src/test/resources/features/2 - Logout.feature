@Suite @Logout
Feature: CP02 - Validate Successful Logout
  Background: User Authentication
      Given the user navigates to the website
      And clicks on Make Appointment
      When the user enters valid credentials
    Scenario: 1 - Validate that the user logs out successfully
      Given the system should display the appointment form
      When the user logs out
      Then the system displays the login page