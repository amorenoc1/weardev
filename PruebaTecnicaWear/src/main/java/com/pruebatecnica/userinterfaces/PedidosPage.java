package com.pruebatecnica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PedidosPage {

    public static final  Target SELECT_PEDIDOS = Target.the("Campo para seleccionar el pedido").locatedBy("//a[@href='/Northwind/Order']");
    public static final  Target BTN_NUEVOPEDIDO = Target.the("Campo para seleccionar el nuevo pedido").locatedBy("//span[normalize-space()='Nuevo Pedido']");
    public static final Target SELECT_CLIENTE = Target.the("Campo para seleccionar el cliente").locatedBy("//div[@id='s2id_Serenity_Demo_Northwind_OrderDialog15_CustomerID']//a[@class='select2-choice select2-default']");
    public static final  Target TXT_CLIENTE = Target.the("Campo para seleccionar el cliente").locatedBy("//*[@id=\"select2-chosen-8\"]");
    public static final  Target TXT_FECHA_PEDIDO = Target.the("Campo para seleccioanr la fecha del pedido").locatedBy("//input[@id='Serenity_Demo_Northwind_OrderDialog15_OrderDate']");
    public static final  Target BTN_DETALLE_PEDIDO = Target.the("Boton para seleccionar el detalle del pedido").locatedBy("//span[normalize-space()='Nuevo Detalle de pedido']");
    public static final  Target SELECT_PRODUCTO = Target.the("Campo para seleccionar el producto").locatedBy("//span[@id='select2-chosen-288']");
    public static final  Target TXT_PRODUCTO = Target.the("Campo para seleccionar el producto").locatedBy("//input[@id='s2id_autogen288_search']");
    public static final  Target TXT_PRECIO_UNITARIO = Target.the("Campo para poner el precio unitario").locatedBy("//input[@id='OrderDetailDialog47_UnitPrice']");
    public static final  Target TXT_CANTIDAD = Target.the("Campo para poner la cantidad").locatedBy("//input[@id='OrderDetailDialog47_Quantity']");
    public static final  Target TXT_DESCUENTO = Target.the("Campo para poner el descuento").locatedBy("//input[@id='OrderDetailDialog47_Discount']");
    public static final  Target BTN_GUARDAR = Target.the("Boton para guardar el nuevo detalle del producto").locatedBy("//div[@id='OrderDetailDialog47_Toolbar']//span[@class='button-inner'][normalize-space()='Guardar']");
}
