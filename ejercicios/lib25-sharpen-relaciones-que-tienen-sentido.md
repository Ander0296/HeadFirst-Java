# lib25 — Sharpen your pencil: ¿qué relaciones tienen sentido?

**Origen:** Head First Java, pág. 505 (Sesión #92 de GUIA-JAVA.md)
**Si te trabás:** revisá la Sesión #92 y la #91 de GUIA-JAVA.md

---

## ENUNCIADO

"Put a check next to the relationships that make sense."
(Poné un tilde al lado de las relaciones que tengan sentido.)

"Hint: apply the IS-A test."
(Pista: aplicá la prueba ES-UN.)

"Yours to solve." (Te toca resolverlo: el libro NO trae la solución.)

Las once relaciones que da el libro, con la traducción de cada clase:

1. `Oven extends Kitchen` — Oven (horno), Kitchen (cocina, el ambiente). NO, un horno no es una cocina
2. `Guitar extends Instrument` — Guitar (guitarra), Instrument (instrumento musical). SI
3. `Person extends Employee` — Person (persona), Employee (empleado). NO, todas  las personas no son empleadas
4. `Ferrari extends Engine` — Ferrari (la marca de auto), Engine (motor). NO, un Ferrari no es un motor tiene un motor.
5. `FriedEgg extends Food` — FriedEgg (huevo frito), Food (comida). SI
6. `Beagle extends Pet` — Beagle (la raza de perro), Pet (mascota). SI
7. `Container extends Jar` — Container (recipiente, envase en general), Jar (frasco). NO, Un container no es un frasco
8. `Metal extends Titanium` — Metal (metal), Titanium (titanio). NO, un metal no es titanio, algunos son titanio pero no todos
9. `GratefulDead extends Band` — Grateful Dead (una banda de rock
   estadounidense muy conocida, activa desde los años 60), Band (banda musical). SI
10. `Blonde extends Smart` — Blonde (rubia/rubio), Smart (inteligente). NO, no todos los rubios son inteligentes.
11. `Beverage extends Martini` — Beverage (bebida en general), NO, todas las bebidas no son un martini.
    Martini (un trago hecho con gin y vermut seco).

Recordá cómo se lee cada línea: `X extends Y` se lee "X hereda de Y",
y para que el diseño esté bien tiene que ser verdad que **X ES UN Y**.

Qué entregar:

1. Las once relaciones, cada una marcada con **SÍ** (tiene sentido) o
   **NO** (no tiene sentido).
2. Para cada **NO**, una línea con el POR QUÉ: qué frase queda falsa al
   aplicar la prueba ES-UN. Si el problema es que la relación está dada
   vuelta, decilo y escribila como iría.


## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

```
/entrega Hice el ejercicio del libro lib25 "Sharpen your pencil: ¿qué
relaciones tienen sentido?" (pág. 505), está en
ejercicios/lib25-sharpen-relaciones-que-tienen-sentido.md. Corregí mis
respuestas.
```
