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

WebUI.navigateToUrl('https://accounts.google.com/v3/signin/identifier?dsh=S771871841%3A1690278105099859&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&ifkv=AeDOFXho48atIudWTii4Fx-88tGYGE1x2JW67E6PyRNyk5VjIYmRC3wiVRoVs7O-oN1n1P-vQYkA&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/gmail/Page_Gmail/input_to continue to Gmail_identifier'), '9975195182')

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail/span_Next'))

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail/a_Learn more_WpHeLc VfPpkd-mRLv6 VfPpkd-RLmnJb'))

WebUI.click(findTestObject('Object Repository/gmail/Page_Gmail Private and secure email at no c_d3ebd8/span_Create an account'))

WebUI.setText(findTestObject('Object Repository/gmail/Page_Gmail/input_Enter your name_firstName'), 'priya')

WebUI.closeBrowser()

