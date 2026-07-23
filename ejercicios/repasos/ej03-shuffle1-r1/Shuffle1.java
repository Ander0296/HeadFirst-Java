// REPASO r1 — Code Magnets: "Shuffle1" (pág. 121-122)
// Head First Java, Capítulo 1. Repaso del ejercicio de la Sesión #15
// (programado para 2026-07-21).
//
// Se hace DESDE CERO: resolvé sin mirar tu versión original. Es
// normal si no te acordás del orden exacto que usaste — de eso se
// trata un repaso.
//
// Enunciado (igual que la primera vez): reordená estos imanes (sin
// cambiar lo que dice cada uno) para armar un programa Java que
// compile y que, al correr `java Shuffle1`, imprima EXACTAMENTE:
//
//   a-b c-d
//
// Los imanes:
//
//   if (x == 1) {
//       System.out.print("d");
//       x = x - 1;
//   }
//
//   if (x == 2) {
//       System.out.print("b c");
//   }
//
//   class Shuffle1 {
//       public static void main(String [] args) {
//
//   if (x > 2) {
//       System.out.print("a");
//   }
//
//   int x = 3;
//
//   x = x - 1;
//   System.out.print("-");
//
//   while (x > 0) {
//
// Ojo: algunas llaves { } de cierre no vienen en los imanes — agregá
// todas las que hagan falta.
//
// Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (while,
// if/else).
//
// Escribí tu versión armada DEBAJO de este bloque, todo a mano.
// Recordá que la clase pública debe llamarse igual que el archivo:
// Shuffle1.
//
// PROMPT DE ENTREGA (copiá y pegá esto cuando termines):
// -------------------------------------------------------
// Hice el repaso r1 de Shuffle1 (pág. 121-122), está en
// ejercicios/repasos/ej03-shuffle1-r1/Shuffle1.java.
// Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
// Comparalo con mi versión original (sin mostrármela antes si no la
// recuerdo) y decime qué mejoré, qué error se repitió y por qué.
// Actualizá EJERCICIOS.md: si salió bien, agendá el siguiente repaso
// del ciclo; si salió mal, acortá el intervalo a ~3 días.
//

class Shuffle1 {
    public static void main(String[] args) {

        int x = 3;

        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            } // end if x>2

            if (x == 2) {
                System.out.print("b c");
            }

            System.out.print("-");

            x = x - 1;

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }

        } // end while x>0
    } // end main
} // end class
