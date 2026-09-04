# Checklist: leer la documentación de una clase de Java (javadoc)

Para cuando necesitás saber qué hace una clase o un método y no querés
adivinar. Se recorre de arriba a abajo, con la página abierta al lado.

## Antes de buscar

- [ ] Definí cuál de los DOS problemas tenés. No se resuelven igual:
      - No sé ni el nombre de lo que necesito → problema de DESCUBRIR.
        Abrí la pestaña PACKAGE del paquete donde podría estar (casi
        siempre `java.util`) y mirá la lista entera, o hojeá un libro
        de referencia. Buscar no sirve: no sabés qué escribir.
      - Ya sé el nombre y quiero saber qué puede hacer → problema de
        CONSULTAR. Seguí con esta lista.
- [ ] Fijate qué versión de Java tenés (`java -version` en la terminal).
      La dirección de la documentación lleva ese número:
      `https://docs.oracle.com/en/java/javase/NN/docs/api/index.html`
- [ ] Atajo más rápido que navegar el sitio: buscar en el navegador
      `java NN NombreDeLaClase javadoc` (ej: `java 26 ArrayList javadoc`).

## Al abrir la ficha de la clase

- [ ] Leé el encabezado: dice el MÓDULO y el PAQUETE de esa clase
      (ej: Module java.base, Package java.util). El paquete es lo que
      vas a necesitar para el `import`.
- [ ] Leé el primer párrafo de la descripción, no solo el título.
      Ahí suele estar la diferencia entre dos clases parecidas.
- [ ] Bajá a "Method Summary" (resumen de métodos): es la tabla con
      TODOS los métodos, con lo que devuelve cada uno a la izquierda.

## Al mirar un método concreto

- [ ] Mirá lo que devuelve (a la izquierda del nombre). Si dice `void`,
      NO devuelve nada: guardarlo en una variable no compila.
- [ ] Mirá los paréntesis: qué recibe y de qué tipo, en ese orden exacto.
- [ ] Si el mismo nombre aparece VARIAS veces, no es un error de la
      página: son versiones distintas del mismo método, que se
      diferencian por lo que reciben entre paréntesis. Elegí la que
      coincida con lo que vos tenés a mano.
- [ ] Buscá la palabra **Deprecated** (obsoleto). Si el método la tiene,
      funciona y compila, pero no lo uses en código nuevo: hay algo
      mejor, y la propia ficha suele decir cuál.

## Trampas conocidas

| Ves esto | Significa |
| --- | --- |
| `void` a la izquierda | no devuelve nada; no lo asignes a una variable |
| `boolean` a la izquierda | devuelve true/false; ya sirve solo dentro de un `if`, sin `== true` |
| el mismo nombre repetido | varias versiones que se distinguen por los paréntesis |
| `static` a la izquierda | se llama con el nombre de la CLASE, no con un objeto (`Math.random()`) |
| Deprecated | anda, pero está desaconsejado |
