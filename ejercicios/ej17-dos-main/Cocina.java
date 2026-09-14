/*
 EJERCICIO #17 — "Tres clases, dos puertas de entrada" (RE-ESTUDIO)

 POR QUÉ ESTE EJERCICIO: la idea de que `main` es un METODO (y no "una
 clase main") se te escapó tres veces seguidas. Explicarlo otra vez no
 alcanzó. Este ejercicio la hace PASAR POR LA TERMINAL: vas a ver con
 tus ojos que la misma carpeta tiene dos puertas de entrada, que la
 puerta la elegís vos, y que una clase sin puerta compila igual.

 Antes de escribir nada: releé la Sesión #09 y la #10 de la guía (hoy
 viven en GUIA-ARCHIVO.md).
 Checklist: ToDo/crear-una-clase-java.md (sección "La trampa del main").

 ---------------------------------------------------------------
 PARTE 1 — escribí TRES archivos .java en esta misma carpeta
 ---------------------------------------------------------------

 a) Cocina.java  (este archivo)
    - Tiene un metodo `main` que imprime: Cocinando

 b) Horno.java   (lo creás vos)
    - Tiene un metodo `main` que imprime: Horneando

 c) Heladera.java (lo creás vos)
    - NO tiene `main`. Solo una instance variable `int temperatura`
      y un metodo `enfriar()` que imprime: Enfriando

 ---------------------------------------------------------------
 PARTE 2 — compilá y ejecutá, y anotá QUÉ PASÓ en cada caso
 ---------------------------------------------------------------

 Corré estos cinco comandos, uno por uno, y anotá la salida EXACTA
 (o el error exacto, copiado tal cual):

   javac Cocina.java Horno.java Heladera.java
   java Cocina
   java Horno
   java Heladera
   java heladera


  javac Cocina.java Horno.java Heladera.java
  java Cocina
Cocinando
  java Horno
Horneando
  java Heladera
Error: Main method not found in class Heladera, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application
  java heladera
Error: Could not find or load main class heladera
Caused by: java.lang.ClassNotFoundException: heladera

 ---------------------------------------------------------------
 PARTE 3 — contestá en la entrega (con tus palabras)
 ---------------------------------------------------------------

 1. `main` es un método (completá la palabra) y vive DENTRO de una clase.
    Escribí la frase entera sin usar nunca las palabras "clase main".

 2. En esta carpeta hay DOS `main`. ¿Quién decide cuál se ejecuta, y
    en qué momento exacto se decide?

    El que decide cuál se ejecuta soy yo.

 3. `Heladera` no tiene `main` y aun así `javac` no se quejó.
    ¿Por qué? ¿Para qué sirve una clase así?

    No se quejó porque se puede compilar sin problemas, lo que no encontré fue el método main.

 4. Los dos últimos comandos (`java Heladera` y `java heladera`)
    fallan con mensajes DISTINTOS. Pegá los dos y explicá qué le
    faltó a Java en cada caso.

El primero no tiene método main, el programa para arrancar debe tener ese método.
En el segundo no encontró java heladera, ya que no existe, o está en otra carpeta
por lo tanto da error de Could not find load main class heladera.

Error: Main method not found in class Heladera, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application

Error: Could not find or load main class heladera
Caused by: java.lang.ClassNotFoundException: heladera
 ---------------------------------------------------------------

 Escribí tu código DEBAJO de este bloque, todo a mano. Acordate de que
 la clase publica tiene que llamarse igual que el archivo.

 ---------------------------------------------------------------
 PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

 /entrega Terminé el EJERCICIO #17 "Tres clases, dos puertas de
 entrada" (RE-ESTUDIO del concepto main). Mi código está en
 ejercicios/ej17-dos-main/ (Cocina.java, Horno.java, Heladera.java).
 Compiló asi: [pegá acá el resultado de javac]. Las salidas y errores
 de los cinco comandos fueron: [pegalos acá]. Mis respuestas a la
 PARTE 3: [escribilas acá].
 ---------------------------------------------------------------
*/

public class Cocina {
    public static void main(String[] args) {
        System.out.println("Cocinando");
    }
}
