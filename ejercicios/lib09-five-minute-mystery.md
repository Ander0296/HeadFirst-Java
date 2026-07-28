# LIBRO — Five-Minute Mystery: "The case of the pilfered references"

("Misterio de cinco minutos: el caso de las referencias robadas")
Head First Java, pág. 253-255 (Sesión #45).

Es un ejercicio de RAZONAMIENTO, no de código: no hay nada que
compilar. Se responde con una frase bien fundamentada.

## La historia (traducida y resumida)

Era una noche oscura y tormentosa. Tawny entró al "bullpen" (la sala
común donde trabajan los programadores) como si fuera la dueña.
Necesitaba agregar un method nuevo a la clase central de un celular
con Java, ultra secreto, de un cliente. El espacio de heap en la
memoria del celular era MUY escaso ("heap space was tight" = el
espacio del heap estaba justo), y todos lo sabían.

Tawny dibujó en la pizarra qué tenía que hacer el method nuevo y
lanzó el desafío: "Whoever creates the most memory efficient version
of this method is coming with me to the client's launch party on
Maui." ("El que escriba la versión más eficiente en memoria de este
method se viene conmigo a la fiesta de lanzamiento del cliente en
Maui.")

A la mañana siguiente, Bob mostró su solución primero. Tawny le dijo:
"show me how you handled updating the list of contact objects"
("mostrame cómo resolviste actualizar la lista de objetos contacto").

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

Kate fue la siguiente, ya imaginándose los tragos de coco en la
fiesta. "Bob, your solution's a bit kludgy, don't you think?"
("Bob, tu solución es un poco chapucera, ¿no te parece?" — "kludgy"
es código que funciona pero está hecho con alambre.) Y escribió:

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

## LA PREGUNTA

"Why did Tawny choose Bob's method over Kate's, when Kate's used less
memory?"

(¿Por qué Tawny eligió el método de Bob por encima del de Kate, si el
de Kate usaba menos memoria?)

Tawny eligió a bob porque aunque va a consumir más memoria el programa funciona, creó los 11 objetos, 10 para acceder a la información como lo pidió Tawny.
Por otro lado Kate creo 10 objetos, pero un solo "control remoto" en este caso, el control va estar apuntando a un objeto diferente en cada vuelta, esto hace
que pierdan la referencia y queden seleccionables para el garbage collector

Si te trabás: revisá la Sesión #37 de la guía (`null`, garbage
collection y qué pasa con un objeto cuando ninguna referencia lo
apunta) y la Sesión #43 (un arreglo guarda referencias, no objetos).

Pista de lectura, sin resolverlo: seguí a Kate vuelta por vuelta.
Cuando termina la vuelta 1 y arranca la vuelta 2, ¿a qué objeto
apunta `contactRef`? ¿Y qué pasó con el objeto de la vuelta anterior?

## MI RESPUESTA

(escribí acá tu razonamiento, con tus palabras)

---

## PROMPT DE ENTREGA (copiá y pegá esto cuando termines)

Hice el ejercicio del libro "Five-Minute Mystery: the case of the
pilfered references" (página 253-255). Mi respuesta está en
ejercicios/lib09-five-minute-mystery.md. Corregilo EN EL CHAT pero SIN
darme la solución completa de entrada: decime qué tengo bien, qué
tengo mal, y dame pistas para lo que falta. La solución completa solo
si te la pido después. En EJERCICIOS.md registrá el resultado en 3
líneas como máximo; si quedó completado, movelo con su corrección a
EJERCICIOS-ARCHIVO.md y agendá sus repasos.
