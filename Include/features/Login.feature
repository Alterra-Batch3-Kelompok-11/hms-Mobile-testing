@Logins
Feature: Login
	As a user
	I want to login
  So I can access my dashboard

  @Login
  Scenario Outline: Login account
    Given I am on the app page
    When I input <licnum> license number and <sandi> sandi
    And I click masuk button
    Then I verify the <status> in step

    Examples: 
      | licnum  | sandi | status  |
      | 1029384756 | john123 | success |
      | 1029384756 | john12 | fail |
      | 102938475 | john123 | fail |
      | 102938475 | john12 | fail |
      | 1029384756 |  | fail |
      |  | john123 | fail |
      | | | fail |
      
  #Scenario: Login click remember me
    #Given I am on the app page
    #When I input license number
    #And I input sandi
    #And I click remember me
    #And I click masuk button
    #Then I see my dashboard
    #
  #Scenario: Login after click remember me
    #Given I succes login with remember me
    #When I click masuk button
    #Then I see my dashboard