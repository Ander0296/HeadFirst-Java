// EJERCICIO DEL LIBRO — "Code Magnets: Shuffle1" (pág. 121-122)
// Head First Java, Capítulo 1, Sesión #15
//
// CONTEXTO — qué es "Code Magnets" (Imanes de Código):
// es una sección recurrente del libro con la broma visual de que hay
// un programa Java completo pegado con imanes en una heladera, pero
// alguien lo desarmó y los pedazos quedaron mezclados sin orden. Tu
// trabajo es reordenar los imanes (sin cambiar lo que dice cada uno)
// hasta armar un programa que compile y produzca la salida pedida.
// Ojo: "algunas llaves { } se cayeron al piso y eran muy chicas para
// levantar" — es la forma graciosa que tiene el libro de decirte que
// FALTAN llaves de cierre a propósito: agregá todas las que hagan
// falta, no vienen todas incluidas en los imanes.
//
// Enunciado: armá el programa (la clase se llama Shuffle1, igual que
// el archivo) usando ESTOS imanes, cada uno tal cual está escrito,
// en el orden en que vos decidas (no es el orden en que aparecen acá
// abajo, estos están desordenados a propósito, igual que en la
// página del libro):

class Shuffle1 {
    public static void main(String[] args) {

        int x = 3;
        while (x > 0) {

            if (x > 2) {
                System.out.print("a");
            } // End if x>2

            System.out.print("-");
            x = x - 1;

            if (x == 2) {
                System.out.print("b c");
            } // end if ==2

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            } // end if x==1
        } // End while loop
    } // End main
} // end class

// La salida que tiene que dar tu programa, EXACTAMENTE (corriendo
// `java Shuffle1`), es esta línea, sin saltos de línea en el medio:
//
// a-b c-d
//
// Pista para arrancar: fijate que solo hay UN imán con `int x = 3;`
// (se ejecuta una sola vez) y un solo `while`, así que TODO lo demás
// (los tres `if` y la línea con el guion "-") tienen que ir DENTRO
// del cuerpo del `while`, en el orden que haga falta para que la
// salida coincida letra por letra con "a-b c-d". Te conviene hacer
// la traza a mano: anotá el valor de x en cada vuelta y qué se
// imprime, antes de tipear nada.
//
// Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (while,
// if/else) y la Sesión #15 (arrays, esta misma tanda — no hace falta
// para este ejercicio puntual, pero repasa el resto de la tanda).
//
// Escribí tu versión armada DEBAJO de este bloque, todo a mano.
// Recordá que la clase pública debe llamarse igual que el archivo:
// Shuffle1.
//
// PROMPT DE ENTREGA (copiá y pegá esto cuando termines):
// -------------------------------------------------------
// Hice el ejercicio #03, está en ejercicios/ej03-shuffle1/Shuffle1.java.
// Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
// Revisalo línea por línea: qué está bien, qué está mal y POR QUÉ, y
// actualizá su estado y tu corrección en EJERCICIOS.md. Si quedó
// completado, agendá sus repasos en la sección REPASOS.
