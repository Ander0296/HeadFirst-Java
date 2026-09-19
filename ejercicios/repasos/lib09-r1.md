# REPASO r1 — Five-Minute Mystery: "The case of the pilfered references"

("Misterio de cinco minutos: el caso de las referencias robadas")
Head First Java, pág. 253-255. Repaso DESDE CERO: no mires tu versión
original ni la solución del libro.

Es un ejercicio de RAZONAMIENTO, no de código: no hay nada que
compilar. Se responde con frases bien fundamentadas.

## La historia (traducida y resumida)

Era una noche oscura y tormentosa. Tawny entró al "bullpen" (la sala
común donde trabajan los programadores). Necesitaba agregar un método
nuevo a la clase central de un celular con Java, ultra secreto, de un
cliente. El espacio de heap en la memoria del celular era MUY escaso
("heap space was tight" = el espacio del heap estaba justo).

Tawny lanzó el desafío: "Whoever creates the most memory efficient
version of this method is coming with me to the client's launch party
on Maui." ("El que escriba la versión más eficiente en memoria de este
método se viene conmigo a la fiesta de lanzamiento del cliente en
Maui.")

A la mañana siguiente, Bob mostró su solución primero. Tawny le dijo:
"show me how you handled updating the list of contact objects"
("mostrame cómo resolviste actualizar la lista de objetos contacto").
`Contact` (contacto) es la clase; `contacts` (contactos) y `contactRef`
(referencia a contacto) son variables.

Bob escribió esto en la pizarra:

    Contact[] contacts = new Contact[10];
    while (x < 10) {              // make 10 contact objects
        contacts[x] = new Contact();
        x = x + 1;
    }
    // do complicated Contact list updating with contacts

("make 10 contact objects" = crear 10 objetos contacto;
"do complicated Contact list updating" = hacer la actualización
complicada de la lista de contactos.)

Bob se defendió: "Tawny, I know we're tight on memory, but your spec
said that we had to be able to access individual contact information
for all ten allowable contacts; this was the best scheme I could cook
up." ("Tawny, ya sé que estamos justos de memoria, pero tu
especificación decía que teníamos que poder acceder a la información
de cada uno de los diez contactos permitidos; este fue el mejor
esquema que se me ocurrió.")

Kate fue la siguiente: "Bob, your solution's a bit kludgy, don't you
think?" ("Bob, tu solución es un poco chapucera, ¿no te parece?"). Y
escribió:

    Contact contactRef;
    while (x < 10) {              // make 10 contact objects
        contactRef = new Contact();
        x = x + 1;
    }
    // do complicated Contact list updating with contactRef

"I saved a bunch of reference variables worth of memory, Bob-o-rino,
so put away your sunscreen." ("Me ahorré un montón de memoria en
variables de referencia, Bob-o-rino, así que guardá el protector
solar.")

"Not so fast Kate!" dijo Tawny, "you've saved a little memory, but
Bob's coming with me." ("¡No tan rápido, Kate! Ahorraste un poco de
memoria, pero el que viene conmigo es Bob.")

## LA PREGUNTA (contestá las TRES partes)

"Why did Tawny choose Bob's method over Kate's, when Kate's used less
memory?" (¿Por qué Tawny eligió el método de Bob por encima del de
Kate, si el de Kate usaba menos memoria?)

1. Con el código de BOB: ¿cuántos OBJETOS hay en el heap al terminar el
   bucle, y cuántas REFERENCIAS (variables que apuntan a algo)? Contá
   todo, incluido el arreglo.
2. Con el código de KATE: ¿cuántos objetos `Contact` se crearon,
   cuántas referencias hay, y cuántos objetos quedan ACCESIBLES al
   terminar el bucle? ¿Qué les pasa a los demás?
3. Entonces: ¿por qué gana Bob?

Si te trabás: revisá la Sesión #37 de GUIA-JAVA.md (`null`, garbage
collection (recolección de basura) y qué pasa con un objeto cuando
ninguna referencia lo apunta) y la Sesión #43 (un arreglo guarda
referencias, no objetos). Esas sesiones ya están en GUIA-ARCHIVO.md.

Checklist: ToDo/entregar-un-ejercicio.md (contestar TODAS las partes de
cada pregunta, no solo la primera).

## MI RESPUESTA
1. Con el código de BOB hay 11 objetos en el heap y 11 referencias
2. Se crearon 10 objetos peco noro uto que accesible al terminar el bucle, los demas no tienen variable de referencia porque se pisan en cada vuelta
3. Gano BOB porque apesar de que están justos de memoria, no se pierde información, y eso es más importante.


## PROMPT DE ENTREGA (copialo y pegalo en Claude cuando termines)

```
/entrega Hice el REPASO r1 de lib09 Five-Minute Mystery "The case of
the pilfered references" (pág. 253-255). Mi respuesta está en
ejercicios/repasos/lib09-r1.md. Corregilo EN EL CHAT comparándolo con
mi versión original (EJERCICIOS-ARCHIVO.md) y decime qué mejoré y qué
error repetí.
```
