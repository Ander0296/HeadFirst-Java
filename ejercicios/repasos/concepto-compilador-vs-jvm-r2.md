# REPASO r2 — CONCEPTO: "el compilador mira la referencia, la JVM mira el objeto"

Repaso DESDE CERO: no mires tus versiones anteriores ni el libro. Razonalo a
mano, sin compilar (después, si querés, lo comprobás con javac/java).

Si te trabás: revisá las Sesiones #95-#98, #106 y #109 de GUIA-JAVA.md (si ya no
están ahí, en GUIA-ARCHIVO.md).
Checklist: ToDo/entregar-un-ejercicio.md (Niveles 2 y 3) — recorrelo ANTES de entregar.

## EL CÓDIGO

Nombres del código:
- `Instrument` (instrumento) — la superclase
- `Guitar` (guitarra) y `Drum` (tambor) — las subclases
- `Band` (banda) — la clase con el `main`
- `play()` (tocar), `tune()` (afinar), `roll()` (redoble: golpes rápidos al tambor)
- `takeFromCase()` (sacar del estuche) — un método que DEVUELVE un `Object`
- variables: `i1`, `i2` (de instrument), `g`, `g2` (de guitar), `o`, `o2` (de object)

```java
class Instrument {
    void play() {
        System.out.println("Sonido de instrumento");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Rasgueo de guitarra");
    }
    void tune() {
        System.out.println("Afinando cuerdas");
    }
}

class Drum extends Instrument {
    void roll() {
        System.out.println("Redoble");
    }
}

public class Band {
    static Object takFromCase() {
return new Guitar();
    }

    public static void main(String[] args) {
        Instrument i1 = new Drum();      // línea 1
        Instrument i2 = new Guitar();    // línea 2
        Guitar g = new Guitar();         // línea 3
        Object o = g;                    // línea 4
        Guitar g2 = takeFromCase();      // línea 5
        Object o2 = takeFromCase();      // línea 6

        i1.play();     // línea A
        i2.play();     // línea B
        g.tune();      // línea C
        i2.tune();     // línea D
        o.play().;      // línea E
        i1.roll();     // línea F
    }
}
```

## LA CONSIGNA (contestá TODAS las partes, cada una con TODAS sus preguntas, LÍNEA POR LÍNEA)

**PARTE 1 — Las asignaciones.** Para CADA línea, de la 1 a la 6, por separado:
- a) Escribí la frase "<lo de la derecha> ES UN <tipo de la izquierda>".
  Ojo: en las líneas 5 y 6, lo de la derecha es lo que DEVUELVE el método según
  su declaración.
  R: 
  linea 1 Un Drum es un Instrument
  Linea 2 Una Guitar es un Instrument
  Linea 3 Guitar es un Guitar
  Linea 4 Guitar es un Object
  Linea 5 Guitar es un Object
  Linea 6 Guitar es un Objeto

- b) ¿Esa frase es verdadera o falsa?
  R/ Es verdadera.

- c) ¿Compila: SÍ o NO?
No compila, pero no entiendo el por qué, estamos retornando new Guitar, pero da error en la linea 5 y 6, explicame por qué.

**PARTE 2 — Las llamadas.** Para CADA línea, de la A a la F, por separado:
- a) ¿Compila: SÍ o NO?
i1.play() Compila
i2.play() Compila
g.tune() Compila
i2.tune() no compila
o.play() no compila
i1.roll() no compila

- b) ¿Cuál es el TIPO DE LA REFERENCIA en esa línea?
i1.play() el tipo de referencia es Instrument
i2.play() el tipo de referencia es Instrument
g.tune() el tipo de referencia es Guitar
i2.play() el tipo de referencia es Instrument
o.play() el tipo de referencia es Object
i1.roll() El tipo de referencia es Instrument

- c) Si NO compila: ¿por qué? Nombrá qué mira el compilador y en qué clase busca.
i2.play() no compila porque el compilador mira la referencia si tiene el método y Instrument no tiene ese método
o.play() igual que el anterior, no existe ese método en la clase Object
i1.roll() igual que las anteriones, no existe ese método en Instrument

**PARTE 3 — La salida.** Suponé que BORRÁS todas las líneas que no compilan.
- a) Escribí la salida EXACTA, en orden, una línea por renglón.

Sonido de instrumento
Rasgueo de guitarra
Afinando cuerdas

- b) Para cada renglón: ¿qué OBJETO hay detrás de esa variable (leé su `new`) y
  qué versión del método corrió (de qué clase)?
  Sonido de instrumento de la clase Instrument el objeto es de tipo Drum()
  Rasgueo de guitarra de la clase Guitar el objeto es de clase Guitar
  Afinando cuerdas es de la clase Guitar el objeto es de clase Guitar


- c) ¿Quién eligió esa versión, el compilador o la JVM? ¿Mirando qué?
Fue la JVM mirando los métodos del objeto.

**PARTE 4 — La trampa.** En la línea E, la variable `o` apunta a una guitarra, y
`Guitar` SÍ tiene `play()`.
- a) Entonces, ¿por qué el compilador se queja igual?
R/ no sé

**PARTE 5 — El arreglo de la línea 5.** Hay que hacer que la línea 5 compile SIN
cambiar el tipo de `g2` y SIN tocar el método `takeFromCase()`.
- a) Escribí la línea 5 corregida, completa.
Guitar g2 = new Guitar();
- b) Ahora imaginá que alguien cambia `takeFromCase()` para que haga
  `return new Drum();`. Con tu línea 5 corregida: ¿compila? ¿Y qué pasa al
  EJECUTAR? Si algo falla, nombrá exactamente qué y por qué.

**PARTE 6 — La tabla.** Completala con tus palabras:

| | ¿Mira la REFERENCIA o el OBJETO? | ¿Qué pregunta responde? | ¿Cuándo actúa: al compilar o al ejecutar? |
| --- | --- | --- | --- |
| Compilador | Mira la referencia| Si existe la clase y los métohos| al compilar |
| JVM | Mira el objeto| Que versión de los métodos correr | al ejecutar |




---

## PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines)

/entrega Terminé el REPASO r2 del CONCEPTO "el compilador mira la referencia, la JVM mira el objeto". Está en ejercicios/repasos/concepto-compilador-vs-jvm-r2.md. Lo razoné a mano (si lo compilé, pego abajo lo que dijo javac/java).
