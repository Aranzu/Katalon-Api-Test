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

response = WS.sendRequestAndVerify(findTestObject('API RESTful/02 Obtener usuarios'))

WS.verifyElementPropertyValue(response, 'data[4].id', 5)

WS.verifyElementsCount(response, 'data', 6)

WS.sendRequestAndVerify(findTestObject('API RESTful/12 Eliminar Usuario'))

WS.sendRequestAndVerify(findTestObject('API RESTful/10 Crear Usuario'))

WS.sendRequestAndVerify(findTestObject('API RESTful/08 Actualizar Usuario'))

WS.sendRequestAndVerify(findTestObject('API RESTful/01 Obtener 1 usuario'))

WS.sendRequestAndVerify(findTestObject('API RESTful/03 Usuario no encontrado'))

WS.sendRequestAndVerify(findTestObject('API RESTful/11 Crear usuario sin ningun dato'))

WS.sendRequestAndVerify(findTestObject('API RESTful/04 Obtener un recurso'))

WS.sendRequestAndVerify(findTestObject('API RESTful/05 Listar recursos'))

WS.sendRequestAndVerify(findTestObject('API RESTful/06 Obtener recurso inexistente'))

WS.sendRequestAndVerify(findTestObject('API RESTful/07 Respuesta con demora'))

WS.sendRequestAndVerify(findTestObject('API RESTful/08 Actualizar Usuario'))

WS.sendRequestAndVerify(findTestObject('API RESTful/09 Actualizar Usuario email invalido'))

WS.sendRequestAndVerify(findTestObject('API RESTful/10 Crear Usuario'))

WS.sendRequestAndVerify(findTestObject('API RESTful/11 Crear usuario sin ningun dato'))

WS.sendRequestAndVerify(findTestObject('API RESTful/12 Eliminar Usuario'))

WS.sendRequestAndVerify(findTestObject('API RESTful/13 Login exitoso'))

WS.sendRequestAndVerify(findTestObject('API RESTful/14 Login contraseña faltante'))

WS.sendRequestAndVerify(findTestObject('API RESTful/15 Patch usuario'))

WS.sendRequestAndVerify(findTestObject('API RESTful/17 Registro usuario correo faltante'))

'Comprobar que tras el ingreso de correo inválido, no se logre registrar dicho usuario, se aserte codigo de respuesta 400 y se obtenga mensaje solicitando datos faltantes'
WS.sendRequestAndVerify(findTestObject('API RESTful/18 Registro usuario correo invalido'))

WS.sendRequestAndVerify(findTestObject('API RESTful/19 Registro usuario nombre faltante'))

