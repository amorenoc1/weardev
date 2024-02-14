package com.pruebatecnica.tasks;

import com.pruebatecnica.models.InicioSesionModels;
import com.pruebatecnica.userinterfaces.InicioSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioSesion implements Task {

    InicioSesionModels inicioSesionModels;

    public InicioSesion(InicioSesionModels inicioSesionModels) {
        this.inicioSesionModels = inicioSesionModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(inicioSesionModels.getUser()).into(InicioSesionPage.TXT_USER_NAME),
                Enter.theValue(inicioSesionModels.getPass()).into(InicioSesionPage.TXT_PASSWORD),
                Click.on(InicioSesionPage.BTN_LOGIN)

        );


    }

    public  static InicioSesion enDemo(InicioSesionModels inicioSesionModels){
        return   instrumented (InicioSesion.class, inicioSesionModels);
    }
}
