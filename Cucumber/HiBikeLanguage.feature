Feature: Verifyi international language functionality
Scenario: Try to change deafault website language

Given User naviagte to Hibike page
When User select German flag from HIBIKE INTERNATIONAL
Then HiBike website should refresh and shoul be on Germa language

Scenario: Try to change website into spanish language
Given User naviagte to Hibike page
When User select Spanish flag from HIBIKE INTERNATIONAL
Then HiBike website should refresh and shoul be on Spanish language