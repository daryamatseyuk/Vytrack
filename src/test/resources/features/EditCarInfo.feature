@B30G20-175
Feature: Default


	@B30G20-174
	Scenario Outline: Edit car info for managers
		Given user logs in as "<role>"
				When user selects "Vehicles" option from "Fleet" module
				And user hovers over 3 dots"..."
				Then user  sees 3 icons:
					| eye    |
					| pencil |
					| trash  |
		
				Then user is able to read "view,edit,delete" when he hovers over each icon respectively:
		
					| View   |
					| Edit   |
					| Delete |
		
				Examples:
					| role          |
					| store manager |
					| sales manager |	


	@B30G20-188
	Scenario: Edit car info for drivers
		Given user logs in as driver
				When user selects "Vehicles" option from "Fleet" module
				And user hovers over 3 dots"..."
				Then user  sees 3 icons:
					| eye    |
					| pencil |
					| trash  |
		
				Then user is able to read "view,edit,delete" when he hovers over each icon respectively:
		
					| View   |
					| Edit   |
					| Delete |