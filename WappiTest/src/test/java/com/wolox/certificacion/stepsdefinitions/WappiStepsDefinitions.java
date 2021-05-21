package com.wolox.certificacion.stepsdefinitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.containsString;
import com.wolox.certificacion.exceptions.MensajeDiferente;
import com.wolox.certificacion.questions.ValidacionMensaje;
import com.wolox.certificacion.questions.ValidacionProducto;
import com.wolox.certificacion.tasks.Autenticarse;
import com.wolox.certificacion.tasks.Navegar;
import com.wolox.certificacion.tasks.SeleccionarProducto;
import com.wolox.certificacion.tasks.SeleccionarProductoConCupon;
import com.wolox.certificacion.tasks.SeleccionarProductoYConsultar;
import com.wolox.certificacion.userinterfaces.OpcionUrl;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class WappiStepsDefinitions {
	
	private Actor user = Actor.named("John");
	@Before
	public void before() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Given("^que el cliente ingresa a la pagina de Wappi a traves de la autenticacion con sus credenciales$")
	public void que_el_cliente_ingresa_a_la_pagina_de_Wappi_a_traves_de_la_autenticacion_con_sus_credenciales(){
		theActorCalled("John").attemptsTo(Navegar.enLaPaginaWeb(OpcionUrl.PAGINA_WAPPI));
		theActorInTheSpotlight().wasAbleTo(Autenticarse.conSusCredenciales());
	}
	
	    
    @When("^selecciona el producto (.*) para hacer el pedido$")
    public void seleccionaElProductoAceiteDeGirasolParaHacerElPedido(String producto){
    	theActorInTheSpotlight().attemptsTo(SeleccionarProducto.enLaPagina());
    }

    @Then("^puede ver el mensaje en pantalla: (.*)$")
    public void puedeVerElMensajeEnPantallaTuPedidoHaSidoConfirmadoTeMantendremosInformadoAnteNuevasNovedades(String mensaje){
    	theActorInTheSpotlight().should(seeThat(ValidacionMensaje.solicitudExitosa(), containsString(mensaje)).orComplainWith(MensajeDiferente.class,"El mensaje no es el esperado"));
    }
    
   
    @When("^genera cupon y selecciona el producto (.*) para hacer el pedido$")
    public void generaCuponYSeleccionaElProductoJamónPremiumParaHacerElPedido(String producto) {
    	theActorInTheSpotlight().attemptsTo(SeleccionarProductoConCupon.enLaPagina());
        
    }
    
    @When("^genera cupon y selecciona el producto (.*) para hacer el pedido y consultar$")
    public void generaCuponYSeleccionaElProductoJamónPremiumParaHacerElPedidoYConsultar(String producto){
    	theActorInTheSpotlight().attemptsTo(SeleccionarProductoYConsultar.enLaPagina());
    }    
        
    @Then("^puede ver en pantalla lo comprado: (.*)$")
    public void puedeVerEnPantallaLoCompradoJamónPremium(String producto){
    	theActorInTheSpotlight().should(seeThat(ValidacionProducto.solicitudExitosa(), containsString(producto)).orComplainWith(MensajeDiferente.class,"El mensaje no es el esperado"));
      
    }
       

}
