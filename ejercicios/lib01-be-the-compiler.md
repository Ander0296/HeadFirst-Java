# LIBRO — BE the Compiler (pág. 123, Sesión #16)

## Enunciado (tal cual lo plantea el libro)

"Each of the Java files on this page represents a complete source
file. Your job is to play compiler and determine whether each of
these files will compile. If they won't compile, how would you fix
them?"

(Cada uno de los archivos Java de esta página representa un archivo
fuente completo. Tu trabajo es actuar de compilador y decidir si cada
uno de estos archivos va a compilar. Si no compilan, ¿cómo los
arreglarías?)

Son 3 "archivos" (A, B y C). Analizalos uno por uno.

### A

```java
class Exercise1a {
  public static void main(String[] args) {
    int x = 1;
    while (x < 10) {
      if (x > 3) {
        System.out.println("big x");
      } // end if
    } // end while
  } //end main
} // end class
Entra en un bucle infinito porque la variable x siempre vale 1, si ejecuta pero con error de bucle.
```

### B

```java
public static void main(String [] args) {
  int x = 5;
  while ( x > 1 ) {
    x = x - 1;
    if ( x < 3 ) {
      System.out.println("small x");
    } // end if
  } // end while
} // end main
El programa en sintaxis está bien, lo que falta es la clase, es decir no se indica en que clase estamos entonces no compila.
```

### C

```java
class Exercise1c {
  int x = 5;
  while (x > 1) {
    x = x - 1;
    if (x < 3) {
      System.out.println("small x");
    } // end if
  } // end while
} // end class
No compila porque pasa lo mismo que arriba, while debe ir dentro de public static ... entonces se rompe porque está dentro de una clase.
```

Si te trabás: revisá la Sesión #09 y #10 de GUIA-JAVA.md (ahí está la
jerarquía source file → clase → método → instrucción, la base para
saber qué puede ir suelto y qué no).

## MI RESPUESTA

Para cada archivo (A, B, C): ¿compila? Si no, ¿por qué exactamente y
cómo lo arreglarías?

A:

B:

C:

---

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

```
Hice el ejercicio del libro "BE the Compiler" (página 123).
Mi respuesta está en ejercicios/lib01-be-the-compiler.md (o la escribo
acá: [...]). Corregilo pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. Registrá el resultado
en EJERCICIOS.md y, si quedó completado, agendá sus repasos.
```
