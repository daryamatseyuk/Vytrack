@B30G20-173
Feature: Verification of visibility columns on the Vehicle models page. (web-table)

  @B30G20-162
  Scenario Outline: As a user, I want to view columns on the Vehicle models page. (web-table)
    Given user is on the login page.MD
    When user logs in as a "<role>".MD
    And user selects "Vehicles Model" option in "Fleet" module.MD
    Then user is able to see names below
      | MODEL NAME               |
      | MAKE                     |
      | CAN BE REQUESTED         |
      | CVVI                     |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |
    Examples:
      | role          |
      | sales manager |
      | store manager |

  @B30G20-172
  Scenario: Drivers should not able to access the Vehicle Model page
    Given user is on the login page.MD
    When user logs in as a "driver".MD
    Then user is not able to access the Vehicle Model page and sees the message

      #note: users should see "You do not have permission to perform this action."



