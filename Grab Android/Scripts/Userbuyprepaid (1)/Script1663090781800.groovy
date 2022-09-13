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

Mobile.startExistingApplication('com.grabtaxi.passenger')

WebUI.delay(2)

Mobile.swipe(940, 410, 220, 410)

WebUI.delay(2)

Mobile.swipe(940, 410, 220, 410)

WebUI.delay(2)

Mobile.tap(findTestObject('Object Repository/UserBuyPrepaid/android.widget.TextView - Prepaid (1)'), 0)

Mobile.tap(findTestObject('Object Repository/UserBuyPrepaid/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/UserBuyPrepaid/android.widget.LinearLayout (2)'), 0)

Mobile.tap(findTestObject('Object Repository/UserBuyPrepaid/android.widget.Button - CONFIRM (1)'), 0)

Mobile.tap(findTestObject('Object Repository/UserBuyPrepaid/android.widget.LinearLayout (3)'), 0)

Mobile.tap(findTestObject('Object Repository/UserBuyPrepaid/android.widget.Button - Pay RM5.00 (1)'), 0)

Mobile.switchToNative()

Mobile.verifyElementExist(findTestObject('Object Repository/UserBuyPrepaid/android.widget.TextView - Were processing your prepaid top-up. Youll receive a notification once its done (1)'), 
    0)

Mobile.closeApplication()

