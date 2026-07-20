# LIBRO — Mixed Messages (pág. 127-129, Sesión #17)

## Enunciado (tal cual lo plantea el libro)

"A short Java program is listed below. One block of the program is
missing. Your challenge is to match the candidate block of code (on
the left) with the output that you'd see if the block were inserted.
Not all the lines of output will be used, and some of the lines of
output might be used more than once. Draw lines connecting the
candidate blocks of code with their matching command-line output."

(Abajo hay un programa Java corto. Le falta un bloque. Tu desafío es
emparejar cada bloque candidato (a la izquierda) con la salida que
verías si ESE bloque se insertara ahí. No todas las líneas de salida
se usan, y alguna se puede repetir. Unir cada bloque candidato con su
salida correspondiente por consola.)

## El programa (con el bloque faltante marcado)

```java
class Test {
  public static void main(String [] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {

      // ---- CANDIDATE CODE GOES HERE ----

      System.out.print(x + "" + y +" ");
      x = x + 1;
    }
  }
}
```

## Candidatos (probá cada uno en el hueco, por separado)

**Candidato 1:**
```java
y = x - y;
```

**Candidato 2:**
```java
y = y + x;
```

**Candidato 3:**
```java
y = y + 2;
if ( y > 4 ) {
  y = y - 1;
}
```

**Candidato 4:**
```java
x = x + 1;
y = y + x;
```

**Candidato 5:**
```java
if ( y < 5 ) {
  x = x + 1;
  if ( y < 3 ) {
    x = x - 1;
  }
}
y = y + 2;
```

## Salidas posibles (algunas no se usan, alguna se puede repetir)

```
A) 22 46
B) 11 34 59
C) 02 14 26 38
D) 02 14 36 48
E) 00 11 21 32 42
F) 11 21 32 42 53
G) 00 11 23 36 410
H) 02 14 25 36 47
```

Ojo con la concatenación: `x + "" + y + " "` pega el valor de `x` y el
de `y` como texto, sin espacio entre ellos (y con un espacio después).
Si `x` vale 4 e `y` vale 10, esa línea imprime `410 ` — no `14 ` ni
`4 10`.

Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (while, if,
operadores de comparación) y la Sesión #15 (arrays no aplica acá, pero
repasá cómo se traza un bucle paso a paso).

## MI RESPUESTA

Para cada candidato, escribí la letra de la salida que le corresponde
(o "ninguna" si no matchea con nada) y mostrá cómo llegaste (aunque
sea resumido: valores de x e y vuelta por vuelta):

Candidato 1: E

Candidato 2: G

Candidato 3: H

Candidato 4: B

Candidato 5: D

---

PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines):

```
Hice el ejercicio del libro "Mixed Messages" (página 127-129).
Mi respuesta está en ejercicios/lib02-mixed-messages.md (o la escribo
acá: [...]). Corregilo pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. Registrá el resultado
en EJERCICIOS.md y, si quedó completado, agendá sus repasos.
```
