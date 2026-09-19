/*
 EJERCICIO #18 — Pool Puzzle: los botes (Ubicación pág. 536-537, Sesión #99)
 Tipo: completar código

 ENUNCIADO

 El programa de abajo está incompleto: le faltan pedazos (cada raya
 ______ es un hueco). Tu trabajo es completarlo con los fragmentos de
 la "piscina" (pool) que están listados más abajo, de manera que:

   1. el programa COMPILE,
   2. al ejecutar TestBoats, la salida sea EXACTAMENTE:

        drift drift hoist sail

      (drift = "a la deriva"; hoist sail = "izar la vela")

 Reglas del Pool Puzzle:
 - Un mismo fragmento se puede usar MÁS DE UNA VEZ.
 - No hace falta usar todos los fragmentos.
 - No se agregan llaves { } de más: la estructura ya está puesta.

 --------------------------------------------------------------------
 EL CÓDIGO INCOMPLETO (cuatro clases)
 --------------------------------------------------------------------

 public class Rowboat ________ ________ {        // Rowboat = bote de remos
     public ________ rowTheBoat() {              // rowTheBoat() = remar el bote
         System.out.print("stroke natasha");     // stroke natasha = "remada, Natasha"
     }
 }

 public class ________ {
     private int ________ ;
     ________ void ________ ( ________ ) {
         length = len;                           // length = largo · len = largo (abreviado)
     }
     public int getLength() {                    // getLength() = obtener el largo
         ________ ________ ;
     }
     public ________ move() {                    // move() = moverse
         System.out.print("________");
     }
 }

 public class TestBoats {                        // TestBoats = probar los botes
     ________ ________ ________ main(String[] args) {
         ________ b1 = new Boat();               // Boat = bote
         Sailboat b2 = new ________();           // Sailboat = velero
         Rowboat ________ = new Rowboat();
         b2.setLength(32);                       // setLength() = fijar el largo
         b1.________();
         b3.________();
         ________.move();
     }
 }

 public class ________ ________ Boat {
     public ________ ________() {
         System.out.print("________");
     }
 }

 --------------------------------------------------------------------
 LA PISCINA (pool) — los fragmentos disponibles
 --------------------------------------------------------------------

   Rowboat      Sailboat     Boat         TestBoats     subclasses
   extends      drift        hoist sail   rowTheBoat    move
   setLength    getLength    stroke natasha
   String       void         int          static
   public       private      return       continue      break
   int len      int length   int b1       int b2        int b3
   b1           b2           b3           length        len

 --------------------------------------------------------------------

 Si te trabás: revisá las Sesiones #93-#98 de la guía.
 Checklists: ToDo/crear-una-clase-java.md · ToDo/entregar-un-ejercicio.md

 Escribí tu código DEBAJO de este bloque, todo a mano. Acordate de que
 la clase pública tiene que llamarse igual que el archivo: si querés
 escribir las cuatro clases, hacé un archivo por clase dentro de esta
 misma carpeta (Boat.java, Sailboat.java, Rowboat.java y este
 TestBoats.java).

 --------------------------------------------------------------------
 PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):

 /entrega Hice el EJERCICIO #18 Pool Puzzle "los botes" (pág. 536-537).
 Mi código está en ejercicios/ej18-pool-puzzle-boats/. Compila así: [pegá
 acá el resultado de javac] y al ejecutarlo imprime: [pegá acá la salida].
*/
