#language: es

Característica: Boton conoce mas
  @BotonConoceMas
  Escenario: validar el ingreso a la sesion noticias de tus servicios
    Dado que el usuario esta en el home de movistar preferencial
    Cuando visualiza la preview de la sesion noticias
    Entonces da click en el boton conoce mas
    Entonces lo direcciona a la pantalla principal de la noticia
