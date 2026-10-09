# REPASO — CONCEPTO "el compilador mira la referencia, la JVM mira el objeto" (r2 bis)

Repaso DESDE CERO: no mires tus respuestas anteriores. Respondé a mano,
sin compilar. (Cuando termines, si querés, compilalo para comprobar,
pero entregá primero tus predicciones tal como las escribiste).

Si te trabás: revisá las Sesiones #104 (getClass) y #105 a #109 (referencias
Object, método que devuelve Object, cast) de GUIA-ARCHIVO.md.
Checklist: ToDo/entregar-un-ejercicio.md (sobre todo el Nivel 3).

## Los nombres del código

- `Instrument` (instrumento), `play()` (tocar)
- `Guitar` (guitarra), `tune()` (afinar)
- `Shop` (tienda), `sell()` (vender)
- `Concert` (concierto)
- `"Rasgueo"` es el sonido de la guitarra al tocarla.

## El código

```java
class Instrument {
    void play() { System.out.println("..."); }
}

class Guitar extends Instrument {
    void play() { System.out.println("Rasgueo"); }
    void tune() { System.out.println("Afinando"); }
}

class Shop {
    Object sell() {
        return new Guitar();
    }
}

public class Concert {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Object o = shop.sell();                  // A
        Instrument i1 = o;                       // B
        Instrument i2 = (Instrument) o;          // C
        Guitar g = (Guitar) i2;                  // D
        i2.play();                               // E
        i2.tune();                               // F
        g.tune();                                // G
        o.play();                                // H
        System.out.println(o.getClass());        // I
        System.out.println(i2.getClass());       // J
    }
}
```

## Las preguntas

**P1.** Para CADA línea de la A a la J, por separado: ¿compila o no
compila? Y el porqué: qué miró el compilador para decidirlo.

**P2.** En la línea A: ¿qué tipo tiene, para el COMPILADOR, lo que está
a la derecha del `=`? ¿Y qué objeto hay de verdad en el heap?

**P3.** Imaginá que las líneas que NO compilan se borran. Con lo que
queda, escribí la SALIDA EXACTA del programa, en orden, línea por línea.

**P4.** Las líneas I y J: ¿imprimen lo mismo o algo distinto? ¿Por qué?

**P5.** Sobre el cast:
- a) ¿Qué hace el cast de la línea C? ¿Cambia algo del objeto en el heap?
- b) Ahora imaginá que `sell()` hiciera `return new Instrument();` en vez
  de `return new Guitar();`. La línea D, ¿compila? ¿Y al ejecutar, qué
  pasa? Si algo falla, nombrá qué falla y quién lo detecta (compilador
  o JVM).

**P6.** Completá la tabla (después de la línea D):

| Referencia | Tipo de la REFERENCIA | Tipo del OBJETO al que apunta |
| ---------- | --------------------- | ----------------------------- |
| o          |        Object               |      Apunta a Guitar                         |
| i2         |       Instrument                |   Apunta aGUitar                            |
| g          |   Guitar                    |        Apunta a Guitar                       |

¿Cuántos objetos `Guitar` hay en el heap en ese momento?

## MI RESPUESTA

P1:
A: Compila, el compilador mira la referencia o, es de tipo Object, el método devuelve un Object, hay compatibilidad.
B: No compila, el compilador mira la referencia, es de tipo Instrument que quiere apuntar al mismo objeto de o, que es de tipo Object, el compilador nos frena por incompatibilidad.
C: Compila, el compilador mira la referencia, aunque es de tipo Object le estamos diciendo con el Cast que definitivamente vamos a sacar un instrumento, esto porque se lo estamos diciendo explicitamente.
D: Esta me tiene super confundido.
E: Compila, el método existe en Instrument, eso lo ve el compilador.
F: No compila, el método no existe es la clase Instrument, y tampoco lo hereda.
G: Compila, el método existe en la clase Guitar, el compilador lo ve y compila.
H: No compila, La clase Object no tiene el método play();
I. Compila, el o.getClass da como salida de clase Guitar, pero profundiza el por qué.
J: Compila, también es de clase Guitar, apunta al mismo objeto que o.


P2:
Es de tipo Guitar, el método devuelve tipo Object con new Guitar, estoy confundido.

P3:
Rasgueo
Afinando
Afinando
Guitar
Guitar

P4:
Imprimen lo mismo, porque apuntan al mismo objeto.

P5:
Le dice a Object que efectivamente va a sacar un Objeto pero ese objeto es de tipo Instrument, no cambia el objeto en el heap. solo crea la variable de referencia apuntando al mismo objeto de o.
Si compila, le estamos diciendo al compilador que efectivamente queremos sacar un Instrument, él lo da por hecho, el error viene en ejecución, es un error de Casteo aunque no recuerdo bien como se llama.


---

## PROMPT DE ENTREGA (copiá desde la línea de abajo y pegalo en Claude)

/entrega Repaso r2 bis del concepto "el compilador mira la referencia, la JVM mira el objeto". Archivo: ejercicios/repasos/concepto-compilador-vs-jvm-r2bis.md (respuestas P1-P6 en la sección MI RESPUESTA).
