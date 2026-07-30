# LIBRO — "Mixed Messages" ("Mensajes mezclados") — pág. 309-312, Sesión #57 — OPCIONAL (ícono Puzzle)

## Enunciado (traducido)

A la derecha hay un programa Java corto. Al programa le faltan DOS
bloques (dos condiciones). Tu desafío es hacer coincidir (match) los
bloques candidatos (abajo) con la salida (output) que verías si esos
bloques se insertaran donde corresponde. NO se van a usar todas las
líneas de salida, y algunas líneas de salida se pueden usar más de una
vez. Uní con líneas cada bloque candidato con su salida correspondiente
en la línea de comandos.

## El código (con los dos huecos a completar)

```java
public class Mix4 {
  int counter = 0;

  public static void main(String[] args) {
    int count = 0;
    Mix4[] mixes = new Mix4[20];
    int i = 0;
    while ( __________ ) {
      mixes[i] = new Mix4();
      mixes[i].counter = mixes[i].counter + 1;
      count = count + 1;
      count = count + mixes[i].maybeNew(i);
      i = i + 1;
    }
    System.out.println(count + " " + mixes[1].counter);
  }

  public int maybeNew(int index) {
    if ( __________ ) {
      Mix4 mix = new Mix4();
      mix.counter = mix.counter + 1;
      return 1;
    }
    return 0;
  }
}
```

## Candidatos (cada uno es un PAR: condición del `while` / condición del `if`)

1. `i < 9`  /  `index < 5`
2. `i < 20`  /  `index < 5`
3. `i < 7`  /  `index < 7`
4. `i < 19`  /  `index < 1`

## Posibles salidas (pares de números: `count counter`)

`14 7` — `9 5` — `19 1` — `14 1` — `25 1` — `7 7` — `20 1` — `20 5`

(Recordá: no todas se usan, y alguna puede repetirse para más de un
candidato.)

## MI RESPUESTA

(escribí acá qué par de salida le corresponde a cada candidato, por
ejemplo: "candidato 1 -> 14 7", y por qué — con qué línea de código
del programa lo justificás)

Candidato 1: La sálida es 14 1, se crea el objeto mixes que es un array de objetos Mix4, solo alcanza a crear la referencia de 8 objetos de ese array, y se crea un objeto mix en el método maybeNew(index) cada que pasa por ahí crea un nuevo control que apunta a Mix4.
Candidato 2: la sálida es 25 1, alcanza a crear la referencia de todos los objetos del array
Candidato 3: la sálida es 14 1
Candidato 4: La sálida es 20 1

## Pistas si te trabás

Revisá la Sesión #40 a #43 de la guía (arreglos de objetos, notación
`arreglo[índice]`, `new` para crear el arreglo y cada objeto adentro)
y las sesiones donde se explicó `return` con valores (un método puede
devolver un `int` que se suma afuera, como hace `maybeNew`). Clave: la
condición del `while` decide CUÁNTAS vueltas da el bucle (y por lo
tanto cuánto vale `mixes[1].counter`, que solo cuenta las veces que SU
posición específica, la 1, fue tocada); la condición del `if` decide en
CUÁLES de esas vueltas `maybeNew` suma un 1 extra a `count`.

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el ejercicio del libro "Mixed Messages" (página 309-312).
Mi respuesta está en ejercicios/lib11-mixed-messages.md.
Corregilo EN EL CHAT pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
