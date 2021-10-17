Feature: To test whether google search functionality works as expected


Scenario: To test whether user is able to enter keyword in search box
Given User has to navigate to google site
When user has to click the text box
And User has to enter any text

Scenario: To test whether user is able to enter 'Special characters' in search box
Given User has to navigate to google site
When user has to click the text box
And User has to enter any special characters 

Scenario: Verify that user enter keyword and click 'Search' button fetches desired results
Given User has to navigate to google site
When User has to enter a text in search box
And User has to click on the 'Search' button
Then Searched relevant results must be returned
@mispilled
Scenario: Verify misspilled keyword got corrected automatically and results for correct keyword is displayed
Given User has to navigate back to google site
When User has to enter a misspelt text in search box
And User has to click on the 'Search' button.
Then Searched corrected results must be returned

Scenario: Verify 'No result found' message when user enter invalid keyword
Given User has to enter an invalid keyword
When User has to click on the 'Search ' button
Then 'No result found' page must be displayed

Scenario: Verify the functionality of 'I’m feeling Lucky' search
Given User has to click on 'Google' logo to navigate to main page
When User has to enter a valod text in search bar
Then User has to tap 'I’m feeling Lucky' button
And verify whether desired page is displayed

Scenario: Verify on tapping on 'Gmail' tab navigates to Gmail site
Given User must be at 'Google home page'
When User must tap in 'Gmail' text
Then verify whether user in in gmail site

Scenario: Verify on tapping on 'Sign-in' tab navigates to 'Sign-in' page
Given User must be at 'Google homepage'
When User must tap in 'Sign-in' text
Then verify whether user in in 'Sign-in' page

Scenario: Verify whether other search options works fine
Given User must be in google homepage.
When User must enter any search string
And User must press search tab
And User must tap 'Images' tab
And User must tap 'Shopping' tab
And User must tap 'News' tab
Then User must tap 'Videos' tab
