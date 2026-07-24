# REPASO r1 — "BE the Compiler" (pág. 123)

Head First Java, Capítulo 1. Repaso del ejercicio de la Sesión #16
(programado para 2026-07-22).

Se hace DESDE CERO: resolvé sin mirar tu intento original ni su
corrección. Es normal si no te acordás de los detalles — de eso se
trata un repaso.

## Enunciado (igual que la primera vez)

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
      } // end if
    } // end while
  } // end main
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

Si te trabás: revisá la Sesión #09 y #10 de GUIA-JAVA.md.

## MI RESPUESTA

A: No compila porque entra en un bucle infinito.

B: No compila porque falta declarar el nombre de la clase

C: no compila porque falta declarar el main

---

## PROMPT DE ENTREGA (copiá y pegá esto cuando termines)

Hice el repaso r1 de "BE the Compiler" (pág. 123), mi respuesta está
en ejercicios/repasos/lib01-r1.md.
Comparalo con mi intento original (sin mostrármelo antes si no lo
recuerdo) y decime qué mejoré, qué error se repitió y por qué.
Actualizá EJERCICIOS.md: si salió bien, agendá el siguiente repaso del
ciclo; si salió mal, acortá el intervalo a ~3 días.
