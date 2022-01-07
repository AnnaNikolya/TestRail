Feature: Testing TestRail
  Scenario: Registration on TestRail
    When website is open "https://www.gurock.com/testrail/"
    And for registration click button Try TestRail for Free
    And in the field "Web Address" enter a value ""
    And in the field "First Name" enter a value ""
    And in the field "Last Name" enter a value ""
    And in the field "Your Country" choose a value ""
    And in the field "Work Email" enter a value "estrail@mailinator.com"
    And in the field "Organization" enter a value "OOO"
    And in the field "Expected Users" choose a value "1"
    Then choose input with text "I agree to the TestRail Cloud Terms of Service"
    And click button Create TestRail Trial

  Scenario: Create API key
    Given API key ""
    When open way "https://testrailmailinator.testrail.io/index.php?/mysettings"
    And click on tab "API KEYS"
    And clik on "Add key"
    And input Name ""
    Then click "Generate Key"
    And save key

  Scenario: Create project with mistakes
    When open "https://testrailmailinator.testrail.io/index.php?/dashboard"
    And click button Add Project
    And click button Add Project
    Then mistake "Field Name is a required field."

  Scenario: Create project
    When open "https://testrailmailinator.testrail.io/index.php?/dashboard"
    And click button Add Project
    And in the field "Name" enter a value ""
    And click button Add Project

  Scenario: Create Test Runs
    When open all projects "https://testrailmailinator.testrail.io/index.php?/dashboard"
    And  click Test Runs in created project
    And click button Add Test Run
    And click button Add Test Run

  Scenario: Create, delete project and download chart
    When open "https://testrailmailinator.testrail.io/index.php?/admin/overview"
    And choose tab Projects
    And click button Add Example Project
    And in the field "Name" enter a value ""
    And click button Add Example Project
    Then download chart as an image
    Then Return to Dashboard and detete project