# HeadFirst-Java — estudio de Head First Java (3ra ed.) + POO en Java

Claude Code es mi profesor. Yo le paso pantallazos del libro (Kindle),
él me los explica en español, mantiene la guía (GUIA-JAVA.md) y lleva
los ejercicios (EJERCICIOS.md). Yo escribo TODO el código Java a mano,
lo compilo y lo ejecuto yo mismo.

Proyecto hermano: UML-Java (mismo sistema, libro "UML Distilled").
Lo que aprendo acá alimenta ese proyecto y viceversa.

## Los dos lugares donde se escriben cosas

- [TERMINAL] = la consola de siempre (fish)
- [CLAUDE] = dentro del programa, después de escribir `claude`
Cada paso dice dónde va. Los MENSAJES están al final del archivo.

## Carpetas

- paginas/ → acá dejo la tanda actual (3-8 pantallazos por vez)
- paginas/leidas/ → Claude archiva acá los ya explicados (lo hace él)
- ejercicios/ → mi código Java, una carpeta por ejercicio
- diagramas/ → mis diagramas .puml (puente con el proyecto UML-Java)
- GUIA-JAVA.md → la guía (la escribe Claude)
- EJERCICIOS.md → los ejercicios (los escribe Claude)

# ============================================================
# PRIMERA VEZ EN LA VIDA (sesión java-s01)
# ============================================================

1. [TERMINAL] cd ~/Proyectos/HeadFirst-Java
2. [TERMINAL] mkdir -p paginas/leidas ejercicios diagramas
3. [TERMINAL] pasá la primera tanda (3-8 pantallazos) a paginas/
4. [TERMINAL] claude
5. [CLAUDE] /rename java-s01
6. [CLAUDE] /mcp → engram tiene que decir "connected"
7. [CLAUDE] pegá el MENSAJE 1
8. [CLAUDE] cuando responda "listo", pegá el MENSAJE 3
   (la primera vez pide permiso para mover imágenes → aceptá)
9. ¿Querés seguir estudiando? → pasá la siguiente tanda de 3-8 a
   paginas/ (desde el explorador, sin cerrar Claude) y pegá el
   MENSAJE 3 otra vez. Repetí las veces que quieras.
10. [CLAUDE] al terminar el día, pegá el MENSAJE 5
11. [CLAUDE] salí con Ctrl+D
12. [TERMINAL] engram search "tema de hoy" --project HeadFirst-Java
    → si aparece algo, se guardó bien. Fin del día.

# ============================================================
# CADA DÍA DE ESTUDIO (java-s02, s03, ...)
# ============================================================

1. [TERMINAL] pasá la primera tanda (3-8 pantallazos) a paginas/
2. [TERMINAL] cd ~/Proyectos/HeadFirst-Java
3. [TERMINAL] claude
4. [CLAUDE] /rename java-sNN ← el número que sigue (s02, s03...)
5. [CLAUDE] /mcp → engram "connected"
6. [CLAUDE] pegá el MENSAJE 2 → te dice dónde quedamos y qué toca
7. [CLAUDE] si hay ejercicios pendientes y ya hiciste alguno:
   pegá el MENSAJE 4 (ejercicio de código) o el MENSAJE 6
   (ejercicio del libro) ANTES de pasar a páginas nuevas
8. [CLAUDE] pegá el MENSAJE 3 → explica la tanda y la archiva solo
9. ¿Querés seguir? → siguiente tanda de 3-8 a paginas/ y volvé al
   paso 8. Cuántas veces lo repitas lo decidís vos cada día: puede
   ser una tanda o pueden ser muchas. No hay número fijo.
10. [CLAUDE] al terminar el día, pegá el MENSAJE 5
11. [CLAUDE] Ctrl+D
12. [TERMINAL] engram search "tema de hoy" --project HeadFirst-Java
13. [TERMINAL] (opcional) git add . && git commit -m "sesión sNN"

