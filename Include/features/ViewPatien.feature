@ViewPatiens
Feature: View Patien
  As a User
	I want to see patien data
  So I can see patien data

  @ViewPatien
  Scenario: view patient data
    Given I have logged in 
    When I click jadwal button
    And I click jadwal kunjungan
    #And I click icon > patien name
    #Then I can see patien data

    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |