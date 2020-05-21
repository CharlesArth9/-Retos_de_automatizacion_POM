package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {
	@FindBy(xpath = "//*[@id='menu']/li[6]/a")
	public WebElementFacade menuForm;
	@FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[1]/a")
	public WebElementFacade menu_opcFormGeneral;
	@FindBy(xpath = "//*[@id='menu']/li[6]/ul/li[2]/a")
	public WebElementFacade menu_opcFormValidation;
	@FindBy(xpath = "//*[@id='content']/div/div/div[1]/div/div/header/h5")
	public WebElementFacade txtFormValidation;
	
	public void menuFormValidation() {
		menuForm.click();
		menu_opcFormValidation.click();
		String strMensaje = txtFormValidation.getText();
		assertThat(strMensaje, containsString("Popup Validation"));
	}
}
