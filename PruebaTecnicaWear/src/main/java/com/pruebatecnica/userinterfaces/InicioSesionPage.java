package com.pruebatecnica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionPage {


    public static final Target TXT_USER_NAME = Target.the("campo de texto para username").locatedBy("//input[@id='LoginPanel0_Username']");
    public static final  Target TXT_PASSWORD = Target.the("campo de texto para password").locatedBy("//input[@id='LoginPanel0_Password']");
    public static final  Target BTN_LOGIN = Target.the("Boton de login").locatedBy("//button[@id='LoginPanel0_LoginButton']");

    public static final  Target TXT_TABLERO = Target.the("Texto inicio de sesion").locatedBy("//h1[normalize-space()='Tablero']");

}
