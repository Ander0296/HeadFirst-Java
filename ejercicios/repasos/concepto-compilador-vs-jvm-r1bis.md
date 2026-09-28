# REPASO r1 bis — CONCEPTO: "el compilador mira la referencia, la JVM mira el objeto"

Repaso DESDE CERO: no mires tu versión anterior ni el libro. Razonalo a
mano, sin compilar (después, si querés, lo comprobás con javac/java).

Si te trabás: revisá las Sesiones #95-#98 de GUIA-JAVA.md.
Checklist: ToDo/entregar-un-ejercicio.md (Nivel 3) — recorrelo ANTES de entregar.

## EL CÓDIGO

Nombres del código:
- `Payment` (pago) — la superclase
- `CardPayment` (pago con tarjeta) y `CashPayment` (pago en efectivo) — las subclases
- `Checkout` (caja, donde se cobra) — la clase con el `main`
- `process()` (procesar), `askPin()` (pedir el PIN, la clave de la tarjeta),
  `giveChange()` (dar el cambio, la plata que se devuelve)

```java
class Payment {
    void process() {
        System.out.println("Procesando pago");
    }
}

class CardPayment extends Payment {
    void process() {
        System.out.println("Cobrando con tarjeta");
    }
    void askPin() {
        System.out.println("Pidiendo PIN");
    }
}

class CashPayment extends Payment {
    void giveChange() {
        System.out.println("Dando el cambio");
    }
}

public class Checkout {
    public static void main(String[] args) {
        Payment p1 = new CardPayment();
        Payment p2 = new CashPayment();
        CardPayment c = new CardPayment();

        p1.process();      // línea A
        p2.process();      // línea B
        c.askPin();        // línea C
        p1.askPin();       // línea D
        p2.giveChange();   // línea E
    }
}
```

## LA CONSIGNA (contestá TODAS las partes, cada una con TODAS sus preguntas)

**PARTE 1 — ¿Compila?** Para CADA línea, de la A a la E:
- a) ¿Compila: SÍ o NO?
R/ No compila, los métodos askPin() y giveChange no pertenecen a la clase Payment.
- b) ¿Cuál es el TIPO DE LA REFERENCIA en esa línea?
R/ El tipo de referencia es Payment.
- c) Si NO compila: ¿por qué? Nombrá qué mira el compilador y dónde lo busca.
R/ El compilador mira el método en la clase Payment, al no existir ese método en la clase Payment no compila.

**PARTE 2 — La salida.** Suponé que BORRÁS las líneas que no compilan.
- a) Escribí la salida EXACTA, en orden, una línea por renglón.
Cobrando con tarjeta
Procesando pago
Pidiendo PIN
- b) Para cada renglón: ¿qué versión del método corrió (de qué clase)?
El primer renglon corre la versión de CardPayment.
Para el segundo renglon corre la versión de Payment
Para el tercer renglon corre la versión de CardPayment
- c) ¿Quién eligió esa versión, el compilador o la JVM? ¿Mirando qué?
El que elijió la versión fue JVM, el compilador solo mira que exista.

**PARTE 3 — La trampa.** En las líneas D y E, el OBJETO sí tiene el método
(`CardPayment` tiene `askPin()`, `CashPayment` tiene `giveChange()`).
- a) Entonces, ¿por qué el compilador se queja igual?
R/ porque estamos llamando al método es en la clase Payment y ahí no existe.

**PARTE 4 — El arreglo.** Hay que hacer que la línea D compile SIN tocar la
línea D y SIN cambiar el tipo de la variable `p1`.
- a) Un compañero propone: "agreguemos `askPin()` también en `CashPayment`".
  ¿Con eso compila la línea D? ¿Por qué?
  R/ No compila, sigue siendo un objeto de tipo Payment. y el compilador no encuentra ese método al que hace referencia el objeto creado.
- b) ¿Cuál es TU arreglo? Decí en qué clase va y escribí las líneas.
R/ Agregar ambos métodos en la clase Payment, 
    void askPin() {
        System.out.println("Pidiendo PIN");
    }

    void giveChange() {
        System.out.println("Dando el cambio");
    }

- c) Con tu arreglo puesto, ¿qué imprime la línea D? ¿Por qué esa y no otra?
  Imprime Dando el cambio y es el método de CashPayment, que lo está sobreescribiendo, así tengan el mismo contenido el hecho de 
  tenerlo como método dentro de la clase ya se sobreentiende que está sobreescribiendo.

**PARTE 5 — La tabla.** Completala con tus palabras:

| | ¿Mira la REFERENCIA o el OBJETO? | ¿Qué pregunta responde? | ¿Cuándo actúa: al compilar o al ejecutar? |
| --- | --- | --- | --- |
| Compilador | Referencia | Existe el método? | Al compilar |
| JVM | Objeto | El método está en esta clase? | Al ejecutar |





---

## PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines)

/entrega Terminé el REPASO r1 bis del CONCEPTO "el compilador mira la referencia, la JVM mira el objeto". Está en ejercicios/repasos/concepto-compilador-vs-jvm-r1bis.md. Lo razoné a mano (si lo compilé, pego abajo lo que dijo javac/java).
