# Que cosas importantes faltan implementar! (Viernes 2/12)

* Probar que la nueva implementacion de movimiento con los estados funcione correctamente.
* Que estacion de venta funcione bien. Ahora lo hace pero tiene errores cuando entras y salis. El problema es la funcion que cuenta.
* Que la estacion de reparacion funcione.
* Hacer algo con los bordes del mapa. Poner otra imagen o no se.
* Musica, sonidos. Para los sonidos, crear una nueva varia
* Config file.
* Afinar animaciones de pj.
* Slots de guardados.
* Dar una historia
* Revisar Flywheel y Controller. Con controller se puede dar la opcion de customizar los movimientos.

# URGENTE

* Pasar todas las tiendas a root en vez de popup (algunas ya están)
* Leer todo el código, hay muchos cambios por todos lados y anotaciones.
* Agregar la opción de Explosivos, existe la clase pero no está en el HashMap de la TiendaDeConsumibles y nos puede generar problemas!!
* Ver de crear un método actualizar para las tiendas. Una cosa es inicializar el pane y el root y todo eso, y otra cosa es actualizar los valores según el estado actual del personaje :P.
* Tiendas:
- Estación de Venta: ya casi está, no más que no llama a interactuar JAJAJAJAJAJA está vendiendo ahí de una. Creo que está mal eso también, tendría que llamar a interactuar de su correspondiente tienda. Pero es eso no más :P
- Estación de Consumibles: tiene seteados los botones para vender pero no se muestra (por el problema de que todavía no sabemos dónde mostrarla). Tiene el fondo, tiene la X para cerrar, pero le falta acomodar los botones y los label en la pantalla porque se corta la imagen del fondo cuando movés algo. 
- Estación de Servicio: te adjunto la clase que hice aparte porque no me deja mover al personaje JAJAJAJAJAJAJAJJA
- Estación de Reparación: hay que armarla, es igual a la de servicio, mi idea era que hagamos una superclase y dos subclases pero no sé.
- Tienda de Mejoras: hay que ponerle fondo (no me toma el fondo), los botones van bien donde están, pero hay que ponerles los setOnAction(...).

# IMPORTANTE
- Movimiento.
- Animación correcta del taladro.
- Sonido al taladrar (va de la mano con la animacion creo).
- Musica.
- Dar una manera de ganar el juego.
- Darle estado al juego.
- Agregar la mecanica de daño. (hay una función, ver qué onda con eso :P)
- 
# EXTRA 
- Pausa (ya tenemos el menu igual, creo que con eso alcanza).
- Darle historia al juego.
- Apartado configuracion:
    - Resolución de la ventana.
    - Volumen de la musica y sonidos.
    - Dificultad (yo pensaba en que la dificultad sea el tamaño del mapa, maybe cantidad de minerales).
- Save y Load.
- Zoom in y Zoom out + Resize de la ventana
