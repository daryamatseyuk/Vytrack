Feature: Verification of visibility columns on the Vehicle models page. (web-table)

  @wipDasha
  Scenario Outline: As a user, I want to view columns on the Vehicle models page. (web-table)
    Given user is on the login page
    When user logs in as a "<role>"
    And user selects "Vehicles Model" option in "Fleet" module
    Then user is able to see modules below
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
      #| store manager |



