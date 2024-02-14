package com.pruebatecnica.stepsdefinitions;

import com.pruebatecnica.models.InicioSesionModels;
import com.pruebatecnica.questions.Validar;
import com.pruebatecnica.tasks.InicioSesion;
import com.pruebatecnica.utils.Urls;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;


import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InicioSesionStepDefinitions {


    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
        theActorCalled("demo");

    }

    @Given("que el cliente se encuentra en la pagina de inicio de sesion")
    public void queElClienteSeEncuentraEnLaPaginaDeInicioDeSesion() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Urls.Demo));
    }
    @When("ingresa las credenciales para el inicio de sesion")
    public void ingresaLasCredencialesParaElInicioDeSesion(DataTable iniciosesion) {

        theActorInTheSpotlight().attemptsTo(InicioSesion.enDemo(new InicioSesionModels(iniciosesion)));

    }
    @Then("visualiza los diferentes modulos")
    public void visualizaLosDiferentesModulos() {

        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat("se inicia sesion", Validar.elMensaje(), Matchers.equalTo("Tablero")));

    }

}
