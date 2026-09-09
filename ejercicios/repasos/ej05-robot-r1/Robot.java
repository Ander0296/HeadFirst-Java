/*
 * REPASO r1 — EJERCICIO #05 Robot (Sesión #25) — programado 2026-07-28
 *
 * DESDE CERO: resolvé sin mirar tu solución original de
 * ejercicios/ej05-robot/ ni su corrección.
 *
 * Enunciado (igual que la primera vez): escribí una clase Robot con:
 * - Dos instance variables: nombre (String) y bateria (int, de 0 a 100).
 * - Dos methods:
 *     saludar()  -> imprime por consola un saludo que incluya el nombre
 *                   del robot (ej. usando el operador + para concatenar).
 *     cargar()   -> imprime por consola que el robot está cargando la
 *                   batería.
 *
 * Si te trabás: revisá la Sesión #25 de GUIA-ARCHIVO.md.
 *
 * Recordá que la clase pública debe llamarse igual que el archivo:
 * Robot. Escribí tu código DEBAJO de este bloque, todo a mano.
 *
 * Este repaso tiene DOS archivos — cuando termines este, pasá a
 * RobotTestDrive.java (misma carpeta). El prompt de entrega está en
 * ese segundo archivo.
 */

public class Robot {
    private String nombre;
    private int bateria;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBateria(int bateria) {
        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        }
    }

    public void saludar() {
        System.out.println("Hola, " + nombre);
    }

    public void cargar() {
        System.out.println(nombre + " está cargando, lleva " + bateria + "%");
    }
}
