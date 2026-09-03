/*
 EJERCICIO #15 — "Agenda de contactos" (ejercicio del profe, 2026-09-02)

 Sale del examen en frío del 2026-09-02: junta los tres puntos que se
 cayeron ahí. Es corto a propósito; lo que importa es escribirlo entero
 a mano, sin mirar ejercicios viejos.

 ENUNCIADO

 Escribí DOS archivos en esta misma carpeta:

 (1) Agenda.java — la clase Agenda, que guarda contactos.

     - Tiene UNA variable de instancia: una lista de textos con los
       nombres de los contactos. Tiene que ser una lista que CREZCA
       (los contactos se agregan y se borran), no un arreglo de tamaño
       fijo. Esa clase de lista NO viene puesta en Java: hay que
       escribir arriba del archivo la linea que le dice al compilador
       de donde sacarla.
     - Esa variable de instancia va escondida del resto del programa:
       nadie de afuera puede tocarla directamente.
     - Metodo agregar(String nombre): guarda el nombre en la lista,
       PERO solo si el nombre no esta vacio (""). Si esta vacio,
       imprime "Nombre invalido." y no guarda nada. Esta validacion es
       el motivo entero de esconder la variable: escribila vos, no la
       saltees.
     - Metodo borrar(String nombre): saca ese nombre de la lista.
     - Metodo cuantos(): DEVUELVE (no imprime) cuantos contactos hay
       guardados ahora mismo.
     - Metodo listarConIndice(): recorre la lista con un for clasico de
       tres partes (el de int i = 0; ...; i++) e imprime cada contacto
       con su numero de posicion, asi:
         0 - Ana
         1 - Beto
     - Metodo listarSimple(): recorre la MISMA lista pero con el for
       mejorado (el de los dos puntos) e imprime solo los nombres.
       Los dos metodos tienen que imprimir los mismos nombres.

 (2) AgendaTestDrive.java — la clase con el main que la prueba.

     - Crea una Agenda.
     - Agrega "Ana", "Beto" y "Carla".
     - Intenta agregar "" (texto vacio) y muestra que NO entra.
     - Llama a listarConIndice().
     - Borra "Beto".
     - Llama a listarSimple().
     - Imprime cuantos contactos quedan, usando lo que DEVUELVE
       cuantos(). Algo como: "Quedan 2 contactos."

 TRAMPAS QUE YA TE MORDIERON (no son pistas: son avisos)

 - Una lista que crece y un arreglo comun NO se recorren igual. Antes
   de escribir el for clasico, mira el checklist.
 - Un metodo que promete devolver algo tiene que devolverlo por TODOS
   los caminos posibles, no imprimirlo.
 - Si dentro de un metodo escribis el tipo delante del nombre de la
   variable de instancia, estas creando otra variable distinta que
   muere al terminar el metodo.

 Si te trabas: revisa la Sesion #78 a #81 de la guia (listas que crecen
 y como traer una clase que no viene puesta) y la Sesion #22 a #25
 (variables de instancia y metodos).
 Checklist: ToDo/recorrer-una-coleccion.md y ToDo/crear-una-clase-java.md

 Escribi tu codigo DEBAJO de este bloque, todo a mano. Acordate de que
 la clase publica tiene que llamarse igual que el archivo: la de aca
 abajo se llama Agenda, y la del otro archivo, AgendaTestDrive.

 ------------------------------------------------------------------
 PROMPT DE ENTREGA (copialo tal cual cuando termines):

 /entrega Termine el EJERCICIO #15 "Agenda de contactos" (ejercicio del
 profe, del examen del 2026-09-02). Esta en
 ejercicios/ej15-agenda/Agenda.java y
 ejercicios/ej15-agenda/AgendaTestDrive.java. Resultado de compilar y
 ejecutar: <pega aca lo que te dijo javac/java>
 ------------------------------------------------------------------
*/
