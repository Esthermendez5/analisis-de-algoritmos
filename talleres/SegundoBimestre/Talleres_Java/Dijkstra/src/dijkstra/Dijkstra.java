// ╔══════════════════════════════════════════════════════════════════════════════╗
// ║         Algoritmo de Dijkstra con Prueba de Escritorio                         ║
// ╚══════════════════════════════════════════════════════════════════════════════╝

package dijkstra;

import java.util.*;

public class Dijkstra {

    // Número total de nodos en el grafo
    static final int N = 5;

    // Valor usado para representar "infinito" (ausencia de conexión)
    static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {

        // Matriz de adyacencia que representa el grafo
        // L[i][j] representa el peso de la arista desde el nodo i+1 al nodo j+1
        int[][] L = {
            {0, 10, 30, INF, 100},  // Nodo 1
            {INF, 0, INF, 50, INF}, // Nodo 2
            {INF, INF, 0, 20, 60},  // Nodo 3
            {INF, INF, INF, 0, 10}, // Nodo 4
            {INF, INF, INF, INF, 0} // Nodo 5
        };

        // Arreglo que guarda la distancia mínima desde el nodo inicial a cada nodo
        int[] D = new int[N];
        boolean[] visitado = new boolean[N]; // Arreglo para marcar si un nodo ya fue visitado
        int inicio = 0;

        // Inicializar las distancias desde el nodo inicial
        for (int i = 0; i < N; i++) {
            D[i] = L[inicio][i]; // Distancia directa desde el nodo inicial
        }

        // Marcamos el nodo inicial como visitado
        visitado[inicio] = true;

        // Imprimimos el encabezado de la tabla en consola con formato mejorado
        System.out.printf("%-6s | %-20s | %-15s | %-30s\n", "Paso", "C (no visitados)", "S (visitados)", "Distancias D");
        System.out.println("----------------------------------------------------------------------------------------------");

        // Imprimimos el estado inicial (paso 0)
        imprimirTabla(0, D, visitado);

        // Bucle principal del algoritmo (N - 1 pasos como máximo)
        for (int paso = 1; paso < N; paso++) {
            int v = -1;
            int minDist = INF;

            // Buscar el nodo no visitado con la menor distancia D[v]
            for (int i = 0; i < N; i++) {
                if (!visitado[i] && D[i] < minDist) {
                    v = i;
                    minDist = D[i];
                }
            }

            // Si no se encontró un nodo válido, terminamos
            if (v == -1) break;

            // Marcamos el nodo v como visitado
            visitado[v] = true;

            // Relajación: actualizar las distancias a vecinos de v
            for (int w = 0; w < N; w++) {
                // Si hay conexión y el nodo w no ha sido visitado
                if (!visitado[w] && L[v][w] != INF) {
                    // Si encontramos un camino más corto hacia w
                    if (D[w] > D[v] + L[v][w]) {
                        D[w] = D[v] + L[v][w]; // actualizamos D[w]
                    }
                }
            }

            // Imprimir la tabla de este paso
            imprimirTabla(paso, D, visitado);
        }

        // Mostrar resultado final con distancias mínimas desde el nodo inicial
        System.out.println("\nResultado final (distancias mínimas desde el nodo 1):");
        for (int i = 0; i < N; i++) {
            System.out.println("Nodo 1 -> Nodo " + (i + 1) + " = " + (D[i] == INF ? "∞" : D[i]));
        }
    }
    static void imprimirTabla(int paso, int[] D, boolean[] visitado) {
        // Listas para almacenar nodos no visitados (C) y visitados (S)
        List<Integer> C = new ArrayList<>();
        List<Integer> S = new ArrayList<>();

        // Clasificamos cada nodo como visitado o no visitado
        for (int i = 0; i < D.length; i++) {
            if (visitado[i]) {
                S.add(i + 1); // Se suma 1 para mostrar desde 1, no desde 0
            } else {
                C.add(i + 1);
            }
        }

        // Imprimir los valores en formato tabular alineado
        System.out.printf("%-6d | %-20s | %-15s | ", paso, C.toString(), S.toString());
        for (int i = 0; i < D.length; i++) {
            if (D[i] == INF) {
                System.out.printf("%-4s", "∞");
            } else {
                System.out.printf("%-4d", D[i]);
            }
        }
        System.out.println(); // Salto de línea
    }
}
