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

'Abro el navegador\r\n'
WebUI.openBrowser('')

try {
    'Accedo a la página de citas\r\n'
    WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

    'Hacer click en el boón de appointment'
    WebUI.click(findTestObject('Web reserva de citas/Formulario de login/Botón de reservar cita'))

    'Rellenar un usuario que exista\r\n'
    WebUI.sendKeys(findTestObject('Web reserva de citas/Formulario de login/Input del nombre del usuario'), nombre_usuario)

    'Rellenar su contraseña REAL'
    WebUI.sendKeys(findTestObject('Web reserva de citas/Formulario de login/Input de la contraseña'), password_usuario)

    'Apretar en el botón de login'
    WebUI.click(findTestObject('Web reserva de citas/Formulario de login/Botón de login'))

    'Muestro el menú, para ver si tengo el Logout'
    WebUI.click(findTestObject('Web reserva de citas/Menu de la aplicación/Botón mostrar menu'))

    'Verificar que no existe un elemento con el texto logout en el menu'
    WebUI.verifyElementNotPresent(findTestObject('Web reserva de citas/Menu de la aplicación/Botón de logout'), 0)

    'Verificar que no hay formulario de "solicitar cita"'
    WebUI.verifyElementNotPresent(findTestObject('Web reserva de citas/Formulario de Solicitar cita/Título del formulario de solicitar cita'), 
        0)

    'Ver que seguimos en el formulario de login'
    titulo_formulario_login = WebUI.getText(findTestObject('Web reserva de citas/Formulario de login/Título del formulario de login'))

    'Buscar en cualquier sitio de la página literalmente el texto "Login failed"'
    WebUI.verifyTextPresent('Login failed', false)

    'Buscar en cualquier sitio de la página el texto "Login failed", en mayúsculas, minúsculas y con el número de espacios en blanco que sea entre medias'
    WebUI.verifyTextPresent('[Ll][Oo][Gg][Ii][Nn]\\s+[Ff][Aa][Ii][Ll][Ee][Dd]', true)

    'Que se vea el mensaje de login incorrecto'
    WebUI.verifyElementVisible(findTestObject('Web reserva de citas/Formulario de login/Mensaje Login Incorrecto'), FailureHandling.STOP_ON_FAILURE)
}
finally { 
    'Cierro el navegador'
    WebUI.closeBrowser()
}

'Miro el título del formulario de login... para asegurarme que estoy allí'
WebUI.verifyEqual(titulo_formulario_login, 'Login')

