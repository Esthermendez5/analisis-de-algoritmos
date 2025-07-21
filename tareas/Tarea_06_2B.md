![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  

# Contenido Semanal: Análisis de Algoritmos 🧠💻  
# 📚 Semana 6: Algoritmos Probabilistas I 🎲🤖

## 🔹 6.1 Tiempo Esperado ⏳

El **tiempo esperado** es el promedio del tiempo de ejecución de un algoritmo probabilista, considerando todas las posibles elecciones aleatorias que puede hacer durante su ejecución.

### 📌 ¿Por qué es útil?
- Proporciona una medida realista del desempeño en la práctica.
- Aunque el algoritmo pueda tener casos peores, el tiempo esperado suele ser eficiente.

##### 📌 Ejemplo sencillo:
Supongamos un algoritmo que selecciona al azar un número entre 1 y n hasta encontrar un valor objetivo. El tiempo esperado para encontrarlo es proporcional a n/2.

---

## 🔹 6.2 Algoritmos Numéricos 🔢

Los algoritmos numéricos probabilistas usan **números pseudoaleatorios** para aproximar soluciones o generar secuencias con propiedades estadísticas útiles.

### 📌 Generador Lineal Congruencial (GLC)

Es uno de los métodos más comunes para generar números pseudoaleatorios. La fórmula es:

\[
X_{n+1} = (aX_n + c) \mod m
\]

Donde:
- \(X_0\) es la semilla inicial.
- \(a, c, m\) son constantes.

### 📌 Ejemplo en Java: Generador Lineal Congruencial

```java
public class GeneradorLCG {
    private long a = 1664525;
    private long c = 1013904223;
    private long m = (long) Math.pow(2, 32);
    private long seed;

    public GeneradorLCG(long seed) {
        this.seed = seed;
    }

    public long next() {
        seed = (a * seed + c) % m;
        return seed;
    }

    public double nextDouble() {
        return (double) next() / m;
    }

    public static void main(String[] args) {
        GeneradorLCG gen = new GeneradorLCG(12345);
        for (int i = 0; i < 10; i++) {
            System.out.println(gen.nextDouble());
        }
    }
}
````

Este código genera 10 números pseudoaleatorios entre 0 y 1.

### 💡 Resumen Semana 6
- Los algoritmos probabilistas aprovechan la aleatoriedad para eficiencia y simplicidad.

- El tiempo esperado permite evaluar su desempeño típico.

- El generador lineal congruencial es una base simple para producir secuencias pseudoaleatorias usadas en simulaciones, criptografía y más.

