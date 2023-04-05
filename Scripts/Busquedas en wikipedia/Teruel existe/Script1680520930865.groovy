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

'Abrir wikipedia en el navegador\r\n'
WebUI.openBrowser('https://wikipedia.es')

'Las tareas siguientes pueden producir una condición anómala (error). Te aviso de ello.'
try {
    'Escribir teruel en la caja de búsqueda\r\n'
    WebUI.sendKeys(findTestObject('Componentes de la web de Wikipedia/Caja de búsqueda'), 'Teruel')

    'Buscar el texto introducido: TERUEL\r\n'
    WebUI.click(findTestObject('Componentes de la web de Wikipedia/Lupa de buscar'))

    'Obtener el título de la página a la que llegamos'
    titulo = WebUI.getText(findTestObject('Componentes de la web de Wikipedia/Título de la página de Wikipedia'))
}
finally { 
    'Se haya producio o no un error, quiero que el navegador sea cerrado'
    WebUI.closeBrowser()
}

WebUI.verifyEqual(titulo, 'Teruel')

