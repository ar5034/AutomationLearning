Feature: Verify


Background: User is Logged In
Given I navigate to the login page
When I submit username and password
Then I should be logged in


Scenario Outline: Verify Title

Given User opens a website "<website>"
When Website is successfully opened
Then Website has title "<titles>"

Examples:
|website|titles|
|https://www.google.co.in/ | Google|
|https://www.toolsqa.com/ | Tools QA|
|https://www.flipkart.com/ | Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!|
|https://www.amazon.in/ | Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in|
|https://www.myntra.com/ | Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra|




 

Scenario: Search a product and add the first product to the User basket
	Given User search for Lenovo Laptop
	When Add the first laptop that appears in the search result to the basket
	Then User basket should display with added item

Scenario: Navigate to a product and add the same to the User basket
	Given User navigate for Lenovo Laptop
	When Add the laptop to the basket
	Then User basket should display with added item	