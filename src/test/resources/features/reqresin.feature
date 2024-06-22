Feature: Servicio Rest con Serenity

  Scenario: Servicio Rest reqres.in
    Given que me encuentro con la URI de reqres
    When realice el GET del servicio
    Then validare que el codigo del estado del servicio final sea 200