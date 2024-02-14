package com.pruebatecnica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosPages {

    public static final Target SELECT_PRODUCTOS= Target.the("campo para seleccionar el producto").locatedBy("//span[normalize-space()='Productos']");
    public static final Target BTN_NUEVOPRODUCTO= Target.the("Boton para crear un nuevo producto").locatedBy("//span[normalize-space()='Nuevo Producto']");

    public static final Target TXT_NOMBRE_PRODUCTO= Target.the("campo para escribir el nombre del producto").locatedBy("//input[@id='ProductDialog9_ProductName']");
    public static final Target SELECT_ARCHIVO= Target.the("campo para seleccionar un archivo").locatedBy("//*[@id='ProductDialog9_ProductImage']/div/div[2]/div[1]/input");
    public static final Target TXT_STOCK= Target.the("campo para escribir las unidades del stock").locatedBy("//input[@id='ProductDialog9_UnitsInStock']");
    public static final Target TXT_PEDIDO= Target.the("campo para escribir las unidades del pedido").locatedBy("//input[@id='ProductDialog9_UnitsOnOrder']");
    public static final Target TXT_REORDEN= Target.the("campo para escribir el nivel del reorden").locatedBy("//input[@id='ProductDialog9_ReorderLevel']");
    public static final Target BTN_GUARDAR= Target.the("boton para guardar el producto").locatedBy("//input[@id='ProductDialog9_ReorderLevel']");


}

