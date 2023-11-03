@B30G20-184
Feature:As a user, I should be able to access the Oronic Documentation Page.
  @B30G20-164
  Scenario Outline: users should be able to access the Oronic Documentation Page.

    Given User is logged in as "<role>"
    When user selects Get help question mark icon on top pin bar
    Then user should be able to see "https://doc.oroinc.com/" page

    Examples:
      | role          |
      | driver        |
      | store manager |
      | sales manager  |
