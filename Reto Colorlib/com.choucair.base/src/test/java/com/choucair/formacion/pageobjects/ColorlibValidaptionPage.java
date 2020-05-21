package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ColorlibValidaptionPage extends PageObject {

    @FindBy(xpath = "//*[@id='req']")
    public WebElementFacade txtRequired;
    @FindBy(xpath = "//*[@id='sport']")
    public WebElementFacade cmbSport1;
    @FindBy(xpath = "//*[@id='sport2']")
    public WebElementFacade txtMultiselect;
    @FindBy(xpath = "//*[@id='url1']")
    public WebElementFacade txtUrl;
    @FindBy(xpath = "//*[@id='email1']")
    public WebElementFacade txtEmail;
    @FindBy(xpath = "//*[@id='pass1']")
    public WebElementFacade txtPass1;
    @FindBy(xpath = "//*[@id='pass2']")
    public WebElementFacade txtPass2;
    @FindBy(xpath = "//*[@id='minsize1']")
    public WebElementFacade txtMinSize1;
    @FindBy(xpath = "//*[@id='maxsize1']")
    public WebElementFacade txtMaximo1;
    @FindBy(xpath = "//*[@id='number2']")
    public WebElementFacade txtNumber;
    @FindBy(xpath = "//*[@id='ip']")
    public WebElementFacade txtIp;
    @FindBy(xpath = "//*[@id='date3']")
    public WebElementFacade txtDate;
    @FindBy(xpath = "//*[@id='past']")
    public WebElementFacade txtDateEar;
    @FindBy(xpath = "//*[@id='popup-validation']/div[14]/input")
    public WebElementFacade btnValidate;
    @FindBy(xpath = "//div[@class='formErrorContent'][1]")
    public WebElementFacade globoInformativo;

    public void required(String datoPrueba) {
        txtRequired.click();
        txtRequired.clear();
        txtRequired.sendKeys(datoPrueba);
    }

    public void select_sport(String datoPrueba) {
        cmbSport1.click();
        cmbSport1.selectByVisibleText(datoPrueba);
    }
    public void multiple_select(String datoPrueba) {
        txtMultiselect.click();
        txtMultiselect.selectByVisibleText(datoPrueba);
    }
    public void url(String datoPrueba) {
        txtUrl.click();
        txtUrl.clear();
        txtUrl.sendKeys(datoPrueba);
    }
    public void email(String datoPrueba) {
        txtEmail.click();
        txtEmail.clear();
        txtEmail.sendKeys(datoPrueba);
    }
    public void password(String datoPrueba) {
        txtPass1.click();
        txtPass1.clear();
        txtPass1.sendKeys(datoPrueba);
    }
    public void confirmacion_password(String datoPrueba) {
        txtPass2.click();
        txtPass2.clear();
        txtPass2.sendKeys(datoPrueba);
    }
    public void minimun_field_size(String datoPrueba) {
        txtMinSize1.click();
        txtMinSize1.clear();
        txtMinSize1.sendKeys(datoPrueba);
    }
    public void maximun_field_size(String datoPrueba) {
        txtMaximo1.click();
        txtMaximo1.clear();
        txtMaximo1.sendKeys(datoPrueba);
    }
    public void number(String datoPrueba) {
        txtNumber.click();
        txtNumber.clear();
        txtNumber.sendKeys(datoPrueba);
    }
    public void ip(String datoPrueba) {
        txtIp.click();
        txtIp.clear();
        txtIp.sendKeys(datoPrueba);
    }
    public void date(String datoPrueba) {
        txtDate.click();
        txtDate.clear();
        txtDate.sendKeys(datoPrueba);
    }
    public void date_earlier(String datoPrueba) {
        txtDateEar.click();
        txtDateEar.clear();
        txtDateEar.sendKeys(datoPrueba);
    }
    public void validate() {

        btnValidate.click();
    }
    public void formulario_sin_errores(){

        assertThat(globoInformativo.isCurrentlyVisible(), is(false));
    }
    public void formulario_con_errores()
    {
        assertThat(globoInformativo.isCurrentlyVisible(), is(true));
    }
}
