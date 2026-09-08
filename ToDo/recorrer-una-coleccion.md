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

## 7. Si el bucle lleva un CONTADOR que no debe contar dos veces

Cuando el bucle suma a un contador cada vez que encuentra algo, el
contador cuenta EVENTOS, no elementos distintos. Si el mismo elemento
puede aparecer dos veces (porque el usuario repite un dato, o porque
el bucle vuelve a pasar), ese elemento se suma dos veces y el total
miente.

- [ ] Preguntate: ¿este contador tiene que contar cuántas VECES pasó,
      o cuántos elementos DISTINTOS encontré? No son lo mismo.
- [ ] Si es "distintos", necesitás recordar cuáles ya contaste. Dos
      formas: un arreglo paralelo `boolean[] yaContadas` del mismo
      tamaño, o un `ArrayList` donde vas guardando lo ya contado.
- [ ] La comprobación va con un `if`, NO con un `while`. Un `while`
      repite; acá no hay nada que repetir: se pregunta UNA vez y se
      decide. Poner un bucle donde va una pregunta es un bug distinto.
- [ ] Ese `if` va **ANTES** de la línea que suma (`contador++`), nunca
      después. Después ya sumaste: el chequeo llegó tarde.
- [ ] Y adentro del `if`, cuando sí contás, acordate de **marcar** el
      elemento como contado. Si no lo marcás, el chequeo nunca da
      verdadero y el guard no sirve para nada.
- [ ] Con `ArrayList` el chequeo es `if (!yaContadas.contains(x))`. Con
      arreglo paralelo es `if (!yaContadas[i])`.

## 8. Si el bucle contesta SÍ o NO (bandera booleana)

Cuando el bucle busca algo y al final tenés que decir "estaba" o "no
estaba", el resultado se guarda en un `boolean` que se llama bandera.

- [ ] La bandera se declara **antes** del bucle y arranca en `false`:
      `boolean loEncontre = false;`. `false` es la respuesta por defecto
      ("no lo encontré") y el bucle solo la cambia si encuentra algo.
- [ ] Declararla vacía (`boolean loEncontre;`) y asignarla solo adentro
      del `if` NO compila cuando después la leés: el compilador no sabe
      si ese `if` va a entrar alguna vez y avisa
      `variable might not have been initialized` (puede que la variable
      no haya sido inicializada). Es la regla de asignación definitiva.
- [ ] Apenas la ponés en `true`, salí con `break`: la pregunta ya está
      contestada y seguir recorriendo es trabajo al pepe.
- [ ] Al comparar textos dentro del bucle, poné primero el valor que
      SEGURO no es null: `if (buscado.equals(elemento))`, no
      `elemento.equals(buscado)`. Si una casilla del arreglo está vacía,
      el elemento es `null` y llamarle `.equals()` revienta con
      `NullPointerException`.

## Tabla de trampas — arreglo vs. ArrayList

| Quiero... | Arreglo `String[]` | `ArrayList<String>` |
| --- | --- | --- |
| saber cuántos hay | `x.length` | `x.size()` |
| leer el de la posición i | `x[i]` | `x.get(i)` |
| guardar uno | `x[i] = "a";` | `x.add("a");` |
| borrar uno | no se puede | `x.remove(i)` / `x.remove("a")` |
| tamaño | fijo desde el `new` | crece y baja solo |
| insertar en el medio | no se puede | `x.add(2, "a");` (corre a los demás) |
| pisar el de la posición i | `x[i] = "a";` | `x.set(i, "a");` (no crece) |

## Trampa de los índices que se mueven

En un `ArrayList`, el índice de un elemento **no es fijo**. Cada vez que
insertás con `add(i, ...)` o borrás con `remove(i)`, todos los que
estaban de esa posición en adelante se corren un lugar.

- [ ] Si guardaste una posición en una variable antes de insertar o
      borrar, esa posición puede haber quedado vieja. Volvé a
      preguntarla con `indexOf(...)` en vez de reutilizar el número.
- [ ] Al borrar dentro de un bucle que va de 0 hacia arriba, después de
      un `remove(i)` el elemento siguiente pasa a ocupar la posición `i`:
      si igual hacés `i++`, te lo salteás.
