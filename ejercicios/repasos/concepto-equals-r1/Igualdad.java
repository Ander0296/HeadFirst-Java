/*
 * REPASO r1 — CONCEPTO: "== vs. equals() (y el String pool)"
 * (repaso del profe — lo pediste vos por la confusión de la Sesión #104)
 *
 * DESDE CERO: no mires tus programas ni tus apuntes anteriores. Volver
 * a resolverlo es lo que fija el conocimiento; releerlo no.
 *
 * ------------------------------------------------------------------
 * ENUNCIADO
 *
 * PARTE 1 — el programa (escribilo vos, todo a mano)
 *
* En este mismo archivo escribí DOS clases:
 *
 *   - Una clase Dog (perro), NO pública, con una sola instance variable
 *     de tipo String llamada name (nombre). Sin métodos: ni equals, ni
 *     toString, ni nada.
 *   - La clase pública Igualdad con su main, que haga esto en orden:
 *
 *   a) Declare String a con el valor "hola" y String b con el valor
 *      "hola" (los dos escritos entre comillas, sin new).
 *      Imprima a == b  y  a.equals(b)   (una línea cada uno).
 *
 *   b) Declare String c creado con new String("hola").
 *      Imprima a == c  y  a.equals(c).
 *
 *   c) Cree un Dog d1 con name "Fido" y OTRO Dog d2, también con name
 *      "Fido" (dos new).
 *      Imprima d1 == d2  y  d1.equals(d2).
 *
 *   d) Declare Dog d3 y asígnele d1 (sin new).
 *      Imprima d1 == d3  y  d1.equals(d3).
 *
 *   e) Imprima d1 solo: System.out.println(d1);
 *
 * Para que la salida se entienda, poné una etiqueta delante de cada
 * resultado, por ejemplo: "a == b: " + (a == b)
 * (OJO: los paréntesis alrededor de a == b hacen falta. Parte de la
 * pregunta 6 es explicar por qué.)
 *
 * PARTE 2 — ANTES de compilar (escribilo en la sección MIS RESPUESTAS)
 *   1. Para CADA una de las 8 comparaciones (a-d): ¿true o false?
 *   2. Para CADA uno de los 4 equals: ¿qué clase ESCRIBIÓ el equals que
 *      corre ahí (String u Object)? ¿Esa clase lo SOBRESCRIBIÓ o lo
 *      HEREDÓ? Y entonces, ¿qué compara: el contenido o si es el mismo
 *      objeto?
 *   3. En a) y en b) el texto es el mismo, "hola". ¿Por qué == puede dar
 *      distinto en un caso y en el otro? Nombrá dónde viven los String
 *      escritos entre comillas.
 *   4. Al terminar el main, ¿cuántos objetos Dog hay en el heap? ¿Y
 *      cuántas referencias Dog?
 *   5. En e): ¿qué FORMA tiene lo que se imprime (no hace falta el número
 *      exacto)? ¿Qué método se llama solo, y qué clase lo escribió?
 *   6. ¿Qué pasaría sin los paréntesis en "a == b: " + (a == b)? Decí si
 *      compila o no y por qué (pista: el orden en que se evalúa el +).
 *
 * PARTE 3 — compilá y ejecutá (javac Igualdad.java, java Igualdad)
 *   7. Pegá la salida real. ¿Coincidió con lo que predijiste? Si algo no
 *      coincidió, decí cuál y por qué. Si no compiló a la primera, pegá
 *      el error tal cual, decí qué significa y qué corregiste.
 *   8. Una regla para el trabajo real: ¿con qué se comparan dos String,
 *      y por qué no con ==?
 *
 * Si te trabás: revisá las Sesiones #103 y #104 de GUIA-JAVA.md (si ya
 * no están ahí, están en GUIA-ARCHIVO.md).
 * Checklist: ToDo/entregar-un-ejercicio.md, Nivel 3 y Nivel 4. ABRILO
 * RECIÉN CUANDO TERMINES, para revisar antes de entregar (mirarlo antes
 * es mirar la respuesta).
 *
 * Escribí tu código DEBAJO de este bloque, todo a mano. La clase
 * pública tiene que llamarse igual que el archivo: Igualdad.
 * Las respuestas de las partes 2 y 3 van en comentarios // debajo del
 * código, numeradas del 1 al 8.
 *
 * ------------------------------------------------------------------
 * PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):
 *
 * /entrega Repaso r1 del concepto "== vs. equals() (y el String pool)".
 * Archivo: ejercicios/repasos/concepto-equals-r1/Igualdad.java
 * (código + respuestas 1-8 en comentarios). Salida de javac/java:
 * [pego]. Comparalo con mi chequeo de la Sesión #104 (sin mostrármelo
 * antes) y decime qué mejoré y qué se repitió.
 */

class Dog {
    String nombre;
}

public class Igualdad {
    public static void main(String[] args) {
        String a = "hola";
        String b = "hola";

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = d1;

        d1.nombre = "Fido";
        d2.nombre = "Fido";
        d3.nombre = "Fido";

        System.out.println(" a == b " + (a == b)); // true
        System.out.println(" a.equials(b) " + (a.equals(b))); // true
        // la clase que escribió el equals es String, lo sobreescribe de Object, y
        // compara si es el mismo contenido
        // Da distinto porque los String escritos entre comillas entran en el pool, los
        // trata distintos y compara si es el mismo contenido.
        System.out.println();

        String c = new String("hola");
        System.out.println(" a == c " + (a == c)); // false
        System.out.println(" a.equials(c) " + (a.equals(c))); // true
        // la clase que escribió el equals es String, lo hereda de sobreescribe de
        // Object, y compara si es el mismo contenido
        System.out.println();

        System.out.println("d1 == d2 " + (d1 == d2)); // false
        System.out.println("d1.equals(d2) " + (d1.equals(d2))); // false
        // la clase que escribió el equals es Dog, lo hereda de Object, compara si es el
        // mismo objeto
        System.out.println("d1 == d3 " + (d1 == d3)); // true
        System.out.println("d1.equals(d3) " + (d1.equals(d3))); // true
        // la clase que escribió el equals es Dog, lo hereda de Object, compara si es el
        // mismo objeto
        System.out.println(d1);
        // En el main hay 2 objetos de tipo Dog en el heap y hay 3 referencias apuntando
        // a dos objetos, 2 referencias apuntan a el objeto a y uno el b
        // No entiendo la pregunta e
        // No compila, porque compara diferentes tipos, compararia de izquieda a derecho
        // entonces concatena d1 y compara un String con un DOg
        // entonces nos da el error de incomparable types
        // La salida da
        //
        // a == b true
        // a.equials(b) true
        //
        // a == c false
        // a.equials(c) true
        //
        // d1 == d2 false
        // d1.equals(d2) false
        // d1 == d3 true
        // d1.equals(d3) true
        // Dog@7ad041f3
        //
        // Si coincidió con lo que predije
        // Dos String se comparan con equals, porque cuando los hacemos entre comillas
        // sin el new nos puede dar true solo por el contenido y no por el objeto.

    }
}
