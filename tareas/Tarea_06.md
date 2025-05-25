# 🌟 Tarea 06

## ⚙️ Semana 6

### 3.1. Estructuras de Control

#### 🎯 ¿Qué son las Estructuras de Control?

Las **estructuras de control** determinan el **flujo de ejecución** de un programa. Su análisis es crucial para determinar la complejidad temporal de los algoritmos.

#### 🔄 Tipos Principales

#### **1. Secuenciales**
```java
// O(1) - Cada línea es O(1)
int x = 5;
int y = 10;
int z = x + y;
```
**Complejidad**: O(1) + O(1) + O(1) = O(1)

#### **2. Condicionales**
```java
// Análisis: Tomar el peor caso
if (condition) {           // O(1)
    operacionA();          // O(f(n))
} else {
    operacionB();          // O(g(n))
}
```
**Complejidad**: O(1) + max(O(f(n)), O(g(n)))

#### **3. Iterativas**

**🔄 Bucle Simple:**
```java
for (int i = 0; i < n; i++) {     // n iteraciones
    System.out.println(i);        // O(1) por iteración
}
```
**Complejidad**: n × O(1) = O(n)

**🔄 Bucles Anidados:**
```java
for (int i = 0; i < n; i++) {     // n iteraciones
    for (int j = 0; j < n; j++) { // n iteraciones por cada i
        System.out.println(i + ", " + j);    // O(1)
    }
}
```
**Complejidad**: n × n × O(1) = O(n²)

**🔄 Bucles Dependientes:**
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) { // j va de 0 a i-1
        System.out.println(i + ", " + j);
    }
}
```
**Análisis**: 0 + 1 + 2 + ... + (n-1) = n(n-1)/2 = **O(n²)**

#### 📊 Patrones Comunes de Análisis

| Estructura | Código | Complejidad |
|------------|--------|-------------|
| **Secuencial** | `a; b; c;` | O(1) |
| **If-Else** | `if: A else: B` | max(O(A), O(B)) |
| **Bucle Simple** | `for i in n: A` | n × O(A) |
| **Bucles anidados** | `for i: for j: A` | n × m × O(A) |
| **Bucle logarítmico** | `while n > 1: n//=2` | O(log n) |

#### 🎯 Casos Especiales

**🔍 Bucle Logarítmico:**
```python
while n > 1:
    n = n // 2
    # operación O(1)
```
**Análisis**: n → n/2 → n/4 → ... → 1
**Iteraciones**: log₂(n) = **O(log n)**

**🔍 Bucle con Incremento Variable:**
```python
i = 1
while i < n:
    # operación O(1)
    i = i * 2
```
**Análisis**: 1 → 2 → 4 → 8 → ... → n
**Iteraciones**: log₂(n) = **O(log n)**

#### 🎨 Visualización de Complejidades

```
Estructuras de Control - Complejidad
┌─────────────────────────────────────┐
│ Secuencial:  ■                      │ O(1)
│ Condicional: ■                      │ O(1)
│ Bucle simple: ■■■■■■■■■■■■■■■■■■■■  │ O(n)
│ Bucles anidados: ████████████████████ │ O(n²)
│ Bucle log:   ■■■■                   │ O(log n)
└─────────────────────────────────────┘
```
