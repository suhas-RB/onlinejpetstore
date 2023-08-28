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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.click(findTestObject('Object Repository/Exp/Page_JPetStore Demo/a_Enter the Store (2)'))

WebUI.click(findTestObject('Object Repository/Exp/Page_JPetStore Demo/a_Sign In (2)'))

WebUI.setText(findTestObject('Object Repository/Exp/Page_JPetStore Demo/input_Need a user name and password_username (2)'), 
    'suhas3')

WebUI.setEncryptedText(findTestObject('Object Repository/Exp/Page_JPetStore Demo/input_Need a user name and password_password (2)'), 
    'qg5PJjO9hfg=')

WebUI.click(findTestObject('Object Repository/Exp/Page_JPetStore Demo/input_Need a user name and password_signon (2)'))

WebUI.click(findTestObject('Object Repository/Exp/Page_JPetStore Demo/img (2)'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Exp/Page_JPetStore Demo/th_Product ID (2)'), 0)

WebUI.click(findTestObject('Object Repository/Exp/Page_JPetStore Demo/a_Sign Out (2)'))

WebUI.closeBrowser()

