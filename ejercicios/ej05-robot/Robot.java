/*
 * EJERCICIO #05 — Tu primera clase con new + operador punto (Sesión #25)
 * Head First Java, pág. 164-169
 *
 * Enunciado: escribí una clase Robot con:
 * - Dos instance variables: nombre (String) y bateria (int, de 0 a 100).
 * - Dos methods:
 *     saludar()  -> imprime por consola un saludo que incluya el nombre
 *                   del robot (ej. usando el operador + para concatenar).
 *     cargar()   -> imprime por consola que el robot está cargando la
 *                   batería.
 *
 * Este ejercicio practica lo mismo que el ejemplo Dog del libro
 * (pág. 167): una clase simple con instance variables y methods, sin
 * constructor todavía (eso viene más adelante).
 *
 * Si te trabás: revisá la Sesión #25 de GUIA-JAVA.md (clase Dog con
 * size/breed/name y el method bark()).
 *
 * Recordá que la clase pública debe llamarse igual que el archivo:
 * Robot. Escribí tu código DEBAJO de este bloque, todo a mano.
 *
 * Este ejercicio tiene DOS archivos — cuando termines este, pasá a
 * RobotTestDrive.java (mismo carpeta). El prompt de entrega está en
 * ese segundo archivo.
 */

public class Robot {
    private String nombre;
    private int bateria;

    public void saludar() {
        System.out.println("Hola, soy :" + nombre);
    }

    public void cargar() {
        System.out.println("Cargando, batería en: " + bateria + "%");
    }
}
