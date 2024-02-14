package com.pruebatecnica.questions;

import com.pruebatecnica.userinterfaces.InicioSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Validar implements Question<String>{

    @Override
    public String answeredBy(Actor actor) {
        return InicioSesionPage.TXT_TABLERO.resolveFor(actor).getText();
    }

    public  static Validar elMensaje() {
        return new Validar();
    }




}
