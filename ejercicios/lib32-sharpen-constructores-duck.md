# LIBRO — Sharpen your pencil: "Yours to solve" — ¿qué constructor de Duck corre? (pág. 657-659, Sesión #123)

Sharpen your pencil (Afilá tu lápiz) · Yours to solve (Te toca resolverlo).

Si te trabás: revisá las Sesiones #122 y #123 de la guía (constructores
sobrecargados y lista de argumentos).

## ENUNCIADO

Uní cada llamada `new Duck(...)` del `main` (izquierda) con el CONSTRUCTOR
de la clase `Duck` (pato) que corre cuando se crea ese pato. El libro ya
resolvió la fácil para que arranques: `d[0] = new Duck();` → `public Duck()`
(imprime "type 1 duck" (pato tipo 1)).

Nombres del código: `TestDuck` (probar pato), `weight` (peso), `density`
(densidad), `name` (nombre), `feathers` (plumas), `canFly` (puede volar),
`airspeed` (velocidad en el aire), `kilos`, `floatability` (flotabilidad),
`maxSpeed` (velocidad máxima), `fly` (volar), `max` (máximo).

```java
public class TestDuck {
  public static void main(String[] args) {
    int weight = 8;
    float density = 2.3F;
    String name = "Donald";
    long[] feathers = {1, 2, 3, 4, 5, 6};
    boolean canFly = true;
    int airspeed = 22;

    Duck[] d = new Duck[7];

    d[0] = new Duck();
    d[1] = new Duck(density, weight);
    d[2] = new Duck(name, feathers);
    d[3] = new Duck(canFly);
    d[4] = new Duck(3.3F, airspeed);
    d[5] = new Duck(false);
    d[6] = new Duck(airspeed, density);
  }
}

class Duck {
  private int kilos = 6;
  private float floatability = 2.1F;
  private String name = "Generic";
  private long[] feathers = {1, 2, 3, 4, 5, 6, 7};
  private boolean canFly = true;
  private int maxSpeed = 25;

  public Duck() {
    System.out.println("type 1 duck");
  }

  public Duck(boolean fly) {
    canFly = fly;
    System.out.println("type 2 duck");
  }

  public Duck(String n, long[] f) {
    name = n;
    feathers = f;
    System.out.println("type 3 duck");
  }

  public Duck(int w, float f) {
    kilos = w;
    floatability = f;
    System.out.println("type 4 duck");
  }

  public Duck(float density, int max) {
    floatability = density;
    maxSpeed = max;
    System.out.println("type 5 duck");
  }
}
```

Respondé:

1. Para cada línea `d[1]` a `d[6]`: qué constructor corre (type 1 a 5)
   y POR QUÉ (escribí la lista de tipos de esa llamada, ej. `(float, int)`).
2. ¿Qué imprime el programa completo, en orden?
3. ¿Hay algún constructor que corra más de una vez? ¿Alguno que no corra
   nunca?

## MI RESPUESTA



---

PROMPT DE ENTREGA (copiá y pegá en Claude cuando termines):

```
/entrega Sharpen your pencil "Yours to solve": constructores de Duck (pág. 657-659). Mi respuesta está en ejercicios/lib32-sharpen-constructores-duck.md
```
