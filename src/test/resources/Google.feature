Feature: Google Testing
Background:
Given I open a google website

Scenario: Google a text


When I search Topic "Selenium"
Then Search result displayed
And I launch website with title "SeleniumHQ Browser Automation"


Scenario Outline: Google a text


When I search Topic "<Topic>"
Then Search result displayed
And I launch website with title "<Title>"
Examples:
| Topic    | Title |
| Selenium | SeleniumHQ Browser Automation |
| Java     | Java                          |


Scenario: Google a text


When I search for Topic
| Topic    | Title |
| Selenium | SeleniumHQ Browser Automation |
| Java     | Java |
Then Search result displayed



