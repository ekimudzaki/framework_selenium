@smoke
Feature: Welcome Page slider


  @slider
  Scenario: Slide successfully
    Given I open App
    Then I slide it 3 times
    Then I click "Let's Get Started" button
    And I see HomePage