package com.wolox.certificacion.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.wolox.certificacion.models.Credenciales;



public class LecturaCredenciales {
	
	public static Credenciales deLaAplicacion() throws FileNotFoundException, IOException {
		Credenciales credenciales= null;
	      String cadena;
	      FileReader f = new FileReader("Credenciales.csv");
	      BufferedReader b = new BufferedReader(f);
	      while((cadena = b.readLine())!=null) {
	    	  if(!cadena.contains("usuario")) {
	    		  credenciales= new Credenciales(cadena.split(",")[0], cadena.split(",")[1]);
	    	  }
	      }
	      b.close();
	      return credenciales;
	}

}
