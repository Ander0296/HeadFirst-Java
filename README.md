# HeadFirst-Java — estudio de Head First Java (3ra ed.) + POO en Java

Claude Code es mi profesor. Yo le paso pantallazos del libro (Kindle),
él me los explica en español, mantiene la guía (GUIA-JAVA.md) y lleva
los ejercicios (EJERCICIOS.md). Yo escribo TODO el código Java a mano,
lo compilo y lo ejecuto yo mismo.

Proyecto hermano: UML-Java (mismo sistema, libro "UML Distilled").
EN PAUSA hasta que termine este libro: los diagramas de clases necesitan
herencia, interfaces y composición, que todavía no vi en Java. Lo
retomo de cero cuando cierre Head First Java.

## Los dos lugares donde se escriben cosas

- [TERMINAL] = la consola de siempre (fish)
- [CLAUDE] = dentro del programa, después de escribir `claude`
Cada paso dice dónde va. Los MENSAJES están al final del archivo.

## Carpetas

- paginas/ → acá dejo la tanda actual: el TEXTO copiado del libro en un
  .md (formato preferido, ver "Cómo armar una tanda") o pantallazos
  cuando la página no se puede copiar
- paginas/leidas/ → Claude archiva acá los ya explicados (lo hace él)
- ejercicios/ → mi código Java, una carpeta por ejercicio. Claude crea
  el ARCHIVO DE ARRANQUE (enunciado + prompt de entrega adentro, solo
  comentarios); yo escribo el 100% del código debajo
- ejercicios/repasos/ → mis repasos de ejercicios ya resueltos
  (se hacen DESDE CERO, sin mirar la solución original)
- diagramas/ → mis diagramas .puml (puente con el proyecto UML-Java)
- GUIA-JAVA.md → la guía (la escribe Claude)
- EJERCICIOS.md → SOLO lo vivo: pendientes, repasos programados y
  conceptos dominados (lo escribe Claude). Se lee entero cada sesión,
  así que se mantiene corto
- EJERCICIOS-ARCHIVO.md → ejercicios ya completados con su corrección
  completa (lo escribe Claude). No se lee al inicio: solo consulta
- RUTA.md → el plan por fases: libro → consolidación → herramientas
  reales → portafolio y empleo (lo mantiene Claude)
- MECANOGRAFIA.md → frases de tipeo por sesión (las anota Claude y
  las vuelca a los archivos de ttyper; yo las practico)
- ANKI.txt → tarjetas de repaso 80/20 (las crea Claude; yo las
  importo en Anki)

## Cómo uso la mecanografía y las tarjetas Anki

Mecanografía (las frases salen de MECANOGRAFIA.md):
- CTRL+SUPER+ALT+T (atajo de mis dotfiles) abre/oculta ttyper
  flotante con una frase al azar de mis proyectos de estudio.
- Al terminar una frase: q pasa a otra frase al azar, r repite la
  misma. Claude vuelca las frases nuevas al cerrar cada tanda; yo
  no toco esos archivos.

Tarjetas Anki (ANKI.txt):
- En Anki: Archivo → Importar → elegir el ANKI.txt de este repo. El
  mazo (HeadFirst-Java), el separador tab y las etiquetas ya vienen
  preconfigurados en las cabeceras del propio archivo.
- Re-importar el MISMO archivo no duplica: actualiza las tarjetas
  que cambiaron y agrega las nuevas (Anki matchea por la pregunta).
- Rutina: después de cada git pull con tarjetas nuevas, re-importo.

# ============================================================
# CÓMO ARMAR UNA TANDA (esto define si la sesión vuela o se arrastra)
# ============================================================

Una tanda es el pedazo de libro que le paso a Claude de una vez.
Lo que hace lenta y cara una sesión es el material acumulado en el
contexto: TODO lo que le pasé antes se le vuelve a enviar en cada
respuesta que escribe. Por eso el tamaño de la tanda depende del
FORMATO en que le paso las páginas.

REGLA MADRE: si la página tiene texto que puedo seleccionar y copiar
en Kindle, va como TEXTO. Un pantallazo cuesta 3 o 4 veces más que la
misma página en texto, y encima Claude lo lee con menos precisión.

| Formato de la tanda            | Tamaño       | Tandas por sesión |
| ------------------------------ | ------------ | ----------------- |
| TEXTO (copiado a paginas/*.md) | 6-10 páginas | 2-3               |
| TEXTO con mucho código         | 5-8 páginas  | 2                 |
| IMÁGENES (pantallazos)         | 3-5 imágenes | 1                 |
| MIXTA (aunque sea 1 imagen)    | como imágenes| 1                 |

Cómo paso una tanda de TEXTO (lo preferido):
- Selecciono el texto en Kindle, lo copio y lo pego en un archivo
  nuevo: paginas/tanda-01.md (después tanda-02.md, etc.).
- Antes de cada pedazo pongo una línea con la referencia:
  `## PÁGINA 207` (o la Ubicación de Kindle). Con eso Claude puede
  anunciar "PÁGINA 207:" y yo sigo el libro con la vista.
- Si en esas páginas hay una figura, un Code Magnets, un crucigrama o
  una viñeta con dibujos que NO se puede copiar, agrego ESE pantallazo
  suelto y el resto va en texto. Eso ya hace la tanda mixta: una sola
  tanda en esa sesión.

Cómo paso una tanda de IMÁGENES (solo cuando no hay texto copiable):
- Dejo 3-5 pantallazos en paginas/ y listo. Después de esa tanda
  cambio de sesión (MENSAJE 1): las imágenes ya explicadas no tienen
  por qué seguir pesando el resto del día.

# ============================================================
# CADA DÍA DE ESTUDIO (java-s02, s03, ...)
# ============================================================

1. [TERMINAL] cd ~/Proyectos/HeadFirst-Java
2. [TERMINAL] git pull ← traé lo último ANTES de tocar nada
   (clave si usás más de un PC; con uno solo no hace daño)
3. [TERMINAL] armá la tanda en paginas/ (ver "Cómo armar una tanda")
4. [TERMINAL] claude
5. [CLAUDE] /rename java-sNN ← el número que sigue (s31, s32...)
6. [CLAUDE] /mcp → engram "connected"
7. [CLAUDE] pegá el MENSAJE 2 → te dice dónde quedamos, qué
   ejercicios tenés pendientes y si hay repasos vencidos
8. [CLAUDE] si ya hiciste algo pendiente, entregalo ANTES de pasar
   a páginas nuevas: MENSAJE 4 (ejercicio de código), MENSAJE 6
   (ejercicio del libro) o MENSAJE 7 (repaso)
9. [CLAUDE] pegá el MENSAJE 3 → explica la tanda y la archiva solo
10. ¿Querés seguir estudiando? Depende del formato de la tanda:
    - fue de TEXTO y la próxima también → armá la tanda nueva en
      paginas/ y volvé al paso 9 (hasta 2-3 tandas por sesión)
    - fue de IMÁGENES, o Claude ya te avisó que conviene cortar →
      MENSAJE 1, Ctrl+D, y volvé al paso 3 con sesión NUEVA
      (/rename con el número siguiente, MENSAJE 2, y seguís)
11. [CLAUDE] al terminar el día, pegá el MENSAJE 5
12. [CLAUDE] Ctrl+D
13. [TERMINAL] engram search "tema de hoy" --project HeadFirst-Java
14. [TERMINAL] git add . && git commit -m "sesión sNN" && git push
    (con un solo PC es opcional; con DOS PCs es OBLIGATORIO — si no
    hacés push, el otro PC no se entera de nada de lo de hoy)

# ============================================================
# SI USÁS OTRO COMPUTADOR (clonar y sincronizar)
# ============================================================

Primera vez en el PC nuevo:
1. [TERMINAL] cd ~/Proyectos
2. [TERMINAL] git clone git@github.com:Ander0296/HeadFirst-Java.git
   ← SIEMPRE con la URL SSH (git@github.com:...), NUNCA con https://
3. [TERMINAL] cd HeadFirst-Java && mkdir -p paginas/leidas
   (paginas/ llega vacía a propósito: las imágenes no viajan por git)
4. Listo: GUIA-JAVA.md, EJERCICIOS.md y ejercicios/ llegan solos con
   todo el progreso. Seguí con el flujo de "CADA DÍA".

La regla que evita desastres con dos PCs:
- Al EMPEZAR el día: git pull (traé lo del otro PC antes de tocar nada)
- Al TERMINAR el día: git add . && git commit -m "..." && git push
- La memoria de Engram vive en cada PC por separado y puede estar
  incompleta en uno de los dos. No pasa nada: GUIA-JAVA.md y
  EJERCICIOS.md viajan por git y el MENSAJE 2 los lee siempre —
  esos archivos son la fuente de verdad del progreso.

Si git te pide usuario y contraseña al hacer push (ya me pasó una vez):
- Causa: el remote quedó configurado en HTTPS, y con HTTPS git ignora
  la llave SSH (la de 1Password) aunque esté cargada y funcionando.
- Diagnóstico: git remote -v
  → si muestra https://github.com/... , es exactamente este problema.
- Arreglo (cambiar el remote a SSH):
  git remote set-url origin git@github.com:Ander0296/HeadFirst-Java.git
- Probá la llave: ssh -T git@github.com
  → debe responder "Hi Ander0296!" (Hola Ander0296!). Después de eso,
  git push funciona sin pedir usuario ni contraseña.

# ============================================================
# SI SE CERRÓ LA TERMINAL SIN QUERER (mismo día)
# ============================================================

[TERMINAL] claude --resume java-sNN
(o `claude --resume` solo, y elegís de la lista)
OJO: esto es SOLO para retomar el mismo día. Día nuevo = sesión nueva.

# ============================================================
# REGLAS DE ORO
# ============================================================

1. El número de sesión SOLO AVANZA. Varias sesiones en un mismo día es
   lo NORMAL, no un problema: cada tanda de imágenes abre una nueva.
2. Si la página se puede copiar como texto, va como texto. Siempre.
3. Tamaño de tanda según formato (tabla de arriba). Nunca más de 5
   pantallazos ni más de 10 páginas de texto por tanda.
4. NUNCA salir sin pegar el MENSAJE 5: es lo que guarda el día.
5. Al cambiar de sesión a mitad del día, MENSAJE 1 primero: sin eso la
   tanda no queda registrada en la guía y se pierde. Si además Claude
   empieza a olvidar cosas dichas antes o se pone lento, eso es la
   señal de que la sesión ya está demasiado cargada: cortá igual.
6. Los ejercicios del libro (Sharpen your pencil, BE the compiler,
   Code Magnets, Pool Puzzle...) SIEMPRE los intento a mano ANTES de
   mirar la solución del libro o pedírsela a Claude.
7. paginas/ NUNCA se sube a git: el repo es público y el contenido del
   libro tiene copyright. Verificá que esté en .gitignore.
8. Los repasos se hacen DESDE CERO, sin mirar mi solución original ni
   pedírsela a Claude: releer no fija nada, volver a resolver sí.
9. Con dos PCs: git pull al empezar, git push al terminar. SIEMPRE.

# ============================================================
# MENSAJES PARA COPIAR Y PEGAR
# ============================================================

--- MENSAJE 1 — cambio de sesión (mitad del día, antes de Ctrl+D) ---

```
Cerramos esta sesión para arrancar una limpia. Sin resumen largo:
1. Confirmá en una línea que la tanda quedó registrada en GUIA-JAVA.md,
   MECANOGRAFIA.md (+ el archivo de ttyper de cada frase nueva) y
   ANKI.txt, y que los ejercicios nuevos tienen su archivo de arranque
   creado.
2. Guardá en Engram (project "HeadFirst-Java") la última página vista y
   qué sigue.
3. Decime en UNA línea con qué arranca la próxima sesión.
```

Después: Ctrl+D → armá la tanda nueva en paginas/ → `claude` →
`/rename java-sNN` (número siguiente) → MENSAJE 2 → MENSAJE 3.

--- MENSAJE 2 — arranque del día (o de una sesión nueva) ---

```
Nueva sesión de estudio. Sin leer CLAUDE.md con Read (ya lo tenés
cargado): leé el INICIO RÁPIDO de GUIA-JAVA.md (solo esa sección, con
limit) y EJERCICIOS.md, buscá en Engram (project "HeadFirst-Java")
dónde quedamos, y decime corto: (1) qué vimos la última vez en una
línea, (2) qué ejercicios tengo pendientes, (3) si hay algún repaso
vencido (las fechas están ordenadas en REPASOS PROGRAMADOS, el de
arriba es el que toca), (4) qué toca hoy. Después decido si corregimos
un ejercicio, hacemos un repaso o te paso la tanda.
```

--- MENSAJE 3 — tanda de páginas (repetible: una vez por cada tanda) ---

```
Tanda nueva: está en paginas/ (si la pasé como texto, en los .md; si
hay pantallazos, en la raíz, sin entrar a paginas/leidas/). Leela en
orden de nombre y arrancá el flujo completo de CLAUDE.md, respetando el
presupuesto de contexto: explicás COMPRIMIENDO, no transcribiendo —
cuando el libro repite una idea ya explicada, decilo en una línea y
seguí.
Cuando termines de explicarme esta tanda, antes de seguir con cualquier
otra cosa: mové ese material a paginas/leidas/ para que la raíz quede
vacía, agregá las frases de esta tanda a MECANOGRAFIA.md y volcá cada
frase NUEVA a su propio archivo de ttyper (append-only, sin reescribir
los viejos), y agregá las tarjetas 80/20 de esta tanda a ANKI.txt.
Si la tanda fue de imágenes, recordame al final que conviene cambiar de
sesión.
```

--- MENSAJE 4 — corregir un ejercicio de código (la versión YA RELLENA está al final del archivo de arranque del ejercicio) ---

```
Hice el ejercicio #NN, está en ejercicios/ejNN-nombre/.
Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
Revisalo línea por línea EN EL CHAT: qué está bien, qué está mal y POR
QUÉ. En EJERCICIOS.md actualizá el estado con una corrección de 3
líneas como máximo; si quedó completado, movelo con su corrección a
EJERCICIOS-ARCHIVO.md y agendá sus repasos.
```

--- MENSAJE 5 — cierre del día (SIEMPRE antes de salir) ---

```
Cerramos el día:
1. Verificá que GUIA-JAVA.md, EJERCICIOS.md, MECANOGRAFIA.md y
   ANKI.txt quedaron actualizados con todo lo de hoy (incluidos los
   repasos agendados, el archivo de ttyper de cada frase nueva, y que
   las tarjetas nuevas sean autocontenidas).
2. Verificá que TODO ejercicio o repaso pendiente tenga su archivo de
   arranque creado en ejercicios/ (si falta alguno, crealo ahora,
   solo comentarios, sin código ejecutable).
3. Archivá lo cerrado: si EJERCICIOS.md pasa de ~150 líneas, mové los
   ejercicios completados y los repasos cumplidos a
   EJERCICIOS-ARCHIVO.md. Si GUIA-JAVA.md pasa de ~500, mové las
   sesiones viejas a GUIA-ARCHIVO.md.
4. Guardá en Engram (project "HeadFirst-Java") el resumen y en qué
   página quedamos.
5. Dame el resumen final del día.
```

--- MENSAJE 6 — ejercicio del libro (la versión YA RELLENA está al final del archivo del ejercicio) ---

```
Hice el ejercicio del libro "[nombre del ejercicio]" (página X).
Mi respuesta está en [ejercicios/libNN-nombre.md] (o la escribo acá:
[...]). Corregilo EN EL CHAT pero SIN darme la solución completa de
entrada: decime qué tengo bien, qué tengo mal, y dame pistas para lo
que falta. La solución completa solo si te la pido después. En
EJERCICIOS.md registrá el resultado en 3 líneas como máximo; si quedó
completado, movelo con su corrección a EJERCICIOS-ARCHIVO.md y agendá
sus repasos.
```

--- MENSAJE 7 — hacer un repaso (cuando el MENSAJE 2 avise que hay uno vencido) ---

```
Voy a hacer el repaso rX del ejercicio #NN. NO me muestres ni me
resumas mi solución anterior: la idea es resolverlo desde cero. Creá el
archivo de arranque en ejercicios/repasos/ (solo enunciado + prompt de
entrega, en comentarios, sin código) y esperá a que lo entregue. Al
revisarlo, buscá mi solución original en EJERCICIOS-ARCHIVO.md y
comparala con la nueva: qué mejoré, qué error repetí y POR QUÉ.
Actualizá REPASOS PROGRAMADOS en EJERCICIOS.md, agendá el siguiente si
corresponde, y mové el repaso cumplido a EJERCICIOS-ARCHIVO.md.
```
