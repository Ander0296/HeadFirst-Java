// REPASO r2 — EJERCICIO DEL LIBRO — "BottleSong: encontrá y arreglá la falla"
// (pág. 111)
// Head First Java, Capítulo 1, Sesión #14. Repaso programado para 2026-08-09.
//
// Se hace DESDE CERO: resolvé sin mirar tu solución original ni la
// del r1. Es normal si no te acordás de los detalles — de eso se
// trata un repaso.
//
// CONTEXTO — la canción "Ten Green Bottles" (Diez botellas verdes):
// es una canción infantil clásica británica, una cuenta regresiva
// cantada (prima hermana de "99 Bottles of Beer"). Se canta así,
// bajando el número de a uno en cada verso:
//
// Diez botellas verdes, colgadas de la pared,
// diez botellas verdes, colgadas de la pared,
// y si una botella verde se cayera sin querer,
// quedarán nueve botellas verdes, colgadas de la pared.
//
// (se repite el mismo verso con 9, 8, 7... bajando de a uno)
//
// Una botella verde, colgada de la pared,  <- OJO: singular
// una botella verde, colgada de la pared,
// y si esa botella verde se cayera sin querer,
// no quedará ninguna botella verde, colgada de la pared.
//
// Cada vuelta del while del programa = un verso completo de la
// canción. Las variables representan:
//   bottlesNum -> cuántas botellas quedan colgadas EN ESE momento
//   word       -> "botellas verdes, colgadas de la pared" (plural) o
//                 "botella verde, colgada de la pared" (singular)
//
// Enunciado (traducido): el libro da el siguiente código. Compila y
// corre sin errores, pero la SALIDA no es 100% perfecta — en algún
// verso, la parte "botella/botellas verde(s), colgada(s)" queda mal
// (plural cuando debía ser singular, o viceversa). Tu trabajo es
// encontrar en qué verso pasa y arreglarlo.
//
// Código (con la falla adentro):
//
// public class BottleSong {
//   public static void main(String[] args) {
//     int bottlesNum = 10;
//     String word = "botellas verdes, colgadas de la pared";
//
//     while (bottlesNum > 0) {
//
//       bottlesNum = bottlesNum - 1;
//
//       if (bottlesNum == 1) {
//         word = "botella verde, colgada de la pared";   // singular
//       }
//
//       System.out.println(bottlesNum + " " + word);
//       System.out.println(bottlesNum + " " + word);
//       System.out.println("Y si una botella verde se cayera sin querer,");
//
//       if (bottlesNum > 0) {
//         System.out.println("Quedarán " + bottlesNum + " " + word);
//       } else {
//         System.out.println("No quedará ninguna botella verde, colgada de la pared");
//       }
//
//     } // end while loop
//   } // end main method
// } // end class
//
// Método sugerido: trazá el bucle a mano desde bottlesNum = 10,
// vuelta por vuelta, anotando qué número se imprime y qué versión de
// "word" está activa en ese momento. La falla se ve sola cuando la
// traza está escrita.
//
// Si te trabás: revisá la Sesión #12, #13 y #14 de la guía (ahí está
// todo lo de while, if/else y variables).
//
// Escribí tu versión CORREGIDA debajo de este bloque, todo a mano.
// Recordá que la clase pública debe llamarse igual que el archivo:
// BottleSong. Resolvé ACÁ, en BottleSong.java — no hace falta ningún
// archivo "TestDrive": no hay otra clase que probar.
//
// PROMPT DE ENTREGA (copiá y pegá esto cuando termines):
// -------------------------------------------------------
// Hice el repaso r2 del ejercicio #02 (BottleSong), está en
// ejercicios/repasos/ej02-bottlesong-r2/BottleSong.java.
// Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
// Comparalo con mis soluciones anteriores (sin mostrármelas antes si
// no las recuerdo): qué mejoré, qué error se repitió y por qué.
// Actualizá EJERCICIOS.md: si salió bien, agendá el siguiente repaso
// del ciclo; si salió mal, acortá el intervalo a ~3 días.
