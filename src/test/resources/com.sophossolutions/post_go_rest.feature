Feature: Automatizacion de Rest Api - POM
  Yo como junior
  Necesito automatizar la peticion de una api
  Para aprender a interactuar con los servicios

  Scenario: Crear usuario con metodo post
    Given se establece la base url "https://gorest.co.in/"
    When se envia la informacion del usuario a traves del endpoint "public/v1/users/"
      | name   | Quiero Seguir Aprendiendo   |
      | gender | Male                        |
      | email  | QuieroAprenderMas@falso.com |
      | status | active                      |
    Then se valida que el status code sea 201 y contenga el nombre "Quiero Seguir Aprendiendo"