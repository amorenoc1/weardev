package com.pruebatecnica.stepsdefinitions;

import com.pruebatecnica.models.ClientesModels;
import com.pruebatecnica.models.PedidosModels;
import com.pruebatecnica.models.ProductoModels;
import com.pruebatecnica.tasks.Clientes;
import com.pruebatecnica.tasks.Pedidos;
import com.pruebatecnica.tasks.Productos;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ClientesStepDefinitions {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
        theActorCalled("demo");

    }

      @When("crea un nuevo cliente en el modulo Northwing customers")
    public void creaUnNuevoClienteEnElModuloNorthwingCustomers(DataTable clientes) {

        theActorInTheSpotlight().attemptsTo(Clientes.enNuevoCliente(new ClientesModels( clientes)));

    }

    @When("crea un producto cliente en el modulo Northwing products")
    public void creaUnProductoClienteEnElModuloNorthwingProducts(DataTable productos) {

        theActorInTheSpotlight().attemptsTo(Productos.enNuevoProducto(new ProductoModels(productos)));

    }

    @When("realiza un pedido en el modulo Northwing orders con los datos")
    public void realizaUnPedidoEnElModuloNorthwingOrdersConLosDatos(DataTable pedidos) {

        theActorInTheSpotlight().attemptsTo(Pedidos.enNuevoPedido(new PedidosModels(pedidos)));

    }

    @Then("valida que el precio del orden sea (.*)")
    public void validaQueElPrecioDelOrdenSea(Integer int1) {

    }
}
