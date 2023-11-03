@wipAbdalla
Feature: As a user, I want to learn how to use the pinbar.

  Scenario Outline: when users click the “Learn how to use this space” link on the homepage, users should see:
  #“How To Use Pinbar”  and
  #“Use the pin icon on the right top corner of the page to create fast access link in the pinbar.”
    Given User is logged in as "<role>"
    When User clicks on Learn how to use this space button
    And User clicks on Pin/Unpin the page button
    Then User verifies that the option changed to "How To Use Pinbar"

    Examples:
      | role          |
      | driver        |
      | sales manager |
      | store manager |

  Scenario Outline: users should see an image on the page.
    Given User is logged in as "<role>"
    When User clicks on How to use pinbar button
    Then User verifies that the image soure is "/bundles/oronavigation/images/pinbar-location.jpg"
  #[in automation testing,  just verify the image source.]
  #Expected source:
  #/bundles/oronavigation/images/pinbar-location.jpg
    Examples:
      | role          |
      | driver        |
      | sales manager |
      | store manager |