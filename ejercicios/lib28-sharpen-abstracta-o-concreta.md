# LIBRO lib28 — Sharpen your pencil: "Abstract versus Concrete classes"
(Clases abstractas contra concretas) — pág. 557-560

Si te trabás: revisá las Sesiones #102 y #103 de la guía (clase abstracta =
no se puede instanciar, existe para que otras la extiendan).

## ENUNCIADO

En la columna del medio hay una lista de clases. Para cada una, imaginá:

- una APLICACIÓN donde esa clase sería **CONCRETA** (Concrete): el programa
  NO necesita distinguir tipos distintos de esa cosa, así que se crean
  objetos de esa clase directamente (`new Tree()`).
- una APLICACIÓN donde esa clase sería **ABSTRACTA** (Abstract): al programa
  SÍ le importan las diferencias entre los tipos, así que la clase queda como
  categoría general y los objetos se crean de sus subclases.

No hay una única respuesta correcta: depende del diseño de cada programa.

Ejemplo resuelto por el libro: `Tree` (árbol) sería ABSTRACTA en un programa
de vivero ("tree nursery application" (aplicación de un vivero)), donde
importa la diferencia entre un roble y un álamo. Pero sería CONCRETA en una
simulación de golf ("golf course simulation" (simulación de una cancha de
golf)), donde un árbol es solo un obstáculo y nunca hace falta saber de qué
tipo es.

| Concreta en... | Clase | Abstracta en... |
| --- | --- | --- |
| golf course simulation (simulación de golf) — dato del libro | Tree (árbol) | tree nursery application (vivero) — dato del libro |
| ? | House (casa) | architect application (aplicación para arquitectos) — dato del libro |
| satellite photo application (aplicación de fotos satelitales) — dato del libro | Town (pueblo) | ? |
| ? | Football Player (jugador de fútbol americano) | coaching application (aplicación para entrenadores) — dato del libro |
| ? | Chair (silla) | ? |
| ? | Customer (cliente) | ? |
| ? | Sales Order (orden de venta / pedido) | ? |
| ? | Book (libro) | ? |
| ? | Store (tienda) | ? |
| ? | Supplier (proveedor) | ? |
| ? | Golf Club (palo de golf; ojo: NO es "club") | ? |
| ? | Carburetor (carburador) | ? |
| ? | Oven (horno) | ? |

Consigna completa (no te quedes a mitad):
1. Llená TODOS los "?" (son 15 huecos).
2. En cada respuesta ABSTRACTA, nombrá al menos DOS subclases que tendría
   (ej.: en el vivero, Tree → Oak (roble), Aspen (álamo)). Eso demuestra por
   qué ahí no tiene sentido crear un "árbol a secas".

## MI RESPUESTA

(Escribí acá: "Clase — Concreta en: ... — Abstracta en: ... (subclases: ..., ...)")



---

PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines):

/entrega Hice el ejercicio del libro lib28 Sharpen "Abstract versus Concrete
classes" (pág. 557-560). Mi respuesta está en
ejercicios/lib28-sharpen-abstracta-o-concreta.md.
