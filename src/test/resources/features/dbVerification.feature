Feature: Updating contact detail from UI and verifying from DB

  @db
  Scenario: Contact test with email
    Given the user logged in as "sales manager"
    And the user navigates to "Customers" "Contacts"
    And the user updates one contact details
    Then verify same data has been modified at the DB
