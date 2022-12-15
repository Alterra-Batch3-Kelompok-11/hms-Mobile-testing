@ConHis
Feature: Consent history
  As a User
	I want to see consent history data
  So I can see consent history

  @ConHis
  Scenario: Consent history
    Given I have logged in
    When I click riwayat button
    And I click riwayat persetujuan 
    Then I see consent history

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |