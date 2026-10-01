/*
 * REPASO r2 — EJERCICIO #14: "¿dónde vive cada cosa?" (parte 2)
 *
 * El enunciado completo, los comandos a correr y el prompt de entrega
 * están en Termometro.java, en esta misma carpeta.
 *
 * Acá va la clase con el método main: la que crea un objeto
 * Termometro, le asigna una temperatura y usa sus métodos.
 *
 * Si te trabás: revisá la Sesión #09 y #10 de GUIA-JAVA.md.
 * Checklist: ToDo/crear-una-clase-java.md
 *
 * Escribí tu código DEBAJO de este bloque, todo a mano. Acordate de
 * que la clase pública tiene que llamarse igual que el archivo.
 */

public class TermometroTestDrive {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.setTemperaturaActual(10);
        System.out.println(termometro.temperaturaFarenheit());
        System.out.println(termometro.estadoTemperatura());
    }
}
