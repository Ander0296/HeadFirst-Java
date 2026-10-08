/*
 * REPASO r1 bis — CONCEPTO: "== vs. equals() (y el String pool)"
 *
 * DESDE CERO: no mires tus programas, tus apuntes ni el r1. Volver a
 * resolverlo es lo que fija el conocimiento; releerlo no.
 *
 * ------------------------------------------------------------------
 * ENUNCIADO
 *
 * PARTE 1 — el programa (escribilo vos, todo a mano)
 *
 * En este mismo archivo escribí DOS clases:
 *
 *   - Una clase Book (libro), NO pública, con una sola instance variable
 *     de tipo String llamada title (título). Sin métodos: ni equals, ni
 *     toString, ni nada.
 *   - La clase pública Comparar con su main, que haga esto en orden:
 *
 *   a) Declare String x con el valor "cafe" y String y con el valor
 *      "cafe" (los dos escritos entre comillas, sin new).
 *      Imprima x == y  y  x.equals(y)   (una línea cada uno).
 *
 *   b) Declare String z creado con new String("cafe").
 *      Imprima x == z  y  x.equals(z).
 *
 *   c) Cree un Book b1 con title "Dune" y OTRO Book b2, también con
 *      title "Dune" (dos new).
 *      Imprima b1 == b2  y  b1.equals(b2).
 *
 *   d) Declare Book b3 y asígnele b2 (sin new).
 *      Imprima b2 == b3  y  b2.equals(b3).
 *
 *   e) Imprima b1 solo: System.out.println(b1);
 *
 * Para que la salida se entienda, poné una etiqueta delante de cada
 * resultado, por ejemplo: "x == y: " + (x == y)
 * (OJO: los paréntesis alrededor de x == y hacen falta. Parte de la
 * pregunta 6 es explicar por qué.)
 *
 * PARTE 2 — ANTES de compilar (en comentarios, debajo del código)
 *   1. Para CADA una de las 8 comparaciones (a-d): ¿true o false?
 *   2. Para CADA uno de los 4 equals: ¿qué clase ESCRIBIÓ el equals que
 *      corre ahí (String, Book u Object)? ¿La clase del objeto lo
 *      SOBRESCRIBIÓ o lo HEREDÓ? Y entonces, ¿qué compara: el contenido
 *      o si es el mismo objeto?
 *   3. En a) y en b) el texto es el mismo, "cafe". ¿Por qué x == y da lo
 *      que da, y por qué x == z puede dar distinto? Decí QUÉ compara ==
 *      en cada caso y nombrá dónde viven los String escritos entre
 *      comillas.
*   4. Al terminar el main, ¿cuántos objetos Book hay en el heap? ¿Y
 *      cuántas referencias Book?
 *   5. En e): ¿qué FORMA tiene lo que se imprime (no hace falta el número
 *      exacto)? ¿Qué método se llama solo, y qué clase lo escribió?
 *   6. ¿Qué pasaría sin los paréntesis en "x == y: " + (x == y)? Decí si
 *      compila o no y por qué (pista: el orden en que se evalúa el +).
 *
 * PARTE 3 — compilá y ejecutá (javac Comparar.java, java Comparar)
 *   7. Pegá la salida real. ¿Coincidió con lo que predijiste? Si algo no
 *      coincidió, decí cuál y por qué. Si no compiló a la primera, pegá
 *      el error tal cual, decí qué significa y qué corregiste.
 *   8. Una regla para el trabajo real: ¿con qué se comparan dos String,
 *      y por qué no con ==?
 *
 * Contestá las 8 preguntas, cada una con su porqué: una pregunta en
 * blanco cuenta como mal.
 *
 * Si te trabás: revisá la Sesión #104 de GUIA-JAVA.md (y la #55 en
 * GUIA-ARCHIVO.md).
 * Checklist: ToDo/entregar-un-ejercicio.md, Nivel 3 y Nivel 4. ABRILO
 * RECIÉN CUANDO TERMINES, para revisar antes de entregar (mirarlo antes
 * es mirar la respuesta).
 *
 * Escribí tu código DEBAJO de este bloque, todo a mano. La clase
 * pública tiene que llamarse igual que el archivo: Comparar.
 * Las respuestas de las partes 2 y 3 van en comentarios // debajo del
 * código, numeradas del 1 al 8.
 *
 * ------------------------------------------------------------------
 * PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):
 *
 * /entrega Repaso r1 bis del concepto "== vs. equals() (y el String
 * pool)". Archivo: ejercicios/repasos/concepto-equals-r1bis/Comparar.java
 * (código + respuestas 1-8 en comentarios). Salida de javac/java:
 * [pego]. Comparalo con mi r1 (sin mostrármelo antes) y decime qué
 * mejoré y qué se repitió.
 */

