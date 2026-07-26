// ============================================================
// EJERCICIO #08 — BE the Compiler ("Sé el Compilador"), PARTE A
// Head First Java, 3ra ed., Ubicación pág. 245-246 (Sesión #42)
// ============================================================
//
// ENUNCIADO (traducido del libro):
//
//   "Cada uno de los archivos Java de esta página representa un
//    archivo fuente COMPLETO. Tu trabajo es hacer de compilador y
//    determinar si cada uno de estos archivos compilará y se
//    ejecutará SIN EXCEPCIÓN. Si no lo hacen, ¿cómo los arreglarías?"
//
// Son DOS preguntas distintas, contestá las dos:
//   1. ¿Compila? (¿el compilador acepta el código?)
//   2. ¿Se ejecuta sin excepción? (¿no revienta al correrlo?)
//   3. Si algo falla: ¿cuál es el arreglo?
//
// ------------------------------------------------------------
// PROGRAMA A — tal cual está en el libro (dos clases, un archivo)
// ------------------------------------------------------------
//
// class Books {
//   String title;
//   String author;
// }
//
// class BooksTestDrive {
//   public static void main(String[] args) {
//     Books[] myBooks = new Books[3];
//     int x = 0;
//     myBooks[0].title = "The Grapes of Java";
//     myBooks[1].title = "The Java Gatsby";
//     myBooks[2].title = "The Java Cookbook";
//     myBooks[0].author = "bob";
//     myBooks[1].author = "sue";
//     myBooks[2].author = "ian";
//
//     while (x < 3) {
//       System.out.print(myBooks[x].title);
//       System.out.print(" by ");
//       System.out.println(myBooks[x].author);
//       x = x + 1;
//     }
//   }
// }
//
// (Los títulos son parodias de novelas famosas cambiándoles una
//  palabra por "Java": "The Grapes of Wrath" (Las uvas de la ira),
//  "The Great Gatsby" (El gran Gatsby) y un recetario. El "by" que
//  imprime significa "por": "El título por el autor".)
//
// ------------------------------------------------------------
// TU TRABAJO
// ------------------------------------------------------------
// Escribí tu código DEBAJO de este bloque, TODO A MANO: la versión
// CORREGIDA del programa A, tal como vos creés que debe quedar para
// que compile Y se ejecute sin excepción. Compilala y ejecutala.
// Acordate: la clase pública debe llamarse igual que el archivo, y
// acá el archivo se llama BooksTestDrive.java.
//
// Si te trabás: revisá la Sesión #40 y #42 de la guía (crear un
// arreglo de objetos y el operador punto sobre un elemento).
//
// ============================================================
// PROMPT DE ENTREGA — copiá esto y pegalo en Claude cuando termines
// ============================================================
//
// Hice el ejercicio #08 (BE the Compiler, arrays), está en
// ejercicios/ej08-be-the-compiler-arrays/.
// Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
// Revisalo línea por línea EN EL CHAT: qué está bien, qué está mal y POR
// QUÉ. En EJERCICIOS.md actualizá el estado con una corrección de 3
// líneas como máximo; si quedó completado, movelo con su corrección a
// EJERCICIOS-ARCHIVO.md y agendá sus repasos.
//
// ============================================================
