# REPASO r1 bis — LIBRO "ArrayList vs. arreglo común" — pág. 407, Sesión #75

Repaso desde cero. NO mires tu versión anterior ni la solución del libro.

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

3. myList[0] = a;
5. myList[1] = b;
6. int theSize = myList.length;
7. String str = myList[1];
8. myList[1] = null;
9. boolean isIn = false;
for (String name : myList){
  if (b.equals(name)){
    isIn = true;
    break;
  }
}

## Pistas si te trabás

Revisá la Sesión #37 y #38 de la guía (arreglos: declarar, crear,
índices, `length`) y la Sesión #75 (las ocho operaciones de ArrayList).
Dos preguntas que te van a guiar: ¿en qué posición del arreglo va a
parar cada valor, y quién decide ese número? ¿Y qué significa
exactamente "quitar" un elemento cuando el tamaño no se puede cambiar?

Checklist: ToDo/recorrer-una-coleccion.md

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

```
/entrega Hice el REPASO r1 bis del ejercicio del libro "ArrayList vs.
arreglo común" (página 407). Mi respuesta está en
ejercicios/repasos/lib19-r1bis.md. Corregilo EN EL CHAT comparando
contra mi versión original: qué mejoré, qué error repetí y por qué.
```
