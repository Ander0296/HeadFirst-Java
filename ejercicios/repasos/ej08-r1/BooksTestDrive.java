/*
 * REPASO r1 — EJERCICIO #08 BE the Compiler: arreglos, PARTE A
 * (pág. 245-246) — programado 2026-07-31
 *
 * DESDE CERO: resolvé sin mirar tu solución original de
 * ejercicios/ej08-be-the-compiler-arrays/ ni su corrección.
 *
 * Enunciado (igual que la primera vez): este archivo representa un
 * archivo fuente COMPLETO tal como viene en el libro. Hacé de
 * compilador y contestá las TRES preguntas:
 *
 *   1. ¿Compila? (¿el compilador acepta el código?)
 *   2. ¿Se ejecuta sin excepción? (¿no revienta al correrlo?)
 *   3. Si algo falla: ¿cuál es el arreglo?
 *
 * PROGRAMA A — tal cual está en el libro (dos clases, un archivo):
 *
 *   class Books {
 *     String title;
 *     String author;
 *   }
 *
 *   class BooksTestDrive {
 *     public static void main(String[] args) {
 *       Books[] myBooks = new Books[3];
 *       int x = 0;
 *       myBooks[0].title = "The Grapes of Java";
 *       myBooks[1].title = "The Java Gatsby";
 *       myBooks[2].title = "The Java Cookbook";
 *       myBooks[0].author = "bob";
 *       myBooks[1].author = "sue";
 *       myBooks[2].author = "ian";
 *
 *       while (x < 3) {
 *         System.out.print(myBooks[x].title);
 *         System.out.print(" by ");
 *         System.out.println(myBooks[x].author);
 *         x = x + 1;
 *       }
 *     }
 *   }
 *
 * (Los títulos son parodias de novelas famosas cambiándoles una
 *  palabra por "Java": "The Grapes of Wrath" (Las uvas de la ira),
 *  "The Great Gatsby" (El gran Gatsby) y un recetario. El "by" que
 *  imprime significa "por": "El título por el autor".)
 *
 * Escribí acá abajo, a mano, la versión CORREGIDA del programa A para
 * que compile Y se ejecute sin excepción. Compilala y ejecutala.
 * Dejá también, en comentarios al final, tus respuestas a las tres
 * preguntas de arriba.
 *
 * Este repaso tiene DOS archivos — este es el programa A. Cuando
 * termines este, pasá a Hobbits.java (misma carpeta); el prompt de
 * entrega está ahí.
 *
 * Si te trabás: revisá la Sesión #40 y #42 de la guía.
 *
 * Recordá que la clase pública debe llamarse igual que el archivo:
 * BooksTestDrive. Escribí tu código DEBAJO de este bloque, todo a
 * mano.
 */
