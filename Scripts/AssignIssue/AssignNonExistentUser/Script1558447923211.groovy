import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://jira.greenfox.codecanvas.hu/secure/Dashboard.jspa')

WebUI.setText(findTestObject('Object Repository/Page_System Dashboard - CodeCanvas Greenfox Jira/input_U_os_username'), 
    'user5')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_System Dashboard - CodeCanvas Greenfox Jira/input_P_os_password'), 
    'TH2Uh5Bok1ZIg+SkmWxVrQ==')

WebUI.click(findTestObject('Object Repository/Page_System Dashboard - CodeCanvas Greenfox Jira/input_Jira administrators_login'))

WebUI.sendKeys(findTestObject('Page_System Dashboard - CodeCanvas Greenfox Jira/input_Create_searchString'), 'jta-74')

WebUI.submit(findTestObject('Page_System Dashboard - CodeCanvas Greenfox Jira/QuickSearch_frm'))

WebUI.click(findTestObject('Assignee/assignee_btn'))

WebUI.click(findTestObject('Assignee/assignee_fld'), FailureHandling.STOP_ON_FAILURE)

WebUI.clearText(findTestObject('Assignee/assignee_fld'))

WebUI.sendKeys(findTestObject('Assignee/assignee_fld'), '')

WebUI.sendKeys(findTestObject('Assignee/assignee_fld'), nonExistentUser)

WebUI.click(findTestObject('Assignee/assignee_dlg_assign_btn'))

WebUI.verifyElementText(findTestObject('Assignee/nonExistentUserErrorMessage'), 'User \'blablabla\' does not exist.')

WebUI.click(findTestObject('Assignee/assigneeCancel_btn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

