package com.wolox.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class WappiLogin {
			
		public static final Target CAMPO_USUARIO = Target.the("Campo para ingresar el usuario").locatedBy("//*[@id='username']");
		public static final Target CAMPO_CONTRASENA = Target.the("Campo para ingresar la contrasena").locatedBy("//*[@id='password']");
		public static final Target BOTON_INGRESAR = Target.the("Boton Ingresar").locatedBy("//*[@id='button-login']");
		

}
