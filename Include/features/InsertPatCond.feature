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
    And I click icon > patien name
    When I click tambah kondisi pasien button
    And I input <alergi> alergi
    And I input <condition> condition
    And I input <obat> obat
    And I click simpan button
    And I click ya button for confirm
    Then I verify the <status> in step

    Examples: 
      | alergi  | condition | obat | status  |
      | tidak ada | hidung mampet dan tenggerokan sakit | mixagrip |successipc |
      |  | hidung mampet dan tenggerokan sakit | mixagrip | failipc |
      | tidak ada | hidung mampet dan tenggerokan sakit |  | failipc |
      | tidak ada |  | mixagrip | failipc |
    
  @VisSche    
  Scenario: Visit schedule
    Given I have logged in
    When I click jadwal button
    And I click jadwal kunjungan
    Then I see visit schedule
         