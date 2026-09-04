/*
 * REPASO r1 — EJERCICIO #14: "¿dónde vive cada cosa?" (parte 2)
 *
 * El enunciado completo, los comandos a correr y el prompt de entrega
 * están en Termometro.java, en esta misma carpeta.
 *
 * Acá va la clase con el método main: la que crea un objeto Termometro,
 * le asigna una temperatura, imprime su valor en Fahrenheit y le pide
 * que diga si hace frío o calor.
 *
 * Mientras la escribís, fijate en el contraste: esta clase tiene main y
 * la otra no, y las DOS compilan igual de bien. La diferencia aparece
 * recién cuando querés ARRANCAR el programa.
 *
 * Escribí tu código DEBAJO de este bloque, todo a mano. Acordate de
 * que la clase pública tiene que llamarse igual que el archivo.
 */

public class TermometroTestDrive {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.setTemperatura(18);
        double fahrenheit = termometro.fahrenheit();
        System.out.println("Temperatura en farenheit: " + fahrenheit);
        termometro.setEstado();
        termometro.setTemperatura(14);
        termometro.setEstado();
    }
}
