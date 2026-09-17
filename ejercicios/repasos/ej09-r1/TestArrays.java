/*
 * REPASO r1 — EJERCICIO #09: Code Magnets: TestArrays (imanes con arreglos)
 * (Head First Java, pág. 247-249, Sesión #43)
 *
 * DESDE CERO: no mires tu versión anterior. Resolvelo como si fuera
 * la primera vez.
 *
 * ENUNCIADO
 *
 * Un programa Java que funciona quedó todo desordenado en imanes
 * pegados en la heladera. Tu trabajo es reconstruir los fragmentos
 * de abajo para armar un programa que COMPILE, CORRA y produzca la
 * salida esperada. Podés repetir un imán las veces que haga falta, y
 * no hace falta usarlos todos. Las llaves { } que se cayeron al piso
 * las agregás vos donde falten.
 *
 * IMANES DISPONIBLES (desordenados, tal cual aparecen en el libro):
 *
 *
 * SALIDA ESPERADA (ejecutando: java TestArrays):
 *
 *   island = Fiji
 *   island = Cozumel
 *   island = Bermuda
 *   island = Azores
 *
 * Pista de lectura (sin resolver el orden): index[] no es un dato a
 * mostrar, es un MAPA — para cada vuelta del bucle te dice qué
 * casillero de islands[] hay que imprimir.
 *
 * Si te trabás: revisá las Sesiones #40 a #43 de GUIA-JAVA.md
 * (arreglos, notación con corchetes, referencias).
 *
 * Checklist: ToDo/un-bucle-que-termina.md y ToDo/entregar-un-ejercicio.md
 *
 * Escribí tu código DEBAJO de este bloque, todo a mano (la clase
 * pública debe llamarse igual que este archivo: TestArrays).
 *
 * ---- PROMPT DE ENTREGA (copiar y pegar en Claude al terminar) ----
 *
 * Hice el REPASO r1 del EJERCICIO #09 (Code Magnets: TestArrays), está
 * en ejercicios/repasos/ej09-r1/TestArrays.java.
 * Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
 * Corregilo EN EL CHAT comparándolo con mi versión original: qué mejoré,
 * qué error repetí y POR QUÉ. Después actualizá REPASOS PROGRAMADOS en
 * EJERCICIOS.md según cómo salió.
 */

class TestArrays {
    public static void main(String[] args) {

        int[] index = new int[4];
        String[] islands = new String[4];

        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        int y = 0;
        int ref;

        while (y < 4) {
            ref = index[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;

        }
    }
}
