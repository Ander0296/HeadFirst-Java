# LIBRO/PROFE — "Leer el javadoc" (a partir de la pág. 452-454, Sesión #83)

Ejercicio de LECTURA de documentación. No hay código para compilar:
se contesta en papel (o acá abajo), con lo que encuentres en el sitio.

## ENUNCIADO

Abrí la documentación oficial de la API de Java en tu navegador:

    https://docs.oracle.com/en/java/javase/26/docs/api/index.html

(el 26 es tu versión de Java; si esa página no abre, probá con 17,
que es la que usa el libro — las respuestas no cambian)

Buscá la ficha de la clase **ArrayList** (atajo: la pestaña INDEX, o
buscar en Google "java 26 ArrayList javadoc") y contestá:

1. ¿En qué PAQUETE vive ArrayList? ¿Y en qué MÓDULO?

2. Buscá el método `add`. Vas a ver que aparece MÁS DE UNA VEZ, con
   listas de parámetros distintas. Escribí las dos versiones tal como
   figuran, y explicá con tus palabras qué hace cada una.

3. Buscá el método `clear()`. ¿Qué dice su descripción y qué devuelve?

4. Encontrá UN método de ArrayList que no hayas usado nunca y que te
   parezca útil. Escribí su nombre, qué recibe, qué devuelve, y una
   frase tuya de para qué lo usarías.

5. En la ficha, ¿ves alguna palabra "Deprecated"? Explicá con tus
   palabras qué significa que un método esté deprecated.

Si te trabás: revisá la Sesión #83 de GUIA-JAVA.md.

## MI RESPUESTA

1. Vive es el paquete java.lang, en el modulo java.base.

2. la primera es add(int index, E element) Esta toma dos atributos, una de tipo int y otra de tipo  objeto, inserta el elemento en la posición indicada.
la segunda es add(E e) Agrega el objeto al final de la lista.

3. Remueve todos los elementos de la lista.

4. El método que he encontrado ha sido clone(), tiene de modificador el Objeto, no se le pasan atributos, devuelve la copia de la lista, perfecto para hacer pruebas
donde tenga que modificar elementos, sin necesidad de dañar la lista original.

5. No veo alguna que sea Deprecated, significa que sirven  hoy en día, se pueden usar, pero hay opciones mejores, que ya cumplen con la meta de mejor manera.

---

PROMPT DE ENTREGA (copiá esto y pegámelo en Claude cuando termines):

/entrega Terminé el ejercicio "Leer el javadoc" (pág. 452-454).
Mi respuesta está en ejercicios/lib21-leer-el-javadoc.md.
Corregilo EN EL CHAT, dándome primero pistas y no la solución completa.
