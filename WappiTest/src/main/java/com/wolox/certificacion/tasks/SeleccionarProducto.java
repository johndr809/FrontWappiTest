package com.wolox.certificacion.tasks;

import com.wolox.certificacion.userinterfaces.WappiPedido;
import com.wolox.certificacion.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task {
	
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(
				Click.on(WappiPedido.BOTON_PEDIR),
				Wait.unMomento(9000),
				Click.on(WappiPedido.BOTON_CONFIRMAR),
		Wait.unMomento(9000));
	}

	public static SeleccionarProducto enLaPagina() {
		
		return Tasks.instrumented(SeleccionarProducto.class);
	}
	
	

}
