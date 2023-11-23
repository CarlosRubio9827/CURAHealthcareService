@Suite @MakeAppointment
Feature: CP03 - Validate Appointment Booking
    Background: User Authentication
      Given the user navigates to the website
      And clicks on Make Appointment
      When the user enters valid credentials
  @MakeAppointmentTokyoMedicare
  Scenario: 1 - Book an appointment in Tokyo - Medicare
    And the user selects the facility "Tokyo"
    And selects hospital readmission
    And selects the healthcare program "Medicare"
    And selects the visit date "27/12/2023"
    And adds comments "Basic comment"
    And clicks the submit button
    Then the system displays the appointment confirmation

  @MakeAppointmentSeoulMedicaid
  Scenario: 2 - Book an appointment in Seoul - Medicaid
    And the user selects the facility "Seoul"
    And selects hospital readmission
    And selects the healthcare program "Medicaid"
    And selects the visit date "27/12/2023"
    And adds comments "Formatted comment with additional details: [Details]"
    And clicks the submit button
    Then the system displays the appointment confirmation

  @MakeAppointmentHongkongNoneNoComment
  Scenario: 3 - Book an appointment in Hong Kong - None
    And the user selects the facility "Hong Kong"
    And selects hospital readmission
    And selects the healthcare program "None"
    And selects the visit date "27/12/2023"
    And adds comments "This is a long and detailed comment providing additional information about the appointment booking. It includes multiple lines to express important details."
    And clicks the submit button
    Then the system displays the appointment confirmation
