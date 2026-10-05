// REPASO r1 — EJERCICIO #18 Pool Puzzle: los botes (pág. 536-537)
// Desde CERO: no mires tu versión anterior.
//
// ENUNCIADO
//
// El programa de abajo está incompleto: le faltan pedazos (cada raya
// ______ es un hueco). Tu trabajo es completarlo con los fragmentos de
// la "piscina" (pool) que están listados más abajo, de manera que:
//
//   1. el programa COMPILE,
//   2. al ejecutar TestBoats, la salida sea EXACTAMENTE:
//
//        drift drift hoist sail
//
//      (drift = "a la deriva"; hoist sail = "izar la vela")
//
// Reglas del Pool Puzzle:
// - Un mismo fragmento se puede usar MÁS DE UNA VEZ.
// - No hace falta usar todos los fragmentos.
// - No se agregan llaves { } de más: la estructura ya está puesta.
//
// --------------------------------------------------------------------
// EL CÓDIGO INCOMPLETO (cuatro clases)
// --------------------------------------------------------------------
//
// public class Rowboat extends Boat {        // Rowboat = bote de remos
//     public void rowTheBoat() {              // rowTheBoat() = remar el bote
//         System.out.print("stroke natasha");     // stroke natasha = "remada, Natasha"
//     }
// }
//
// public class Boat {
//     private int length ;
//     public void setLength ( int len ) {
//         length = len;                           // length = largo · len = largo (abreviado)
//     }
//     public int getLength() {                    // getLength() = obtener el largo
//         return length ;
//     }
//     public void move() {                    // move() = moverse
//         System.out.print("drift");
//     }
// }
//
// public class TestBoats {                        // TestBoats = probar los botes
//     public static void main(String[] args) {
//         Boat b1 = new Boat();               // Boat = bote
//         Sailboat b2 = new Sailboat();           // Sailboat = velero
//         Rowboat b3 = new Rowboat();
//         b2.setLength(32);                       // setLength() = fijar el largo
//         b1.move();
//         b3.move();
//         b2.move();
//     }
// }
//
// public class Sailboat extends Boat {
//     public void move() {
//         System.out.print("hoist sail");
//     }
// }
//
// --------------------------------------------------------------------
// LA PISCINA (pool) — los fragmentos disponibles
// --------------------------------------------------------------------
//
//   Rowboat      Sailboat     Boat         TestBoats     subclasses
//   extends      drift        hoist sail   rowTheBoat    move
//   setLength    getLength    stroke natasha
//   String       void         int          static
//   public       private      return       continue      break
//   int len      int length   int b1       int b2        int b3
//   b1           b2           b3           length        len
//
// DICCIONARIO DE LA PISCINA (qué significa cada fragmento en inglés):
//   Rowboat = bote de remos · Sailboat = velero · Boat = bote
//   TestBoats = probar los botes · subclasses = subclases
//   extends = extiende (hereda de) · drift = a la deriva
//   hoist sail = izar la vela · rowTheBoat = remar el bote
//   move = moverse · setLength = fijar el largo · getLength = obtener el largo
//   stroke natasha = "remada, Natasha" (Natasha es un nombre de persona)
//   return = devolver · continue = continuar (saltar a la próxima vuelta)
//   break = cortar (salir del bucle)
//   len = largo (abreviado) · length = largo
//   (String, void, int, static, public, private: palabras de Java que ya conocés)
//
// Antes de completar, contestá también en un comentario, con tus palabras:
//   - ¿Por qué b3.move() imprime lo que imprime?
//
// R/ b3 imprime drift debido a que es un método heredado de la superclase Boat, como no lo sobreescribe ejecuta la verisón que tiene por defecto la clase Boat.
// --------------------------------------------------------------------
//
// Si te trabás: revisá las Sesiones #93-#98 de GUIA-JAVA.md.
// Checklists: ToDo/crear-una-clase-java.md · ToDo/entregar-un-ejercicio.md
//
// Escribí tu código DEBAJO de este bloque, todo a mano. Acordate de que
// la clase pública tiene que llamarse igual que el archivo: si querés
// escribir las cuatro clases, hacé un archivo por clase dentro de esta
// misma carpeta (Boat.java, Sailboat.java, Rowboat.java y este
// TestBoats.java).
//
// --------------------------------------------------------------------
// PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):
//
// /entrega Hice el REPASO r1 del EJERCICIO #18 Pool Puzzle "los botes"
// (pág. 536-537). Mi código está en ejercicios/repasos/ej18-r1/. Compila
// así: [pegá acá el resultado de javac] y al ejecutarlo imprime: [pegá
// acá la salida].
//

class Rowboat extends Boat { // Rowboat = bote de remos
    public void rowTheBoat() { // rowTheBoat() = remar el bote
        System.out.print("stroke natasha"); // stroke natasha = "remada, Natasha"
    }
}

class Boat {
    private int length;

    public void setLength(int len) {
        length = len; // length = largo · len = largo (abreviado)
    }

    public int getLength() { // getLength() = obtener el largo
        return length;
    }

    public void move() { // move() = moverse
        System.out.print("drift ");
    }
}

public class TestBoats { // TestBoats = probar los botes
    public static void main(String[] args) {
        Boat b1 = new Boat(); // Boat = bote
        Sailboat b2 = new Sailboat(); // Sailboat = velero
        Rowboat b3 = new Rowboat();
        b2.setLength(32); // setLength() = fijar el largo
        b1.move();
        b3.move();
        b2.move();
    }
}

class Sailboat extends Boat {
    public void move() {
        System.out.print("hoist sail");
    }
}
