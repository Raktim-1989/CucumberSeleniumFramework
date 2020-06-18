Feature: TestScenario outline validation

Scenario Outline: TestData set validation with multiple set of data Negative testing and Positive testing
Given User navigates the URL 
Then User enters "<username>" and "<password>"
And User clicks on button
Then Login successful
And Browser is closed

Examples:
| username | password |
| 12345    | wrish    | 
| wrishi_1989 | Naj#2025 |

