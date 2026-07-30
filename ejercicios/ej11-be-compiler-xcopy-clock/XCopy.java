/*
BE the Compiler — Parte A (Ubicación pág. 307, Sesión #56)

Enunciado: ¿esta clase compila? Si no compila, ¿cómo la arreglarías?
Si compila, ¿qué imprime al ejecutarla?

class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}

Si te trabás: revisá la Sesión #49 de la guía (pass-by-value con
primitivos).

Escribí tu código DEBAJO de este bloque, todo a mano (la clase
pública debe llamarse igual que el archivo: XCopy).

---

PROMPT DE ENTREGA (copiar y pegar en Claude cuando termines, junto con
el de Clock/ClockTestDrive del mismo ejercicio):

Hice el ejercicio #11, está en ejercicios/ej11-be-compiler-xcopy-clock/.
Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
Revisalo línea por línea EN EL CHAT: qué está bien, qué está mal y POR
QUÉ. En EJERCICIOS.md actualizá el estado con una corrección de 3
líneas como máximo; si quedó completado, movelo con su corrección a
EJERCICIOS-ARCHIVO.md y agendá sus repasos.
*/

// Esta clase si compila correctamente, lo que imprime al ejecutarla es 42 84

class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
