package com.wolox.certificacion.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait implements Interaction {

	private int tiempoEspera;
	
	public Wait(int tiempoEspera) {
		super();
		this.tiempoEspera = tiempoEspera;
	}

	/**
	 * Hace una pausa de tiempo.
	 * @param tiempoEspera en milisegundos
	 * @return 
	 */
	public static Wait unMomento(int tiempoEspera) {
		return instrumented(Wait.class, tiempoEspera);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(tiempoEspera);
	}
}
