# CHECKLIST — Antes de entregar un ejercicio

Este checklist no habla de Java. Habla de **cómo se responde un
enunciado**, que es una habilidad aparte — y la que más puntos regala
cuando falta.

Recorrelo cuando creas que terminaste, ANTES de copiar el prompt de
entrega.

---

## La idea de fondo: un enunciado son varias preguntas disfrazadas de una

Los enunciados casi nunca piden una sola cosa. Piden dos o tres
pegadas con comas y con "y", y la vista se detiene en la primera.

> "¿Compila cada archivo? Si no, **¿por qué exactamente** y **cómo lo
> arreglarías**? Si sí compila, **¿cuál sería su salida**?"

Eso no es una pregunta. Son tres, y hay que responder las que
correspondan según por dónde salga la primera.

Diagnosticar es la mitad fácil. Arreglar es la mitad que demuestra que
entendiste, porque para arreglar hay que escribir la solución, y ahí
no se puede esconder nada.

---

## Nivel 1 — Releer el enunciado

- [ ] Leelo de nuevo **después** de escribir tu respuesta, no solo
      antes. Antes lo leés con expectativa; después lo leés con lo que
      escribiste al lado.
- [ ] **Contá los signos de pregunta** del enunciado. Ese número es
      cuántas respuestas tenés que tener.
- [ ] Subrayá los verbos que te piden acción: *decir*, *explicar*,
      *arreglar*, *completar*, *mostrar la salida*, *reconstruir*.
      Cada verbo es una entrega distinta.
- [ ] Buscá los condicionales: "**si** no compila...", "**si** sí
      compila...". Uno de los dos caminos te toca. Fijate cuál y
      respondelo entero.

## Nivel 2 — Revisar tu respuesta contra el enunciado

- [ ] Punto por punto: por cada pregunta que contaste arriba, señalá
      con el dedo **dónde** está su respuesta en tu texto. Si no la
      encontrás en dos segundos, no está.
- [ ] Si el enunciado tiene varias partes rotuladas (A, B, C...),
      comprobá que **todas** tengan respuesta. Una parte en blanco no
      es "obvia": es una parte en blanco.
- [ ] Si pidieron un arreglo, **escribí el arreglo**, no lo describas.
      "Habría que crear el método" no es un arreglo. El arreglo es el
      código, con su tipo de retorno, sus llaves y su `;`.
- [ ] Si pidieron una salida, escribila **literal**, tal como saldría
      en la pantalla, línea por línea. No "imprime los datos".

## Nivel 3 — Precisión de lo que decís

- [ ] Nombrá **la cosa exacta** que falla, no la zona donde falla.
      "Falta algo en el TestDrive" no sirve; "la variable `song` nunca
      se declaró" sí.
- [ ] Si tu explicación usa una palabra técnica, comprobá que sea la
      correcta. Estas tres se mezclan todo el tiempo:

| Palabra | Qué es | Ejemplo |
| --- | --- | --- |
| **clase** | El molde, el plano. Se escribe una vez. | `class Perro { }` |
| **objeto** | La cosa construida con ese molde. Vive en memoria. | lo que crea `new Perro()` |
| **referencia** (la variable) | El control remoto que apunta **a un objeto**, nunca a una clase. | `Perro p` |

La frase "la referencia apunta a la clase" está mal. Apunta al
**objeto**. La clase solo dice de qué tipo puede ser ese objeto.

- [ ] Si dos cosas fallan por causas distintas, decí las dos. Si
      fallan por la misma, no la repitas dos veces con otras palabras.

## Nivel 4 — Antes de mandar

- [ ] **Guardá el archivo.** Escribir en el editor no es guardar. Una
      respuesta sin guardar llega en blanco y se corrige en blanco.
- [ ] Comprobá que estás entregando **la ruta correcta** (el archivo
      del repaso, no el original; la carpeta del ejercicio, no otra).

---

## La trampa: "ya sé cuál es el error, listo"

Saber cuál es el error se siente como haber terminado. No lo es.

Diagnosticar usa **reconocimiento**: mirás el código y algo no encaja.
Arreglar usa **producción**: tenés que escribirlo bien de memoria.

Son dos músculos distintos, y en una entrevista técnica te van a pedir
el segundo. Nadie contrata a alguien que sepa señalar el bug pero no
sepa taparlo.

Regla dura: **si el enunciado pide un arreglo y tu respuesta no tiene
código escrito, no terminaste.**
