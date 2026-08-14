# HeadFirst-Java — estudio de Head First Java (3ra ed.) + POO en Java

Claude Code es mi profesor. Yo le paso el libro por tandas (texto de
Kindle o pantallazos), él me lo explica en español, mantiene la guía
(`GUIA-JAVA.md`) y lleva los ejercicios (`EJERCICIOS.md`). **Yo escribo
TODO el código Java a mano, lo compilo y lo ejecuto yo mismo.**

No hay mensajes que copiar y pegar: **cada cosa es un comando**, y el
profe me dice cuál sigue. Tampoco escribo comandos de git: los hace él.

Proyecto hermano: UML-Java (mismo sistema, libro "UML Distilled").
EN PAUSA hasta que termine este libro: los diagramas de clases necesitan
herencia, interfaces y composición, que todavía no vi en Java. Lo
retomo de cero cuando cierre Head First Java.

## Los dos lugares donde se escriben cosas

- `[TERMINAL]` = la consola de siempre (fish)
- `[CLAUDE]` = dentro del programa, después de escribir `claude`

## El mapa en 30 segundos

```
HeadFirst-Java/
├── paginas/         acá dejo la tanda de hoy (NO va a git: copyright)
│   └── leidas/      lo ya explicado — lo archiva Claude solo
├── ejercicios/      mi código Java, una carpeta por ejercicio. Claude
│   │                deja el ENUNCIADO en comentarios; el 100% del
│   └── repasos/     código lo escribo yo. Los repasos, desde cero
├── pruebas/         código suelto para probar cosas mías
├── intellij/        proyectos de IntelliJ (Fase 3)
├── diagramas/       mis .puml (puente con UML-Java)
├── ToDo/            checklists: qué verificar antes de compilar
├── GUIA-JAVA.md   ★ lo que ENTENDÍ, sesión a sesión + vocabulario
├── EJERCICIOS.md  ★ SOLO lo vivo: pendientes, repasos y conceptos
│                    dominados. Se lee entero cada sesión: va corto
├── PENDIENTES.md    la deuda que NO es un ejercicio: páginas que no
│                    llegaron y contenido diferido. Lo triagea
│                    /pendientes, no se lee al empezar
├── RUTA.md          el plan por fases: libro → consolidación →
│                    herramientas reales → portafolio y empleo
├── MECANOGRAFIA.md  frases de tipeo de cada sesión (ttyper)
├── ANKI.txt         tarjetas de repaso 80/20 para importar en Anki
├── CLAUDE.md        las reglas del profe
└── .claude/          los comandos (commands/) y los dos automatismos
                      (hooks/): pull al abrir, y el candado
```

**Los dos automatismos que corren solos:**
- al abrir cualquier sesión se hace `git pull`, aunque me olvide de
  `/arranque`;
- Claude tiene **prohibido por el harness** editar o pisar cualquier archivo
  que ya exista en `ejercicios/`, `diagramas/` o `pruebas/`. Solo puede CREAR
  el archivo de arranque. Si algún día necesito desactivarlo: `/hooks`.

Archivos que crecen aparte y NO se leen al empezar:
`GUIA-ARCHIVO.md` (sesiones viejas) y `EJERCICIOS-ARCHIVO.md`
(ejercicios completados con su corrección).

# ============================================================
# EL ÚNICO FLUJO QUE TENGO QUE SABER
# ============================================================

Da igual si vengo a estudiar páginas nuevas, a entregar un ejercicio o
a hacer un repaso. **Siempre es lo mismo:**

```
[TERMINAL]  cd ~/Proyectos/HeadFirst-Java
[TERMINAL]  armo la tanda en paginas/  (ver "Cómo armar una tanda")
[TERMINAL]  claude
[CLAUDE]    /arranque
```

Y ya está. El profe hace `git pull`, mira en qué página quedamos, qué
ejercicios tengo pendientes y qué repasos vencieron, y me dice en menos
de 10 líneas qué toca hoy. Termina siempre con un bloque así:

