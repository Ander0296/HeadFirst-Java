# REPASO r2 — "Mixed Messages" (pág. 127-129)

Head First Java, Capítulo 1. Segundo repaso del ejercicio de la
Sesión #17 (programado para 2026-08-08).

Se hace DESDE CERO: resolvé sin mirar tu intento original, ni el r1,
ni sus correcciones. Es normal si no te acordás de los detalles — de
eso se trata un repaso.

## Enunciado (igual que las veces anteriores)

Al programa de abajo le falta un bloque de código. Emparejá cada uno
de los 5 candidatos con la salida que produciría si se insertara en
el hueco. No todas las salidas se usan, y alguna se puede repetir.

```java
class Test {
  public static void main(String [] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      System.out.print(x + "" + y +" ");
      x = x + 1;
    }
  }
}
```

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

Salidas posibles:

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

Si te trabás: revisá la Sesión #12 y #13 de la guía (while, if) y
practicá trazar el bucle a mano, vuelta por vuelta.

## MI RESPUESTA

Candidato 1: E) 00 11 21 32 42

Candidato 2: G) 00 11 23 36 410

Candidato 3: H) 02 14 25 36 47

Candidato 4: B) 11 34 59

Candidato 5: D) 02 14 36 48

---

## PROMPT DE ENTREGA (copiá y pegá esto cuando termines)

Hice el repaso r2 de "Mixed Messages" (pág. 127-129), mi respuesta
está en ejercicios/repasos/lib02-r2.md.
Comparalo con mis intentos anteriores (sin mostrármelos antes si no
los recuerdo) y decime qué mejoré, qué error se repitió y por qué.
Actualizá EJERCICIOS.md: si salió bien, agendá el siguiente repaso del
ciclo; si salió mal, acortá el intervalo a ~3 días.
