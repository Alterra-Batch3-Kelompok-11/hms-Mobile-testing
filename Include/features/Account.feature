@Account
Feature: Account
  As a User
	I want to see profile data
  So I can see profile data

  @Account
  Scenario: Account profile
    Given I have logged in
    When I click account button
    Then I can see profile data

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |