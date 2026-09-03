# ToDo/ — Checklists de verificación

Esta carpeta guarda **checklists reutilizables**: listas de "qué tengo
que verificar antes de dar algo por terminado".

No son apuntes ni resúmenes. Un apunte explica un tema; un checklist se
usa **mientras trabajás**, con el archivo abierto al lado, tachando
puntos uno por uno.

## En qué se diferencia de los otros archivos del repo

| Archivo | Para qué sirve | Cuándo se lee |
| --- | --- | --- |
| `GUIA-JAVA.md` | Qué aprendí, sesión por sesión | Al repasar un tema |
| `EJERCICIOS.md` | Qué tengo pendiente | Al empezar la sesión |
| `ANKI.txt` | Memorizar por repetición | En la app de Anki |
| `ToDo/` | **Verificar mi propio trabajo** | Mientras escribo código |

## Cómo se usa

1. Abrí el checklist que corresponda ANTES de empezar.
2. Escribí tu código.
3. Volvé al checklist y recorré los puntos uno por uno sobre lo que
   escribiste.
4. Recién ahí compilá.

Ese orden importa. Si compilás primero y usás el checklist después,
estás dejando que el compilador piense por vos — y en una entrevista
técnica no hay compilador.

## Reglas de estos archivos

- **Autocontenidos**: se entienden sin haber leído el libro ni las
  sesiones de la guía. Cualquiera tiene que poder usarlos.
- **Accionables**: cada punto es algo que se puede verificar mirando el
  código, no un concepto para reflexionar.
- **Vivos**: cuando aparece un error nuevo que el checklist no cubría,
  se le agrega un punto. Crecen con la experiencia.
- Van a git: son material propio, no material del libro.

## Índice

- [Crear una clase en Java](crear-una-clase-java.md) — qué verificar en
  cada nivel de anidamiento (archivo → clase → método → instrucción)
  antes de compilar.
- [Antes de entregar un ejercicio](entregar-un-ejercicio.md) — cómo
  comprobar que respondiste el enunciado ENTERO (diagnóstico Y arreglo)
  y que las palabras clase/objeto/referencia están bien usadas.
- [Un bucle que termina](un-bucle-que-termina.md) — qué señalar con el
  dedo en cualquier bucle: la línea que lo apaga, el contador que cuenta
  lo que dice el mensaje final, y el valor devuelto guardado una sola vez.
- [Recorrer un arreglo o un ArrayList](recorrer-una-coleccion.md) — qué
  cambia entre `length`/`[i]` y `size()`/`get(i)`, el tipo del for
  mejorado, y el `null` de las casillas vacías.
