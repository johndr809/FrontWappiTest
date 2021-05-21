#Author: John Alexander Diaz Ramirez

Feature: Experiencia de Wappi
  Como cliente
  Quiero realizar compra de comida
  A traves del home de wappi delivery de comidas

  Background:
    Given que el cliente ingresa a la pagina de Wappi a traves de la autenticacion con sus credenciales


    Scenario: Verificar que el cliente sin cupon de descuento pueda realizar su pedido exitosamente
    When el cliente selecciona el producto para hacer el pedido
      | fecha   | descripcion | precio | envio   | comercio | direccion |
      | 18/05/2021  | Aceite de Girasol | $20,000.00 | $2,000.00   | Premier | Tr. 13 #12-34 |
    Then el cliente realiza su pedido exitosamenteiza su pedido exitosamente