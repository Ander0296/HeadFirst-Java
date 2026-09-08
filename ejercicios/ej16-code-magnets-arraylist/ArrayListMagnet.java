// ============================================================
// EJERCICIO #16 — Code Magnets: "ArrayListMagnet"
// (Head First Java, pág. 461-463 — Sesión #85 de la guía)
// ============================================================
//
// ENUNCIADO
//
// Alguien armó un programa Java completo con imanes en la heladera,
// y alguien mas paso corriendo y los tiro todos al piso. Los pedazos
// de codigo estaban bien: tu trabajo es volver a acomodarlos para
// reconstruir un programa que funcione y que produzca la salida de
// abajo.
//
// DATO NUEVO que necesitas para este ejercicio: si buscas ArrayList
// en la documentacion de Java, vas a encontrar un SEGUNDO metodo add
// que recibe DOS argumentos:
//
//     add(int index, Object o)
//
// Te deja decirle al ArrayList EN QUE POSICION queres meter el
// objeto, en vez de agregarlo siempre al final.
//
// ------------------------------------------------------------
// LOS IMANES (cada bloque separado por una linea en blanco es UN
// iman; se usan TODOS, y cada uno UNA sola vez):
//
//   a.remove(2);
//
//   printList(a);
//
//   printList(a);
//
//   printList(a);
//
//   a.add(0, "zero");
//   a.add(1, "one");
//
//   public static void printList(ArrayList<String> list) {
//
//   if (a.contains("two")) {
//       a.add("2.2");
//   }
//
//   a.add(2, "two");
//
//   public static void main (String[] args) {
//
//       System.out.print(element + "  ");
//   }
//   System.out.println();
//
//   if (a.contains("three")) {
//       a.add("four");
//   }
//
//   public class ArrayListMagnet {
//
//   if (a.indexOf("four") != 4) {
//       a.add(4, "4.2");
//   }
//
//   }
//
//   }
//
//   }
//
//   }
//
//   import java.util.ArrayList;
//
//   ArrayList<String> a = new ArrayList<String>();
//
//   for (String element : list) {
//
//   a.add(3, "three");
//   printList(a);
//
// ------------------------------------------------------------
// SALIDA QUE TIENE QUE DAR (File Edit Window Help Dance):
//
//   % java ArrayListMagnet
//   zero  one  two  three
//   zero  one  three  four
//   zero  one  three  four  4.2
//   zero  one  three  four  4.2
//
// (Son CUATRO lineas: o sea que printList se llama cuatro veces.)
// ------------------------------------------------------------
//
// Si te trabas: revisa la Sesion #85 de la guia (el add de dos
// argumentos) y la Sesion #71 (Code Magnets: como se resuelven).
// Checklist: ToDo/recorrer-una-coleccion.md
//
// Escribi tu codigo DEBAJO de este bloque, todo a mano. Acordate de
// que la clase publica tiene que llamarse igual que el archivo:
// ArrayListMagnet.
//
// ============================================================
// PROMPT DE ENTREGA (copiar y pegar en Claude cuando termines):
// ============================================================
//
// /entrega
// Hice el ejercicio #16, esta en ejercicios/ej16-code-magnets-arraylist/.
// Compilo: [si / no]. Al ejecutarlo: [pego abajo la salida o el error].
// Revisalo linea por linea EN EL CHAT: que esta bien, que esta mal y
// por que. Despues actualiza EJERCICIOS.md.
//
