package com.pruebatecnica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ClientesPage {

    public static final Target LBL_NORTHWIND = Target.the("Texto del modulo Northwind ").locatedBy("//span[normalize-space()='Northwind']");
    public static final Target LBL_CLIENTES = Target.the("Texto del modulo clientes ").locatedBy("//a[@href='/Northwind/Customer']//span[@class='s-sidebar-link-text'][normalize-space()='Clientes']");
    public static final Target BTN_NUEVOCLIENTE = Target.the("Boton nuevo cliente").locatedBy("//span[normalize-space()='Nuevo Cliente']");
    public static final Target TXT_IDCLIENTE = Target.the("Texto para escribir el id del cliente").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CustomerID']");
    public static final Target TXT_NOMBRE_EMPRESA = Target.the("Texto para escribir el nombre de la empresa").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_CompanyName']");

    public static final Target TXT_NOMBRE_CONTACTO = Target.the("Texto para escribir el nombre del contacto").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_ContactName']");

    public static final Target SELECT_REPRESENTANTES = Target.the("Campo para seleccionar el represnetante").locatedBy("//input[@id='s2id_autogen4']");
    public static final Target CLICK_REPRESENTANTES = Target.the("Campo para seleccionar el represnetante").locatedBy("//div[normalize-space()='{0}']");
    public static final Target TXT_DIRECCION = Target.the("Texto para escribir la direccion").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Address']");
    public static final Target SELECT_PAIS = Target.the("Texto para seleccionar el pais").locatedBy("//input[@id='s2id_autogen5_search']");
    public static final Target CLICK_PAIS = Target.the("Campo para seleccionar el pais").locatedBy("//input[@id='s2id_autogen5_search']");
    public static final Target TXT_REGION = Target.the("Texto para escribir la region").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Region']");
    public static final Target TXT_CODIGO_POSTAL = Target.the("Texto para escribir el codigo postal").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_PostalCode']");
    public static final Target TXT_TELEFONO = Target.the("Texto para escribir el telefono").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Phone']");
    public static final Target TXT_FAX = Target.the("Texto para escribir el fax").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Fax']");
    public static final Target TXT_FECHA = Target.the("Texto para escribir la fecha").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_LastContactDate']");
    public static final Target TXT_EMAIL= Target.the("Texto para escribir el email").locatedBy("//input[@id='Serenity_Demo_Northwind_CustomerDialog9_Email']");
    public static final Target TXT_ULTIMO_CONTACTO= Target.the("Texto para escribir el ultimo contacto").locatedBy("//div[@id='select2-drop-mask']");
    public static final Target BTN_GUARDAR= Target.the("boton para guardar para guardar").locatedBy("//span[normalize-space()='Guardar']");
}
