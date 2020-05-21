#Author: your.email@your.domain.com

@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campo a travez del globo informativo.

  @CasoExitoso
  Scenario: Diligenciar de manera exitosa el Popup Validaption,
  no se presenta ningún mensaje de validación.
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validaption
    When Diligencio el formulario Popup Validaption
      |Require|Select|MultipleS1|MultipleS2|Url                  |Email          |Password1|Password2|MinSize|MaxSize|Number|Ip         |Date      |DateEarlier|
      |valor1 |Golf  |Tennis    |Football      |http://www.valor1.com|valor1@mail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2020-05-12|2012/09/12 |
    Then Verifico el ingreso exitoso
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When  I check for the <value> in step
    Then  I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
