/*
 * EJERCICIO #14 — RE-ESTUDIO: "¿dónde vive cada cosa?" (parte 2)
 *
 * El enunciado completo, los comandos a correr y el prompt de entrega
 * estan en Termometro.java, en esta misma carpeta.
 *
 * Aca va la clase con el metodo main: la que crea un objeto Termometro,
 * le asigna una temperatura, imprime su valor en Fahrenheit y le pide
 * que diga si hace frio o calor.
 *
 * Fijate en el contraste mientras lo escribis: esta clase tiene main y
 * la otra no, y las DOS compilan igual de bien. La diferencia aparece
 * recien cuando queres ARRANCAR el programa.
 *
 * Escribi tu codigo DEBAJO de este bloque, todo a mano. Acordate de
 * que la clase publica tiene que llamarse igual que el archivo.
 */

public class TermometroTestDrive {
    public static void main(String[] args) {
        Termometro term = new Termometro();
        term.setTemperaturaActual(20);
        System.out.println(term.getTemperaturaCelsius() + " grados celsius");
        System.out.println(term.getTemperaturaFarenheit() + " grados farenheit");
        term.getEstado();
    }
}
