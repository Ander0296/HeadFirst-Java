# lib26 — Mixed Messages: "Mixed2" (herencia y sobrescritura)

**Origen:** Head First Java, pág. 531-533 (Sesión #97 de la guía)
**Si te trabás:** revisá las Sesiones #94, #95 y #96 de la guía (qué versión de un método corre según el OBJETO real)
**Checklist:** ToDo/entregar-un-ejercicio.md (Nivel 2: leé el método ENTERO que se ejecuta)

---

## ENUNCIADO

"Mixed Messages" (Mensajes mezclados).

"A short Java program is listed below. One block of the program is missing!"
(Abajo hay un programa Java corto. ¡Le falta un bloque!)

"Your challenge is to match the candidate block of code (on the left), with the
output that you'd see if the block were inserted."
(Tu desafío es emparejar cada bloque de código candidato con la salida que
verías si ese bloque se insertara en el hueco.)

"Not all the lines of output will be used, and some of the lines of output might
be used more than once."
(No todas las líneas de salida se usan, y alguna podría usarse más de una vez.)

"Draw lines connecting the candidate blocks of code with their matching
command-line output."
(Uní con líneas cada bloque candidato con la salida que le corresponde.)

### El programa

Nombres: `A`, `B`, `C` son solo letras (tres clases en cadena: C hereda de B,
B hereda de A). `ivar` = "instance variable" (variable de instancia).
`m1()`, `m2()`, `m3()` = método 1, método 2, método 3. `Mixed2` = "Mezclados 2".
`A's m1` = "el m1 de A".

```java
class A {
  int ivar = 7;

  void m1() {
    System.out.print("A's m1, ");
  }
  void m2() {
    System.out.print("A's m2, ");
  }
  void m3() {
    System.out.print("A's m3, ");
  }
}

class B extends A {
  void m1() {
    System.out.print("B's m1, ");
  }
}

class C extends B {
  void m3() {
    System.out.print("C's m3, " + (ivar + 6));
  }
}

public class Mixed2 {
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    A a2 = new C();
    // <-- acá va el bloque candidato (tres líneas)
  }
}
```

### Bloques candidatos

```
Bloque 1:          Bloque 2:          Bloque 3:          Bloque 4:
b.m1();            c.m1();            a.m1();            a2.m1();
c.m2();            c.m2();            b.m2();            a2.m2();
a.m3();            c.m3();            c.m3();            a2.m3();
```

### Salidas posibles (una línea por opción)

```
S1: A's m1, A's m2, C's m3, 6
S2: B's m1, A's m2, A's m3,
S3: A's m1, B's m2, A's m3,
S4: B's m1, A's m2, C's m3, 13
S5: B's m1, C's m2, A's m3,
S6: B's m1, A's m2, C's m3, 6
S7: A's m1, A's m2, C's m3, 13
```

### Qué entregar

Para CADA bloque (1 a 4): qué salida le corresponde (S1...S7) y POR QUÉ, en una
línea por cada llamada: de qué clase es el OBJETO y qué versión del método corre.
Mirá también la cuenta de `ivar + 6`.

---

## MI RESPUESTA



---

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

```
/entrega Hice el ejercicio del libro lib26 "Mixed Messages: Mixed2"
(pág. 531-533), está en ejercicios/lib26-mixed-messages-mixed2.md.
Corregí mis respuestas.
```
