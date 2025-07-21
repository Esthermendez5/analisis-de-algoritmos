![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  
# Contenido Semanal: Análisis de Algoritmos 🧠💻
# 📚 Semana 5: Algoritmos Divide y Vencerás III 🧠⚔️

## 🔹 5.3 Mediana 🧮

La **mediana** es el valor central de un conjunto de datos ordenado. En algoritmos, encontrar la mediana eficientemente es clave para optimizar ciertas tareas como la selección o la partición.

### ✅ ¿Por qué es importante?
- Se utiliza para seleccionar buenos pivotes (por ejemplo, en QuickSort).
- Ayuda a reducir el impacto de valores atípicos en análisis de datos.

### 📌 Ejemplo en Java: Encontrar la mediana de un arreglo ordenado
```java
import java.util.Arrays;

public class MedianaEjemplo {
    public static void main(String[] args) {
        int[] datos = {3, 5, 1, 8, 2};
        Arrays.sort(datos);
        double mediana;
        int n = datos.length;

        if (n % 2 == 0) {
            mediana = (datos[n / 2 - 1] + datos[n / 2]) / 2.0;
        } else {
            mediana = datos[n / 2];
        }

        System.out.println("La mediana es: " + mediana);
    }
}
```
--- 
## 🔹 5.4 Multiplicación de Matrices 🧮➕➗
La multiplicación de matrices es una operación fundamental en programación científica, gráficos y aprendizaje automático.

✅ Enfoque divide y vencerás:
Se pueden dividir las matrices grandes en submatrices más pequeñas y aplicar recursivamente la multiplicación. Un famoso ejemplo es el Algoritmo de Strassen.

📌 Ejemplo básico en Java: Multiplicación tradicional de matrices

```
public class MultiplicacionMatrices {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        int[][] C = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Resultado de A x B:");
        for (int[] fila : C) {
            for (int val : fila) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
```


--- 
## 📊 Comparación Visual: Mediana vs Media

| 🧮 Concepto  | 📌 Definición breve                    | 🎯 Uso en algoritmos                    | ⚠️ Sensibilidad a valores extremos |
|-------------|-----------------------------------------|-----------------------------------------|------------------------------------|
| **Mediana** | Valor central en un conjunto ordenado   | Ideal para dividir conjuntos, seleccionar pivotes | Baja (más robusta)               |
| **Media**   | Promedio (suma total / cantidad de datos) | Común en estadísticas y análisis rápido | Alta (afectada por outliers)      |

## 💡 **Conclusión:**  
Cuando necesitas un valor representativo que no se vea influido por valores muy altos o bajos, la **mediana** es mejor opción. La **media** es útil para cálculos rápidos, pero puede ser engañosa si hay valores extremos.