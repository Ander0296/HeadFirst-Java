# LIBRO — "A Heap o' Trouble" ("Un montón (heap) de problemas") — pág. 251-252, Sesión #44 — OPCIONAL (ícono Puzzle)

## Enunciado (traducido)

A la derecha hay un programa Java corto. Cuando se llega a
`// do stuff`, ya se crearon algunos objetos y algunas variables de
referencia. Tu tarea es determinar cuáles de las variables de
referencia apuntan a cuáles objetos. NO todas las variables de
referencia se van a usar, y algunos objetos pueden estar apuntados por
más de una referencia. Uní con líneas cada variable de referencia con
el objeto que le corresponde.

**Tip del libro:** A menos que seas mucho más piola que nosotros,
probablemente necesites dibujar diagramas como los de la sección "Life
on the garbage-collectible heap" ("La vida en el heap recolectable
por el recolector de basura", ya vista en la Sesión #37) de este
capítulo. Usá lápiz para poder dibujar y después borrar los vínculos
de referencia (las flechas que van de un control remoto a un objeto).

## El código

```java
class HeapQuiz {
  int id = 0;

  public static void main(String[] args) {
    int x = 0;
    HeapQuiz[] hq = new HeapQuiz[5];
    while (x < 3) {
      hq[x] = new HeapQuiz();
      hq[x].id = x;
      x = x + 1;
    }
    hq[3] = hq[1];
    hq[4] = hq[1];
    hq[3] = null;
    hq[4] = hq[0];
    hq[0] = hq[3];
    hq[3] = hq[2];
    hq[2] = hq[0];
    // do stuff
  }
}
```

## Lo que tenés para unir

**Variables de referencia:** `hq[0]`, `hq[1]`, `hq[2]`, `hq[3]`, `hq[4]`

**Objetos HeapQuiz creados:** uno con `id = 0`, uno con `id = 1`, uno
con `id = 2`

(Nota del libro: uní cada variable de referencia con su objeto
correspondiente; puede que no uses todas las referencias.)

## Pistas si te trabás

Revisá la Sesión #37 y #38 de la guía (vida y muerte de un objeto en
el heap, `null`, reprogramar una referencia ya asignada) y la Sesión
#43 (arreglo como mapa de posiciones — acá el arreglo `hq[]` guarda
referencias, no valores). Clave: cada asignación `hq[a] = hq[b];`
copia el valor QUE TIENE `hq[b]` en ESE momento, no crea un vínculo
permanente — si `hq[b]` cambia después, `hq[a]` no se entera.

## MI RESPUESTA

(escribí acá qué referencia final apunta a qué objeto, y por qué —
podés listarlo como `hq[0] -> id = ?`, `hq[1] -> id = ?`, etc.)

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el ejercicio del libro "A Heap o' Trouble" (página 251-252).
Mi respuesta está en ejercicios/lib08-heap-o-trouble.md.
Corregilo EN EL CHAT pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
