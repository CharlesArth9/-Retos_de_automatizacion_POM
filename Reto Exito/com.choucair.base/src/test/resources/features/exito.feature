
@Prueba

Feature:  Utilizar la aplicación Trello para realizar un control de las actividades planeadas,
  que se están realizando y finalizadas en un equipo de trabajo.


  @CasoExito
  Scenario: Realizar dla compra de un TV en la pagina de Exito
    Given  el usuario ingresa a la pagina de tiendas Exito
    When  busca un televisor usando el buscador con los filtros
      | producto |  marca  | resolucion  |  pulgadas   |
      | televisores |  LG  | uhd-4k  |  49   |
    Then  realiza la compra con envio a su domicilio

