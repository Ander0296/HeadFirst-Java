# REPASO r2 — LIBRO Sharpen your pencil: "Television" (pág. 162-163, Sesión #24)

Este es un REPASO: resolvelo DESDE CERO, sin mirar tu versión anterior
ni ninguna corrección vieja. Volver a resolverlo es lo que fija el
conocimiento; releer no.

## ENUNCIADO

El libro muestra el dibujo de un televisor y, al lado, una tabla vacía
de una clase llamada `Television`, dividida en dos secciones:

- arriba: **instance variables** (lo que el objeto SABE)
- abajo: **methods** (lo que el objeto SABE HACER)

Completá la tabla: escribí qué instance variables y qué methods
necesitaría un objeto `Television`.

El libro aclara "Yours to solve" (es tuyo para resolver): no hay una
única respuesta correcta, es un ejercicio abierto de diseño.

Si te trabás: revisá la Sesión #23 y #24 de GUIA-JAVA.md
(instance variables vs. methods, "sabe" vs. "sabe hacer").
Checklist: ToDo/crear-una-clase-java.md

## MI RESPUESTA

### instance variables (lo que SABE)
private static final String MARCA;
private static final double PULGADAS;
private int canal;
private int volumen;
private boolean encendido;

### methods (lo que SABE HACER)
public String getMarca(){
  return marca;
}

public double getPulgadas()){
  return pulgadas
}

public int getCanal(){
  return canal;
}

public void cambiarCanal(int canal){
  this.canal = canal;
}

public int getVolumen(){
  return volumen;
}

public void subirVolumen(int volumen){
  this.volumen = volumen;
}

public void encender(){
  isEncendido = true;
}


public void apagar(){
  isEncendido = false;
}

---

## PROMPT DE ENTREGA (copiá esto y pegalo en Claude cuando termines)

Terminé el repaso r2 de LIBRO Sharpen your pencil: "Television"
(pág. 162-163). Mi respuesta está en
ejercicios/repasos/lib03-television-r2.md.
Corregilo EN EL CHAT: qué está bien, qué está mal y por qué.
Compará contra mi versión original (EJERCICIOS-ARCHIVO.md): qué mejoré
y qué error repetí. Después actualizá EJERCICIOS.md según el resultado.
