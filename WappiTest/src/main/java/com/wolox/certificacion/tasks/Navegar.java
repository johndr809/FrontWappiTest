package com.wolox.certificacion.tasks;

import com.wolox.certificacion.userinterfaces.OpcionUrl;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class Navegar implements Task {
	
	private final OpcionUrl opcion;
	
	 public Navegar(OpcionUrl opcion) {
		this.opcion= opcion;
	}

	@Override
	@Step("{0} navega a la opcion #opcion")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
                Open.url(opcion.url())
        );
		
	}
	
	public static Performable enLaPaginaWeb(OpcionUrl opcion) {
        return Tasks.instrumented(Navegar.class, opcion);
    }

}
