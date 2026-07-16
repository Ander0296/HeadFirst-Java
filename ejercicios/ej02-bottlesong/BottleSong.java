// EJERCICIO DEL LIBRO — "BottleSong: encontrá y arreglá la falla" (pág. 111)
// Head First Java, Capítulo 1, Sesión #14
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
//   word       -> "bottles" (botellas, plural) o "bottle" (botella,
//                 singular) según corresponda gramaticalmente
//
// Enunciado (traducido): el libro da el siguiente código. Compila y
// corre sin errores, pero la SALIDA no es 100% perfecta — en algún
// verso, la palabra "bottle"/"bottles" queda mal (plural cuando debía
// ser singular, o viceversa). Tu trabajo es encontrar en qué verso
// pasa y arreglarlo.
//
// Código original tal cual lo trae el libro (con la falla adentro):
//
//   public class BottleSong {
//     public static void main(String[] args) {
//       int bottlesNum = 10;
//       String word = "bottles";
//
//       while (bottlesNum > 0) {
//
//         if (bottlesNum == 1) {
//           word = "bottle"; // singular, as in ONE bottle.
//         }
//
//         System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
//         System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
//         System.out.println("And if one green bottle should accidentally fall,");
//         bottlesNum = bottlesNum - 1;
//
//         if (bottlesNum > 0) {
//           System.out.println("There'll be " + bottlesNum +
//                   " green " + word + ", hanging on the wall");
//         } else {
//           System.out.println("There'll be no green bottles, hanging on the wall");
//         }
//       } // end while loop
//     } // end main method
//   } // end class
//
// Pista para arrancar: el chequeo `if (bottlesNum == 1)` está ANTES
// de `bottlesNum = bottlesNum - 1` en el código — se evalúa con el
// valor de bottlesNum de ANTES de restar. Pero ese mismo "word" se
// reutiliza más abajo, en la línea "There'll be", que ya usa el
// bottlesNum de DESPUÉS de restar. Seguí la traza completa desde
// bottlesNum=10 y fijate en qué verso puntual esos dos valores dejan
// de estar sincronizados.
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
// Hice el ejercicio #02, está en ejercicios/ej02-bottlesong/BottleSong.java.
// Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
// Revisalo línea por línea: qué está bien, qué está mal y POR QUÉ, y
// actualizá su estado y tu corrección en EJERCICIOS.md. Si quedó
// completado, agendá sus repasos en la sección REPASOS.
