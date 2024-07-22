Feature: Signup functionality
  Scenario Outline: Valid Signup
    Given I read data from excel row number <row number>
    Given I setup the new browser
    And I enter required Personal details
    Then I verify form is filled
    Then I take screenshot
    Then I close the new browser
    Examples:
      |row number  |
      |0           |