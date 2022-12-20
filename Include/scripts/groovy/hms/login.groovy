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



class login {

	@Given("I am on the app page")
	def iAmOnTheAppPage() {
		Mobile.startApplication('C:\\Users\\ACER\\Documents\\Capston_Proyek\\app-release.apk', true)
	}

	@When("I input (.*) license number and (.*) sandi")
	def iInputLisensiAndSandi(String licnum, String sandi) {
		Mobile.tap(findTestObject('Object Repository/ViewPatien/ViPat002/android.widget.EditText - Nomor Lisensi'), 0)

		Mobile.sendKeys(findTestObject('Object Repository/ViewPatien/ViPat002/android.widget.EditText - Nomor Lisensi (1)'), '09218764365')

		Mobile.tap(findTestObject('Object Repository/ViewPatien/ViPat002/android.widget.EditText - Sandi'), 0)

		Mobile.sendKeys(findTestObject('Object Repository/ViewPatien/ViPat002/android.widget.EditText - Sandi (1)'), 'ytta123')
	}

	@And("I click masuk button")
	def iClickMasukButton() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button'), 0)
	}

	@Then("I verify the (.*) in step")
	def iVerifyTheStatusInStep(String status) {
		Mobile.tap(findTestObject('Object Repository/Login/login003/android.view.View'), 0)
	}
}