Feature: Inicio de sesion en la pagina demo.serenity
  Como cliente debe poder iiciar sesión en la cuenta con diferentes usuarios
  para acceder a los diferentes modulos


  Scenario Outline: Inicio de sesión exitoso con un usuario valido
    Given que el cliente se encuentra en la pagina de inicio de sesion
    When ingresa las credenciales para el inicio de sesion
      |user    |pass   |
      |<user>  |<pass> |

   #Then visualiza los diferentes modulos

    Examples:
      |user             |pass        |
      |admin            |serenity    |