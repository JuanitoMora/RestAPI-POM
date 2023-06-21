Feature: Automatizacion de Rest Api - POM
  Yo como junior
  Necesito automatizar la peticion de una api
  Para aprender a interactuar con los servicios

  Scenario: Eliminar usuario con metodo delete
    Given se establece la base url "https://gorest.co.in/"
    When se consulta en el endpoint "public/v1/users/" el usuario a eliminar por id "3110754"
      | email | QuieroMAS@falso.com |
    Then se valida que el status code sea 204