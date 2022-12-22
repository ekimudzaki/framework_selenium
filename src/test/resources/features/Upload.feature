@upload
Feature: Upload file
  Scenario: User sucessfully uploaded file
    Given I open upload page
    When I choose file
    Then I click upload
    And I should see file