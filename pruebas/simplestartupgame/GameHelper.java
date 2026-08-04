import java.util.Scanner; // Trae la clase Scanner: envuelve una fuente de datos (acá, el teclado) para poder leerla

public class GameHelper {
    public int getUserInput(String prompt) {
        System.out.print(prompt + ": "); // print (no println): no salta de línea, para que el usuario tipee al lado del
                                         // mensaje
        Scanner scanner = new Scanner(System.in); // System.in es el teclado; Scanner lo envuelve para leerlo con
                                                  // métodos como nextInt()
        return scanner.nextInt(); // Bloquea el programa hasta que el usuario tipea un número y aprieta Enter
    }
}
