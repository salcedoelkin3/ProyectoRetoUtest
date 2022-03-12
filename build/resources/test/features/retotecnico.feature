#language:es
  #Autor: Elkin Salcedo

@Historia
Característica: como estudiante quiero crear un nuevo usuario para registrarme en la pagina utest y verificar el mensaje

  @escenario
  Esquema del escenario: Escenario: realizar registro de usuario
    Dado que Elkin quiere registrar un usuario

    Cuando el hace el registro del formulario en la pagina utest
      | nombre   | apellido   | email   | mes   | dia   | ano   | lenguaje   | ciudad   | postal   | pais   | movil   | modelo   | so   | contrasena   | confirmacion   |
      | <nombre> | <apellido> | <email> | <mes> | <dia> | <ano> | <lenguaje> | <ciudad> | <postal> | <pais> | <movil> | <modelo> | <so> | <contrasena> | <confirmacion> |

    Entonces verifica que se presente en pantalla el mensaje Welcome to the world's largest community of freelance software testers!
      | validacion   |
      | <validacion> |

    Ejemplos:
      | nombre | apellido | email       | mes   | dia | ano  | lenguaje | ciudad   | postal | pais     | movil | modelo   | so       | contrasena         | confirmacion       | validacion                                                              |
      | Raul   | Perez    | raul1@p.com | April | 19  | 2000 | Italian  | Montería | 230003 | Colombia | Apple | iPhone 4 | iOS 11.3 | 1234567890ASDFG*hh | 1234567890ASDFG*hh | Welcome to the world's largest community of freelance software testers! |
