/*
 * REPASO r1 — EJERCICIO #08 BE the Compiler: arreglos, PARTE B
 * (pág. 245-246) — programado 2026-07-31
 *
 * DESDE CERO: sin mirar tu solución original ni su corrección.
 *
 * Mismas TRES preguntas que en la parte A:
 *
 *   1. ¿Compila?
 *   2. ¿Se ejecuta sin excepción?
 *   3. Si algo falla: ¿cuál es el arreglo?
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
 *  Bilbo, Frodo y Sam son tres de ellos. La salida arma la frase
 *  "X is a good Hobbit name" = "X es un buen nombre de Hobbit".)
 *
 * Pista de método (no de solución): seguí el valor de z a mano, vuelta
 * por vuelta del while, y anotá qué casillero se toca en cada una.
 *
 * Escribí acá abajo, a mano, la versión CORREGIDA del programa B, y
 * dejá en comentarios al final tus respuestas a las tres preguntas.
 *
 * Si te trabás: revisá la Sesión #40 y #42 de la guía.
 *
 * Recordá que la clase pública debe llamarse igual que el archivo:
 * Hobbits. Escribí tu código DEBAJO de este bloque, todo a mano.
 *
 * PROMPT DE ENTREGA (copiá y pegá esto cuando termines los DOS
 * archivos):
 * -------------------------------------------------------
 * Hice el repaso r1 del ejercicio #08 (BE the Compiler, arrays), está
 * en ejercicios/repasos/ej08-r1/. Compiló: [sí/no]. Al ejecutarlo:
 * [pego abajo la salida o el error]. Comparalo con mi solución
 * original (sin mostrármela antes) y decime qué mejoré y qué se
 * repitió. Actualizá EJERCICIOS.md: si salió bien, agendá el r2; si
 * salió mal, acortá el intervalo a ~3 días.
 */
