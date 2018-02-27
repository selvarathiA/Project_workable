import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://beta1.beerboard.com/')

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_Welcome to SmartBar/input_useremail'), 'admin')

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_Welcome to SmartBar/input_userpassword'), 'password')

WebUI.click(findTestObject('TC_5_user_creation_admin/Page_Welcome to SmartBar/button_Dont Allow'))

WebUI.click(findTestObject('TC_5_user_creation_admin/Page_Welcome to SmartBar/button_Login'))

WebUI.delay(15)

WebUI.click(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/a_nav-link nav-toggle'))

WebUI.click(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/span_Retailer Settings'))

WebUI.delay(15)

WebUI.selectOptionByValue(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/select_ABC Beer Co.Alleycats E'), 
    'number:357', true)

WebUI.selectOptionByValue(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/select_LocationUserRegionPrice'), 
    'string:user', true)

WebUI.click(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/a_Add User'))

WebUI.delay(15)

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_first_name'), 'testhappy')

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_last_name'), 'testhappy')

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_email'), 'testhappy@gmail.com')

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_mobile'), '9696976312')

WebUI.selectOptionByValue(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/select_ATTVerizonT-MobileSprin'), 
    'string:tmobile', true)

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_username'), 'testhappy')

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_password'), 'password')

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_password_confirmation'), 'password')

WebUI.selectOptionByValue(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/select_AccesstestBJs AdminBJs'), 
    'number:4', true)

WebUI.scrollToElement(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/button_Create User'), 15)

WebUI.click(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_ui-select-search input-x'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_ui-select-search input-x'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/select_NoneLevel 1Level 2'), 
    'number:1', true)

WebUI.click(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/button_Create User'))

WebUI.click(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/div_User Added Successfully.'))

WebUI.delay(15)

WebUI.setText(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_form-control custom_sel_'), 
    'testhappy')

WebUI.sendKeys(findTestObject('TC_5_user_creation_admin/Page_SmartBar  Admin Dashboard/input_form-control custom_sel_'), 
    Keys.chord(Keys.ENTER))

WebUI.closeBrowser()

