![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  

# Contenido Semanal:

# 📚 Semana 7: Algoritmos Probabilistas II 🎲✨

## 🔹 6.3 Algoritmos de Monte Carlo 🎰

Los **algoritmos de Monte Carlo** utilizan técnicas de muestreo aleatorio para obtener soluciones aproximadas a problemas complejos, con alta probabilidad de éxito.

### 📌 Características principales:
- Utilizan decisiones aleatorias durante la ejecución.
- No garantizan siempre la misma salida para una misma entrada.
- Son muy útiles para estimar resultados cuando el cálculo exacto es difícil o costoso.

### 📌 Aplicaciones comunes:
- Cálculo de integrales difíciles.
- Simulación de sistemas físicos y financieros.
- Aproximación del valor de π (pi).
- Optimización y problemas combinatorios.

---

## 🧮 Ejemplo: Aproximación de π con Monte Carlo en Java

El método consiste en generar puntos aleatorios dentro de un cuadrado y contar cuántos caen dentro del cuarto de círculo inscrito. La relación entre puntos dentro del círculo y el total se usa para estimar π.

```java
import java.util.Random;

public class MonteCarloPi {
    public static void main(String[] args) {
        int totalPoints = 1_000_000;
        int pointsInsideCircle = 0;
        Random random = new Random();

        for (int i = 0; i < totalPoints; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (x*x + y*y <= 1) {
                pointsInsideCircle++;
            }
        }

        double piEstimate = 4.0 * pointsInsideCircle / totalPoints;
        System.out.println("Estimación de π usando Monte Carlo: " + piEstimate);
    }
}
````
--- 

| Aspecto              | 📌 Algoritmo Determinista          | 🎯 Algoritmo Probabilista                 |
|----------------------|--------------------------------|--------------------------------------|
| **Salida**           | Siempre la misma para una entrada dada | Puede variar en diferentes ejecuciones |
| **Tiempo de ejecución** | Predecible                    | Basado en probabilidades, variable   |
| **Complejidad**      | Normalmente analizada          | Tiempo esperado o promedio            |
| **Correctitud**      | Garantizada                   | Alta probabilidad, puede fallar       |
| **Uso**              | Problemas donde se requiere certeza | Problemas con alta complejidad o incertidumbre |

### 💡 Resumen Semana 7
- Los algoritmos de Monte Carlo son poderosas herramientas para problemas complejos.

- Su fortaleza está en la simplicidad y la aproximación eficiente.

- xLa aleatoriedad permite manejar problemas que serían inviables con métodos deterministas.







