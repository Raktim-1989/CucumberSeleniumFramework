Feature: TestData validation

Scenario: TestData set validation with multiple set of data Negative testing
Given User navigates the URL 
Then User enters "Raktim" and "001"
And User clicks on button
Then Login successful
And Browser is closed

Scenario: TestData set validation with multiple set of data Positive testing
Given User navigates the URL 
Then User enters "wrishi_1989" and "Naj#2025"
And User clicks on button
Then Login successful
And Browser is closed

