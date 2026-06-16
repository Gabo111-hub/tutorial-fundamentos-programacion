# Tema 5: Manejo de Archivos

La manipulación de archivos permite que la información de nuestros programas persista, es decir, que no se borre cuando cerramos la ejecución de la terminal. 

## 1. Lectura y Escritura
En Java, utilizamos clases como `Scanner` o `BufferedReader` para leer texto de un archivo existente, y herramientas como `FileWriter` o `PrintWriter` para escribir datos nuevos hacia el disco duro.

## 2. Manejo de Excepciones (try-catch)
Al interactuar con el sistema de archivos del sistema operativo, pueden ocurrir errores imprevistos (por ejemplo, intentar leer un archivo que no existe o no tener permisos de escritura). Por eso, el código siempre debe estar envuelto en un bloque `try-catch` para atrapar esos errores y evitar que el programa colapse.

---

### 💻 Ejercicio Práctico: Generación de Reportes
Vamos a escribir un programa que genere un archivo `.txt` físico.
* Usaremos `FileWriter` para crear un archivo llamado `reporte_ventas.txt`.
* Utilizaremos un bloque `try-catch` para capturar cualquier `IOException`.

🔗 **[Haz clic aquí para ver el código fuente resuelto de este ejercicio](../src/EjemploArchivos.java)**
