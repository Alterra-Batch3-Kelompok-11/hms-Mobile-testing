import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\ACER\\Documents\\Capston_Proyek\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Login/Login002/android.widget.EditText - Nomor Lisensi'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Login/Login002/android.widget.EditText - Nomor Lisensi (1)'), '1234567893')

Mobile.tap(findTestObject('Object Repository/Login/Login002/android.widget.EditText - Sandi'), 0)

Mobile.sendKeys(findTestObject('Object Repository/Login/Login002/android.widget.EditText - Sandi (1)'), 'melati123')

Mobile.tap(findTestObject('Object Repository/Login/Login002/android.widget.Button'), 0)

Mobile.getText(findTestObject('Object Repository/Login/Login002/android.view.View'), 0)

Mobile.closeApplication()

