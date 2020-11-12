Feature: Boundary Value Analysis & Equivalence Partitioning

Scenario: Try to add negative number into quantity field

Given User navigate to the HiBike home page
When User navigate to the Bicycles main menu and select from menu
And User select product from  submenu
And User configure options for his product
Then User into the quantity field types negative number 
Then User procced by clicking on add to cart button


Scenario: Try to add fourdigital number into quantity field
Given User navigate to the HiBike home page
When User navigate to the Bicycles main menu and select from menu
And User select product from  submenu
And User configure options for his product
Then User into the quantity field types fourdigital number 
Then User procced by clicking on add to cart button

Scenario: Try to add different simbols into quantity field
Given User navigate to the HiBike home page
When User navigate to the Bicycles main menu and select from menu
And User select product from  submenu
And User configure options for his product
Then User into the quantity field types simbols
Then User procced by clicking on add to cart button

