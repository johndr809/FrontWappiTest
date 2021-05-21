#Author: John Alexander Diaz Ramirez

Feature: Experiencia de Wappi
  Como cliente
  Quiero realizar compra de comida
  A traves del home de wappi delivery de comidas

  Background:
    Given que el cliente ingresa a la pagina de Wappi a traves de la autenticacion con sus credenciales

    @compra_sin_cupon
    Scenario: Verificar que el cliente sin cupon de descuento pueda realizar su pedido exitosamente
    When selecciona el producto Aceite de Girasol para hacer el pedido 
    Then puede ver el mensaje en pantalla: Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
             
     @compra_con_cupon
    Scenario: Verificar que el cliente con cupon de descuento pueda realizar su pedido exitosamente
    When genera cupon y selecciona el producto Jamón Premium para hacer el pedido
    Then puede ver el mensaje en pantalla: Tu pedido ha sido confirmado, te mantendremos informado ante nuevas novedades
      
     @consulta_pedidos
    Scenario: Verificar que el cliente pueda consultar los pedidos realizados
    When genera cupon y selecciona el producto Jamón Premium para hacer el pedido y consultar
    Then puede ver en pantalla lo comprado: Jamón Premium
      