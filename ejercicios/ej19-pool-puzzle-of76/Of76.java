/*
 EJERCICIO #19 — Pool Puzzle: Acts / Clowns / Of76 (Ubicación pág. 619-620, Sesión #114)
 Tipo: completar código

 ENUNCIADO

 El programa de abajo está incompleto: cada raya ______ es un hueco.
 Completalo con los fragmentos de la "piscina" (pool) listados más
 abajo, de manera que:

   1. el programa COMPILE,
   2. al ejecutarlo, la salida sea EXACTAMENTE la que se muestra
      (con sus huecos también completados).

 Reglas del Pool Puzzle:
 - Un mismo fragmento se puede usar MÁS DE UNA VEZ.
 - No hace falta usar todos los fragmentos.
 - No se agregan llaves { } de más: la estructura ya está puesta.

 Nombres del código (todos inventados por el libro, son un chiste de
 circo: una nariz de payaso, un pintor famoso, los números del show):
   Nose = nariz · Picasso = el pintor Pablo Picasso · Acts = números
   (de un espectáculo) · Clowns = payasos · Of76 = "del 76" (nombre de
   fantasía, sin significado técnico) · iMethod() = "método i"
   (nombre inventado) · i = nombre de la variable · x = contador del for

 --------------------------------------------------------------------
 EL CÓDIGO INCOMPLETO (lado izquierdo del libro: cuatro tipos)
 --------------------------------------------------------------------

 ________ Nose {
     ________________________
 }

 abstract class Picasso implements ______ {
     ________________________
         return 7;
     }
 }

 class ________ ________ ________ { }

 class ________ ________ ________ {
     ________________________
         return 5;
     }
 }

 --------------------------------------------------------------------
 EL CÓDIGO INCOMPLETO (lado derecho del libro: la clase con main)
 --------------------------------------------------------------------

 public ________ ________ extends Clowns {
     public static void main(String[] args) {
         ________________________
         i[0] = new ________
         i[1] = new ________
         i[2] = new ________
         for (int x = 0; x < 3; x++) {
             System.out.println(________________
                 + " " + ________.getClass());
         }
     }
 }

 --------------------------------------------------------------------
 SALIDA ESPERADA (Output)
 --------------------------------------------------------------------

   % java ________
   5 class Acts
   7 class Clowns
   ________Of76

 --------------------------------------------------------------------
 LA PISCINA (fragmentos disponibles, copiados tal cual del libro)
 --------------------------------------------------------------------

 Llamadas a constructores:   Acts();   Nose();   Of76();   Clowns();   Picasso();

 Palabras clave:             class   extends   interface   implements

 Formas de nombrar la i:     i   i()   i(x)   i[x]

 Comienzos de línea de salida:   class   5 class   7 class   7 public class

 Nombres de tipos:           Acts   Nose   Of76   Clowns   Picasso

 Declaraciones del arreglo:  Of76 [] i = new Nose[3];
                             Of76 [3] i;
                             Nose [] i = new Nose();
                             Nose [] i = new Nose[3];

 Declaraciones del método:   public int iMethod() ;
                             public int iMethod{ }
                             public int iMethod() {
                             public int iMethod() { }

 Llamadas al método:         i.iMethod(x)
                             i(x).iMethod[]
                             i[x].iMethod()
                             i[x].iMethod[]

 Si te trabás: revisá las Sesiones #111-#113 de la guía (interfaces,
 abstract, implements) y la #106 (getClass(), la clase Object).
 Checklist: ToDo/entregar-un-ejercicio.md

 INSTRUCCIONES: escribí tu código DEBAJO de este bloque, todo a mano.
 Recordá que la clase public tiene que llamarse IGUAL que el archivo,
 y que puede haber UNA sola clase public por archivo. Compilá con
 javac y ejecutá con java; pegá la salida en el prompt de entrega.

 --------------------------------------------------------------------
 PROMPT DE ENTREGA (copiar y pegar en Claude cuando termines):
 --------------------------------------------------------------------

 /entrega Hice el EJERCICIO #19 Pool Puzzle "Acts/Clowns/Of76" (pág. 619-620).
 Mi código está en ejercicios/ej19-pool-puzzle-of76/Of76.java.
 Salida de javac/java: [pegá acá lo que imprimió, o el error tal cual]
*/
