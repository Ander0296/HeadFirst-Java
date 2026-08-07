# LIBRO — Sharpen your pencil: "ArrayList vs. arreglo común" — pág. 407, Sesión #75

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
| 3 | `myList.add(a);` | myList[0] = a; | 
| 4 | `String b = "Frog";` | `String b = "Frog";`  ← DADO POR EL LIBRO |
| 5 | `myList.add(b);` | myList[1] = b; |
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
Fila 6 -> int TheSize = myList.length;
Fila 7 → String str = myList[1];
Fila 8 → myList[1] = null;
Fila 9 → boolean isIn;
for (contain : myList){
  if(contain.equals(b)){
    isIn = true;
}
System.Out.Print(isIn)
}

## Pistas si te trabás

Revisá la Sesión #37 y #38 de la guía (arreglos: declarar, crear,
índices, `length`) y la Sesión #75 (las ocho operaciones de ArrayList).
Dos preguntas que te van a guiar: ¿en qué posición del arreglo va a
parar cada valor, y quién decide ese número? ¿Y qué significa
exactamente "quitar" un elemento cuando el tamaño no se puede cambiar?

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el ejercicio del libro "Sharpen your pencil: ArrayList vs. arreglo
común" (página 407). Mi respuesta está en
ejercicios/lib19-arraylist-vs-array.md.
Corregilo EN EL CHAT pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