```
▶ SIGUE: explicar las páginas 446-453 (tanda de texto, 8 páginas)
  1. /rename java-s56     ← el nombre de ESTA sesión
  2. /tanda
```

Copio eso y sigo. **No tengo que acordarme de ningún número, ningún
nombre ni ningún mensaje.** Si el bloque no aparece, lo pido: "¿qué
sigue?".

Si quiero forzar algo distinto a lo que detectó, se lo digo de una:
`/arranque vengo a entregar el ejercicio lib13`.

# ============================================================
# LOS COMANDOS
# ============================================================

Los prompts completos viven en `.claude/commands/`.

| Comando | Para qué | Cuándo lo uso |
| --- | --- | --- |
| `/arranque` | dónde quedamos, cómo se llama esta sesión y qué toca hoy | **siempre, primero** |
| `/tanda` | me explica las páginas que dejé en `paginas/` | por cada tanda |
| `/entrega` | corrige el ejercicio que terminé (código o del libro) | cuando termino uno |
| `/repaso` | repaso vencido, desde cero | cuando el profe avisa |
| `/pendientes` | triage: qué se pudre, qué se salda, qué doy de baja | domingo, 5 minutos |
| `/examen` | me toma examen en frío, sin material al lado | cuando quiera probarme |
| `/cambio` | cierra esta sesión y abre una limpia | mitad del día |
| `/cierre` | guarda todo y sube a git | antes de salir, siempre |

Todos aceptan contexto extra: `/tanda son 4 pantallazos del capítulo 6`,
`/entrega el ej13 está en ejercicios/ej13-multifor/, compila y corre bien`.

El prompt de `/entrega` ya relleno está **al final de cada archivo de
arranque**: lo copio de ahí, es más rápido.

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
  nuevo: `paginas/tanda-01.md` (después `tanda-02.md`, etc.).
- Antes de cada pedazo pongo una línea con la referencia:
  `## PÁGINA 207` (o la Ubicación de Kindle). Con eso Claude puede
  anunciar "PÁGINA 207:" y yo sigo el libro con la vista.
- Si en esas páginas hay una figura, un Code Magnets, un crucigrama o
  una viñeta con dibujos que NO se puede copiar, agrego ESE pantallazo
  suelto y el resto va en texto. Eso ya hace la tanda mixta: una sola
  tanda en esa sesión.

Cómo paso una tanda de IMÁGENES (solo cuando no hay texto copiable):
- Dejo 3-5 pantallazos en `paginas/` y listo. Después de esa tanda,
  `/cambio`: las imágenes ya explicadas no tienen por qué seguir
  pesando el resto del día.

Cuando termina de explicar, Claude mueve solo la tanda a
`paginas/leidas/`. Yo no muevo nada.

# ============================================================
# UN DÍA DE ESTUDIO, ENTERO
# ============================================================

```
[TERMINAL]  cd ~/Proyectos/HeadFirst-Java
[TERMINAL]  armo la tanda en paginas/
[TERMINAL]  claude
[CLAUDE]    /arranque          → me dice el /rename y qué toca
[CLAUDE]    /rename java-sNN
[CLAUDE]    /entrega ...       → si traigo algo hecho, PRIMERO esto
[CLAUDE]    /tanda             → me explica las páginas
            ¿sigo? tanda de TEXTO → armo otra en paginas/ y /tanda
                   tanda de IMÁGENES → /cambio, Ctrl+D, sesión nueva
[CLAUDE]    /cierre            → guarda todo, commitea y pushea
[TERMINAL]  Ctrl+D
```

Todo lo de git lo hace el profe: `pull` al abrir, y `commit` + `push`
al cerrar (me muestra qué cambió y me pide el OK antes de subir).

# ============================================================
# REGLAS DE ORO
# ============================================================

1. `/arranque` siempre primero. De ahí sale el nombre de la sesión y
   todo lo demás.
2. Si la página se puede copiar como texto, va como texto. Siempre.
3. Tamaño de tanda según formato (tabla de arriba). Nunca más de 5
   pantallazos ni más de 10 páginas de texto por tanda.
