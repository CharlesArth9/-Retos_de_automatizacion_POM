package com.choucair.formacion.definition;

import com.choucair.formacion.steps.Exito_Steps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class Exito_Definitions {


    @Steps
    Exito_Steps exito_steps;

    @Given("^el usuario ingresa a la pagina de tiendas Exito$")
    public void el_usuario_ingresa_a_la_pagina_de_tiendas_Exito()  {
        exito_steps.ingresarTiendaExito();
    }

    @When("^busca un televisor usando el buscador con los filtros$")
    public void busca_un_televisor_usando_el_buscador_con_los_filtros(DataTable filtros) {
        List<List<String>> data = filtros.raw();
        for (int i=1; i<data.size();i++) {
            exito_steps.buscarProducto(data, i);
            exito_steps.filtrarMarca(data, i);
            exito_steps.filtroResolucion(data, i);
            exito_steps.filtroPulgadas(data, i);
        }
    }

    @Then("^realiza la compra con envio a su domicilio$")
    public void realiza_la_compra_con_envio_a_su_domicilio()  {
        exito_steps.Imprimir_informacion_de_busqueda();
        exito_steps.comprar_PrimerTV();

    }



}