# ============================================================
# SI SE CERRÓ LA TERMINAL SIN QUERER (mismo día)
# ============================================================

[TERMINAL] claude --resume java-sNN
(o `claude --resume` solo, y elegís de la lista)
OJO: esto es SOLO para retomar el mismo día. Día nuevo = sesión nueva.

# ============================================================
# REGLAS DE ORO
# ============================================================

1. Normalmente una sesión por día. El número solo avanza: si un día
   abrís dos sesiones, no pasa nada.
2. Cada tanda: 3-8 pantallazos MÁXIMO. Este libro es muy visual (hay
   páginas casi sin texto): ajustá la cantidad según la densidad, pero
   nunca más de 8. La cantidad de tandas por día es libre.
3. NUNCA salir sin pegar el MENSAJE 5: es lo que guarda todo.
4. En días largos: si Claude empieza a olvidar cosas dichas antes o
   se pone lento, terminá la tanda en curso, pegá el MENSAJE 5, Ctrl+D,
   y seguí en una sesión nueva (número siguiente, mismo día).
5. Los ejercicios del libro (Sharpen your pencil, BE the compiler,
   Code Magnets, Pool Puzzle...) SIEMPRE los intento a mano ANTES de
   mirar la solución del libro o pedírsela a Claude.
6. paginas/ NUNCA se sube a git: el repo es público y los pantallazos
   del libro tienen copyright. Verificá que esté en .gitignore.

# ============================================================
# MENSAJES PARA COPIAR Y PEGAR
# ============================================================

--- MENSAJE 1 — inicial (solo en java-s01) ---

```
Este es un proyecto de estudio y vos sos mi profesor particular.

QUIÉN SOY
- Novato en POO/Java. Vengo aprendiendo UML en un proyecto hermano
  (UML-Java, mismo sistema de estudio), pero de Java en sí sé muy poco.
  No asumas nada que no esté registrado en la guía o en Engram.
- Objetivo: escribir código bien estructurado y conseguir mi primer
  empleo como desarrollador.
- El libro es "Head First Java" (Kathy Sierra, Bert Bates y Trisha Gee,
  3ra edición, O'Reilly), en inglés, cubre Java 8-17; yo leo mejor en
  español.

FLUJO POR CADA TANDA DE PÁGINAS (máx. 3-8 pantallazos que dejo en paginas/)
1. TRADUCCIÓN EXPLICADA: contame en español TODO lo que dicen esas
   páginas, con tus palabras, reordenado para un novato, sin saltarte
   ningún concepto. No es traducción literal del libro: es una
   explicación completa con tus propios ejemplos. Los términos técnicos
   clave dejalos también en inglés entre paréntesis (los necesito para
   entrevistas).
2. CÓDIGO: mostrá el código clave de la tanda EN EL CHAT, con comentario
   // en cada línea relevante. Si aparece sintaxis o una base que no
   vimos, frená y explicala primero, con analogías.
3. EJERCICIOS DEL LIBRO: si la tanda trae ejercicios propios del libro
   (Sharpen your pencil, BE the compiler, Code Magnets, Pool Puzzle,
   crucigramas...), avisame cuáles son para que los intente a mano.
   NO me des la solución de entrada: primero pistas.
4. COMPRENSIÓN: antes de cerrar, haceme 1-2 preguntas cortas para
   verificar que entendí. Si respondo mal, explicalo de otra forma.
5. GUÍA: actualizá GUIA-JAVA.md agregando la sesión con el formato del
   archivo, y sumá los términos nuevos a la tabla de vocabulario.
6. EJERCICIOS: registrá en EJERCICIOS.md los ejercicios del libro que
   queden pendientes, y agregá ejercicios propios cuando el tema lo
   amerite, con su formato (número, tema, tipo, enunciado claro, dónde
   entrego, y "Si te trabás: revisá la Sesión #Y"). Los hago de a uno
   por día.
7. ENGRAM: guardá en Engram (project "HeadFirst-Java") los conceptos
   clave, las decisiones y en qué página quedamos.

NOTA: en un mismo día puedo pasarte varias tandas seguidas (yo decido
cuántas). Cada tanda repite este flujo completo desde el paso 1.

REGLAS FIJAS
- Yo escribo TODO el código Java a mano en ejercicios/, y yo mismo lo
  compilo y lo ejecuto (javac / java). Vos no creás ni editás archivos
  .java: mostrás ejemplos en el chat y corregís lo mío. Si me sale un
  error de compilación o ejecución, te lo pego y me explicás qué
  significa y cómo pensarlo.
- SÍ podés editar directamente GUIA-JAVA.md y EJERCICIOS.md. Si todavía
  no existen, crealos vos con un formato limpio y reutilizable.
- No ejecutes bash salvo que te lo pida explícitamente.
- Puedo frenarte en cualquier momento con una duda: resolvela con calma
  y detalle antes de seguir.
- El libro cubre hasta Java 17: si algo cambió o hoy tiene una forma
  más moderna en Java, decímelo y anotalo en la guía como
  "NOTA DEL PROFE".
- Cuando un ejercicio quede terminado y tenga 2 o más clases
  relacionadas, proponeme (opcional) dibujar su diagrama de clases en
  diagramas/ para practicar lo del proyecto UML-Java.

ARRANQUE DE HOY
1. Leé CLAUDE.md y, si existen, GUIA-JAVA.md y EJERCICIOS.md.
2. Buscá en Engram (project "HeadFirst-Java") si hay progreso previo.
3. Confirmame en una línea qué encontraste y decime "listo para la
   primera tanda".
```

