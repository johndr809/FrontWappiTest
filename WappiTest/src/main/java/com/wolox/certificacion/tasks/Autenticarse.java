package com.wolox.certificacion.tasks;




import com.wolox.certificacion.models.Credenciales;
import com.wolox.certificacion.userinterfaces.WappiLogin;
import com.wolox.certificacion.utils.LecturaCredenciales;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Autenticarse implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		Credenciales credenciales=null;
		try {
			credenciales = LecturaCredenciales.deLaAplicacion();
		} catch (Exception e) {
			e.printStackTrace();
			}
		actor.attemptsTo(Click.on(WappiLogin.CAMPO_USUARIO),
		Enter.theValue(credenciales.getUsuario()).into(WappiLogin.CAMPO_USUARIO),
		Click.on(WappiLogin.CAMPO_CONTRASENA),
		Enter.theValue(credenciales.getContrasena()).into(WappiLogin.CAMPO_CONTRASENA),
		Click.on(WappiLogin.BOTON_INGRESAR));
		
	}
	public static Autenticarse conSusCredenciales() {
		return Tasks.instrumented(Autenticarse.class);
	}


}
