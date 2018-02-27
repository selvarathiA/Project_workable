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

WebUI.setText(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (4)/input_useremail'), 'testdolly')

WebUI.click(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (4)/button_Dont Allow'))

WebUI.setText(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (4)/input_userpassword'), 'password')

WebUI.click(findTestObject('User_creation_deletion/Page_Welcome to SmartBar (4)/button_Login'))

WebUI.maximizeWindow()

WebUI.delay(45)

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (1)/a_Admin'))

WebUI.selectOptionByValue(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (5)/select_LocationUserRegionPrice'), 
    'string:user', false)

WebUI.delay(30)

WebUI.setText(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (5)/input_font-white form-control'), 
    'testdolly101')

WebUI.delay(30)

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (5)/a_Delete User'))

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (5)/button_Ok'))

WebUI.click(findTestObject('User_creation_deletion/Page_SmartBar  Retailer Dashboard (5)/div_Deleted succesfully'))

WebUI.closeBrowser()

