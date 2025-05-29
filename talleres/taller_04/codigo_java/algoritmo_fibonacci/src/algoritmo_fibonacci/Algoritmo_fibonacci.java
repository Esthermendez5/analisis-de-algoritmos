/*
Escriba un programa que me permita almacenar en un arreglo, el número de la serie fibonacci (usar recursividad) 
correspondiente a cada una de sus posiciones.
*/

package algoritmo_fibonacci;

public class Algoritmo_fibonacci {

    public static void main(String[] args) {
        int [] fib = new int[11];
        
        for (int i = 1; i <= 10; i++) {
            fib[i] = fibonacci(i);
            
        } 
        System.out.println("La serie de Fibonacci es: ");
        for (int i = 1; i <=10; i++) {
            System.out.print(fib[i] + " ");
        }
               
    }
    public static int fibonacci(int fib) {
        // Caso base
            if (fib == 1 || fib == 2) {
                return 1;
            }else {
                return fibonacci(fib - 1) + fibonacci(fib - 2);
            }
    }   
}
