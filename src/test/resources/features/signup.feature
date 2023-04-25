@signup
  Feature: Sign up module testing
    Scenario Outline: Signup using valid email
      Given user open sign up page
      And user insert <email>
      Then user fill in <password>
      And user should see <message> on strength bar and verify sign up button is <btnStatus>
      Then user should be able to click sign up
      And user input all required fields
      Then user click on start using autobahn button
    Examples:
      | email                   | password       | message     | btnStatus |
#      | jcoupkpdo@bugfoo.com    | Sekolah4n      | Weak        | disabled  |
#      | jflamn@bugfoo.com       | Sekolah4n.     | Average     | disabled  |
#      | jflamn@bugfoo.com       | Sekolah4n.a    | Strong      | enabled   |
      | fnkattkmhuis@bugfoo.com | Sekolah4n.auto | Very Strong | enabled   |