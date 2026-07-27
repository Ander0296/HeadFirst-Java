// ============================================================
// EJERCICIO #08 — BE the Compiler ("Sé el Compilador"), PARTE B
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
// PROGRAMA B — tal cual está en el libro
// ------------------------------------------------------------
//
// class Hobbits {
//   String name;
//
//   public static void main(String[] args) {
//     Hobbits[] h = new Hobbits[3];
//     int z = 0;
//
//     while (z < 4) {
//       z = z + 1;
//       h[z] = new Hobbits();
//       h[z].name = "bilbo";
//       if (z == 1) {
//         h[z].name = "frodo";
//       }
//       if (z == 2) {
//         h[z].name = "sam";
//       }
//       System.out.print(h[z].name + " is a ");
//       System.out.println("good Hobbit name");
//     }
//   }
// }
//
// (Hobbits: los personajes bajitos de "El Señor de los Anillos".
//  Bilbo, Frodo y Sam son tres de ellos. La salida arma la frase
//  "X is a good Hobbit name" = "X es un buen nombre de Hobbit".)
//
// ------------------------------------------------------------
// TU TRABAJO
// ------------------------------------------------------------
// Escribí tu código DEBAJO de este bloque, TODO A MANO: la versión
// CORREGIDA del programa B, tal como vos creés que debe quedar para
// que compile Y se ejecute sin excepción. Compilala y ejecutala.
// Acordate: la clase pública debe llamarse igual que el archivo, y
// acá el archivo se llama Hobbits.java.
//
// Pista de método (no de solución): seguí el valor de z a mano, vuelta
// por vuelta del while, y anotá qué casillero se toca en cada una.
//
// Si te trabás: revisá la Sesión #40 y #42 de la guía (índices de un
// arreglo, length, y el recorrido con while).
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

// Compila pero no ejecuta, el problema viene que empezamos la variable z en 1
// sin tener en cuenta el objeto al que apunta h[0],
// También hay un error de desbordamiento ya que tenemos 3 objetos que debemos
// crear, pero estamos dando 4 vueltas al while.
// Con mover el aumentador y bajar a z<3 nos va compilar y ejecutar sin
// problemas.
