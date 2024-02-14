package com.pruebatecnica.tasks;

import com.pruebatecnica.models.ClientesModels;
import com.pruebatecnica.models.ProductoModels;
import com.pruebatecnica.userinterfaces.ClientesPage;
import com.pruebatecnica.userinterfaces.ProductosPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Productos implements Task {
    ProductoModels productoModels;

    public Productos(ProductoModels productoModels) {
        this.productoModels = productoModels;
    }

    private Path upload = Paths.get(System.getProperty("user.dir")+"\\src\\test\\resources\\data\\tenis.jpg");

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(ProductosPages.SELECT_PRODUCTOS),
                Click.on(ProductosPages.BTN_NUEVOPRODUCTO),
                Enter.theValue( productoModels.getNombreproducto()).into(ProductosPages.TXT_NOMBRE_PRODUCTO),
                Upload.theFile(upload).to(ProductosPages.SELECT_ARCHIVO),
                Enter.theValue( productoModels.getStock()).into(ProductosPages.TXT_STOCK),
                Enter.theValue( productoModels.getStock()).into(ProductosPages.TXT_PEDIDO),
                Enter.theValue( productoModels.getReorden()).into(ProductosPages.TXT_REORDEN),
                Click.on(ProductosPages.BTN_GUARDAR)

        );


    }


    public  static Productos enNuevoProducto(ProductoModels productoModels){
        return   instrumented (Productos.class, productoModels);
    }
}
