# REPASO — LIBRO "BE the Compiler" (pág. 123, Sesión #09/#10) (r3)

RIESGO ALTO — RE-ESTUDIO ACTIVO: el archivo C de este mismo ejercicio
falló en el r1 y en el r2 (dos veces seguidas). Antes de responder,
releé la Sesión #09 y #10 de GUIA-JAVA.md (la jerarquía archivo fuente
→ clase → método → instrucción: qué puede ir suelto y qué no).

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
```

## MI RESPUESTA

Para cada archivo (A, B, C): ¿compila? Si no, ¿por qué exactamente y
cómo lo arreglarías?

A: Compila perfectamente, no hay error de compilación, pero el bucle no para nunca, es un bucle infinito. Se arregla aumentando la variable x;

B: No compila, la clase no está declarada como class NombreClase{...}, para arreglarlo se debe declarar como class Exercise1b{ public static void main ... }

C: No compila, la clase tiene un while suelto, está debe de ir solamente dentro de métodos, para arreglarlo se debe crear un método, public void mostrar(int x){ while (x>1) ...}

## Si te trabás

Revisá la Sesión #09 y #10 de GUIA-JAVA.md. Checklist:
ToDo/crear-una-clase-java.md (qué puede ir suelto en cada nivel:
archivo, clase, método, instrucción).

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el REPASO r3 (ÚLTIMO DEL CICLO) del ejercicio del libro "BE the
Compiler" (página 123). Mi respuesta está en
ejercicios/repasos/lib01-r3.md.
Corregilo EN EL CHAT comparando contra el r1 y el r2 (están en
EJERCICIOS-ARCHIVO.md): si el archivo C sale bien esta vez, el
ejercicio GRADÚA y sus conceptos pasan a CONCEPTOS DOMINADOS. Si vuelve
a fallar, seguimos en RE-ESTUDIO. En EJERCICIOS.md actualizá el repaso
en 3 líneas como máximo.
