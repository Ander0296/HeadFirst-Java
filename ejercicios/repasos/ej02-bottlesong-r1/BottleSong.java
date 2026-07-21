// REPASO r1 — EJERCICIO DEL LIBRO — "BottleSong: encontrá y arreglá la falla" (pág. 111)
// Head First Java, Capítulo 1, Sesión #14. Repaso programado para 2026-07-25.
//
// Se hace DESDE CERO: resolvé sin mirar tu solución original. Es
// normal si no te acordás de los detalles — de eso se trata un repaso.
//
// CONTEXTO — la canción "Ten Green Bottles" (Diez botellas verdes):
// es una canción infantil clásica británica, una cuenta regresiva
// cantada (prima hermana de "99 Bottles of Beer"). Se canta así,
// bajando el número de a uno en cada verso:
//
//   Diez botellas verdes, colgadas de la pared,
//   diez botellas verdes, colgadas de la pared,
//   y si una botella verde se cayera sin querer,
//   quedarán nueve botellas verdes, colgadas de la pared.
//
// (se repite el mismo verso con 9, 8, 7... bajando de a uno)
//
//   Una botella verde, colgada de la pared,       <- OJO: singular
//   una botella verde, colgada de la pared,
//   y si esa botella verde se cayera sin querer,
//   no quedará ninguna botella verde, colgada de la pared.
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
//     public static void main(String[] args) {
//         int bottlesNum = 10;
//         String word = "botellas verdes, colgadas de la pared";
//
//         while (bottlesNum > 0) {
//
//             bottlesNum = bottlesNum - 1;
//
//             if (bottlesNum == 1) {
//                 word = "botella verde, colgada de la pared"; // singular
//             }
//
//             System.out.println(bottlesNum + " " + word);
//             System.out.println(bottlesNum + " " + word);
//             System.out.println("Y si una botella verde se cayera sin querer,");
//
//             if (bottlesNum > 0) {
//                 System.out.println("Quedarán " + bottlesNum + " " + word);
//             } else {
//                 System.out.println("No quedará ninguna botella verde, colgada de la pared");
//             }
//
//         } // end while loop
//     } // end main method
// } // end class
//
// Pista para arrancar: el chequeo `if (bottlesNum == 1)` está ANTES
// de que se impriman las dos primeras líneas de cada verso — pero ese
// mismo bottlesNum ya viene restado. Seguí la traza completa desde
// bottlesNum=10 y fijate en qué verso puntual el número que se
// imprime no coincide con el número que debería estar anunciando ese
// verso.
//
// Si te trabás: revisá la Sesión #12, #13 y #14 de GUIA-JAVA.md (ahí
// está todo lo de while, if/else y variables).
//
// Escribí tu versión CORREGIDA debajo de este bloque, todo a mano.
// Recordá que la clase pública debe llamarse igual que el archivo:
// BottleSong.
//
// PROMPT DE ENTREGA (copiá y pegá esto cuando termines):
// -------------------------------------------------------
// Hice el repaso r1 del ejercicio #02 (BottleSong), está en
// ejercicios/repasos/ej02-bottlesong-r1/BottleSong.java.
// Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
// Comparalo con mi solución original (sin mostrármela antes si no la
// recuerdo): qué mejoré, qué error se repitió y por qué. Actualizá
// EJERCICIOS.md: si salió bien, agendá el siguiente repaso del ciclo;
// si salió mal, acortá el intervalo a ~3 días.
