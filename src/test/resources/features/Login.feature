@login
Feature: Login

  Scenario: User tap login button without inserting email & password
    Given I open App
    Then I slide it 3 times
    Then I click "Let's Get Started" button
    And I see HomePage
    Given User tap "Account" on HomePage
    Then User tap sign in on AccountPage
    When I tap login button on AccountPage
    And User will see "Please enter email address." on AccountPage

  Scenario: User tap login button without password
    Given User tap "Account" on HomePage
    Then User tap sign in on AccountPage
    Then User insert email with "email@gmail.com"
    When I tap login button on AccountPage
    And User will see "Please enter password." on AccountPage