# REPASO r1 — "Mixed Messages" (pág. 127-129)

Head First Java, Capítulo 1. Repaso del ejercicio de la Sesión #17
(programado para 2026-07-23).

Se hace DESDE CERO: resolvé sin mirar tu intento original ni su
corrección. Es normal si no te acordás de los detalles — de eso se
trata un repaso.

## Enunciado (igual que la primera vez)

Al programa de abajo le falta un bloque de código. Emparejá cada uno
de los 5 candidatos con la salida que produciría si se insertara en
el hueco. No todas las salidas se usan, y alguna se puede repetir.

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

Si te trabás: revisá la Sesión #12 y #13 de GUIA-JAVA.md (while, if) y
practicá trazar el bucle a mano, vuelta por vuelta.

## MI RESPUESTA

Candidato 1:

Candidato 2:

Candidato 3:

Candidato 4:

Candidato 5:

---

## PROMPT DE ENTREGA (copiá y pegá esto cuando termines)

Hice el repaso r1 de "Mixed Messages" (pág. 127-129), mi respuesta
está en ejercicios/repasos/lib02-r1.md.
Comparalo con mi intento original (sin mostrármelo antes si no lo
recuerdo) y decime qué mejoré, qué error se repitió y por qué.
Actualizá EJERCICIOS.md: si salió bien, agendá el siguiente repaso del
ciclo; si salió mal, acortá el intervalo a ~3 días.
