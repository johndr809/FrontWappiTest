package com.wolox.certificacion.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.wolox.certificacion.interactions.Obtener;
import com.wolox.certificacion.interactions.Wait;
import com.wolox.certificacion.questions.JavaScriptText;
import com.wolox.certificacion.userinterfaces.ConsultarPedido;
import com.wolox.certificacion.userinterfaces.WappiPedido;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

public class SeleccionarProductoConCupon implements Task {
	
	private static String obtenerCupon;
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Click.on(WappiPedido.BOTON_CUPON),
		Wait.unMomento(9000));
		obtenerCupon = actor.asksFor(JavaScriptText.of(WappiPedido.MODAL_CODIGO));
		String cupon = Text.of(WappiPedido.MODAL_CODIGO).viewedBy(actor).value();
		Wait.unMomento(9000);
		actor.attemptsTo(Click.on(WappiPedido.MODAL_X),
		Click.on(WappiPedido.HOME),
		Click.on(WappiPedido.BOTON_PEDIR),
		Wait.unMomento(9000),
		Click.on(WappiPedido.CAMPO_CUPON),
		Enter.theValue(cupon).into(WappiPedido.CAMPO_CUPON),
		Click.on(WappiPedido.BOTON_CONFIRMAR),
		Wait.unMomento(9000));
		System.out.print(cupon);
		
		
	}

	public static SeleccionarProductoConCupon enLaPagina() {
		
		return Tasks.instrumented(SeleccionarProductoConCupon.class);
	}
	

}
