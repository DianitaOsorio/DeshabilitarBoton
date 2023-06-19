#language: es
Característica: probar login en la app

  Esquema del escenario: login en el sitio
    Dado Diana se encuentra en la app mi movistar
    Cuando Diana digita la siguiente informacion
      | usuario   | contrasena   |
      | <usuario> | <contrasena> |
    Entonces Diana podra ver el <texto> en el sitio
    Ejemplos:
      | usuario                 | contrasena      | texto              |
      | pruebasaxia86@gmail.com | Mimovistar2023* | Prod Tradicionales |

