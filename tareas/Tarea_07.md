# 🌟 Tarea 07
## 🎯 Semana 7

### 3.2. Análisis del Caso Medio

#### 🎯 ¿Qué es el Caso Medio?

El **análisis del caso medio** calcula el **tiempo esperado de ejecución** considerando todas las posibles entradas con sus respectivas probabilidades. Es más realista que el caso peor, pero más complejo de calcular.

#### 📊 Metodología del Análisis

1. **Identificar todas las entradas posibles**
2. **Asignar probabilidades a cada entrada**
3. **Calcular el tiempo para cada entrada**
4. **Calcular el promedio ponderado**

#### 💡 Ejemplo: Búsqueda Lineal

**🔍 Configuración:**
- Array de tamaño n
- Elemento puede estar en cualquier posición o no estar
- Probabilidad uniforme

**📈 Análisis:**
```
Si el elemento está en posición i: i comparaciones
Si el elemento no está: n comparaciones

Caso 1: Elemento presente (probabilidad 1/2)
- Posición 1: 1 comparación (prob. 1/n)
- Posición 2: 2 comparaciones (prob. 1/n)
- ...
- Posición n: n comparaciones (prob. 1/n)

Promedio si está presente: (1 + 2 + ... + n)/n = (n+1)/2

Caso 2: Elemento ausente (probabilidad 1/2)
- Siempre n comparaciones

Caso medio total:
(1/2) × (n+1)/2 + (1/2) × n = (3n+1)/4 = O(n)
```


#### 📊 Ejemplos en Diferentes Algoritmos

| Algoritmo | Caso Mejor | Caso Medio | Caso Peor |
|-----------|------------|------------|-----------|
| **Búsqueda Lineal** | O(1) | O(n) | O(n) |
| **Quick Sort** | O(n log n) | O(n log n) | O(n²) |
| **Insertion Sort** | O(n) | O(n²) | O(n²) |
| **Hash Table (búsqueda)** | O(1) | O(1) | O(n) |

#### 🎯 Importancia Práctica

- **Predicción realista**: Mejor estimación del rendimiento real
- **Optimización**: Decidir qué algoritmo usar en la práctica
- **Diseño de sistemas**: Planificar recursos computacionales

---

### 3.3. Análisis Amortizado

#### 🎯 ¿Qué es el Análisis Amortizado?

El **análisis amortizado** estudia el **costo promedio por operación** en una secuencia de operaciones, considerando que algunas operaciones costosas se "amortizan" con muchas operaciones baratas.

#### 🔧 Métodos de Análisis Amortizado

#### **1. Método Agregado**
- Calcular el costo total de n operaciones
- Dividir entre n para obtener el costo amortizado

#### **2. Método Contable**
- Asignar "créditos" a operaciones baratas
- Usar créditos para pagar operaciones costosas

#### **3. Método Potencial**
- Definir una función potencial
- El costo amortizado incluye el cambio de potencial

#### 💡 Ejemplo Clásico: Array Dinámico (ArrayList en Java)

**🔍 Problema:**
- ArrayList que se duplica cuando se llena
- Inserción normal: O(1)
- Redimensión: O(n) - copiar todos los elementos

**📊 Análisis Agregado:**
```java
// Secuencia de n inserciones en ArrayList:
// - Redimensiones en tamaños: 1, 2, 4, 8, 16, ..., n
// - Costo de copiar: 1 + 2 + 4 + 8 + ... + n < 2n

// Costo total: n (inserciones) + 2n (copias) = 3n
// Costo amortizado: 3n/n = 3 = O(1) por inserción
```




#### 📊 Aplicaciones del Análisis Amortizado

| Estructura de Datos | Operación | Costo Individual | Costo Amortizado |
|-------------------|-----------|------------------|------------------|
| **ArrayList** | add() | O(1) / O(n) | O(1) |
| **HashMap** | put() | O(1) / O(n) | O(1) |
| **Heap Binomial** | union() | O(log n) | O(1) |
| **Splay Tree** | search() | O(n) | O(log n) |

---

### 3.4. Recurrencias

#### 🎯 ¿Qué son las Recurrencias?

Las **recurrencias** son ecuaciones que expresan el tiempo de ejecución de un algoritmo en términos de su tiempo de ejecución en entradas más pequeñas. Son fundamentales para analizar algoritmos recursivos.

#### 📐 Forma General

```
T(n) = a·T(n/b) + f(n)
```

Donde:
- **a**: número de subproblemas
- **n/b**: tamaño de cada subproblema  
- **f(n)**: trabajo para dividir/combinar

#### 🔧 Métodos de Resolución

#### **1. Método de Sustitución**
- Adivinar la solución
- Verificar por inducción matemática

#### **2. Método del Árbol de Recursión**
- Dibujar el árbol de llamadas recursivas
- Sumar el trabajo en cada nivel

#### **3. Teorema Maestro**
- Fórmula directa para recurrencias comunes

#### 🏆 Teorema Maestro

Para recurrencias de la forma **T(n) = a·T(n/b) + f(n)**:

| Caso | Condición | Resultado |
|------|-----------|-----------|
| **Caso 1** | f(n) = O(n^(log_b(a-ε))) | T(n) = Θ(n^log_b(a)) |
| **Caso 2** | f(n) = Θ(n^log_b(a)) | T(n) = Θ(n^log_b(a) · log n) |
| **Caso 3** | f(n) = Ω(n^(log_b(a+ε))) | T(n) = Θ(f(n)) |

#### 💡 Ejemplos Clásicos

**🔍 Merge Sort:**
```
T(n) = 2T(n/2) + O(n)

Aplicando Teorema Maestro:
- a = 2, b = 2, f(n) = n
- n^log_b(a) = n^log_2(2) = n^1 = n
- f(n) = n = Θ(n^log_2(2))

Caso 2: T(n) = Θ(n log n)
```

**🔍 Búsqueda Binaria:**
```
T(n) = T(n/2) + O(1)

Aplicando Teorema Maestro:
- a = 1, b = 2, f(n) = 1
- n^log_b(a) = n^log_2(1) = n^0 = 1
- f(n) = 1 = Θ(1)

Caso 2: T(n) = Θ(log n)
```