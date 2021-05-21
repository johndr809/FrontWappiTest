package com.wolox.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ConsultarPedido {
	
	public static final Target CAMPO_PRODUCTO = Target.the("Campo donde se muestra el producto").locatedBy("//*[@id='order-0']/td[2]");
	public static final Target OPCION_PEDIDOS = Target.the("Opcion donde se muestra el pedido").locatedBy("//body[1]/app-root[1]/app-home[1]/app-nav-bar[1]/nav[1]/ul[1]/li[3]/a[1]");
	
	
}
