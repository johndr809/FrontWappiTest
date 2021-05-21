package com.wolox.certificacion.questions;

import com.wolox.certificacion.interactions.Wait;
import com.wolox.certificacion.userinterfaces.ConsultarPedido;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidacionProducto implements Question<String>{

	@Override
	public String answeredBy(Actor actor) {
		Wait.unMomento(9000);
		return Text.of(ConsultarPedido.CAMPO_PRODUCTO).viewedBy(actor).asString();
	}

	public static ValidacionProducto solicitudExitosa() {
		
		return new ValidacionProducto();
	}

	
	

}
