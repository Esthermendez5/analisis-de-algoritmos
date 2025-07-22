
package generador_pseudoaleatorio;


public class Generador_pseudoaleatorio {

    
    public static void main(String[] args) {
    int cantidad = 100;          // Total de números a generar
        long semilla = 12345L;       // Semilla inicial (puede ser cualquier valor definido por el estudiante)

        // Generamos los números pseudoaleatorios
        double[] numeros = generarPseudoaleatorios(semilla, cantidad);

        // Imprimimos los primeros 10 números generados
        System.out.println("Primeros 10 números pseudoaleatorios generados:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Número %2d: %.10f%n", (i + 1), numeros[i]);
        }

        // Prueba de escritorio: Mostrar la tabla de los primeros 10 pasos
        System.out.println("\n==== PRUEBA DE ESCRITORIO ====");
        System.out.println("| Iteración |        Xn        |     Resultado Normalizado     |");
        System.out.println("|-----------|------------------|-------------------------------|");

        long a = 1664525;
        long c = 1013904223;
        long m = (long) Math.pow(2, 32);

        long x = semilla;
        for (int i = 0; i < 10; i++) {
            x = (a * x + c) % m;
            double resultado = (double) x / m;
            System.out.printf("|    %3d    | %16d | %27.10f |\n", i + 1, x, resultado);
        }
        System.out.println("=================================================================");
    }

    /**
     * Método para generar una secuencia de números pseudoaleatorios
     * usando el método congruencial lineal.
     *
     * @param semilla Semilla inicial definida por el usuario
     * @param cantidad Número total de valores a generar
     * @return Arreglo de números generados en el rango [0, 1)
     */
    public static double[] generarPseudoaleatorios(long semilla, int cantidad) {
        // Parámetros del método congruencial lineal (Numerical Recipes)
        long a = 1664525;
        long c = 1013904223;
        long m = (long) Math.pow(2, 32);

        // Arreglo para almacenar los resultados normalizados
        double[] resultados = new double[cantidad];
        long x = semilla;  // Valor inicial (X0)

        // Generamos la secuencia
        for (int i = 0; i < cantidad; i++) {
            x = (a * x + c) % m;               // Fórmula del método congruencial lineal
            resultados[i] = (double) x / m;    // Normalización al rango [0, 1)
        }

        return resultados;
    }
}
