package hms
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class InsertPatConStep {

	@Given("I have logged in as a doctor")
	def iHaveLoggedInAsADoctor() {
		println name
	}

	@When("I click tambah kondisi pasien button")
	def iClickTambahKondisiPasienButton() {
		println value
	}

	@And("I input (.*) alergi")
	def iInputAlergi(String alergi) {
		println alergi
	}

	@And("I input (.*) condition")
	def iInputCondition(String condition) {
		println condition
	}

	@And("I input (.*) obat")
	def iInputObat(String obat) {
		println obat
	}

	@And("I click simpan button")
	def iClickSimpanButton() {
		println name
	}

	@And("I click ya button for confirm")
	def iClickYaButtonForConfirm() {
		println name
	}
	
	@Then("I see visit schedule")
	def iSeeVisitSchedule() {
		Mobile.tap(findTestObject('Object Repository/VisitSchedule/VisSche001/android.view.View (1)'), 0)
		Mobile.closeApplication()
	}
}