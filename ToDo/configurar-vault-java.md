# Configurar el vault de Obsidian `Java-Notas`

El vault vive en `~/Proyectos/Java-Notas`. NO viaja por git: solo llega
a otro PC con Obsidian Sync. Las notas las escribís vos; Claude las
revisa con `/nota`.

## 1. En el PC donde ya existe el vault

- [ ] Obsidian → *Abrir carpeta como bóveda* → `~/Proyectos/Java-Notas`.
- [ ] Ajustes → *Plantillas* → ubicación de la carpeta de plantillas: `90 Plantillas`.
- [ ] Ajustes → *Archivos y enlaces* → ubicación de notas nuevas: `00 Bandeja`.
- [ ] Ajustes → *Sync* → crear una bóveda remota nueva (cifrado de extremo a extremo, contraseña en 1Password) y conectarla.
      Por qué: sin Sync el vault queda SOLO en ese PC.

## 2. En el otro PC

- [ ] Crear la carpeta vacía `~/Proyectos/Java-Notas` y abrirla como bóveda.
- [ ] Ajustes → *Sync* → conectar la bóveda remota del paso 1 y esperar a que bajen los archivos.
      Ojo: no le pidas a Claude que vuelva a crear la estructura acá: se duplicaría con lo que baja Sync.
- [ ] Repetir los ajustes de *Plantillas* y *Archivos y enlaces* (algunos no se sincronizan solos).

## 3. Cada nota nueva

- [ ] Escribila en `00 Bandeja` con la plantilla *Concepto*, de memoria y con tus palabras.
- [ ] Una sola idea por nota (ej: "super() va primero"), no un capítulo entero.
      Por qué: una nota con una sola idea se enlaza fácil; una con diez ideas no se enlaza con nada.
- [ ] Llená "En una frase" antes que nada: si no sale en una frase, todavía no está clara.
- [ ] Corré `/nota "00 Bandeja/<nombre>.md"` y corregí lo que diga Claude.
- [ ] Cambiá `estado: revisada`, movela a `10 Conceptos` y enlazala en su sección de `Inicio.md`.

## Carpetas

| Carpeta | Para qué |
| --- | --- |
| `Inicio.md` | Mapa principal: una sección por tema, con los enlaces a cada nota |
| `00 Bandeja` | Borradores sin revisar |
| `10 Conceptos` | Notas revisadas |
| `20 Mapas` | Mapa propio de un tema cuando junta ~7 notas |
| `90 Plantillas` | La plantilla *Concepto* |
