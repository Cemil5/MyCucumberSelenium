Feature: Login as different users

  Scenario: login with given user
    Given the user is on the login page
    When the user logs in using "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

  Scenario: Menu Options for Driver
    Given the user logged in as "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  Scenario: Menu Options for Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |



  Scenario: Login as a given user
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | John        |
      | lastname  | Doe         |
    Then the user should be able to login


  Scenario Outline: Login as a given user <user>
    Given the user is on the login page
    When the user logs in using following credentials
      | username  | <user>      |
      | password  | UserUser123 |
      | firstname | <firstName> |
      | lastname  | <lastName>  |
    Then the user should be able to login
    Examples:
      | user   | firstName | lastName |
      | user10 | John      | Doe      |


     #homework

  Scenario: login with any user type
    Given the user logged in as "driver"
    Then the user should be able to login
    And the title contains "Dashboard"
    #driver,storemanager,salesmanager
   #you will have one step definition and it will handle different usertypes