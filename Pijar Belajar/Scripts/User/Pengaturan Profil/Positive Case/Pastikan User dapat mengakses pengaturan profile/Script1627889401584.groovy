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

WebUI.focus(findTestObject('Top Menu/button_Berlangganan Sekarang_hidden mdflex p-2 hoverbg-black-200 bg-black-200 flex items-center justify-center rounded-lg'))

WebUI.click(findTestObject('Top Menu/span_Pengaturan Profil'))

WebUI.click(findTestObject('Pengaturan Profil/button_Pilih Foto'))

WebUI.uploadFile(findTestObject('Pengaturan Profil/Page_Pijar Belajar/button_Ubah Password_absolute ml-12 my-16 w-7 h-7 mb-2 inline-flex items-center justify-center rounded-full bg-white flex-shrink-0 shadow-md'), 
    file)

WebUI.click(findTestObject('Pengaturan Profil/button_Ubah Foto'))

WebUI.click(findTestObject('Pengaturan Profil/button_Hapus'))

WebUI.sendKeys(findTestObject('Pengaturan Profil/input_Nama Lengkap_fullname'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Pengaturan Profil/input_Nama Lengkap_fullname'), 'Pijar Belajar')

WebUI.sendKeys(findTestObject('Pengaturan Profil/input_Nama Panggilan_shortName'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Pengaturan Profil/input_Nama Panggilan_shortName'), 'Pijar Belajar Edit')

WebUI.sendKeys(findTestObject('Pengaturan Profil/input_Sekolah_schoolName'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Pengaturan Profil/input_Sekolah_schoolName'), 'QA Sekolah')

WebUI.sendKeys(findTestObject('Pengaturan Profil/input_Nomor Handphone_phone'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('Pengaturan Profil/input_Nomor Handphone_phone'), '8999111122')

WebUI.click(findTestObject('Pengaturan Profil/input_Tanggal Lahir_birthday-month-picker'))

WebUI.click(findTestObject('Pengaturan Profil/span_Februari'))

WebUI.click(findTestObject('Pengaturan Profil/input_Tanggal Lahir_birthday-year-picker'))

WebUI.click(findTestObject('Pengaturan Profil/span_2020'))

WebUI.click(findTestObject('Pengaturan Profil/input_Tanggal Lahir_birthday-date-picker'))

WebUI.click(findTestObject('Pengaturan Profil/span_28'))

WebUI.click(findTestObject('Pengaturan Profil/label_Wanita'))

WebUI.click(findTestObject('Pengaturan Profil/button_Simpan'))

WebUI.click(findTestObject('Pengaturan Profil/button_Simpan dan Keluar'))

