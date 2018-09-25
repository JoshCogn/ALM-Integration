#Auto generated Octane revision tag
@TID1001REV0.2.0
Feature: Credit Card Payement
Users can purchase products using a credit card

Background: User is logged in
And User has items in cart

Scenario Outline: Payment with valid credit card details
	Given User is on cart page
    When User enters checkout page
    And User enters name "<name>"
    And User enters number "<number>"
    And User enters expiry date "<expire_date>"
    And User clicks Send
    Then Payment is successful
    
    Examples:
    | name | number | expire_date |
    | John | 1234 | 04.19 |
    | Matt | 3322 | 06.20 |