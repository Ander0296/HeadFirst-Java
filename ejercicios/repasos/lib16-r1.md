# REPASO — LIBRO "BE the JVM" (pág. 378-380, Sesión #70) — r1

Repaso DESDE CERO: no mires tu respuesta original ni la corrección
anterior. Resolvelo como si lo vieras por primera vez.

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

## Cómo entregarlo

No alcanza con marcar la letra: escribí la TRAZA vuelta por vuelta
(qué vale `i`, qué vale `value` al entrar, qué pasa en cada `if`, qué
se imprime), y recién al final la opción elegida. Si la traza está
bien, la letra sale sola; si solo ponés la letra, no se puede saber si
lo razonaste o lo adivinaste.

Si te trabás: revisá la Sesión #69 de GUIA-JAVA.md (trampa `++x` vs.
`x++` dentro de una expresión mayor).
Checklist: ToDo/un-bucle-que-termina.md

## MI RESPUESTA

la respuesta es la opción 3, value al entrar vale 7, y en cada vuelta del for aumenta en 1 mientras no entre en ningun if
al recorrer hasta que i vale 6 entra en el if de  if i > 14 por lo que alcanza a imprimir 13 15 i = 6
después de imprimir se corta el for con la sentencia break
---

## PROMPT DE ENTREGA (copiá esto y pegámelo cuando termines)

/entrega Terminé el REPASO r1 del ejercicio del libro "BE the JVM"
(pág. 378-380). Mi respuesta está en
ejercicios/repasos/lib16-r1.md. Corregilo comparando contra mi versión
original (está en EJERCICIOS-ARCHIVO.md): qué mejoré, qué error repetí
y por qué. Después actualizá EJERCICIOS.md según cómo salió.
