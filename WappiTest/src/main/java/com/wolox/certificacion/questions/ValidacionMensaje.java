package com.wolox.certificacion.questions;

import com.wolox.certificacion.interactions.Wait;
import com.wolox.certificacion.userinterfaces.MensajeExitoso;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionMensaje implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		Wait.unMomento(9000);
		return Text.of(MensajeExitoso.MODAL_EXITOSO).viewedBy(actor).asString();
	}

	public static ValidacionMensaje solicitudExitosa() {
		
		return new ValidacionMensaje();
	}

}
