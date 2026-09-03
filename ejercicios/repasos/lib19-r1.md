# REPASO — LIBRO "ArrayList vs. arreglo común" (r1) — pág. 407, Sesión #75

## Enunciado (traducido)

"Fill in the rest of the table below by looking at the ArrayList code
on the left and putting in what you think the code might be if it were
using a regular array instead. We don't expect you to get all of them
exactly right, so just make your best guess."

(Completá el resto de la tabla de abajo mirando el código con ArrayList
de la izquierda, y escribiendo cómo pensás que sería ese código si en
lugar de eso usara un arreglo común. No esperamos que las aciertes
todas exactamente, así que hacé tu mejor intento.)

El libro te regala las tres primeras celdas ya resueltas (marcadas
abajo con "DADO POR EL LIBRO"). El resto lo escribís vos.

## La tabla

| # | ArrayList | Arreglo común (regular array) |
| - | --------- | ----------------------------- |
| 1 | `ArrayList<String> myList = new ArrayList<String>();` | `String [] myList = new String[2];`  ← DADO POR EL LIBRO |
| 2 | `String a = "whoohoo";` | `String a = "whoohoo";`  ← DADO POR EL LIBRO |
| 3 | `myList.add(a);` | ? |
| 4 | `String b = "Frog";` | `String b = "Frog";`  ← DADO POR EL LIBRO |
| 5 | `myList.add(b);` | ? |
| 6 | `int theSize = myList.size();` | ? |
| 7 | `String str = myList.get(1);` | ? |
| 8 | `myList.remove(1);` | ? |
| 9 | `boolean isIn = myList.contains(b);` | ? |

## MI RESPUESTA

(escribí acá, fila por fila, el código equivalente con arreglo común.
Si alguna fila NO tiene equivalente de una sola línea, decilo y
explicá por qué — esa observación vale tanto como el código.)

Fila 3 → myList[0] = a;
Fila 5 → myList[1] = b;
Fila 6 → int theSize = myList.length;
Fila 7 → String str = myList[1];
Fila 8 → No se puede, se debe crear un nuevo arreglo.
Fila 9 → boolean isIn = myList[1].equals(b);

## Pistas si te trabás

Revisá la Sesión #37 y #38 de la guía (arreglos: declarar, crear,
índices, `length`) y la Sesión #75 (las ocho operaciones de ArrayList).
Dos preguntas que te van a guiar: ¿en qué posición del arreglo va a
parar cada valor, y quién decide ese número? ¿Y qué significa
exactamente "quitar" un elemento cuando el tamaño no se puede cambiar?

Checklist: ToDo/recorrer-una-coleccion.md

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el REPASO r1 del ejercicio del libro "ArrayList vs. arreglo
común" (página 407). Mi respuesta está en
ejercicios/repasos/lib19-r1.md.
Corregilo EN EL CHAT comparando contra mi versión original (está en
EJERCICIOS-ARCHIVO.md): qué mejoré, qué error repetí y por qué. En
EJERCICIOS.md actualizá el repaso en 3 líneas como máximo: si salió
bien, agendá el siguiente del ciclo (r2, en ~2 semanas); si salió mal,
agendá uno nuevo en ~3 días; si salió mal DOS veces seguidas, marcalo
para RE-ESTUDIO.
