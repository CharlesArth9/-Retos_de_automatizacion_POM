package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.Keys;

import java.util.List;


@DefaultUrl("https://www.exito.com/")
public class Exito_Page extends PageObject {

    @FindBy(css = "#downshift-0-input")
    public WebElementFacade buscador;

    @FindBy(xpath = "(//label[contains(.,'LG')])[1]")
    public WebElementFacade marcaLG;

    @FindBy(xpath = "//label[@for='zuhd-4k']")
    public WebElementFacade resolusion_Uhd4k;

    @FindBy(css = "label[for*='49-pulgadas']")
    public WebElementFacade pulgadasTv;

    @FindBy(xpath = "(//span[contains(@class,'ProductName search')])[1]")
    public WebElementFacade primerTV;

    @FindBy(css = "div[class*='buy-button-manager-add']")
    public WebElementFacade btnAddCarrito;

    @FindBy(xpath = "//span[contains(.,'Mi carrito')]")
    public WebElementFacade btnVerproductosCarrito;

    @FindBy(css = "a[id*='product-name']")
    public WebElementFacade verificaProducto;

    public void buscarTele(String producto) {
         buscador.sendKeys(producto, Keys.ENTER);
         waitFor(5).seconds();

     }


    public void filtroMarca(String marca) {
     //   marcaLG.click();
        $("(//label[contains(.,'"+marca+"')])[1]").click();
        waitFor(5).seconds();
    }

    public void filtroResolucion(String resolusion) {
        $("//label[@for='z"+resolusion+"']").click();
        waitFor(5).seconds();
    }

    public void filtroPulgadas(String pulgadas) {
    //    pulgadasTv.click();
        $("label[for*='"+pulgadas+"-pulgadas']").click();
        waitFor(5).seconds();
    }


    public void imprimirInfoTVs() {
        List<WebElementFacade> listaTVs = findAll( "(//span[contains(@class,'ProductName search')])" );
        int totalBusquedaTVs = listaTVs.size();
        System.out.println(listaTVs);

        for (int i = 1; i <= totalBusquedaTVs; i++) {

            String infoTVnombre = $("(//span[contains(@class,'ProductName search')])["+i+"]").getText();
            String infoTVprecio = $("(//div[contains(@class,'selling-price')])["+i+"]").getText();
            System.out.println("--------------------");
            System.out.println("Producto: "+infoTVnombre);
            System.out.println("Precio: "+infoTVprecio);
            System.out.println("--------------------");
            waitFor(5).seconds();

        }

    }


    public void comprarTV(){
        String txtProducto = primerTV.getText().trim();
        primerTV.click();
        waitFor(5).seconds();
        btnAddCarrito.click();
        waitFor(5).seconds();
        btnVerproductosCarrito.click();
        String txtProductoenCarrito = verificaProducto.getText().trim();
        if (txtProductoenCarrito.equalsIgnoreCase(txtProducto)) {
            System.out.println("Producto verificado");
        }
    }
 //   Televisor LG 49 pulgadas UM7300 UHD 4K Smart TV
//    Televisor lg 49 pulgadas um7300 uhd 4k smart tv

    }
