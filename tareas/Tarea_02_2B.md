![Dijkstra Example](https://citec.com.ec/wp-content/uploads/2024/08/utpl-1024x412.png)
# Universidad Técnica Particular de Loja 🏛️
## Análisis de Algoritmos  
### Nombre: Esther Méndez  
### Segundo Bimestre 📘  
# Contenido Semanal: Análisis de Algoritmos 🧠💻
## 📅 Semana 2: Algoritmos Voraces – Parte II

### 🔸 4.3 Algoritmos Voraces en Grafos Dirigidos ➡️
![Dijkstra Example](https://www.wextensible.com/temas/voraces/ejemplos/dijkstra.png)

Los grafos dirigidos se utilizan especialmente para encontrar **caminos mínimos** entre nodos.

#### 🛣️ Algoritmo de Dijkstra:
![Dijkstra Example](https://www.wextensible.com/temas/voraces/ejemplos/grafo-dirigido.png)
- Determina el camino más corto desde un nodo origen a todos los demás nodos.

- Utiliza una cola de prioridad para elegir el nodo con menor distancia provisional.

- No funciona con pesos negativos.

📌 Ejemplo: Encontrar la ruta más corta entre dos ciudades considerando distancias en kilómetros.

#### 🧠 Proceso paso a paso:
1. Inicializa todas las distancias como infinitas excepto el nodo de inicio (distancia = 0).

2. Marca el nodo de inicio como visitado.

3. Para cada vecino del nodo actual, actualiza la distancia si es menor que la ya registrada.

4. Selecciona el siguiente nodo con menor distancia no visitado.

5. Repite hasta visitar todos los nodos.

✅ Es muy utilizado en mapas GPS, routers de red y videojuegos.