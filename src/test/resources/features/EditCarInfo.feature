@B30G20-175
Feature: Default


	@B30G20-174

	Scenario Outline: Edit car info for all users
		Given user logs in as "<role>"
		When user selects "Vehicles" option from "Fleet" module
		And user hovers over 3 dots"..."
		Then user is able to see following icons
			| View   |
			| Edit   |
			| Delete |

		Examples:
			| role          |
			| store manager |
			| sales manager |
			| driver        |
