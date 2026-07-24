# REPASO r2 — "BE the Compiler" (pág. 123)

Head First Java, Capítulo 1. Segundo repaso del ejercicio de la
Sesión #16 (programado para 2026-07-27).

Se hace DESDE CERO: resolvé sin mirar tu intento original, el repaso
r1 ni sus correcciones. Es normal si no te acordás de los detalles —
de eso se trata un repaso.

## Enunciado (igual que las veces anteriores)

Cada uno de los archivos Java de abajo representa un archivo fuente
completo. Tu trabajo es actuar de compilador y decidir si cada uno va
a compilar. Si no compila, ¿por qué exactamente y cómo lo arreglarías?

### A

```java
class Exercise1a {
  public static void main(String[] args) {
    int x = 1;
    while (x < 10) {
      if (x > 3) {
        System.out.println("big x");
      }
    }
  }
}
```

### B

```java
public static void main(String [] args) {
  int x = 5;
  while ( x > 1 ) {
    x = x - 1;
    if ( x < 3 ) {
      System.out.println("small x");
    }
  }
}
```

### C

```java
class Exercise1c {
  int x = 5;
  while (x > 1) {
    x = x - 1;
    if (x < 3) {
      System.out.println("small x");
    }
  }
}
```

Si te trabás: revisá la Sesión #09 y #10 de GUIA-ARCHIVO.md.

## MI RESPUESTA

A:

B:

C:

---

## PROMPT DE ENTREGA (copiá y pegá esto cuando termines)

Hice el repaso r2 de "BE the Compiler" (pág. 123), mi respuesta está
en ejercicios/repasos/lib01-r2.md.
Comparalo con mis intentos anteriores (sin mostrármelos antes) y
decime qué mejoré, qué error se repitió y por qué.
Actualizá EJERCICIOS.md: si salió bien, agendá el siguiente repaso del
ciclo; si salió mal, aplicá la regla de RE-ESTUDIO.
