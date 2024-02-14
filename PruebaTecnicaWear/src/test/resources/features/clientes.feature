Feature: Creacion de clientes
  Como usuario debe poder crear un cliente
  para acceder a los diferentes productos


  Scenario Outline: Creacion de un cliente

    Given que el cliente se encuentra en la pagina de inicio de sesion
    When ingresa las credenciales para el inicio de sesion
      |user    |pass   |
      |<user>  |<pass> |
    And crea un nuevo cliente en el modulo Northwing customers
    |id    |nombreempresa  |contacto  |titulo  |representante   |direccion  |pais  |region      |telefono   |ciudad  |postal |fax     |fecha     |ultimocontacto |email      |
    |<id>  |<nombreempresa>|<contacto>|<titulo>| <representante>|<direccion>|<pais>|<region>    |<telefono> |<ciudad>|<postal>|<fax>  |<fecha>  |<ultimocontacto>|<email>    |

    And crea un producto cliente en el modulo Northwing products

    |nombreproducto   |stock   |pedido  |reorden  |
    |<nombreproducto> |<stock> |<pedido>|<reorden>|

  #  And realiza un pedido en el modulo Northwing orders con los datos

   #|nombreempresa    |nombreproducto     |fechapedido   |preciou  |cantidad  |descuento|
   #|<nombreempresa> | <nombreproducto>  |<fechapedido> |<preciou>|<cantidad>|<descuento>  |

   # Then valida que el precio del orden sea <preciou>

    Examples:
      |user             |pass        |id        |nombreempresa|contacto    |titulo         |representante  |direccion     |pais       |region   |telefono   |ciudad|postal|fax       |fecha       |ultimocontacto  |email              |nombreproducto   |stock  |pedido |reorden|fechapedido |preciou |cantidad|descuento|
      |admin            |serenity    |AI123     |nikeaI       |pepe        |ingeniero      |Andrew Fuller  |calle 12-14-30|Austria    |colombia |3124567890 |Graz  |456    |3345555  |20/02/2/24  | Anne Dodsworth|pepe@gmail.com      |pruebas2         | 10    | 1     |1      |20/02/2/24  |5000    | 1       |100|
