package com.choucair.formacion.steps;

import com.choucair.formacion.pageobjects.Exito_Page;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

import java.util.List;
import java.util.logging.Logger;


public class Exito_Steps {
    Exito_Page exitoPage;
    public final static Logger LOG_TEST = Logger.getLogger("Exito/Fracaso");

    @Step

    public void ingresarTiendaExito() {
        exitoPage.open();
    }

    public void buscarProducto(List<List<String>> data, int id) {
        exitoPage.buscarTele(data.get(id).get(0).trim());
    }

    public void filtrarMarca(List<List<String>> data, int id) {
        exitoPage.filtroMarca(data.get(id).get(1).trim());
    }

    public void filtroResolucion(List<List<String>> data, int id) {
        exitoPage.filtroResolucion(data.get(id).get(2).trim());
    }

    public void filtroPulgadas(List<List<String>> data, int id) {
        exitoPage.filtroPulgadas(data.get(id).get(3).trim());
    }

    public void Imprimir_informacion_de_busqueda() {
        exitoPage.imprimirInfoTVs();
    }

    public void comprar_PrimerTV() {
        exitoPage.comprarTV();
    }


}