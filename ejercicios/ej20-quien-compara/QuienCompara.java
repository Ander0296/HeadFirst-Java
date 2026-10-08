/*
 * EJERCICIO #20 — RE-ESTUDIO: "¿quién compara y qué compara?"
 * (== vs. equals() vs. toString(), ejercicio nuevo del profe)
 *
 * ANTES DE EMPEZAR: releé la Sesión #104 (la clase Object y sus 4
 * métodos) y la Sesión #55 (== vs. equals()), las dos en
 * GUIA-ARCHIVO.md. Recién después cerralas y resolvé esto sin mirarlas.
 *
 * ------------------------------------------------------------------
 * ENUNCIADO
 *
 * PARTE 1 — el programa (escribilo vos, todo a mano)
 *
 * En este mismo archivo escribí DOS clases:
 *
 *   - Una clase Car (auto), NO pública, con una sola instance variable
 *     de tipo String llamada plate (patente). Sin métodos.
 *   - La clase pública QuienCompara con su main, que haga esto en orden:
 *
 *   a) Cree un Car c1 y otro Car c2, los dos con plate "AB123" (dos
 *      new). Declare Car c3 y asígnele c1 (sin new).
 *   b) Declare String p con el valor "AB123" (entre comillas, sin new),
 *      String q creado con new String("AB123"), y String r al que le
 *      asignás q (sin new).
 *   c) Imprima, con etiqueta, estas 8 comparaciones:
 *      c1 == c2   c1.equals(c2)   c1 == c3   c1.equals(c3)
 *      p == q     p.equals(q)     q == r     q.equals(r)
 *   d) Imprima System.out.println(c1);  y después
 *      System.out.println(c1.toString());
 *
 * PARTE 2 — ANTES de compilar: una TABLA en comentarios, una fila por
 * cada una de las 8 comparaciones, con estas 4 columnas:
 *   - true o false
 *   - si es equals: qué clase ESCRIBIÓ el código que corre (String o
 *     Object). Si es ==: poné "nadie, es un operador".
 *   - qué se compara de verdad: "si es el mismo objeto" o "el contenido"
 *   - una línea de porqué
 *
 * PARTE 3 — tres preguntas cortas (también ANTES de compilar)
 *   1. Completá la frase: "== entre referencias SIEMPRE compara ______".
 *      ¿Hay alguna excepción con los String del pool? (decí sí o no y
 *      por qué)
 *   2. Car no tiene ningún método escrito. ¿De dónde sale entonces
 *      c1.equals(...)? ¿Y por qué no puede comparar la patente?
 *   3. ¿Las dos líneas de d) imprimen lo mismo o distinto? ¿Por qué?
 *      Nombrá el método que corre en las dos.
 *
 * PARTE 4 — compilá y ejecutá (javac QuienCompara.java, java QuienCompara)
 *   Pegá la salida real y ponela AL LADO de tu tabla: si alguna fila no
 *   coincidió, decí cuál y por qué.
 *
 * Si te trabás: revisá las Sesiones #104 y #55 de GUIA-ARCHIVO.md.
 * Checklist: ToDo/entregar-un-ejercicio.md, Nivel 3 y Nivel 4. ABRILO
 * RECIÉN CUANDO TERMINES, para revisar antes de entregar.
 *
 * Escribí tu código DEBAJO de este bloque, todo a mano. La clase
 * pública tiene que llamarse igual que el archivo: QuienCompara.
 * La tabla y las respuestas van en comentarios // debajo del código.
 *
 * ------------------------------------------------------------------
 * PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):
 *
 * /entrega Ejercicio #20 "¿quién compara y qué compara?" (RE-ESTUDIO de
 * == vs. equals()). Archivo: ejercicios/ej20-quien-compara/QuienCompara.java
 * (código + tabla + respuestas 1-3 en comentarios). Salida de javac/java:
 * [pegá acá la salida]
 */
