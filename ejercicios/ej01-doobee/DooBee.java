// EJERCICIO DEL LIBRO — "Sharpen your pencil: DooBee" (pág. 109)
// Head First Java, Capítulo 1, Sesión #13
//
// Enunciado (traducido): te dan la salida de un programa Java ya
// ejecutado. Tu trabajo es completar el código que falta (los
// espacios en blanco) para que, al compilarlo y correrlo, produzca
// EXACTAMENTE esa salida.
//
// Salida dada:
//   % java DooBee
//   DooBeeDooBeeDo
//
// Código a completar tal cual lo trae el libro (los ____ son los
// espacios en blanco que hay que decidir):
public class DooBee {

    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x == 3) {
            System.out.print("Do");
        }
    }
}
//
// Pista para arrancar: toda la salida queda pegada en un solo
// renglón, sin saltos de línea — eso te dice algo sobre si hay que
// usar print o println en los espacios en blanco de adentro del
// while.
//
// Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (ahí está
// todo lo de while, if/else y print vs println).
//
// Escribí tu código DEBAJO de este bloque, todo a mano. Recordá que
// la clase pública debe llamarse igual que el archivo: DooBee.
//
// PROMPT DE ENTREGA (copiá y pegá esto cuando termines):
// -------------------------------------------------------
// Hice el ejercicio #01, está en ejercicios/ej01-doobee/DooBee.java.
// Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
// Revisalo línea por línea: qué está bien, qué está mal y POR QUÉ, y
// actualizá su estado y tu corrección en EJERCICIOS.md. Si quedó
// completado, agendá sus repasos en la sección REPASOS.
