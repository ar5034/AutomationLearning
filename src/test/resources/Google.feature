Feature: Google Testing

Scenario: Google a text

Given I open a google website
When I search Topic "Selenium"
Then Search result displayed
And I launch website with title "SeleniumHQ Browser Automation"


Scenario Outline: Google a text

Given I open a google website
When I search Topic "<Topic>"
Then Search result displayed
And I launch website with title "<Title>"
Examples:
| Topic    | Title |
| Selenium | SeleniumHQ Browser Automation |
| Java     | Java                          |

@DataTable
Scenario: Google a text

Given I open a google website
When I search for Topic
| Topic    | Title |
| Selenium | SeleniumHQ Browser Automation |
| Java     | Java |
Then Search result displayed
