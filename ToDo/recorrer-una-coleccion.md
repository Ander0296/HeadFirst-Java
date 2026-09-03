# Checklist — Recorrer un arreglo o un ArrayList

Usalo cada vez que escribas un bucle que pasa por todos los elementos
de un arreglo (`String[]`) o de un `ArrayList`. Los dos guardan varias
cosas, pero **NO se escriben igual**, y mezclarlos es el error más
repetido: se reconoce leyendo, se falla escribiendo.

## 1. Antes del bucle: ¿qué tengo entre manos?

- [ ] Mirá la línea donde se declaró. ¿Dice `String[] x` (corchetes) o
      `ArrayList<String> x` (diamante)? De eso depende TODO lo demás.
- [ ] Si es un arreglo: ¿se creó con `new String[N]`? Entonces ya tiene
      N casillas ocupando lugar, aunque no hayas guardado nada.
- [ ] Si es un `ArrayList`: ¿se creó con `new ArrayList<String>()`?
      Arranca con CERO elementos; crece con cada `add()`.

## 2. La condición del `for` clásico: cuántos hay

- [ ] Arreglo → `x.length` — **sin paréntesis**, porque no es un método:
      es un dato del arreglo.
- [ ] ArrayList → `x.size()` — **con paréntesis**, porque es un método.
- [ ] Verificá que la condición sea `i < cuántos`, nunca `i <=`: los
      índices van de 0 a cuántos-1, y `<=` se pasa una posición.

## 3. Sacar el elemento de adentro

- [ ] Arreglo → `x[i]` (corchetes).
- [ ] ArrayList → `x.get(i)` (método). `x[i]` en un ArrayList **no
      compila**: los corchetes son sintaxis de arreglo, no de objeto.
- [ ] Si necesitás el NÚMERO de posición dentro del bucle, usá `i`
      directo. Nunca `x.indexOf(x.get(i))`: eso saca el elemento y
      después le pregunta a la lista dónde está, y `indexOf` devuelve
      **la primera aparición** de ese valor. Con elementos repetidos
      imprime el número equivocado y el bug queda invisible mientras
      todos los elementos sean distintos.
- [ ] `ArrayList.contains(x)` recorre TODAS las posiciones comparando
      con `.equals()`. Su equivalente en arreglo es un BUCLE completo,
      nunca revisar una sola posición fija (`x[1].equals(valor)` no es
      "buscar": solo mira el índice 1 y da `false` aunque el valor esté
      en cualquier otro lado).

## 4. Si usás el `for` mejorado (el de los dos puntos)

- [ ] La variable del bucle lleva **su tipo adelante**:
      `for (String nombre : nombres)`. Sin el tipo no compila.
- [ ] El tipo que escribís es el de UN elemento, no el de la colección:
      `String`, no `String[]` ni `ArrayList<String>`.
- [ ] Sirve para los dos (arreglo y ArrayList) sin cambiar nada. Si solo
      querés leer cada elemento, es la forma más segura: no hay índice
      que se pase de rango.

## 5. Antes de usar lo que sacaste

- [ ] Si el arreglo es de OBJETOS (`String[]`, `Perro[]`) y no llenaste
      todas las casillas, las vacías valen **`null`**, no `0` ni `""`.
      Llamar un método sobre esa casilla compila y **revienta en
      ejecución** con `NullPointerException`.
- [ ] `0` es el valor por defecto de los `int`; `0.0` de los `double`;
      `false` de los `boolean`; `null` de TODO lo que sea un objeto.

## 6. Si además borrás elementos

- [ ] Arreglo: no se puede borrar. El tamaño es fijo; lo más que podés
      es dejar la casilla en `null` o crear un arreglo nuevo y copiar.
      Si el enunciado dice "se dan de baja", el arreglo es mala elección.
- [ ] ArrayList: `remove("texto")` borra **por contenido** y
      `remove(2)` borra **por índice**. No son lo mismo: fijate cuál
      estás llamando.
- [ ] Después de un `remove()` los que estaban detrás **corren un lugar**
      y `size()` baja en 1. Nunca guardes el tamaño en una variable antes
      del bucle si adentro vas a borrar.

## Tabla de trampas — arreglo vs. ArrayList

| Quiero... | Arreglo `String[]` | `ArrayList<String>` |
| --- | --- | --- |
| saber cuántos hay | `x.length` | `x.size()` |
| leer el de la posición i | `x[i]` | `x.get(i)` |
| guardar uno | `x[i] = "a";` | `x.add("a");` |
| borrar uno | no se puede | `x.remove(i)` / `x.remove("a")` |
| tamaño | fijo desde el `new` | crece y baja solo |
