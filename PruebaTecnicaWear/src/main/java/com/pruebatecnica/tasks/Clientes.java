package com.pruebatecnica.tasks;

import com.pruebatecnica.models.ClientesModels;
import com.pruebatecnica.models.InicioSesionModels;
import com.pruebatecnica.userinterfaces.ClientesPage;
import com.pruebatecnica.userinterfaces.InicioSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Clientes implements Task {

    ClientesModels clientesModels;

    public Clientes(ClientesModels clientesModels) {
        this.clientesModels = clientesModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(ClientesPage.LBL_NORTHWIND),
                Click.on(ClientesPage.LBL_CLIENTES),
                Click.on(ClientesPage.BTN_NUEVOCLIENTE),
                Enter.theValue(clientesModels.getId()).into(ClientesPage.TXT_IDCLIENTE),
                Enter.theValue(clientesModels.getNombreempresa()).into(ClientesPage.TXT_NOMBRE_EMPRESA),
                Click.on(ClientesPage.BTN_GUARDAR)



        );


    }

    public  static Clientes enNuevoCliente(ClientesModels clientesModels){
        return   instrumented (Clientes.class, clientesModels);
    }
}
