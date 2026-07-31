# LIBRO — Sharpen your pencil: "¿qué más testear?" — pág. 346, Sesión #62

## Contexto (qué es esto)

El libro mostró el test code completo de la clase `SimpleStartupTestDrive`
(prueba el método `checkYourself()` de `SimpleStartup` con un intento
falso del usuario). Antes de seguir implementando la clase real, pide
pensar qué le falta a ese test.

## Enunciado (traducido)

"En las próximas páginas vamos a implementar la clase SimpleStartup, y
después volvemos a la clase de test. Mirando el test code de arriba,
¿qué más se debería agregar? ¿Qué NO se está probando en este código
que SÍ deberíamos probar? Escribí tus ideas (o líneas de código) abajo."

Recordatorio del test code que mostró el libro (ya visto en el chat):
crea un `SimpleStartup`, le asigna la ubicación `{2, 3, 4}`, prueba con
el intento falso `userGuess = 2` y solo revisa si el resultado es
`"hit"`.

## MI RESPUESTA

(escribí acá tus ideas: qué otros casos, valores o resultados posibles
del método `checkYourself()` NO está cubriendo este test — no hace
falta que compile, alcanza con la idea o unas líneas sueltas)

## Pistas si te trabás

Repasá qué puede devolver `checkYourself()` según el prep code (Sesión
#61 de la guía): no es un único resultado posible. También pensá qué
pasa si se prueba más de una vez seguida sobre el mismo objeto.

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Hice el ejercicio del libro "¿qué más testear?" (página 346).
Mi respuesta está en ejercicios/lib13-que-mas-testear.md.
Corregilo EN EL CHAT pero SIN darme la solución completa de entrada:
decime qué tengo bien, qué tengo mal, y dame pistas para lo que falta.
La solución completa solo si te la pido después. En EJERCICIOS.md
registrá el resultado en 3 líneas como máximo; si quedó completado,
movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá sus repasos.
