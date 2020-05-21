package com.choucair.formacion.steps;


import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;
import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

 ColorlibLoginPage colorlibLoginPage;
 ColorlibMenuPage colorlibMenuPage;
 
 @Step
 public void login_colorlib(String usuario, String clave) {
	 colorlibLoginPage.open();
	 colorlibLoginPage.ingresarDatos(usuario, clave);
	 colorlibLoginPage.verificarHome();
 }

 @Step
 public void ingresar_form_validation() {

     colorlibMenuPage.menuFormValidation();
 }
}