--- MENSAJE 2 — arranque del día (s02 en adelante) ---

```
Nueva sesión de estudio. Leé CLAUDE.md, GUIA-JAVA.md y EJERCICIOS.md,
buscá en Engram (project "HeadFirst-Java") dónde quedamos, y decime:
(1) qué vimos la última vez en una línea, (2) qué ejercicios tengo
pendientes, (3) qué toca hoy. Después decido si corregimos un ejercicio
o te paso la siguiente tanda.
```

--- MENSAJE 3 — tanda de páginas (repetible: una vez por cada tanda) ---

```
Tanda nueva: leé todas las imágenes que hay en la raíz de paginas/
(sin entrar a paginas/leidas/), en orden de nombre, y arrancá el flujo.
Cuando termines de explicarme esta tanda, antes de seguir con cualquier
otra cosa, mové esas mismas imágenes a paginas/leidas/ para que la raíz
quede vacía.
```

--- MENSAJE 4 — corregir un ejercicio de código ---

```
Hice el ejercicio #NN, está en ejercicios/ejNN-nombre/.
Compiló: [sí / no]. Al ejecutarlo: [pego abajo la salida o el error].
Revisalo línea por línea: qué está bien, qué está mal y POR QUÉ, y
actualizá su estado y tu corrección en EJERCICIOS.md.
```

--- MENSAJE 5 — cierre (SIEMPRE antes de salir) ---

```
Cerramos acá:
1. Verificá que GUIA-JAVA.md y EJERCICIOS.md quedaron actualizados con
   todo lo de hoy.
2. Guardá en Engram (project "HeadFirst-Java") el resumen y en qué
   página quedamos.
3. Dame el resumen final de la sesión.
```

--- MENSAJE 6 — ejercicio del libro (papel / mental) ---

```
Hice el ejercicio del libro "[nombre del ejercicio]" (página X).
Mi respuesta: [la escribo acá o pego una foto].
Corregilo pero SIN darme la solución completa de entrada: decime qué
tengo bien, qué tengo mal, y dame pistas para lo que falta. La solución
completa solo si te la pido después. Registrá el resultado en
EJERCICIOS.md.
```
