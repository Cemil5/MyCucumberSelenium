Feature: Contacts page

  Scenario: Default page number
    Given the user is on the login page
    And the user enters the driver information
    When the user navigates to "Customers" "Contacts"
    Then default page number should be 1

  @smoke
  Scenario: Verify Create Calendar Event
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendar"

  @smoke @db
  Scenario: Contacts test with email
    Given the user logged in as "sales manager"
    And the user navigates to "Customers" "Contacts"
    When the user clicks on "steven.senger@hotmail.com" from contacts
    Then the information should be same with database

  @wip @db
  Scenario Outline: Contacts test
    Given the user logged in as "sales manager"
    And the user navigates to "Customers" "Contacts"
    When the user clicks on "<email>" from contacts
    Then the information should be same with database

    Examples:
      | email                     |
      | steven.senger@hotmail.com |
      | mbrackstone9@example.com  |