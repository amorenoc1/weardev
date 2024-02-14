package com.pruebatecnica.tasks;

import com.pruebatecnica.models.PedidosModels;
import com.pruebatecnica.models.ProductoModels;
import com.pruebatecnica.userinterfaces.PedidosPage;
import com.pruebatecnica.userinterfaces.ProductosPages;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Pedidos implements Task {


    PedidosModels pedidosModels;

    public Pedidos(PedidosModels pedidosModels) {
        this.pedidosModels = pedidosModels;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(

                Click.on(PedidosPage.SELECT_PEDIDOS),
                Click.on(PedidosPage.BTN_NUEVOPEDIDO),
                Click.on(PedidosPage.SELECT_CLIENTE),
                Enter.theValue(pedidosModels.getNombreempresa()).into(PedidosPage.TXT_CLIENTE),
                Enter.theValue(pedidosModels.getFechapedido()).into(PedidosPage.TXT_FECHA_PEDIDO),
                Click.on(PedidosPage.SELECT_PRODUCTO)
              //  Enter.theValue().into(pedidosModels.getNombreproducto()).into(PedidosPage.TXT_PRODUCTO),





                );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public  static Pedidos enNuevoPedido(PedidosModels pedidosModels){
        return   instrumented( Pedidos.class,  pedidosModels);
    }
}
