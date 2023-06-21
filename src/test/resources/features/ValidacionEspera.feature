#language: es

Característica: Validar la espera habilitar boton

  @EsperaHabilitarBoton
  Escenario: validar la espera de la activacion del boton
    Dado que el usuario esta en la pantalla de redenciones
    Cuando da click al boton se visualiza de color gris
    Entonces se debe esperar unos segundos que se active el boton
    Cuando se le da click varias veces
    Entonces validar que se visualice de color azul y luego se visualiza modal


