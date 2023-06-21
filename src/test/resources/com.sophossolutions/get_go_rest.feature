Feature: Automatizacion de Rest Api - POM
  Yo como junior
  Necesito automatizar la peticion de una api
  Para aprender a interactuar con los servicios

  Scenario: Consultar usuario con metodo get
    Given se establece la base url "https://gorest.co.in/"
    When se consulta en el endpoint "public/v1/users/" por id "3110754"
    Then se valida que el status code sea 200 y contenga el nombre "Quiero Seguir Aprendiendo"