Feature: Search option functionality

Background: Open the app

Given Navigate to homepage



@search
Scenario: Validate Search feature 

When user enter data into search field
And click on search icon
Then related data should be displayed

@search
Scenario: Verify User navigated to Women Section

When user enter data and click on search option
Then related data should be displayed 
When user select Women section
Then Women related data should be displayed
