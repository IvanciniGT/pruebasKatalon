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

respuesta = WS.sendRequest(findTestObject('Servicios web/Servicio de Calculadora', [('numero1') : numeroA, ('numero2') : numeroB]))

WS.verifyElementPropertyValue(respuesta, 'AddResponse.AddResult', resultadoSuma)

WS.verifyResponseStatusCode(respuesta, 200)

WS.verifyResponseStatusCodeInRange(respuesta, 200, 299)

resultadoOperacion = WS.getElementPropertyValue(respuesta, 'AddResponse.AddResult')

WS.delay(2)

respuesta = WS.sendRequest(findTestObject('Servicios web/Servicio de Calculadora', [('numero1') : numeroA, ('numero2') : resultadoOperacion]))

