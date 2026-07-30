/*
BE the Compiler — Parte B (Ubicación pág. 307, Sesión #56)

Enunciado: ¿esta clase compila? Si no compila, ¿cómo la arreglarías?
Si compila, ¿qué imprime al ejecutarla?

class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    void getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}

Si te trabás: revisá la Sesión #49 de la guía (tipo de retorno
declarado y la obligación de devolverlo).

Escribí tu código DEBAJO de este bloque, todo a mano (la clase
pública debe llamarse igual que el archivo: ClockTestDrive; Clock
puede vivir en el mismo archivo).

---

PROMPT DE ENTREGA: ver el que está al final de XCopy.java (es el
mismo ejercicio #11, se entrega junto).
*/

// Esta clase no compila normalmente debido a que estamos haciendo una variable de retorno void y estamos retornando
// se arregló cambiando la variable de retorno void por String
// la ejecución de la clase da como resultado time: 1234

class Clock {
    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}
