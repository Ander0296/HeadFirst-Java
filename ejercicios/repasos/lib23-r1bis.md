# lib23 — REPASO r1 bis — Sharpen your pencil: contar el árbol Doctor / Surgeon / FamilyDoctor

**Origen:** Head First Java, pág. 482 (Sesión #88 de GUIA-JAVA.md)
**Si te trabás:** revisá la Sesión #88 y la #87 de GUIA-JAVA.md
**Checklist:** ToDo/entregar-un-ejercicio.md (Nivel 1 y Nivel 2)

Resolvelo DESDE CERO, sin mirar tus versiones anteriores.

---

## ENUNCIADO

Tenés este árbol de herencia (es el dibujo de la página 482). Cada caja tiene
tres partes, de arriba a abajo: el nombre de la clase, sus variables de
instancia y sus métodos.

Traducción de los nombres:
- `Doctor` (médico) · `Surgeon` (cirujano) · `FamilyDoctor` (médico de familia)
- `worksAtHospital` (trabaja en el hospital)
- `treatPatient` (tratar al paciente)
- `makeIncision` (hacer una incisión)
- `makesHouseCalls` (hace visitas a domicilio)
- `giveAdvice` (dar consejos)

```
                     ┌──────────────────┐
                     │      Doctor      │
                     ├──────────────────┤
                     │ worksAtHospital  │
                     ├──────────────────┤
                     │ treatPatient()   │
                     └────────△─────────┘
                              │
                ┌─────────────┴─────────────┐
     ┌──────────┴───────┐        ┌──────────┴───────┐
     │     Surgeon      │        │   FamilyDoctor   │
     ├──────────────────┤        ├──────────────────┤
     │                  │        │ makesHouseCalls  │
     ├──────────────────┤        ├──────────────────┤
     │ treatPatient()   │        │ giveAdvice()     │
     │ makeIncision()   │        │                  │
     └──────────────────┘        └──────────────────┘
```

Recordá: en un diagrama de herencia, la caja de una subclase muestra SOLO lo
que esa clase escribe. Lo heredado no se dibuja, pero está.

Contestá cada pregunta con el NÚMERO y la LISTA de nombres que contaste
(y de dónde sale cada uno: propio o heredado).

1. How many instance variables does Doctor have?
   (¿Cuántas variables de instancia tiene Doctor?)

   R/ Tiene 1 variable de instancia llamada worksAtHospital

2. How many instance variables does Surgeon have?
   (¿Cuántas variables de instancia tiene Surgeon?)

   R/ no tiene ninguna variable de instancia propia, tiene una heredada de Doctor = worksAtHospital

3. How many instance variables does FamilyDoctor have?
   (¿Cuántas variables de instancia tiene FamilyDoctor?)

   R/ FamilyDoctor tiene una variable de instancia propia makesHouseCalls y una heredada de Doctor = worksAtHospital.

4. How many methods does Doctor have?
   (¿Cuántos métodos tiene Doctor?)

   R/ tiene un solo método treatPatient()

5. How many methods does Surgeon have?
   (¿Cuántos métodos tiene Surgeon?)

   R/ tiene 2 métodos, uno sobreescrito treatPatient() y tiene makeIncision() que este es propio de Surgeon.

6. How many methods does FamilyDoctor have?
   (¿Cuántos métodos tiene FamilyDoctor?)

   R/ Tiene dós métodos, uno heredado de Doctor treatPatient() y giveAdvice que es propio de FamilyDoctor.

7. Can a FamilyDoctor do treatPatient()?
   (¿Puede un FamilyDoctor hacer treatPatient()?)

   R/ Si puede porque lo está heredando de Doctor.

8. Can a FamilyDoctor do makeIncision()?
   (¿Puede un FamilyDoctor hacer makeIncision()?)

   R/ no puede, porque es exclusivo de Surgeon.

En las preguntas 7 y 8, además del sí/no, escribí POR QUÉ en una línea.

---

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

```
/entrega Hice el REPASO r1 bis del ejercicio del libro lib23 "Sharpen your pencil:
contar el árbol Doctor/Surgeon/FamilyDoctor" (pág. 482), está en
ejercicios/repasos/lib23-r1bis.md. Corregí mis respuestas y comparalas con las
del original y con el r1.
```
