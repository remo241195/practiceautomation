Feature: feature to test the googlesearch fuctionlity

  Scenario: validate  googlesearch is working or not
    Given Browser is open
    And user is on google search page
    When user enters a text in searchbox
    And hits enter
    Then user is navigated to results
