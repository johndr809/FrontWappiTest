package com.wolox.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class WappiPedido {
	
	public static final Target BOTON_PEDIR = Target.the("Boton para realizar el pedido").locatedBy("//*[@id=\"offer-0\"]/td[7]/button");
	public static final Target BOTON_CONFIRMAR = Target.the("Boton para confirmar pedido").locatedBy("//*[@id='order-confirm']");
	public static final Target CAMPO_CUPON = Target.the("Campo para ingresar cupon de descuento").locatedBy("//*[@id='coupon']");
	public static final Target PEDIDO_EXITOSO = Target.the("Campo para ingresar cupon de descuento").locatedBy("//*[@id='coupon']");
	public static final Target BOTON_PEDIR2 = Target.the("Boton para realizar el pedido").locatedBy("//*[@id='offer-2']/td[7]/button");
	public static final Target BOTON_PEDIR1 = Target.the("Boton para realizar el pedido").locatedBy("//*[@id=\"offer-1\"]/td[7]/button");
	public static final Target BOTON_CUPON = Target.the("Boton para generar el cupon").locatedBy("//*[@id='welcome-coupon']");
	public static final Target CODIGO_CUPON = Target.the("codigo para capturar el cupon").locatedBy("//*[@id=\'coupon-0\']/td[1]");
	public static final Target HOME = Target.the("Modal para capturar el cupon").locatedBy("/html/body/app-root/app-coupons/app-nav-bar/nav/ul[1]/li[1]/a");
	public static final Target MODAL_X = Target.the("opcion para cerrar modal de cupon").locatedBy("//body[1]/app-root[1]/app-coupon-modal[1]/div[1]/div[1]/span[1]");
	public static final Target MODAL_CODIGO = Target.the("Modal donce se recupera el cupon").locatedBy("//*[@id=\"coupon-code\"]");
	public static final Target MODAL_PEDIDO_X = Target.the("opcion para cerrar modal de cupon").locatedBy("//*[@id=\"confirmation-modal\"]/div/span");
		

}
