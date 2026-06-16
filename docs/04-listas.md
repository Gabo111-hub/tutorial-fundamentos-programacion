# Tema 4: Listas (Colecciones Dinámicas)

A diferencia de los vectores y matrices tradicionales que tienen un tamaño fijo, las listas son estructuras de datos dinámicas. Esto significa que pueden crecer o encogerse automáticamente en tiempo de ejecución a medida que agregamos o eliminamos elementos.

## 1. ArrayList en Java
Es la implementación más común de una lista. Pertenece al framework de Colecciones de Java y ofrece métodos integrados muy útiles como `.add()` para insertar, `.remove()` para eliminar y `.size()` para saber la cantidad actual de elementos.

## 2. Tipos de Datos Envolventes (Wrappers)
Las listas en Java no pueden almacenar datos primitivos directamente (como `int` o `double`), sino que utilizan sus clases envolventes equivalentes (`Integer`, `Double`, `String`).

---

### 💻 Ejercicio Práctico: Inventario Dinámico
Vamos a crear un sistema de inventario de stock para la marca de ropa urbana "Terrícolas".
* Utilizaremos un `ArrayList` para registrar las prendas disponibles.
* Agregaremos modelos de ropa oversize.
* Eliminaremos un artículo que se haya agotado y mostraremos la lista actualizada.

🔗 **[Haz clic aquí para ver el código fuente resuelto de este ejercicio](../src/EjemploListas.java)**
