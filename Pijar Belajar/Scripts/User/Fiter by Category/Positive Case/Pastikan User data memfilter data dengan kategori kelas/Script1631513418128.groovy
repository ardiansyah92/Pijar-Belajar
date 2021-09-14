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

WebUI.callTestCase(findTestCase('User/Login/Positive Case/Pastikan User datap melakukan login'), [('email') : 'yandi@yopmail.com'
        , ('password') : '12345678'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Top Menu/button_kategori'))

WebUI.click(findTestObject('Top Menu/a_SMA - Kelas 12 IPA'))

WebUI.click(findTestObject('Top Menu/button_kategori'))

WebUI.click(findTestObject('Top Menu/a_SD - Kelas 5'))

WebUI.click(findTestObject('Mulai Belajar/p_Buku Diknas'))

WebUI.click(findTestObject('Mulai Belajar/button_Video Pembahasan Bank Soal'))

WebUI.click(findTestObject('Mulai Belajar/button_Bank Soal'))

WebUI.click(findTestObject('Mulai Belajar/button_E-Book'))

WebUI.click(findTestObject('Mulai Belajar/tombol_tampilkan'))

WebUI.click(findTestObject('Mulai Belajar/li_40'))

WebUI.click(findTestObject('Mulai Belajar/tombol_tampilkan'))

WebUI.click(findTestObject('Mulai Belajar/li_60'))

WebUI.click(findTestObject('Mulai Belajar/div_Pendidikan Agama Islam'))

