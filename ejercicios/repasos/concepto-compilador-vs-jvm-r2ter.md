# REPASO — CONCEPTO "el compilador mira la referencia, la JVM mira el objeto" (r2 ter)

Repaso DESDE CERO: no mires tus respuestas anteriores. Respondé a mano,
sin compilar. (Cuando termines, si querés, compilalo para comprobar,
pero entregá primero tus predicciones tal como las escribiste).

Si te trabás: revisá las Sesiones #104 (getClass) y #105 a #109 (referencias
Object, tipo de retorno de un método, cast) de la guía (están en GUIA-ARCHIVO.md).
Checklist: ToDo/entregar-un-ejercicio.md (sobre todo el Nivel 3).

## Los nombres del código

- `Vehicle` (vehículo)
- `Truck` (camión)
- `Garage` (taller), `repair()` (reparar)

## El código

```java
class Vehicle { }

class Truck extends Vehicle { }

class Garage {
    Vehicle repair() {
        return new Truck();
    }
}
```

Y estas líneas, en orden, dentro de un método que se ejecuta:

```java
Garage garage = new Garage();
Vehicle v = garage.repair();          // A
Truck t = (Truck) v;                  // B
System.out.println(v.getClass());     // C
```

## Las preguntas

**P1.** En la línea A: ¿qué tipo tiene, para el COMPILADOR, lo que está a
la derecha del `=`? ¿Y qué objeto hay de verdad en el heap?

**P2.** Sobre la línea B:
- a) Si le sacás el `(Truck)` y queda `Truck t = v;`, ¿qué pasa y quién lo
  detecta (compilador o JVM)? ¿Por qué?
- b) Dejá el `(Truck)` puesto e imaginá que `repair()` hiciera
  `return new Vehicle();`. ¿Compila? ¿Y al ejecutar, qué pasa? Si algo
  falla, nombrá qué falla y quién lo detecta.

**P3.** Con el código original, escribí la SALIDA EXACTA de la línea C.

## MI RESPUESTA

P1: El tipo es Vehicle, la variable de referencia es v, está llamando el método repair de Garage a traves de la variable de referencia garage, y lo guarda en la variable de referencia v, es decir ese método retorna un objeto de tipo Truck y es el que está en el heap;

P2a: Si le saco el (Truck) va a dar error de Type MistMacht, porque estamos haciendo una variable de referencia de tipo Truck apuntando a Vehicle.

P2b: Compila pero hay error de ejecición, ya le estamos diciendo a Java que estamos convirtiendo la variable de referencia en tipo Truck, que confíe en nosotros pero al retornar un tipo Vehicle, cuando llega a esa linea dará error de ejecución con cast class exeption.

P3: class Truck, pero explicame bien el por qué.

---

## PROMPT DE ENTREGA (copiá desde la línea de abajo y pegalo en Claude)

/entrega Repaso r2 ter del concepto "el compilador mira la referencia, la JVM mira el objeto". Archivo: ejercicios/repasos/concepto-compilador-vs-jvm-r2ter.md (respuestas P1-P3 en la sección MI RESPUESTA).
