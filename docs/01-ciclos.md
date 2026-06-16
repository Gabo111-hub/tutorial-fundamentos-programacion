# Tema 1: Ciclos (Bucles)

Los ciclos o bucles son estructuras de control que nos permiten repetir un bloque de código múltiples veces, dependiendo de una condición. Son fundamentales para no escribir el mismo código una y otra vez.

## 1. El ciclo `for`
Se utiliza cuando **sabemos exactamente cuántas veces** queremos que se repita un bloque de código. Por ejemplo, recorrer una lista de 10 elementos o contar del 1 al 100.

## 2. El ciclo `while`
Se utiliza cuando **no sabemos cuántas veces** se repetirá el ciclo, sino que depende de que una condición sea verdadera (`true`). El ciclo se detendrá en el momento en que la condición pase a ser falsa (`false`).

---

### 💻 Ejercicio Práctico: Validador de Contraseña
Para entender la diferencia, vamos a crear un programa que simule el inicio de sesión de un usuario. 
* El sistema le pedirá la contraseña.
* Si se equivoca, le volverá a preguntar usando un ciclo `while`.
* El usuario tendrá un máximo de 3 intentos permitidos.

🔗 **[Haz clic aquí para ver el código fuente resuelto de este ejercicio](../src/EjemploCiclos)**
