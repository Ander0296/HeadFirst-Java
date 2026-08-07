# LIBRO — "Mixed Messages" #3 ("Mensajes mezclados") — pág. 386-387, Sesión #72 — OPCIONAL (ícono Puzzle)

## Enunciado (traducido)

Un programa Java corto. Al programa le falta UN bloque de código (el
recuadro de abajo). Tu desafío es hacer coincidir (match) cada bloque
candidato (abajo) con la salida (output) que verías si ESE bloque se
insertara en el hueco. Puede que no se usen todas las líneas de salida.

Ojo: el pantallazo original arranca directo en `public static void
main`, no se vio el nombre de la clase ni si tiene variables antes —
asumí que esa parte no cambia el resultado y concentrate en el cuerpo
del método.

## El código (con el hueco a completar)

```java
public static void main(String[] args) {
  int x = 0;
  int y = 30;
  for (int outer = 0; outer < 3; outer++) {
    for (int inner = 4; inner > 1; inner--) {

      // ← EL BLOQUE CANDIDATO VA ACÁ

      y = y - 2;
      if (x == 6) {
        break;
      }
      x = x + 3;
    }
    y = y - 2;
  }
  System.out.println(x + " " + y);
}
```

## Candidatos

1. `x = x + 3;`
2. `x = x + 6;`
3. `x = x + 2;`
4. `x++;`
5. `x--;`
6. `x = x + 0;`

## Posibles salidas (pares `x y`)

`45 6` — `36 6` — `54 6` — `60 10` — `18 6` — `6 14` — `12 14`

(Recordá: no todas se usan necesariamente.)

## MI RESPUESTA

(escribí acá qué salida le corresponde a cada candidato, y por qué —
con qué línea del programa lo justificás)

## Pistas si te trabás

Revisá la Sesión #68 (las 3 partes del for, y qué pasa con dos `for`
anidados) y la Sesión #69 (pre-incremento `++x` vs. post-incremento
`x--`). Clave: el candidato se ejecuta ANTES de `y = y - 2` y del `if
(x == 6) { break; }` en cada vuelta del `inner`, así que su efecto
sobre `x` decide en qué vuelta exacta se corta el bucle con el break —
y eso cambia cuántas veces se resta 2 a `y`.

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el ejercicio del libro "Mixed Messages" #3 (página 386-387).
Mi respuesta está en ejercicios/lib18-mixed-messages-3.md.
Corregilo EN EL CHAT pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
