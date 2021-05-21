package com.wolox.certificacion.models;

public class Credenciales {
	
	private  String usuario,contrasena;

	public String getUsuario() {
		return usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public Credenciales(String usuario, String contrasena) {
		super();
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
}	