class Book {
    String tittle;
}

public class Comparar {
    public static void main(String[] args) {
        String x = "cafe";
        String y = "cafe";
        String z = new String("cafe");
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = b2;
        b1.tittle = "Dune";
        b2.tittle = "Dune";

        System.out.println("x == y " + (x == y));
        // true
        // Compara el contenido
        System.out.println("x.equals(y) " + (x.equals(y)));
        // true
        // la clase que escribió el equals es String, creo que la clase String lo
        // sobreescribe de Object, compara el contenido.
        System.out.println("---------------------");
        System.out.println("x == z " + (x == z));
        // false
        // Compara si es el mismo objeto
        System.out.println("x.equals(z) " + (x.equals(z)));
        // true
        // la clase que escribió el equals es String, lo sobreescribe de object
        // compara el contenido
        System.out.println("---------------------");
        System.out.println("b1 == b2 " + (b1 == b2));
        // false
        // compara si es el mismo objeto
        System.out.println("b1.equals(b2) " + (b1.equals(b2)));
        // true
        // la clase que escribió el equals es Book, lo hereda de Object
        // compara el contenido
        System.out.println("---------------------");
        System.out.println("b2 == b3 " + (b2 == b3));
        // true
        // Compara si es el mismo objeto
        System.out.println("b2.equals(b3) " + (b2.equals(b3)));
        // true
        // la clase que escribió el equals es Book, lo hereda de Object
        // compara el contenido.
        System.out.println(b1);
        // Respuesta 3, aunque el texto sea el mismo, cuando camparamos dos variables
        // que tienen
        // String en comillas sin hacer el new, esos String se guardan en el pool, por
        // eso nos da true tanto con == y .equals()
        // En el caso en que ponemos el new, ahí si entra a comparar la referencia, es
        // decir si apuntan al mismo objeto
        // en ese caso .equals() compara el contenido y el == si apuntan al mismo
        // objeto.
        // Respuesta 4
        // En el heap hay 3 objetos, 2 de tipo Book y 1 de tipo String, en total tenemos
        // 3 referencias de tipo Book
        // respuesta 5
        // En e se imprime el hashcode,primero muestra la clase del objeto y un código
        // tiene una forma de código único y lo escribe la
        // clase Object
        // respuesta 6
        // Sin los parentesis al se concatenaría el String de la izquierda con las
        // variables de la derecha. en algunos casos compila, por ejemplo si la variable
        // es un String, pero si es un Objeto o otro tipo no compatible no compila.
        // respuesta 7
        // Salida:
        // x == y true
        // x.equals(y) true
        // ---------------------
        // x == z false
        // x.equals(z) true
        // ---------------------
        // b1 == b2 false
        // b1.equals(b2) false
        // ---------------------
        // b2 == b3 true
        // b2.equals(b3) true
        // Book@7ad041f3
        // Dos String se comparar siempre con equals, así evitamos confusiones, cuando
        // creamos variables de tipo String sin new, esos String se van a el pool,
        // entonces si comparamos dos variables con == que tienen el mismo prompt y
        // queremos si apuntan al mismo objeto siempre da true, porque no hicimos el new
        // en esas variables, entonces siempre con .equals para comparar prompts
    }
}
