@VisHis
Feature: Visit history
  As a User
	I want to see visit history data
  So I can see all visit history

  @VisHis
  Scenario: Visit history
    Given I have logged in
    When I click riwayat button
    Then I can see all visit history

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |