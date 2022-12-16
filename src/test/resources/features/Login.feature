@feature.login @regression
Feature: Login
  Background:
    Given I open web portalpasti AHM
    When I fill in "m.dummy.b1" as username

  @login.sukses @sanity
  Scenario: Login Successfully
    Then I fill in "Honda2020!" as password
    And I click login button
    And I should see "Announcement" text

  @smoke @sanity
  Scenario: Login failed using invalid password
    Then I fill in "Honda" as password
    And I click login button
    And I should see "Invalid username / passwords" text

#  Scenario Outline: Login scenario
#    Then I fill in "<password>" as password
#    And I click login button
#    And I should see "<textValidation>" text
#    Examples:
#      | password     | textValidation              |
#      | Honda2020!!! | Announcement                |
#      | password     | Invalid username / password |


