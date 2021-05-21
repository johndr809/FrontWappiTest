package com.wolox.certificacion.exceptions;

import java.text.MessageFormat;



public class MensajeDiferente extends AssertionError {
	public MensajeDiferente(String message, Throwable cause) {
		super(message, cause);
	}
	
	public static MensajeDiferente enPantalla(String message, Throwable cause) {
		return new MensajeDiferente(message, cause);
	}
	
	
	public static String MensajeDiferente(String mensaje) {
		return MessageFormat.format("el error {0} ", mensaje);
	}


}
