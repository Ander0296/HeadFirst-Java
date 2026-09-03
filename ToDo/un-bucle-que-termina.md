# Checklist: un bucle que arranca, cuenta y TERMINA

Para cualquier bucle (`while`, `for`, o su versión en pseudocódigo /
prep code). Es la lista que evita los dos desastres clásicos: el bucle
que no termina nunca y el que corta antes de tiempo.

Recorrelo con el código a la vista, señalando con el dedo la línea
concreta de cada punto. Si no podés señalarla, el punto está fallando.

## 1. La condición

- [ ] Escribí en una frase QUÉ tiene que pasar para que el bucle siga.
- [ ] Señalá la variable (o la llamada) que aparece en esa condición.
- [ ] Señalá la línea DE ADENTRO del bucle que cambia esa variable.
      Si no existe esa línea, el bucle es infinito. No hay excepciones:
      una condición que nadie modifica vale siempre lo mismo.
- [ ] Si la condición es una frase vaga tipo "mientras siga vivo",
      traducila a algo verificable: ¿vivo se mide con un booleano, con
      un contador, con el texto que devolvió un método?

## 2. La salida

- [ ] Señalá la línea exacta que APAGA el bucle (la que vuelve falsa la
      condición, o el `break`).
- [ ] Comprobá que esa línea está en el caso correcto y en UN solo caso.
      Error espejo típico: primero se corta en todos los casos, después
      en ninguno. Los dos vienen de no tener identificado el caso único
      de salida.
- [ ] Si el bucle tiene varias ramas (SI / SI NO / comparaciones), decí
      en voz alta cuál de ellas es la de salida. Solo una debería serlo.

## 3. El contador

- [ ] ¿Qué cuenta exactamente? Escribilo con sus palabras: "intentos que
      hizo el usuario" no es lo mismo que "aciertos".
- [ ] Mirá el mensaje final que se imprime y comprobá que el contador
      cuenta ESO. Si el mensaje dice "te llevó N intentos", el contador
      sube en TODAS las vueltas, no solo en las exitosas.
- [ ] Comprobá que la línea que suma está en el nivel correcto: si sube
      dentro de una rama, solo cuenta las vueltas que entran ahí.
- [ ] Comprobá que declaraste el contador ANTES del bucle (si lo
      declarás adentro, se reinicia en cada vuelta) e inicializado en 0.
- [ ] ¿Usaste la variable que declaraste? Declarar un contador y después
      sumarle a otro es un error que compila y da un resultado mudo.

## 4. Lo que devuelve un método

- [ ] Si adentro del bucle llamás a un método que DEVUELVE un valor y
      querés mirar ese valor más de una vez, guardalo primero en una
      variable.
- [ ] Contá cuántas veces escribiste el nombre del método con paréntesis
      en la vuelta. Cada aparición es una EJECUCIÓN nueva, no una
      consulta al resultado anterior. Tres comparaciones contra
      `metodo()` son tres ejecuciones con tres resultados distintos.
- [ ] Comprobá la dirección de los datos: lo que va entre paréntesis es
      lo que el método RECIBE; lo que sale es lo que DEVUELVE. Decirlo
      al revés suele venir con el error de arriba.

## 5. Antes y después del bucle

- [ ] Lo que se hace UNA sola vez (crear objetos, preparar datos,
      configurar) va AFUERA, antes del bucle.
- [ ] Lo que resume el resultado final (el mensaje "te llevó N...") va
      AFUERA, después del bucle — no adentro, donde se imprimiría en
      cada vuelta.
- [ ] Mirá la indentación: cada línea tiene que estar visiblemente
      metida adentro del bucle al que pertenece. Una línea mal indentada
      es un bug que todavía no se declaró.

## Trampas conocidas

| Síntoma | Causa casi siempre |
| --- | --- |
| El programa no termina | Nada adentro cambia la condición |
| Corta en la primera vuelta | La salida está en la rama equivocada, o en todas |
| El contador da uno de menos | Suma después de la salida, o solo en una rama |
| El contador da números raros | Se declaró adentro del bucle |
| El resultado cambia sin motivo | Se llama al método varias veces en vez de guardar lo que devuelve |
| El mensaje final se repite | Está adentro del bucle en vez de después |
