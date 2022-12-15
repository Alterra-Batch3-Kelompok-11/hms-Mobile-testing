@Logout
Feature: Logout
  As a User
	I want to logout my account
  So I can succses logout account

  @Logout
  Scenario: Logout account
    Given I have logged in
    When I click account button
    And I click button keluar
    Then I can succes logout

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |