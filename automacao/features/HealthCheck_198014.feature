#Auto generated Octane revision tag
@TID198014REV0.2.0
Feature: This feature is to check GET API

  Scenario Outline: Verifique se o usuario pode enviar uma solicitacao GET
    Given que eu quero executar um servico no ambiente
    When envio a solicitacao GET
    Then valido o codigo de status <statuscode>

    Examples: 
      | statuscode |
      |        200 |
      