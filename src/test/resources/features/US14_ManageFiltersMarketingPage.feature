Feature: Managing filters on the Marketing Page

  @wipDasha
  Scenario Outline:
    Given user is on the login page. Dasha
    When user logs in as a "<role>". Dasha
    Then user selects "Marketing" option in "Campaigns" module. Dasha
    Then user clicks on the filter button. Dasha
    And clicks on the manage filters button. Dasha
    Then user is able to see options below checked by default. Dasha
      | Name       |
      | Code       |
      | Start Date |
      | End Date   |
      | Budget     |
    Examples:
      | role          |
      | sales manager |
      | store manager |