Feature: Testing TestRail
  Scenario: Check valid login and password values
    When website is open "https://secure.gurock.com/customers/auth/login/"
    And in the field "Username" enter a value "estrail@mailinator.com"
    And in the field "Password" enter a value "ynzw.9k5ExGykFvlCOzf"
    And click button "Login"
    Then check the site address is "https://testrailmailinator.testrail.io/"
