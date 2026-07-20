/*
LIBRO — Pool Puzzle (pág. 129-131, Sesión #17) — OPCIONAL (ícono
Puzzle del libro, no es un Exercise obligatorio; se puede saltar sin
culpa, pero es buena práctica de rastrear bucles e if a mano).

ENUNCIADO (tal cual lo plantea el libro):
Tu trabajo es tomar fragmentos de código de "la pileta" (pool) y
colocarlos en los espacios en blanco del código de abajo. NO podés
usar el mismo fragmento más de una vez, y NO vas a necesitar usar
todos los fragmentos. Tu objetivo es armar una clase que compile,
corra, y produzca EXACTAMENTE la salida indicada. Ojo: el libro avisa
que este es más difícil de lo que parece.

SALIDA ESPERADA (al ejecutar):
% java PoolPuzzleOne
a noise
annoys
an oyster

ESQUELETO CON ESPACIOS EN BLANCO (tal cual lo da el libro — los
guiones bajos son huecos a completar, no código real):

class PoolPuzzleOne {
  public static void main(String [] args) {
    int x = 0;

    while ( __________ ) {

      __________
      if ( x < 1 ) {
        __________
      }
      __________

      if ( __________ ) {
        __________

        __________
      }
      if ( x == 1 ) {

        __________
      }
      if ( __________ ) {

        __________
      }
      System.out.println();

      __________
    }
  }
}

FRAGMENTOS DISPONIBLES EN LA PILETA (cada uno se puede usar UNA sola
vez; no hace falta usarlos todos):

  Condiciones:
    x > 0
    x < 1
    x > 1
    x > 3
    x < 4

  Asignaciones:
    x = x + 1;
    x = x + 2;
    x = x - 2;
    x = x - 1;

  Impresiones (System.out.print, todas SIN salto de línea):
    System.out.print(" ");
    System.out.print("a");
    System.out.print("n");
    System.out.print("an");
    System.out.print("noys ");
    System.out.print("oise ");
    System.out.print(" oyster ");
    System.out.print("annoys");
    System.out.print("noise");

Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (while, if,
operadores de comparación) y pensá en construir la salida letra por
letra, print tras print, en vez de una sola línea.

Escribí tu código DEBAJO de este bloque, todo a mano (recordá que la
clase pública tiene que llamarse igual que el archivo: PoolPuzzleOne).

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

Hice el ejercicio #04, está en ejercicios/ej04-pool-puzzle/.
Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
Revisalo línea por línea: qué está bien, qué está mal y POR QUÉ, y
actualizá su estado y tu corrección en EJERCICIOS.md. Si quedó
completado, agendá sus repasos.
*/

class PoolPuzzleOne {
  public static void main(String [] args) {
    int x = 0;

    while ( x < 4 ) {

            x = x-1;
      if ( x < 1 ) {
                System.out.print("a");
      }
      __________

      if ( __________ ) {
        __________

        __________
      }
      if ( x == 1 ) {

        __________
      }
      if ( __________ ) {

        __________
      }
      System.out.println();

      __________
    }
  }
}
