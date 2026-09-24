# REPASO r1 — CONCEPTO: qué método corre cuando hay sobrescritura

Repaso del profe (no sale del libro). Se resuelve **desde cero, sin mirar
nada**: ni la guía, ni exámenes anteriores, ni el compilador.

**Si te trabás:** revisá las Sesiones #94 a #98 de GUIA-JAVA.md
**Checklist antes de entregar:** ToDo/entregar-un-ejercicio.md (Nivel 2)

**Regla dura de este repaso:** NO compiles ni ejecutes nada hasta haber
escrito tu respuesta completa. Lo que se está midiendo es tu trazado a
mano, no el de la JVM.

---

## EL CÓDIGO

Estas tres clases están en el mismo paquete y compilan sin errores.

```java
class Vehicle {                              // Vehicle (vehículo)

    public void start() {                    // start() (arrancar)
        System.out.println("Checking fuel");     // (Revisando el combustible)
        ignite();
        System.out.println("Ready to go");       // (Listo para salir)
    }

    public void ignite() {                   // ignite() (encender el motor)
        System.out.println("Generic ignition");  // (Encendido genérico)
    }
}

class Motorcycle extends Vehicle {           // Motorcycle (motocicleta)

    public void ignite() {
        System.out.println("Kick start");        // (Arranque a patada)
    }
}

class Truck extends Vehicle {                // Truck (camión)

    public void ignite() {
        System.out.println("Diesel ignition");   // (Encendido diésel)
    }

    public void start() {
        System.out.println("Releasing brake");   // (Soltando el freno)
        ignite();
    }
}
```

---

## PARTE 1

```java
Vehicle v = new Motorcycle();
v.start();
```

Escribí la salida EXACTA, línea por línea, **en el orden en que aparece en
pantalla**. Si te parece que no imprime nada, decilo y explicá por qué.

Checking fuel
Kick start
Ready to go

## PARTE 2

```java
Vehicle v = new Truck();
v.start();
```

Misma consigna: la salida exacta, línea por línea, en orden.

Releasing brake
Diesel ignition

## PARTE 3

Contestá las tres, cada una en una frase:

a) En la PARTE 2, ¿de qué clase es la versión de `start()` que se ejecuta?
   ¿Por qué esa y no la otra?

es la version de start() de la clase truck, ejecuta 
Releasing brake
Diesel ignition
se ejecuta esa porque ese método existe en la clase Truck, es una sobreescritura de los métodos de Vehicle, JVM ejecuta ese método y dentro de ese método se llama también el método ignite() que tambien
está sobreescrito en la clase Truck

b) En la PARTE 1, `start()` no está escrito en `Motorcycle`, pero adentro
   de `start()` se llama a `ignite()`. ¿Qué versión de `ignite()` corre?
   ¿Por qué?

la versión que corre es la de la clase Motorcycle, ya que se ha sobreescrito y ejecuta las instrucciones de ignite() que tiene Motorcycle.

c) Nombrá QUIÉN toma la decisión de qué versión corre, y EN QUÉ MOMENTO la
   toma (al compilar o al ejecutar).

El que decide qué versión toma es el compilador en el momento de compilar las clases, el que las ejecuta es la JVM.

---



---

## PROMPT DE ENTREGA (copiar y pegar en Claude cuando termines)

```
/entrega Terminé el REPASO r1 del CONCEPTO "qué método corre cuando hay
sobrescritura". Está en ejercicios/repasos/concepto-sobrescritura-r1.md.
No lo compilé: lo tracé a mano, como pedía la consigna.
```
