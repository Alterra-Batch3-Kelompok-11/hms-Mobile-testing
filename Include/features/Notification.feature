@Notification
Feature: Notification
  As a User
	I want to see all notification
  So I can see all notification

  @Notification
  Scenario: Notification
    Given I have logged in
    When I click bell icon 
    Then I see all notification

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |