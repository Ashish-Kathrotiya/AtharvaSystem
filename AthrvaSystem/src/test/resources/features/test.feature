Feature: Validate all available links on Given page

Scenario: validate links are redrect properly

	Given User launch the URL 
	And User fatch the list of all avalible links
	When user hit that link System should prompt valid status code
#	Then user verify the status code 
