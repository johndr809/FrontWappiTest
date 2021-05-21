package com.wolox.certificacion.interactions;

import com.wolox.certificacion.userinterfaces.WappiPedido;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Obtener implements Interaction {
	
   private String cupon;
   public Obtener (String cupon) {
		this.cupon = cupon;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		String claveCupon= "";
		actor.attemptsTo(Click.on(WappiPedido.BOTON_CUPON),
				Click.on(WappiPedido.CODIGO_CUPON));
		       
		
	}

	public static Obtener con(String cupon) {
		
		return Tasks.instrumented(Obtener.class, cupon);
	}

}
