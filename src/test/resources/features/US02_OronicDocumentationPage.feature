
Feature:As a user, I should be able to access the Oronic Documentation Page.

Scenario Outline: users should be able to access the Oronic Documentation Page.

Given user is on the page
When user logs in as "<role>"
And user selects "Get help" question mark icon on top pin bar
Then user should be transferred to "Oronic Documentation" page

Examples:
|role         |
|truck drivers|
|store manager|
|sale manager |
