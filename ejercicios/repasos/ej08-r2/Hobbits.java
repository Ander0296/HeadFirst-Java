/*
 * REPASO r2 — EJERCICIO #08 BE the Compiler: arreglos, PARTE B
 * (pág. 245-246) — programado 2026-09-24
 *
 * DESDE CERO: sin mirar tu solución original, ni el r1, ni sus
 * correcciones.
 *
 * Mismas TRES preguntas que en la parte A:
 *
 *   1. ¿Compila?
 *   Si compila y ejecuta, encuentra el error en la vuelta 3 del bucle while
 *   cuando le pide crear un objeto de tipo Hobbit en el indice 3 del arreglo.
 *   cuando el arreglo solo llega hasta 2 es decir tiene los indices 0, 1 y 2.
 *   Si compila
 *   2. ¿Se ejecuta sin excepción?
 *   Ejecuta hasta que encuentra el error en el arreglo y tira ArrayIndexOutOfBoundsException
 *   3. Si algo falla: ¿cuál es el arreglo?
 *   El arreglo es mover la linea que aumenta la variable z
 *   y reducir la condicion del bucle en 3
 *
 * PROGRAMA B — tal cual está en el libro:
 *
 *   class Hobbits {
 *     String name;
 *
 *     public static void main(String[] args) {
 *       Hobbits[] h = new Hobbits[3];
 *       int z = 0;
 *
 *       while (z < 4) {
 *         z = z + 1;
 *         h[z] = new Hobbits();
 *         h[z].name = "bilbo";
 *         if (z == 1) {
 *           h[z].name = "frodo";
 *         }
 *         if (z == 2) {
 *           h[z].name = "sam";
 *         }
 *         System.out.print(h[z].name + " is a ");
 *         System.out.println("good Hobbit name");
 *       }
 *     }
 *   }
 *
 * (Hobbits: los personajes bajitos de "El Señor de los Anillos".
 *  Bilbo, Frodo y Sam son tres de ellos. name = nombre. La salida arma
 *  la frase "X is a good Hobbit name" = "X es un buen nombre de
 *  Hobbit".)
 *
 * Pista de método (no de solución): seguí el valor de z a mano, vuelta
 * por vuelta del while, y anotá qué casillero se toca en cada una.
 *
 * Escribí acá abajo, a mano, la versión CORREGIDA del programa B, y
 * dejá en comentarios al final tus respuestas a las tres preguntas.
 *
 * Si te trabás: revisá la Sesión #40 y #42 de GUIA-JAVA.md
 * (si no están ahí, están en GUIA-ARCHIVO.md).
 * Checklist: ToDo/entregar-un-ejercicio.md (Nivel 3).
 *
 * Recordá que la clase pública debe llamarse igual que el archivo:
 * Hobbits. Escribí tu código DEBAJO de este bloque, todo a mano.
 *
 * PROMPT DE ENTREGA (copiá y pegá esto cuando termines los DOS
 * archivos):
 * -------------------------------------------------------
 * /entrega Hice el REPASO r2 del ejercicio #08 "BE the Compiler:
 * arreglos" (pág. 245-246), está en ejercicios/repasos/ej08-r2/
 * (BooksTestDrive.java y Hobbits.java). Compiló: [sí/no]. Al
 * ejecutarlo: [pego abajo la salida o el error de cada programa].
 * Comparalo con mi solución original y con el r1 (sin mostrármelas
 * antes) y decime qué mejoré y qué se repitió.
 */

class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits[] h = new Hobbits[3];
        int z = 0;

        while (z < 3) {
            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1) {
                h[z].name = "frodo";
            }
            if (z == 2) {
                h[z].name = "sam";
            }
            System.out.print(h[z].name + " is a ");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }
}
