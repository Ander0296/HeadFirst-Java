# LIBRO — BE the JVM (pág. 378-380, Sesión #70)

## Enunciado (tal cual lo plantea el libro)

"BE the JVM. The Java file on this page represents a complete source
file. Your job is to play JVM and determine what would be the output
when the program runs."

(Sé la JVM. El archivo Java de esta página representa un archivo
fuente completo. Tu trabajo es hacer de JVM —la máquina virtual de
Java— y determinar cuál sería la salida al ejecutarse el programa.)

## El programa completo

```java
class Output {
  public static void main(String[] args) {
    Output output = new Output();
    output.go();
  }

  void go() {
    int value = 7;
    for (int i = 1; i < 8; i++) {
      value++;
      if (i > 4) {
        System.out.print(++value + " ");
      }
      if (value > 14) {
        System.out.println("i = " + i);
        break;
      }
    }
  }
}
```

## Opciones de salida (elegí UNA, la que de verdad imprime este programa)

Venían como 3 ventanas de terminal separadas por "-or-" ("o"):

```
Opción A:
12 14

Opción B:
12 14 x = 6

Opción C:
13 15 x = 6
```

Si te trabás: revisá la Sesión #69 de la guía (trampa `++x` vs. `x++`
dentro de una expresión mayor) y la técnica de trazar un bucle a mano
vuelta por vuelta (anotá el valor de `value` ANTES de cada vuelta,
como ya hiciste en otros ejercicios).

## MI RESPUESTA

Opción elegida: ninguna de las anteriores, el resultado me dio "13 14 15 "

Mostrá cómo llegaste (valor de `value` en cada vuelta del `for`, qué
imprime cada `print`/`println`):



---

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

```
Hice el ejercicio del libro "BE the JVM" (página 378-380).
Mi respuesta está en ejercicios/lib16-be-the-jvm.md (o la escribo acá:
[...]). Corregilo EN EL CHAT pero SIN darme la solución completa de
entrada: decime qué tengo bien, qué tengo mal, y dame pistas para lo
que falta. La solución completa solo si te la pido después. En
EJERCICIOS.md registrá el resultado en 3 líneas como máximo; si quedó
completado, movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá
sus repasos.
```