4. NUNCA salir sin `/cierre`: es lo que guarda el día y lo sube.
5. Al cambiar de sesión a mitad del día, `/cambio` primero: sin eso la
   tanda no queda registrada en la guía y se pierde. Si además Claude
   empieza a olvidar cosas dichas antes o se pone lento, esa es la
   señal de que la sesión ya está demasiado cargada: cortá igual.
6. Los ejercicios del libro (Sharpen your pencil, BE the compiler,
   Code Magnets, Pool Puzzle...) SIEMPRE los intento a mano ANTES de
   mirar la solución del libro o pedírsela a Claude.
7. Los repasos se hacen DESDE CERO, sin mirar mi solución original:
   releer no fija nada, volver a resolver sí.
8. `paginas/` NUNCA se sube a git: el repo es público y el contenido
   del libro tiene copyright. El profe lo verifica antes de cada
   commit.
9. El número de sesión solo avanza. Varias sesiones en un día es lo
   NORMAL: cada tanda de imágenes abre una nueva.

# ============================================================
# MECANOGRAFÍA Y TARJETAS ANKI
# ============================================================

Mecanografía (las frases salen de `MECANOGRAFIA.md`):
- CTRL+SUPER+ALT+T (atajo de mis dotfiles) abre/oculta ttyper flotante
  con una frase al azar de mis proyectos de estudio.
- Al terminar una frase: `q` pasa a otra al azar, `r` repite la misma.
  Claude vuelca las frases nuevas al cerrar cada tanda; yo no toco
  esos archivos.

Tarjetas Anki (`ANKI.txt`):
- En Anki: Archivo → Importar → elegir el `ANKI.txt` de este repo. El
  mazo (HeadFirst-Java), el separador tab y las etiquetas ya vienen
  preconfigurados en las cabeceras del propio archivo.
- Re-importar el MISMO archivo no duplica: actualiza las tarjetas que
  cambiaron y agrega las nuevas (Anki matchea por la pregunta).
- Rutina: después de cada `git pull` con tarjetas nuevas, re-importo.

# ============================================================
# SI USÁS OTRO COMPUTADOR (clonar y sincronizar)
# ============================================================

Primera vez en el PC nuevo:
1. `[TERMINAL]` `cd ~/Proyectos`
2. `[TERMINAL]` `git clone git@github.com:Ander0296/HeadFirst-Java.git`
   ← SIEMPRE con la URL SSH (git@github.com:...), NUNCA con https://
3. `[TERMINAL]` `cd HeadFirst-Java && mkdir -p paginas/leidas`
   (paginas/ llega vacía a propósito: las imágenes no viajan por git)
4. Listo: `GUIA-JAVA.md`, `EJERCICIOS.md`, `ejercicios/` y los comandos
   de `.claude/commands/` llegan solos. Abrí `claude` y `/arranque`.

La regla que evita desastres con dos PCs la ejecuta el profe: `pull` en
`/arranque`, `push` en `/cierre`. Por eso nunca hay que saltearse el
cierre. La memoria de Engram vive en cada PC por separado y puede estar
incompleta en uno de los dos: no pasa nada, `GUIA-JAVA.md` y
`EJERCICIOS.md` viajan por git y son la fuente de verdad del progreso.

Si git pide usuario y contraseña al hacer push (ya me pasó una vez):
- Causa: el remote quedó configurado en HTTPS, y con HTTPS git ignora
  la llave SSH (la de 1Password) aunque esté cargada y funcionando.
- Diagnóstico: `git remote -v` → si muestra `https://github.com/...`,
  es exactamente este problema.
- Arreglo:
  `git remote set-url origin git@github.com:Ander0296/HeadFirst-Java.git`
- Probá la llave: `ssh -T git@github.com` → debe responder
  "Hi Ander0296!" (Hola Ander0296!).

# ============================================================
# SI SE CERRÓ LA TERMINAL SIN QUERER (mismo día)
# ============================================================

`[TERMINAL]` `claude --resume java-sNN`
(o `claude --resume` solo, y elegís de la lista)
OJO: esto es SOLO para retomar el mismo día. Día nuevo = sesión nueva.
