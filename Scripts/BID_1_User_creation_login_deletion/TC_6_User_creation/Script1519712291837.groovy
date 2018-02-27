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

WebUI.setText(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (3)/input_useremail'), 'testdolly')

WebUI.setText(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (3)/input_userpassword (1)'), 'password')

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (3)/button_Dont Allow'))

WebUI.click(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (3)/button_Login (1)'))

WebUI.maximizeWindow()

WebUI.delay(30)

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (3)/a_Admin'))

WebUI.delay(30)

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (3)/select_LocationUserRegionPrice'), 
    'string:user', false)

WebUI.delay(30)

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (3)/a_Add User'))

WebUI.delay(30)

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (2)/input_first_name (2)'), 'testdolly101')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (2)/input_last_name (2)'), 'da')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (2)/input_email (2)'), 'testdolly101.da@gmail.com')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (2)/input_mobile (1)'), '907698875')

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (2)/select_ATTVerizonT-MobileSprin (1)'), 
    'string:verizon', true)

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (2)/input_username (1)'), 'testdollybobby')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (2)/input_password (1)'), 'password')

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard/input_password_confirmation (2)'), 
    'password')

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard/select_AccesstestBJs AdminBJs (2)'), 
    'number:5', true)

WebUI.scrollToElement(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (1)/button_Create User'), 
    15)

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (4)/input_ui-select-search input-x'))

WebUI.sendKeys(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (4)/input_ui-select-search input-x'), 
    Keys.chord(Keys.ENTER))

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard/select_NoneLevel 1Level 2 (2)'), 
    'number:1', true)

WebUI.doubleClick(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard/button_Create User (2)'))

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard/div_User Added Successfully.'))

WebUI.closeBrowser()

