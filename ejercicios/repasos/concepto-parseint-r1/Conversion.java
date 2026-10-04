/*
 * REPASO r1 — CONCEPTO: "String vs. int" (texto contra número)
 * (repaso del profe — salió de CONCEPTOS DOMINADOS en el examen del 01/10)
 *
 * DESDE CERO: no mires tus soluciones ni tus apuntes anteriores. Volver
 * a resolverlo es lo que fija el conocimiento; releerlo no.
 *
 * ------------------------------------------------------------------
 * ENUNCIADO
 *
 * Un programa recibe la cantidad de productos de un pedido, pero le
 * llega como TEXTO, guardada en un String:
 *
 *     cantidad vale "8"   (con comillas: es texto, no un número)
 *
 * PARTE 1 — el programa (escribilo vos, todo a mano)
 *
 * Escribí una clase llamada Conversion con su main que:
 *   a) declare la variable cantidad con el valor "8";
 *   b) imprima el resultado de sumarle 2 a cantidad TAL CUAL, sin
 *      convertir nada;
 *   c) convierta cantidad a un número entero, guarde el resultado de
 *      sumarle 2 en una variable nueva (escribí la línea COMPLETA: tipo,
 *      nombre de la variable, =, la conversión, el + 2 y el ;), e
 *      imprima esa variable.
 *
 * PARTE 2 — ANTES de compilar (escribilo en la sección MIS RESPUESTAS)
 *   1. ¿Qué imprime la línea del punto b)? ¿De qué TIPO es ese
 *      resultado (String o int)? ¿Cómo se llama lo que hace ahí el + ?
 *   2. ¿Qué imprime la línea del punto c)? ¿De qué TIPO es?
 *   3. ¿Por qué hace falta convertir? Una o dos frases.
 *
 * PARTE 3 — compilá y ejecutá (javac Conversion.java, java Conversion)
 *   4. Pegá la salida real. ¿Coincidió con lo que predijiste? Si no
 *      compiló a la primera, pegá el error tal cual, decí qué
 *      significa y qué corregiste.
 *   5. Experimento: cambiá "8" por "ocho", compilá y ejecutá otra vez.
 *      ¿Falla al COMPILAR o al EJECUTAR? Pegá lo que sale. ¿Por qué el
 *      compilador no se dio cuenta? (Al terminar, volvé a dejar "8".)
 *
 * Si te trabás: revisá la Sesión #09 de GUIA-JAVA.md (si ya no está
 * ahí, está en GUIA-ARCHIVO.md).
 * Checklist: ToDo/entregar-un-ejercicio.md, Nivel 3 y Nivel 4. ABRILO
 * RECIÉN CUANDO TERMINES, para revisar antes de entregar (mirarlo antes
 * es mirar la respuesta).
 *
 * Escribí tu código DEBAJO de este bloque, todo a mano. La clase
 * pública tiene que llamarse igual que el archivo: Conversion.
 * Las respuestas de las partes 2 y 3 van en comentarios // debajo del
 * código, numeradas del 1 al 5.
 *
 * ------------------------------------------------------------------
 * PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):
 *
 * /entrega Repaso r1 del concepto "String vs. int: Integer.parseInt".
 * Archivo: ejercicios/repasos/concepto-parseint-r1/Conversion.java
 * (código + respuestas 1-5 en comentarios). Salida de javac/java:
 * [pego]. Con "ocho": [pego]. Comparalo con lo que contesté en el
 * examen del 01/10 (sin mostrármelo antes) y decime qué mejoré y qué
 * se repitió.
 *
 * Respuestas
 * 1. la linea b imprime 82, el resultado es de tipo String, el + se llama concatenar
 * 2. la linea c imprime 10, es de tipo Integer
 * 3. Hace falta convertir porque va concatenar el texto que le pasemos, pero si hacemos la conversión toma el texto y los convierte a enteros,
 * cabe aclarar que el casteo solo sirve si el texto son números.
 * 4. si coincidió con lo que predije, no dio ningun tipo de erorr, la salida da:
82
10
5. si pongo ocho como texto tal cual, va a compilar pero da error de ejecución en la linea del casteo, da como error java.lang.NumberFormatException
El compilador no se da cuenta porque el mira solo la referencia, el que decide que está mal es JVM que es quien ve el objeto.
 */

public class Conversion {
    public static void main(String[] args) {
        String cantidad = "ocho";
        System.out.println(cantidad + 2);
        Integer cant = Integer.parseInt(cantidad) + 2;
        System.out.println(cant);
    }
}
