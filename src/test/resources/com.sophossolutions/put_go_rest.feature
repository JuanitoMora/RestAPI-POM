Feature: Automatizacion de Rest Api - POM
  Yo como junior
  Necesito automatizar la peticion de una api
  Para aprender a interactuar con los servicios

  Scenario: Modificar usuario con metodo put
    Given se establece la base url "https://gorest.co.in/"
    When se envia la informacion del usuario a modificar a traves del endpoint "public/v1/users/" por id "3110754"
      | name  | Quiero Aprender Mas |
      | email | QuieroMAS@falso.com |
    Then se valida que el id "3110754" contenga el nombre "Quiero Aprender Mas" y el email "QuieroMAS@falso.com"