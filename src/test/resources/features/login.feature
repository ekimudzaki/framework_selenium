Feature: Login

  @smoke
  Scenario: Login successfully
    Given I open Login Page
    When I fill the username with "tomsmith"
    And I fill the password with "SuperSecretPassword!"
    And I click on Login
