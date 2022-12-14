#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Patcon
Feature: Patient condition
  As a User
	I want to insert patien condition
  so the patient condition was successfully added

  @Patcon
  Scenario Outline: Insert patien condition
    Given I have logged in as a doctor
    And I click jadwal button
    And I click jadwal kunjungan
    And I click icon > on the nama pasien
    When I click tambah kondisi pasien button
    And I input alergi <alergi>
    And I input condition <condition>
    And I input obat <obat>
    And I click simpan button
    And I click ya button for confirm
    Then I verify the <status> in step

    Examples: 
      | alergi  | condition | obat | status  |
      | name1 |     batuk | obh |success |
      | name2 |     7 | Fail    |