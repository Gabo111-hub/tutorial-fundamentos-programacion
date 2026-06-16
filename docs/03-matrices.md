# Tema 3: Vectores y Matrices

Las estructuras de datos estáticas nos permiten almacenar múltiples valores del mismo tipo en una sola variable, organizándolos mediante índices.

## 1. Vectores (Arreglos unidimensionales)
Son como una fila de casilleros. Tienen un tamaño fijo que se define al crearlos. Para acceder a cada elemento, utilizamos su posición (índice), recordando siempre que en programación empezamos a contar desde el cero `0`.

## 2. Matrices (Arreglos bidimensionales)
Son arreglos de arreglos, formando una estructura de filas y columnas (como una tabla o una imagen digital formada por píxeles). Para recorrerlos, la técnica estándar es utilizar dos ciclos `for` anidados: uno para avanzar por las filas y otro para avanzar por las columnas de cada fila.

---

### 💻 Ejercicio Práctico: Análisis de Píxeles
Vamos a simular el procesamiento de una imagen en escala de grises. 
* Representaremos una imagen pequeña de 3x3 como una matriz de números enteros (donde cada número representa la intensidad de un píxel, de 0 a 255).
* Usaremos ciclos anidados para recorrer la matriz y encontrar cuál es el píxel más brillante (el valor más alto).

🔗 **[Haz clic aquí para ver el código fuente resuelto de este ejercicio](../src/EjemploMatrices.java)**  
