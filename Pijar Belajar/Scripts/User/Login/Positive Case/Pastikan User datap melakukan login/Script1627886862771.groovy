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

WebUI.callTestCase(findTestCase('CustomKeyword/Open Browser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CustomKeyword/Nevigate To Url'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Login/Login Email/Page_Pijar Belajar/button_Mulai Belajar'))

WebUI.setText(findTestObject('Login/Login Email/input_Email_email'), email)

WebUI.setText(findTestObject('Login/Login Email/input_Password_password'), password)

WebUI.click(findTestObject('Login/Login Email/button_eyes'))

WebUI.click(findTestObject('Login/Login Email/button_eyes'))

WebUI.click(findTestObject('Login/Login Email/checkbox_ingat'))

WebUI.click(findTestObject('Login/Login Email/button_Masuk'))

