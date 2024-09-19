Feature: Logging in to the pet store
           As a pet store customer
           They want to log in to the system
           So that they can access their account and make a purchase


  Scenario: Log in to the pet store
    Given they are on the pet store homepage
    When they log in to the store
    Then they should see the "Welcome" message